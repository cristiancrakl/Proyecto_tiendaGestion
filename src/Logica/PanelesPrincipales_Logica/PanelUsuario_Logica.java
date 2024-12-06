/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change null license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit null template
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
public class PanelUsuario_Logica {
    private void cargarCitas(DefaultTableModel model) {
        
        model.setRowCount(0); // Limpiar la tabla antes de cargar nuevos datos

        Connection connection = Conexion.getInstancia().conectar();
        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
            return;
        }

        try {
            String query = "SELECT * FROM horariosCitas"; // Cambia esto según tu estructura de base de datos
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id"); // Cambia "id" por el nombre de tu columna
                String fecha = resultSet.getString("dia"); // Cambia "fecha" por el nombre de tu columna
                String hora = resultSet.getString("hora"); // Cambia "hora" por el nombre de tu columna
                String servicio = resultSet.getString("servicio"); // Cambia "servicio" por el nombre de tu columna
                String estado = resultSet.getString("estado"); // Cambia "estado" por el nombre de tu columna

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

    private void cargarProductos(DefaultTableModel model) {
        

        model.setRowCount(0); // Limpiar la tabla antes de cargar nuevos datos
    
        Connection connection = Conexion.getInstancia().conectar();
        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
            return;
        }
    
        try {
            String query = "SELECT id_producto, nombre_producto, cantidad, precio FROM inventario"; // Cambia esto según tu estructura de base de datos
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
    
            while (resultSet.next()) {
                String idProducto = resultSet.getString("id_producto");
                String nombreProducto = resultSet.getString("nombre_producto");
                int cantidad = resultSet.getInt("cantidad");
                float precio = resultSet.getFloat("precio");
    
                model.addRow(new Object[]{idProducto, nombreProducto, cantidad, precio});
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

    public void cargarCitas(JTable tableCitas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void cargarProductos(JTable tableProductos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
