/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz.Productos_CRUD;

import Logica.ConexionLOGIC.Conexion;
import Logica.Productos_CRUD_Logica.EliminarProductos_Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Interfaz.PanelesPrincipales.PanelAdmin;

/**
 *
 * @author Lenovo
 */
public class EliminarProductos extends javax.swing.JFrame {

        /**
         * Creates new form F_registro
         */
        public EliminarProductos() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                Id_producto = new javax.swing.JTextField();
                Text_Producto = new javax.swing.JTextField();
                btn_ELiminarProducto = new javax.swing.JButton();
                btn_VolverInicio = new javax.swing.JButton();
                Int_cantidadProducto = new javax.swing.JTextField();
                Decimal_precio = new javax.swing.JTextField();
                btn_buscarID = new javax.swing.JButton();
                txt_EliminarID = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("ID");

                jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel2.setText("Eliminar un Producto");

                jLabel3.setText("Producto");

                jLabel4.setText("Cantidad");

                jLabel5.setText("Precio");

                Id_producto.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Id_productoActionPerformed(evt);
                        }
                });

                btn_ELiminarProducto.setText("Eliminar Producto");
                btn_ELiminarProducto.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_ELiminarProductoActionPerformed(evt);
                        }
                });

                btn_VolverInicio.setText("Volver al Inicio");
                btn_VolverInicio.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_VolverInicioActionPerformed(evt);
                        }
                });

                btn_buscarID.setText("Buscar");
                btn_buscarID.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_buscarIDActionPerformed(evt);
                        }
                });

                txt_EliminarID.setText("Buscar id");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(48, 48, 48)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jLabel1,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel3,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel4,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                116,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(Id_producto,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                422,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(Text_Producto)
                                                                                                                .addComponent(Int_cantidadProducto)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                126,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(Decimal_precio,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                424,
                                                                                                                Short.MAX_VALUE)))
                                                                .addContainerGap(91, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                189,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(37, 37, 37)
                                                                                                                .addComponent(txt_EliminarID,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                113,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(btn_buscarID)
                                                                                                                .addGap(18, 18, 18))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addComponent(btn_ELiminarProducto,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                145,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(268, 268,
                                                                                                                                268))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(btn_VolverInicio,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                119,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(284, 284,
                                                                                                                                284)))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                33,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(btn_buscarID)
                                                                                                .addComponent(txt_EliminarID,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(Id_producto,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(Text_Producto,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(Int_cantidadProducto,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(Decimal_precio,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                87,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(btn_ELiminarProducto,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                61,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btn_VolverInicio)
                                                                .addGap(22, 22, 22)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btn_buscarIDActionPerformed(java.awt.event.ActionEvent evt) {
                String id = txt_EliminarID.getText().trim(); // Obtener el ID a buscar

                if (id.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID.");
                        return;
                }

                // Conectar a la base de datos
                Connection connection = Conexion.getInstancia().conectar();
                if (connection == null) {
                        JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
                        return;
                }

                try {
                        // Consultar el producto por ID
                        String query = "SELECT * FROM inventario WHERE id_producto = ?";
                        PreparedStatement preparedStatement = connection.prepareStatement(query);
                        preparedStatement.setString(1, id);
                        ResultSet resultSet = preparedStatement.executeQuery();

                        if (resultSet.next()) {
                                // Si se encuentra el producto, llenar los campos
                                Id_producto.setText(resultSet.getString("id_producto"));
                                Text_Producto.setText(resultSet.getString("nombre_producto"));
                                Int_cantidadProducto.setText(String.valueOf(resultSet.getInt("cantidad")));
                                Decimal_precio.setText(String.valueOf(resultSet.getFloat("precio")));
                        } else {
                                JOptionPane.showMessageDialog(null, "No se encontró un producto con ese ID.");
                        }
                } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                } finally {
                        try {
                                connection.close(); // Cerrar la conexión
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
                        }
                }
        }// GEN-LAST:event_btn_buscarIDActionPerformed

        private void Id_productoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Id_productoActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_Id_productoActionPerformed

        private void btn_VolverInicioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:btn_VolverInicioActionPerformed
                PanelAdmin panelAdmin = new PanelAdmin(); // Crear una nueva instancia de LoginUsuario
                panelAdmin.setVisible(true);

                this.dispose(); // Cierra la ventana actual

        }

        private void btn_ELiminarProductoActionPerformed(java.awt.event.ActionEvent evt) {
                // Obtener el ID del producto a eliminar
                String idProducto = Id_producto.getText().trim();

                // Crear una instancia de la lógica de eliminación de productos
                EliminarProductos_Logica eliminarProductosLogica = new EliminarProductos_Logica();
                eliminarProductosLogica.eliminarProducto(idProducto);
                
                PanelAdmin panelAdmin = new PanelAdmin(); // Crear una nueva instancia de panel admin
                panelAdmin.setVisible(true);
        
        
                // Cerrar la ventana actual
                this.dispose();

        }

        // GEN-LAST:event_btn_iniciar_SesionActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new EliminarProductos().setVisible(true);
                        }
                });

        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField Decimal_precio;
        private javax.swing.JTextField Id_producto;
        private javax.swing.JTextField Int_cantidadProducto;
        private javax.swing.JTextField Text_Producto;
        private javax.swing.JButton btn_ELiminarProducto;
        private javax.swing.JButton btn_VolverInicio;
        private javax.swing.JButton btn_buscarID;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JTextField txt_EliminarID;
        // End of variables declaration//GEN-END:variables
}
