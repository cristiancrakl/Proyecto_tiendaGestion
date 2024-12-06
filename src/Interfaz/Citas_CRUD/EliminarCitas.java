/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz.Citas_CRUD;


import Logica.Citas_CRUD_Logica.EliminarCitas_Logica;
import Logica.ConexionLOGIC.Conexion;

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
public class EliminarCitas extends javax.swing.JFrame {

    /**
     * Creates new form F_registro
     */
    public EliminarCitas() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textDia = new javax.swing.JTextField();
        TextHoraInicio = new javax.swing.JTextField();
        btn_EliminarHorario = new javax.swing.JButton();
        btn_VolverInicio = new javax.swing.JButton();
        combo_Disponible = new javax.swing.JComboBox<>();
        TextHorafinal = new javax.swing.JTextField();
        btn_buscarID = new javax.swing.JButton();
        txt_EliminarID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dia");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Eliminar Horario");

        jLabel3.setText("Hora");

        jLabel4.setText("Servicio");

        jLabel5.setText("Estado");

        btn_EliminarHorario.setText("Eliminar Horario");
        btn_EliminarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarHorarioActionPerformed(evt);
            }
        });

        btn_VolverInicio.setText("Volver al Inicio");
        btn_VolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverInicioActionPerformed(evt);
            }
        });

        combo_Disponible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible ", "No disponible" }));

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
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textDia, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                        .addComponent(TextHoraInicio)
                        .addComponent(TextHorafinal))
                    .addComponent(combo_Disponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txt_EliminarID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscarID)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_EliminarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_VolverInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(284, 284, 284))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_buscarID)
                        .addComponent(txt_EliminarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(textDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextHorafinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combo_Disponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btn_EliminarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_VolverInicio)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarIDActionPerformed
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
        // Consultar el horario por ID
        String query = "SELECT * FROM horarioscitas WHERE id = ?"; // Asegúrate de que el nombre de la tabla y columna sea correcto
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            // Si se encuentra el horario, llenar los campos
            textDia.setText(resultSet.getString("dia"));
            TextHoraInicio.setText(resultSet.getString("hora"));
            TextHorafinal.setText(resultSet.getString("servicio")); // Cambia "servicio" por el nombre correcto de la columna
            combo_Disponible.setSelectedItem(resultSet.getString("estado")); // Cambia "estado" por el nombre correcto de la columna
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un horario con ese ID.");
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
    }//GEN-LAST:event_btn_buscarIDActionPerformed

    private void btn_VolverInicioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:btn_VolverInicioActionPerformed
        this.dispose();

        PanelAdmin panelAdmin = new PanelAdmin(); // Crear una nueva instancia de panel admin
        panelAdmin.setVisible(true);

    }

    private void btn_EliminarHorarioActionPerformed(java.awt.event.ActionEvent evt) {
        String id = txt_EliminarID.getText().trim(); // Obtener el ID a eliminar

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID.");
            return;
        }

        EliminarCitas_Logica eliminarC =new EliminarCitas_Logica();
        eliminarC.eliminarHorario(id);
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
                new EliminarCitas().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextHoraInicio;
    private javax.swing.JTextField TextHorafinal;
    private javax.swing.JButton btn_EliminarHorario;
    private javax.swing.JButton btn_VolverInicio;
    private javax.swing.JButton btn_buscarID;
    private javax.swing.JComboBox<String> combo_Disponible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textDia;
    private javax.swing.JTextField txt_EliminarID;
    // End of variables declaration//GEN-END:variables
}
