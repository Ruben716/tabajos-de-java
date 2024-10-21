/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.ruben.cdatosDAO;
import com.ruben.pe.cmodelo.Billete;
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
public class BilleteDao {
    private String mensaje;
    
    
    //metodo para agreagar 
    
    
    public String agregarBillete (Connection conn, Billete billete){
        
        PreparedStatement ps = null ;
        String sql = "INSERT INTO BILLETE (NUMERO_BILLETE,FECHA,HORA,ITINERARIO,ID_CLIENTE,ID_COMPAÑIA)"
                    + "VALUES (?,?,?,?,?,?)"; 
    
        try {
            ps= conn.prepareStatement(sql);
            ps.setInt(1,billete.getNumeroBillete());
            ps.setString(2, billete.getFecha());
            ps.setString(3, billete.getHora());
            ps.setString(4, billete.getITINERARIO());
            ps.setInt(5, billete.getId_cliente());
            ps.setInt(6, billete.getId_conpania());
            
            ps.execute();
            ps.close();
            mensaje ="el billete fue agregado correctamente";
        } catch (Exception e) {
            mensaje ="Error al agregar los datos"+e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje ;
        
    }
        
    //metodo para eliminar 
    
    public String eliminarBillete(Connection conn, Billete billete) {
    PreparedStatement ps = null;
    String sql = "DELETE FROM BILLETE WHERE ID_BILLETE = ?";
    
    try {
        ps = conn.prepareStatement(sql);
        ps.setInt(1, billete.getId_billete()); 

        ps.execute();
        ps.close();
        mensaje = "El billete fue eliminado";
    } catch (Exception e) {
        mensaje = "Error al eliminar los datos: " + e.getMessage();
        System.out.println(e.getMessage());
    }
    return mensaje;
}
public String modificarBillete(Connection conn, Billete billete) {
    PreparedStatement ps = null;
    String sql = "UPDATE BILLETE SET NUMERO_BILLETE = ?, FECHA = ?, HORA = ?, ITINERARIO = ?, ID_CLIENTE = ? ,ID_COMPAÑIA=?"
            + "WHERE ID_BILLETE = ?";

    try {
        ps = conn.prepareStatement(sql);
        
        // Establecer los valores a actualizar
        ps.setInt(1, billete.getNumeroBillete()); 
        ps.setString(2, billete.getFecha());       
        ps.setString(3, billete.getHora());        
        ps.setString(4, billete.getITINERARIO());  
        ps.setInt(5, billete.getId_cliente());
        ps.setInt(6, billete.getId_conpania());
        ps.setInt(7, billete.getId_billete());   
        System.out.println(billete.getId_billete());
        
        ps.executeUpdate();
        ps.close();
        mensaje = "El billete fue modificado con éxito";
    } catch (Exception e) {
        mensaje = "Error al modificar los datos: " + e.getMessage();
        System.out.println(e.getMessage());
    }
    return mensaje;
}

    public void listarBilletes(Connection conn, JTable table) {
    DefaultTableModel model;
    Statement statement = null;
    ResultSet resultSet = null;
    String[] columnas = {"ID_BILLETE", "NUMERO_BILLETE", "FECHA", "HORA", "ITINERARIO", "ID_CLIENTE","ID_COMPAÑIA"};

    model = new DefaultTableModel(null, columnas);
    
    String sql = "SELECT * FROM BILLETE";
    String[] datosTP = new String[7];
    
    try {
        statement = conn.createStatement();
        resultSet = statement.executeQuery(sql);
        
        while (resultSet.next()) {
            Billete DD = new Billete();
            DD.setId_billete(resultSet.getInt("ID_BILLETE"));
            DD.setNumeroBillete(resultSet.getInt("NUMERO_BILLETE"));
            DD.setFecha(resultSet.getString("FECHA"));
            DD.setHora(resultSet.getString("HORA"));
            DD.setITINERARIO(resultSet.getString("ITINERARIO"));
            DD.setId_cliente(resultSet.getInt("ID_CLIENTE"));
            DD.setId_conpania(resultSet.getInt("ID_COMPAÑIA"));

            datosTP[0] = DD.getId_billete()+ "";
            datosTP[1] = DD.getNumeroBillete() + "";
            datosTP[2] = DD.getFecha() + "";
            datosTP[3] = DD.getHora() + "";
            datosTP[4] = DD.getITINERARIO()+ "";
            datosTP[5] = DD.getId_cliente()+ "";
            datosTP[6] = DD.getId_conpania()+ "";
            
            model.addRow(datosTP);
        }
        table.setModel(model);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        System.out.println(e.getMessage());
    } finally {
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
        } catch (Exception e) {
            System.out.println("Error al cerrar recursos: " + e.getMessage());
        }
    }
}
    
    
    
    }


    
    
    
    
    

