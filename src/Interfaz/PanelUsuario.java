package Interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanelUsuario extends JFrame {

    private static final long serialVersionUID = 1L;
    private ArrayList<String> horariosDisponibles;

    // Constructor que recibe los horarios disponibles
    public PanelUsuario(ArrayList<String> horarios) {
        this.horariosDisponibles = horarios; // Asignar los horarios pasados al parámetro
        
        setTitle("Panel de Usuario");
        setBounds(100, 100, 500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Etiqueta de título
        JLabel lblNewLabel = new JLabel("Agendar Cita");
        lblNewLabel.setBounds(200, 20, 100, 30);
        contentPane.add(lblNewLabel);

        // Mostrar horarios disponibles
        JLabel lblHorarios = new JLabel("Seleccione un horario:");
        lblHorarios.setBounds(50, 80, 200, 30);
        contentPane.add(lblHorarios);

        // JComboBox para seleccionar el horario
        JComboBox<String> comboBoxHorarios = new JComboBox<>();
        for (String horario : horariosDisponibles) {
            comboBoxHorarios.addItem(horario);  // Agrega los horarios recibidos desde la base de datos
        }
        comboBoxHorarios.setBounds(50, 120, 400, 30);
        contentPane.add(comboBoxHorarios);

        // Botón para agendar cita
        JButton btnAgendarCita = new JButton("Agendar Cita");
        btnAgendarCita.setBounds(150, 180, 200, 30);
        contentPane.add(btnAgendarCita);

        btnAgendarCita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agendar la cita
                String horarioSeleccionado = (String) comboBoxHorarios.getSelectedItem();
                if (horarioSeleccionado != null) {
                    agendarCita(horarioSeleccionado); // Implementa la lógica para agendar la cita.
                    JOptionPane.showMessageDialog(contentPane, "Cita agendada exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(contentPane, "Por favor seleccione un horario.");
                }
            }
        });

        // Botón de cerrar sesión
        JButton btnCerrarSesion = new JButton("Cerrar Sesión");
        btnCerrarSesion.setBounds(150, 250, 200, 30);
        contentPane.add(btnCerrarSesion);

        btnCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarSesion(); // Implementa la lógica para cerrar sesión.
            }
        });
    }

    // Método principal (ejemplo)
    public static void main(String[] args) {
        // Obtención de los horarios desde la base de datos
        ArrayList<String> horarios = obtenerHorariosDesdeBD(); // Método que debe consultar la base de datos

        // Iniciar la interfaz de usuario
        SwingUtilities.invokeLater(() -> new PanelUsuario(horarios).setVisible(true));
    }

    // Métodos a implementar
    public static ArrayList<String> obtenerHorariosDesdeBD() {
        ArrayList<String> horarios = new ArrayList<>();
        // AQUÍ: Implementa la conexión con la base de datos y realiza un SELECT para obtener los horarios.
        return horarios;
    }

    public void agendarCita(String horarioSeleccionado) {
        // AQUÍ: Implementa la conexión con la base de datos y realiza un INSERT para agendar la cita.
    }

    public void cerrarSesion() {
        // AQUÍ: Implementa la lógica para cerrar sesión.
        // Redirigir a la ventana Principal.
        JOptionPane.showMessageDialog(this, "Sesión cerrada.");
        dispose(); // Cierra la ventana actual.
    }
}
