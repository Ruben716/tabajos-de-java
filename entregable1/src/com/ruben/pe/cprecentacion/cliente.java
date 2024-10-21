/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ruben.pe.cprecentacion;

import com.ruben.pe.cmodelo.Cliente;
import con.ruben.pe.cnegocio.ClienteBO;

import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author ACER
 */
public class cliente extends javax.swing.JPanel {
    ClienteBO  tdbo = new  ClienteBO();
    Cliente dd = new Cliente();
    String idCliente;

    /**
     * Creates new form cliente
     */
    
    
    
    public cliente() {
        initComponents();
        listar_Cliente ();
        
    }
    public void listar_Cliente (){
        tdbo.listarCliente(tablaCliente);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cliente123 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtDni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        BTNeliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();

        Cliente123.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Short Plan", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("DATOS DEL CLIENTE");

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE");

        TxtNombre.setBackground(new java.awt.Color(255, 204, 153));
        TxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        TxtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DNI");

        TxtDni.setBackground(new java.awt.Color(255, 204, 153));
        TxtDni.setForeground(new java.awt.Color(0, 0, 0));
        TxtDni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TxtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDniActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DIRECCIÓN");

        TxtDireccion.setBackground(new java.awt.Color(255, 204, 153));
        TxtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        TxtDireccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TxtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDireccionActionPerformed(evt);
            }
        });

        BtnGuardar.setBackground(new java.awt.Color(0, 153, 153));
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCliente);

        BTNeliminar.setBackground(new java.awt.Color(0, 153, 153));
        BTNeliminar.setText("ELIMINAR");
        BTNeliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNeliminarActionPerformed(evt);
            }
        });

        BtnModificar.setBackground(new java.awt.Color(0, 153, 153));
        BtnModificar.setText("MODIFICAR");
        BtnModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("TELEFONO");

        TxtTelefono.setBackground(new java.awt.Color(255, 204, 153));
        TxtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        TxtTelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Cliente123Layout = new javax.swing.GroupLayout(Cliente123);
        Cliente123.setLayout(Cliente123Layout);
        Cliente123Layout.setHorizontalGroup(
            Cliente123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cliente123Layout.createSequentialGroup()
                .addGroup(Cliente123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Cliente123Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(BtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(BTNeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Cliente123Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(Cliente123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(TxtNombre)
                            .addComponent(TxtDni)
                            .addComponent(TxtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(TxtTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cliente123Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Cliente123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cliente123Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(355, 355, 355))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cliente123Layout.createSequentialGroup()
                        .addComponent(BtnModificar)
                        .addGap(279, 279, 279))))
        );
        Cliente123Layout.setVerticalGroup(
            Cliente123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cliente123Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGroup(Cliente123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cliente123Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(Cliente123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNeliminar)
                            .addComponent(BtnGuardar)))
                    .addGroup(Cliente123Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(BtnModificar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cliente123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cliente123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void TxtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDniActionPerformed

    private void TxtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDireccionActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        try {
        Cliente cl = new Cliente();
        
        cl.setNombre(TxtNombre.getText()); 
        cl.setDni(Integer.parseInt(TxtDni.getText())); //
        cl.setDireccion(TxtDireccion.getText()); 
        cl.setTelefono(Integer.parseInt(TxtTelefono.getText()));
        
        // Crear un objeto de negocio y llamar al método para agregar datos
        ClienteBO clienteBO = new ClienteBO();
        String mensaje = clienteBO.agregarCliente(cl);
        
        JOptionPane.showMessageDialog(this, mensaje);
        
        listar_Cliente();
        limpiarCampos();
        
    } catch (SQLException e) {
        // Manejo de excepciones
        JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
    } catch (NumberFormatException e) {
        // Manejo de excepciones para formato de número
        JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos.");
    }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void tablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClienteMouseClicked
        // TODO add your handling code here:
        
        int seleccion  = tablaCliente.rowAtPoint(evt.getPoint());
        idCliente = tablaCliente.getValueAt(seleccion, 0)+"";
        
        
        TxtNombre.setText(tablaCliente.getValueAt(seleccion, 1)+"");
        TxtDni.setText(tablaCliente.getValueAt(seleccion, 2)+"");
        TxtDireccion.setText(tablaCliente.getValueAt(seleccion, 3)+"");
        TxtTelefono.setText(tablaCliente.getValueAt(seleccion, 4)+"");
        
        
        
        
        System.out.println(seleccion);
        
        
        
    }//GEN-LAST:event_tablaClienteMouseClicked

    private void BTNeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNeliminarActionPerformed
        // TODO add your handling code here:
        
         if (idCliente != null && !idCliente.isEmpty()) {
            try {
                // Establecer el ID del documento a eliminar
                dd.setId_cliente(Integer.parseInt(idCliente));
                
                // Llamar al método de negocio para eliminar el documento
                String mensaje = tdbo.eliminarCliente(dd);
                
                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(this, mensaje);
                
                listar_Cliente();

                
                // Limpiar campos
                limpiarCampos();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar: ID no válido.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error de base de datos: " + e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un registro para eliminar.");
        }
        
        
        
        
    }//GEN-LAST:event_BTNeliminarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here:
        
        if (idCliente != null && !idCliente.isEmpty()) {
        try {
            dd.setId_cliente(Integer.parseInt(idCliente));
            dd.setNombre(TxtNombre.getText()); 
            dd.setDni(Integer.parseInt(TxtDni.getText())); 
            dd.setDireccion(TxtDireccion.getText()); 
            dd.setTelefono(Integer.parseInt(TxtTelefono.getText()));
            
            
            String mensaje = tdbo.modificarCliente(dd);
            
            JOptionPane.showMessageDialog(this, mensaje);
            
            listar_Cliente();
            
            limpiarCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Verifique que todos los campos sean válidos.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de base de datos: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un registro para modificar.");
    }
        
        
        
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void TxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefonoActionPerformed
    private void limpiarCampos() {
        TxtNombre.setText("");
        TxtDni.setText("");
        TxtDireccion.setText("");
        TxtTelefono.setText("");
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNeliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JPanel Cliente123;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtDni;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCliente;
    // End of variables declaration//GEN-END:variables
}
