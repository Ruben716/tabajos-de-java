/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.ruben.cdatosDAO;
import com.ruben.pe.cmodelo.Compania;
import java.sql.SQLException;
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
public class ConpaniaDAO {
    
     private String mensaje = "";

    // Método para agregar una compañía
    public String agregarConpania(Connection conn, Compania conpania) {
        PreparedStatement ps = null;
        String sql = "INSERT INTO COMPAÑIA ( NROCOMPAÑIA, NOMBRE ) VALUES ( ?, ?)";

        try {
            ps = conn.prepareStatement(sql);
            
            ps.setInt(1, conpania.getNmroconpania());
            ps.setString(2, conpania.getNombre());
            

            ps.execute();
            ps.close();
            mensaje = "Compañía agregada correctamente";
        } catch (SQLException e) {
            mensaje = "Error al agregar la compañía: " + e.getMessage();
        }
        return mensaje;
    }

    // Método para modificar una compañía
    public String modificarConpania(Connection conn, Compania conpania) {
        PreparedStatement ps = null;
        String sql = "UPDATE COMPAÑIA SET NROCOMPAÑIA = ?, NOMBRE = ?"
                + " WHERE ID_COMPAÑIA = ?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, conpania.getNmroconpania());
            ps.setString(2, conpania.getNombre());
            
            ps.setInt(3, conpania.getId_compania());

            ps.execute();
            ps.close();
            mensaje = "Compañía modificada correctamente";
        } catch (SQLException e) {
            mensaje = "Error al modificar la compañía: " + e.getMessage();
        }
        return mensaje;
    }

    // Método para eliminar una compañía
   public String eliminarconpania (Connection conn, Compania compania){
        
        PreparedStatement ps = null ;
        String sql = "DELETE FROM COMPAÑIA WHERE ID_COMPAÑIA = ?";  
        
        
        try {
            ps= conn.prepareStatement(sql);
            ps.setInt(1,compania.getId_compania());
            
            
            ps.execute();
            ps.close();
            mensaje ="el tipo de documento fue eliminado";
        } catch (Exception e) {
            mensaje ="Error al eliminar los datos"+e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje ;
    }

    // Método para listar compañías
    public void listarConpania(Connection conn, JTable table) {

    DefaultTableModel model;
    Statement statement = null;
    ResultSet resultSet = null;
    String[] columnas = {"ID_COMPAÑIA", "NROCOMPAÑIA", "NOMBRE"};

    model = new DefaultTableModel(null, columnas);
    
    String sql = "SELECT * FROM COMPAÑIA";
    String[] datosTP = new String[3];
    
    try {
        statement = conn.createStatement();
        resultSet = statement.executeQuery(sql);
        
        while (resultSet.next()) {
            Compania DD = new Compania();
            DD.setId_compania(resultSet.getInt("ID_COMPAÑIA"));
            DD.setNmroconpania(resultSet.getInt("NROCOMPAÑIA"));
            DD.setNombre(resultSet.getString("NOMBRE"));
            
            datosTP[0] = DD.getId_compania()+ "";
            datosTP[1] = DD.getNmroconpania()+ "";
            datosTP[2] = DD.getNombre();
            
            model.addRow(datosTP);
        }
        table.setModel(model);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al listar compañías: " + e.getMessage());
        System.out.println(e.getMessage());
    }
}

    
    
    
    
}
