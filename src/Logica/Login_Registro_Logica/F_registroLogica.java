/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change null license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit null template
 */
package Logica.Login_Registro_Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import Logica.ConexionLOGIC.Conexion;

/**
 *
 * @author Cristiancrakl
 */
public class F_registroLogica {
    public void registrarUsuario(String Nombre ,String Correo,String Contraseña,String confirmarContraseña,String Rol) {
        

        // Validar que los campos no estén vacíos
        if (Nombre.isEmpty() || Correo.isEmpty() || Contraseña.isEmpty() || confirmarContraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;
        }

        // Validar que las contraseñas coincidan
        if (!Contraseña.equals(confirmarContraseña)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
            return;
        }

        // Conectar a la base de datos
        Connection connection = Conexion.getInstancia().conectar();
        if (connection == null) {
            return; // No se pudo conectar a la base de datos
        }

        try {
            // Verificar si el Correo ya existe
            String query = "SELECT COUNT(*) FROM registrohumanos WHERE Correo = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, Correo);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);

            if (count > 0) {
                JOptionPane.showMessageDialog(null, "El Correo ya está registrado.");
            } else {
                // Insertar el nuevo usuario sin hashear la Contraseña
                String insertQuery = "INSERT INTO registrohumanos (Nombre, Correo, Contraseña, Rol) VALUES (?, ?, ?, ?)";
                PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                insertStatement.setString(1, Nombre);
                insertStatement.setString(2, Correo);
                insertStatement.setString(3, Contraseña); 
                insertStatement.setString(4, Rol);
                insertStatement.executeUpdate();

                JOptionPane.showMessageDialog(null, "Registro exitoso.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            try {
                connection.close(); // Cerrar la conexión
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
