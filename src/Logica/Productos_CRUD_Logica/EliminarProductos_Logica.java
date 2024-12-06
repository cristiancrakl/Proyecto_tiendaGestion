/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change null license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit null template
 */
package Logica.Productos_CRUD_Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Interfaz.PanelesPrincipales.PanelAdmin;
import Logica.ConexionLOGIC.Conexion;

/**
 *
 * @author Cristiancrakl
 */
public class EliminarProductos_Logica {

    public void eliminarProducto(String idProducto) {
        // Validar que el ID no esté vacío
        if (idProducto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID.");
            return;
        }

        // Conectar a la base de datos
        Connection connection = Conexion.getInstancia().conectar();
        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
            return;
        }

        // Eliminar el producto de la base de datos
        String query = "DELETE FROM inventario WHERE id_producto = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, idProducto);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente.");
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
    }
}
