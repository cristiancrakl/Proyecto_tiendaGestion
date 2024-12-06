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
    // Obtener los valores ingresados por el usuario

    public void añadirProductos(String idProducto, String nombreProducto, String cantidadProducto, String precio) {

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

        // Insertar el nuevo producto en la base de datos
        String query = "INSERT INTO inventario (id_producto, nombre_producto, cantidad, precio) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, idProducto);
            statement.setString(2, nombreProducto);
            statement.setInt(3, Integer.parseInt(cantidadProducto)); // Asegúrate de que la cantidad sea un entero
            statement.setFloat(4, Float.parseFloat(precio)); // Asegúrate de que el precio sea un número decimal
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Producto agregado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar el producto.");
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

        PanelAdmin panelAdmin = new PanelAdmin(); // Crear una nueva instancia de LoginUsuario
        panelAdmin.setVisible(true); // Hacer visible el panel de LoginUsuario

    }
}
