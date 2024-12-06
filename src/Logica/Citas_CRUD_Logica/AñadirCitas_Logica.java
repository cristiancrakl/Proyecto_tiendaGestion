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
public class AñadirCitas_Logica {

    public void agregarHorario(String dia, String horaInicio, String horaFinal, String estado) {
        // Validate the input
        if (dia.isEmpty() || horaInicio.isEmpty() || horaFinal.isEmpty() || estado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            return;
        }

        // Connect base de datos
        Connection connection = Conexion.getInstancia().conectar();
        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Error connecting to the database.");
            return;
        }

        // Insert the new horario into the database
        String query = "INSERT INTO horarioscitas (dia, hora, servicio, estado) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, dia);
            statement.setString(2, horaInicio);
            statement.setString(3, horaFinal);
            statement.setString(4, estado);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Horario added successfully.");

            } else {
                JOptionPane.showMessageDialog(null, "Error adding horario.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

        // Close the connection
        try {
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error closing connection: " + e.getMessage());
        }
    }

}
