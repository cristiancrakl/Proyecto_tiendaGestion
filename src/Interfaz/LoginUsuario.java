package Interfaz;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;


public class LoginUsuario {
    public LoginUsuario() {
        
        // Creación de la ventana de inicio de sesión
        JFrame marcoSecundario = new JFrame("Iniciar Sesion");
        marcoSecundario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        marcoSecundario.setSize(479, 388);
        marcoSecundario.getContentPane().setLayout(null);

        // Título de la ventana
        JLabel lblTitulo = new JLabel("Iniciar Sesión");
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(150, 20, 180, 30);
        marcoSecundario.getContentPane().add(lblTitulo);
        
        // Campo de texto para el correo electrónico
        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCorreo.setBounds(40, 80, 70, 30);
        marcoSecundario.getContentPane().add(lblCorreo);
        
        JTextField txtCorreo = new JTextField();
        txtCorreo.setBounds(120, 80, 250, 30);
        marcoSecundario.getContentPane().add(txtCorreo);

        // Campo para la contraseña
        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblContrasena.setBounds(40, 120, 80, 30);
        marcoSecundario.getContentPane().add(lblContrasena);

        JPasswordField txtContrasena = new JPasswordField();
        txtContrasena.setBounds(120, 120, 250, 30);
        marcoSecundario.getContentPane().add(txtContrasena);

        // Botón de inicio de sesión
        JButton btnIniciarSesion = new JButton("Iniciar Sesion");
        btnIniciarSesion.setBackground(new Color(128, 128, 128));
        btnIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnIniciarSesion.setBounds(150, 180, 150, 40);
        marcoSecundario.getContentPane().add(btnIniciarSesion);
        
        JLabel lblNewLabel_1 = new JLabel("Aun no tienes una cuenta?");
        lblNewLabel_1.setBounds(162, 278, 225, 14);
        marcoSecundario.getContentPane().add(lblNewLabel_1);
        
        JButton btnRegistrarUsuario = new JButton("Registrate");
        btnRegistrarUsuario.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                new RegistrarUsuario();
                marcoSecundario.dispose(); // Cierra la ventana de registro
        	}
        });
        btnRegistrarUsuario.setBounds(162, 303, 138, 23);
        marcoSecundario.getContentPane().add(btnRegistrarUsuario);

        // Acción para el botón de iniciar sesión
        btnIniciarSesion.addActionListener(e -> {
        	// Validación de las credenciales ( VALIDAR LOS DATOS CON LA BASE DE DATOS) y si es admin abrir el PanelAdmin, si es usuario normal el PanelUsuario
        });

        marcoSecundario.setVisible(true);
    } 
}

