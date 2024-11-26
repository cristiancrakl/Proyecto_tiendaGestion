package Interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAdmin extends JFrame {

    private static final long serialVersionUID = 1L;

    public PanelAdmin() {
        setTitle("Panel de Administrador");
        setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();
        setContentPane(tabbedPane);

        // Gestión de Inventario
        JPanel panelInventario = new JPanel();
        panelInventario.setLayout(null);

        // Etiquetas y campos para agregar productos
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(50, 50, 100, 30);
        panelInventario.add(lblNombre);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(150, 50, 200, 30);
        panelInventario.add(txtNombre);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(50, 100, 100, 30);
        panelInventario.add(lblCantidad);

        JSpinner spinnerCantidad = new JSpinner(new SpinnerNumberModel(1, 1, 1000, 1));
        spinnerCantidad.setBounds(150, 100, 200, 30);
        panelInventario.add(spinnerCantidad);

        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(50, 150, 100, 30);
        panelInventario.add(lblPrecio);

        JTextField txtPrecio = new JTextField();
        txtPrecio.setBounds(150, 150, 200, 30);
        panelInventario.add(txtPrecio);

        // Botón para agregar productos
        JButton btnAgregarProducto = new JButton("Agregar Producto");
        btnAgregarProducto.setBounds(50, 200, 200, 30);
        panelInventario.add(btnAgregarProducto);

        // Botón para listar productos
        JButton btnListarProductos = new JButton("Listar Productos");
        btnListarProductos.setBounds(300, 200, 200, 30);
        panelInventario.add(btnListarProductos);

        // Área para mostrar el inventario
        JTextArea textAreaInventario = new JTextArea();
        textAreaInventario.setEditable(false);
        JScrollPane scrollPaneInventario = new JScrollPane(textAreaInventario);
        scrollPaneInventario.setBounds(50, 250, 700, 250);
        panelInventario.add(scrollPaneInventario);

        // Agregar la pestaña al panel principal
        tabbedPane.addTab("Gestión de Inventario", panelInventario);

        // Pestaña de Gestión de Horarios de Atención
        JPanel panelHorarios = new JPanel();
        panelHorarios.setLayout(null);

        JLabel lblDia = new JLabel("Día:");
        lblDia.setBounds(50, 50, 100, 30);
        panelHorarios.add(lblDia);

        JComboBox<String> comboBoxDia = new JComboBox<>(new String[]{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"});
        comboBoxDia.setBounds(150, 50, 200, 30);
        panelHorarios.add(comboBoxDia);

        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(50, 100, 100, 30);
        panelHorarios.add(lblFecha);

        JSpinner spinnerFecha = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinnerFecha, "yyyy-MM-dd");
        spinnerFecha.setEditor(dateEditor);
        spinnerFecha.setBounds(150, 100, 150, 30);
        panelHorarios.add(spinnerFecha);

        JLabel lblHora = new JLabel("Hora:");
        lblHora.setBounds(50, 150, 100, 30);
        panelHorarios.add(lblHora);

        JSpinner spinnerHora = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(spinnerHora, "HH:mm");
        spinnerHora.setEditor(timeEditor);
        spinnerHora.setBounds(150, 150, 100, 30);
        panelHorarios.add(spinnerHora);

        JButton btnAgregarHorario = new JButton("Agregar Horario");
        btnAgregarHorario.setBounds(400, 50, 150, 30);
        panelHorarios.add(btnAgregarHorario);

        JButton btnVerHorarios = new JButton("Ver Horarios");
        btnVerHorarios.setBounds(150, 200, 150, 30);
        panelHorarios.add(btnVerHorarios);

        JTextArea textAreaHorarios = new JTextArea();
        textAreaHorarios.setEditable(false);
        textAreaHorarios.setBounds(150, 250, 500, 200);
        JScrollPane scrollPane = new JScrollPane(textAreaHorarios);
        scrollPane.setBounds(150, 250, 500, 200);
        panelHorarios.add(scrollPane);

        tabbedPane.addTab("Gestión de Horarios de Atención", panelHorarios);

        // Pestaña de Gestión de Citas
        JPanel panelCitas = new JPanel();
        panelCitas.setLayout(null);

        JButton btnVerCitas = new JButton("Ver Citas Agendadas");
        btnVerCitas.setBounds(50, 50, 200, 30);
        panelCitas.add(btnVerCitas);

        JButton btnEliminarCita = new JButton("Eliminar Cita");
        btnEliminarCita.setBounds(300, 50, 200, 30);
        panelCitas.add(btnEliminarCita);

        JTextArea textAreaCitas = new JTextArea();
        textAreaCitas.setEditable(false);
        JScrollPane scrollPaneCitas = new JScrollPane(textAreaCitas);
        scrollPaneCitas.setBounds(50, 100, 700, 400);
        panelCitas.add(scrollPaneCitas);

        tabbedPane.addTab("Gestión de Citas", panelCitas);

        // Acciones de los botones
        btnAgregarHorario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar la lógica para agregar el horario
            }
        });

        btnVerHorarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar la lógica para ver los horarios
            }
        });

        btnVerCitas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar la lógica para ver las citas agendadas
            }
        });

        btnEliminarCita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar la lógica para eliminar una cita
            }
        });

        btnAgregarProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar la lógica para agregar un producto
            }
        });

        btnListarProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar la lógica para listar los productos
            }
        });
    }

    // Método main para iniciar la aplicación
    public static void main(String[] args) {
        // Crear la interfaz de administrador y mostrarla
        SwingUtilities.invokeLater(() -> new PanelAdmin().setVisible(true));
    }
}

