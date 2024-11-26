package Interfaz;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaPrincipal frame = new VentanaPrincipal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public VentanaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 611, 475);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Sistema de Gestion");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
        lblNewLabel.setBounds(147, 35, 385, 68);
        contentPane.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Registrarse");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RegistrarUsuario(); // Llamada a la ventana de registro
                dispose();
            }
        });
        btnNewButton.setBounds(127, 238, 127, 51);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Iniciar Sesion");
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new LoginUsuario(); // Llamada a la ventana de inicio de sesión
                dispose();
            }
        });
        btnNewButton_1.setBounds(308, 238, 170, 51);
        contentPane.add(btnNewButton_1);
        
    }
}

