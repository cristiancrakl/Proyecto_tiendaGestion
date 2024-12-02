package Interfaz_Logica;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelUsuario extends javax.swing.JFrame {

    public PanelUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Main Panel Components
        setTitle("Panel de Usuario");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Main Tabbed Pane
        jTabbedPane1 = new javax.swing.JTabbedPane();

        // Appointments Panel
        panelCitas = new javax.swing.JPanel();
        jScrollPaneCitas = new javax.swing.JScrollPane();
        tableCitas = new javax.swing.JTable();
        
        // Services Panel
        panelServicios = new javax.swing.JPanel();
        jScrollPaneServicios = new javax.swing.JScrollPane();
        tableServicios = new javax.swing.JTable();

        // Products Panel
        panelProductos = new javax.swing.JPanel();
        jScrollPaneProductos = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();

        // Buttons
        btnNuevaCita = new javax.swing.JButton("Nueva Cita");
        btnCancelarCita = new javax.swing.JButton("Cancelar Cita");
        
        btnVerDetalleServicio = new javax.swing.JButton("Ver Detalle");
        
        btnComprarProducto = new javax.swing.JButton("Comprar");
        btnVerCarrito = new javax.swing.JButton("Ver Carrito");

        // Initialize Tables with placeholder columns
        // TODO: Replace with actual database connection and data retrieval
        initializeCitasTable();
        initializeServiciosTable();
        initializeProductosTable();

        // Appointments Panel Layout
        panelCitas.setLayout(new BorderLayout());
        panelCitas.add(jScrollPaneCitas, BorderLayout.CENTER);
        
        JPanel panelBotonesCitas = new JPanel();
        panelBotonesCitas.add(btnNuevaCita);
        panelBotonesCitas.add(btnCancelarCita);
        panelCitas.add(panelBotonesCitas, BorderLayout.SOUTH);

        // Services Panel Layout
        panelServicios.setLayout(new BorderLayout());
        panelServicios.add(jScrollPaneServicios, BorderLayout.CENTER);
        
        JPanel panelBotonesServicios = new JPanel();
        panelBotonesServicios.add(btnVerDetalleServicio);
        panelServicios.add(panelBotonesServicios, BorderLayout.SOUTH);

        // Products Panel Layout
        panelProductos.setLayout(new BorderLayout());
        panelProductos.add(jScrollPaneProductos, BorderLayout.CENTER);
        
        JPanel panelBotonesProductos = new JPanel();
        panelBotonesProductos.add(btnComprarProducto);
        panelBotonesProductos.add(btnVerCarrito);
        panelProductos.add(panelBotonesProductos, BorderLayout.SOUTH);

        // Add Panels to Tabbed Pane
        jTabbedPane1.addTab("Mis Citas", panelCitas);
        jTabbedPane1.addTab("Servicios", panelServicios);
        jTabbedPane1.addTab("Productos", panelProductos);

        // Set Layout
        setLayout(new BorderLayout());
        add(jTabbedPane1, BorderLayout.CENTER);
    }

    private void initializeCitasTable() {
        // TODO: Connect to database to retrieve actual appointments
        String[] columnNames = {"ID", "Fecha", "Hora", "Servicio", "Estado"};
        tableCitas.setModel(new DefaultTableModel(columnNames, 0));
        jScrollPaneCitas.setViewportView(tableCitas);
    }

    private void initializeServiciosTable() {
        // TODO: Connect to database to retrieve available services
        String[] columnNames = {"Servicio", "Descripción", "Duración", "Precio"};
        tableServicios.setModel(new DefaultTableModel(columnNames, 0));
        jScrollPaneServicios.setViewportView(tableServicios);
    }

    private void initializeProductosTable() {
        // TODO: Connect to database to retrieve available products
        String[] columnNames = {"Producto", "Descripción", "Precio", "Stock"};
        tableProductos.setModel(new DefaultTableModel(columnNames, 0));
        jScrollPaneProductos.setViewportView(tableProductos);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PanelUsuario().setVisible(true);
        });
    }

    // Variables declaration
    private javax.swing.JTabbedPane jTabbedPane1;
    
    // Panels
    private javax.swing.JPanel panelCitas;
    private javax.swing.JPanel panelServicios;
    private javax.swing.JPanel panelProductos;
    
    // Scroll Panes
    private javax.swing.JScrollPane jScrollPaneCitas;
    private javax.swing.JScrollPane jScrollPaneServicios;
    private javax.swing.JScrollPane jScrollPaneProductos;
    
    // Tables
    private javax.swing.JTable tableCitas;
    private javax.swing.JTable tableServicios;
    private javax.swing.JTable tableProductos;
    
    // Buttons
    private javax.swing.JButton btnNuevaCita;
    private javax.swing.JButton btnCancelarCita;
    private javax.swing.JButton btnVerDetalleServicio;
    private javax.swing.JButton btnComprarProducto;
    private javax.swing.JButton btnVerCarrito;
}
