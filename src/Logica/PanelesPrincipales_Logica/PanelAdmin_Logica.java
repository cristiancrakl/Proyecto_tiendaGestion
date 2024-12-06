/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.PanelesPrincipales_Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Logica.ConexionLOGIC.Conexion;
import javax.swing.JTable;

/**
 *
 * @author Cristiancrakl
 */
public class PanelAdmin_Logica {

    public void cargarCitas(JTable tableCitas) {
        DefaultTableModel model = (DefaultTableModel) tableCitas.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de cargar nuevos datos

        Connection connection = Conexion.getInstancia().conectar();
        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
            return;
        }

        try {
            String query = "SELECT * FROM horariosCitas";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String fecha = resultSet.getString("dia");
                String hora = resultSet.getString("hora");
                String servicio = resultSet.getString("servicio");
                String estado = resultSet.getString("estado");

                model.addRow(new Object[] { id, fecha, hora, servicio, estado });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar citas: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    //para poder recivir tablas se le pone el DefaultTableModel model
    public void cargarProductos(JTable tableInventario)  {
        DefaultTableModel model = (DefaultTableModel) tableInventario.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de cargar nuevos datos

        Connection connection = Conexion.getInstancia().conectar();
        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
            return;
        }

        try {
            String query = "SELECT id_producto, nombre_producto, cantidad, precio FROM inventario";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String idProducto = resultSet.getString("id_producto");
                String nombreProducto = resultSet.getString("nombre_producto");
                int cantidad = resultSet.getInt("cantidad");
                float precio = resultSet.getFloat("precio");

                model.addRow(new Object[] { idProducto, nombreProducto, cantidad, precio });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar productos: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public void cargarCitas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void cargarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
