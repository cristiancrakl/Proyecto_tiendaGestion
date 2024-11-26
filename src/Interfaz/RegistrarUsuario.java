package Interfaz;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarUsuario {

    public RegistrarUsuario() {
        // Crear la ventana secundaria
        JFrame marcoSecundario = new JFrame("Formulario de Registro");
        marcoSecundario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        marcoSecundario.setSize(452, 396);
        marcoSecundario.getContentPane().setLayout(null);

        // Etiqueta de título
        JLabel lblNewLabel = new JLabel("Formulario de Registro");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel.setBounds(129, 11, 224, 52);
        marcoSecundario.getContentPane().add(lblNewLabel);

        // Campo de texto para nombre
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNombre.setBounds(45, 74, 86, 22);
        marcoSecundario.getContentPane().add(lblNombre);

        JTextField textFieldNombre = new JTextField();
        textFieldNombre.setBounds(145, 75, 250, 20);
        marcoSecundario.getContentPane().add(textFieldNombre);
        textFieldNombre.setColumns(10);

        // Campo de texto para correo electrónico
        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCorreo.setBounds(45, 114, 86, 22);
        marcoSecundario.getContentPane().add(lblCorreo);

        JTextField textFieldCorreo = new JTextField();
        textFieldCorreo.setBounds(145, 115, 250, 20);
        marcoSecundario.getContentPane().add(textFieldCorreo);
        textFieldCorreo.setColumns(10);

        // Campo para contraseña
        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblContrasena.setBounds(45, 154, 86, 22);
        marcoSecundario.getContentPane().add(lblContrasena);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(145, 155, 250, 20);
        marcoSecundario.getContentPane().add(passwordField);

        // Confirmar contraseña
        JLabel lblConfirmarContrasena = new JLabel("Confirmar Contraseña:");
        lblConfirmarContrasena.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblConfirmarContrasena.setBounds(45, 194, 140, 22);
        marcoSecundario.getContentPane().add(lblConfirmarContrasena);

        JPasswordField passwordFieldConfirmar = new JPasswordField();
        passwordFieldConfirmar.setBounds(145, 195, 250, 20);
        marcoSecundario.getContentPane().add(passwordFieldConfirmar);

        // Botón de registro
        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnRegistrar.setBounds(145, 240, 125, 30);
        marcoSecundario.getContentPane().add(btnRegistrar);

        JLabel lblNewLabel_1 = new JLabel("¿Ya tienes una cuenta?");
        lblNewLabel_1.setBounds(145, 281, 148, 14);
        marcoSecundario.getContentPane().add(lblNewLabel_1);

        JButton btnIniciarSesion = new JButton("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Abrir la ventana de inicio de sesión y cerrar la ventana de registro
                new LoginUsuario(); 
                marcoSecundario.dispose(); 
            }
        });
        btnIniciarSesion.setBounds(145, 303, 127, 23);
        marcoSecundario.getContentPane().add(btnIniciarSesion);

        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = textFieldNombre.getText();
                String correo = textFieldCorreo.getText();
                String contrasena = new String(passwordField.getPassword());
                String confirmarContrasena = new String(passwordFieldConfirmar.getPassword());

                if (nombre.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || confirmarContrasena.isEmpty()) {
                    JOptionPane.showMessageDialog(marcoSecundario, "Todos los campos son obligatorios.");
                } else if (!contrasena.equals(confirmarContrasena)) {
                    JOptionPane.showMessageDialog(marcoSecundario, "Las contraseñas no coinciden.");
                } else {
                    registrarUsuario(nombre, correo, contrasena); // Implementa este método para registrar el usuario.
                }
            }
        });

        marcoSecundario.setVisible(true);
    }

    public void registrarUsuario(String nombre, String correo, String contrasena) {
        // AQUÍ: Implementa la lógica para guardar el usuario en la base de datos y verificar q no existan.
        JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente.");
    }
}
