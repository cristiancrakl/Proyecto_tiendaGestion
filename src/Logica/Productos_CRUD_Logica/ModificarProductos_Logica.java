/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change null license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit null template
 */
package Logica.Productos_CRUD_Logica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import Logica.ConexionLOGIC.Conexion;

/**
 *
 * @author Cristiancrakl
 */
public class ModificarProductos_Logica {
    // Obtener los valores ingresados por el usuario

    public void modificarProducto(String idProducto, String nombreProducto, String cantidadProducto, String precio) {
        // Validar que los campos no estén vacíos
        if (idProducto.isEmpty() || nombreProducto.isEmpty() || cantidadProducto.isEmpty() || precio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;
        }

        // Conectar a la base de datos
        Connection connection = Conexion.getInstancia().conectar();
        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
            return;
        }

        // Actualizar el producto en la base de datos
        String query = "UPDATE inventario SET nombre_producto = ?, cantidad = ?, precio = ? WHERE id_producto = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nombreProducto);
            statement.setInt(2, Integer.parseInt(cantidadProducto)); // Asegúrate de que la cantidad sea un entero
            statement.setFloat(3, Float.parseFloat(precio)); // Asegúrate de que el precio sea un número decimal
            statement.setString(4, idProducto);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Producto modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el producto. Verifique el ID.");
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
