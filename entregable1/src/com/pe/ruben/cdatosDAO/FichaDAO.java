/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.ruben.cdatosDAO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FichaDAO {

    public void listarDatosCombinados(Connection conn, JTable table) {
        DefaultTableModel model;
        Statement statement = null;
        ResultSet resultSet = null;
        String[] columnas = {"ID_CLIENTE", "NOMBRE_CLIENTE", "DNI", "DIRECCION", "TELEFONO",
                             "ID_BILLETE", "NUMERO_BILLETE",  "HORA", "ITINERARIO",
                             "ID_COMPAÑIA", "NROCOMPAÑIA", "NOMBRE_COMPAÑIA"};

        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT C.ID_CLIENTE, C.NOMBRE AS NOMBRE_CLIENTE, C.DNI, C.DIRECCION, C.TELEFONO, " +
                     "B.ID_BILLETE, B.NUMERO_BILLETE, B.HORA, B.ITINERARIO, " +
                     "CP.ID_COMPAÑIA, CP.NROCOMPAÑIA, CP.NOMBRE AS NOMBRE_COMPAÑIA " +
                     "FROM CLIENTE C " +
                     "JOIN BILLETE B ON C.ID_CLIENTE = B.ID_CLIENTE " +
                     "JOIN COMPAÑIA CP ON B.ID_COMPAÑIA = CP.ID_COMPAÑIA";

        String[] datosTP = new String[13];

        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
                // Obtener los datos del cliente
                datosTP[0] = resultSet.getInt("ID_CLIENTE") + "";
                datosTP[1] = resultSet.getString("NOMBRE_CLIENTE");
                datosTP[2] = resultSet.getInt("DNI") + "";
                datosTP[3] = resultSet.getString("DIRECCION");
                datosTP[4] = resultSet.getInt("TELEFONO") + "";

                // Obtener los datos del billete
                datosTP[5] = resultSet.getInt("ID_BILLETE") + "";
                datosTP[6] = resultSet.getInt("NUMERO_BILLETE") + "";
                datosTP[7] = resultSet.getString("HORA");
                datosTP[8] = resultSet.getString("ITINERARIO");

                // Obtener los datos de la compañía
                datosTP[9] = resultSet.getInt("ID_COMPAÑIA") + "";
                datosTP[10] = resultSet.getInt("NROCOMPAÑIA") + "";
                datosTP[11] = resultSet.getString("NOMBRE_COMPAÑIA");

                model.addRow(datosTP);
            }
            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar datos combinados: " + e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}

