/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change null license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit null template
 */
package Logica.Login_Registro_Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import Interfaz.Login_Registro.LoginUsuario;
import Interfaz.PanelesPrincipales.PanelAdmin;
import Interfaz.PanelesPrincipales.PanelUsuario;
import Logica.ConexionLOGIC.Conexion;

/**
 *
 * @author Cristiancrakl
 */
public class LoginUsuario_Logica {

    public void Login(String correo, String contraseña) {
        // Conectar a la base de datos
        Connection connection = Conexion.getInstancia().conectar();
        if (connection == null) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
            return;
        }
    
        while (true) {
            // Verificar que los campos no estén vacíos
            if (correo.isEmpty() || contraseña.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, complete ambos campos.");
                // Aquí puedes pedir al usuario que ingrese nuevamente el correo y la contraseña
                correo = JOptionPane.showInputDialog("Ingrese su correo:");
                contraseña = JOptionPane.showInputDialog("Ingrese su contraseña:");
                continue; // Volver a verificar los campos
            }
    
            try {
                // Verificar las credenciales del usuario
                String query = "SELECT Rol FROM registrohumanos WHERE Correo = ? AND Contraseña = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, correo);
                preparedStatement.setString(2, contraseña);
                ResultSet resultSet = preparedStatement.executeQuery();
    
                if (resultSet.next()) {
                    String rol = resultSet.getString("Rol");
                    if (rol.equals("Admin")) {
                        // Abrir el panel de administrador
                        PanelAdmin panelAdmin = new PanelAdmin(); // Asegúrate de tener esta clase
                        panelAdmin.setVisible(true);
                    } else if (rol.equals("Cliente")) {
                        // Abrir el panel de usuario
                        PanelUsuario panelUsuario = new PanelUsuario(); // Asegúrate de tener esta clase
                        panelUsuario.setVisible(true);
                    }
                    break; // Salir del bucle si el inicio de sesión es exitoso
                } else {
                    // Si las credenciales son incorrectas, mostrar un mensaje y pedir de nuevo
                    JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos.");
                    correo = JOptionPane.showInputDialog("Ingrese su correo:");
                    contraseña = JOptionPane.showInputDialog("Ingrese su contraseña:");
                }
    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                break; // Salir del bucle en caso de error
            }
        }
    
        try {
            connection.close(); // Cerrar la conexión
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
        }
    }
    
}
