/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change null license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit null template
 */
package Logica.Citas_CRUD_Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Logica.ConexionLOGIC.Conexion;

/**
 *
 * @author Cristiancrakl
 */
public class ModificarCitas_Logica {

    public void modificarHorarios( String dia, String hora, String servicio,String estado,String id) {
        // Conectar a la base de datos
        Connection connection = Conexion.getInstancia().conectar();
        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
            return;
        }

        String query = "UPDATE horarioscitas SET dia = ?, hora = ?, servicio = ?, estado = ? WHERE id = ?"; // Cambia "id" por el nombre de tu columna
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, dia);
            statement.setString(2, hora);
            statement.setString(3, servicio);
            statement.setString(4, estado);
            statement.setString(5, id);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Horario modificado exitosamente.");
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
    }


}
