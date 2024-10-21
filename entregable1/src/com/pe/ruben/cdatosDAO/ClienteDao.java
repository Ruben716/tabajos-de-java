/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.ruben.cdatosDAO;

import com.ruben.pe.cmodelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class ClienteDao {
    private String mensaje;
    
    public String agregarDatosDocumento (Connection conn, Cliente cliente){
        
        PreparedStatement ps = null ;
        String sql = "INSERT INTO CLIENTE (NOMBRE,DNI,DIRECCION,TELEFONO)"
                    + "VALUES (?,?,?,?)"; 
    
        try {
            ps= conn.prepareStatement(sql);
            ps.setString(1,cliente.getNombre());
            ps.setInt(2, cliente.getDni());
            ps.setString(3, cliente.getDireccion());
            ps.setInt(4, cliente.getTelefono());
            
            ps.execute();
            ps.close();
            mensaje ="el cliente fue agregado correctamente";
        } catch (Exception e) {
            mensaje ="Error al agregar los datos"+e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje ;
    
    
    
}
    
 //metodo para eliminar 
    public String eliminarCliente (Connection conn, Cliente cliente){
        
        PreparedStatement ps = null ;
        String sql = "DELETE FROM CLIENTE WHERE ID_CLIENTE = ?";  
        
        
        try {
            ps= conn.prepareStatement(sql);
            ps.setInt(1,cliente.getId_cliente());
            
            
            ps.execute();
            ps.close();
            mensaje ="el tipo de documento fue eliminado";
        } catch (Exception e) {
            mensaje ="Error al eliminar los datos"+e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje ;
    }

    
    //metodo para modificar 
    public String modificarCliente(Connection conn, Cliente cliente){    
        
        PreparedStatement ps = null ;
        String sql = "UPDATE CLIENTE SET  NOMBRE=?,DNI =? ,DIRECCION=?,TELEFONO=? "
                    + "  WHERE ID_CLIENTE =?";  
        
        
        try {
            ps= conn.prepareStatement(sql);
            
            
            ps.setString(1,cliente.getNombre());
            ps.setInt(2, cliente.getDni());
            ps.setString(3, cliente.getDireccion());
            ps.setInt(4, cliente.getTelefono());
            ps.setInt(5,cliente.getId_cliente());
            
            ps.execute();
            ps.close();
            mensaje ="El registro fue modificado ";
        } catch (Exception e) {
            mensaje ="Error al modificar los datos"+e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje ;
    }

    //metodo para listar 
    
    
    public void listarDatosDOcumento(Connection conn, JTable table ){

        DefaultTableModel model;
        Statement statement = null;
        ResultSet resultSet = null;
        String [] columnas = {"ID_CLIENTE","NOMBRE","DNI","DIRECCION","TELEFONO"};

        model = new DefaultTableModel (null,columnas);
        
        String sql = "SELECT * FROM CLIENTE";
        String [] datosTP = new String [6];
        
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()){
                Cliente DD = new Cliente();
                DD.setId_cliente(resultSet.getInt("ID_CLIENTE"));
                DD.setNombre(resultSet.getString("NOMBRE"));
                DD.setDni(resultSet.getInt("DNI"));
                DD.setDireccion(resultSet.getString("DIRECCION"));
                DD.setTelefono(resultSet.getInt("TELEFONO"));
                
                datosTP[0] = DD.getId_cliente()+"";
                datosTP[1] = DD.getNombre()+"";
                datosTP[2] = DD.getDni()+"";
                datosTP[3] = DD.getDireccion()+"";
                datosTP[4] = DD.getTelefono()+"";
                
                
                
                model.addRow(datosTP);
                
            }
            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
            System.out.println(e.getMessage());
        }
        
        
    
    }
    //metodo para listar 
    
    



    
}
