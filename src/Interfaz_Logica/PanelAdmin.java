package Interfaz_Logica;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelAdmin extends javax.swing.JFrame {

    public PanelAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Main Panel Components
        setTitle("Panel de Administración");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Main Tabbed Pane
        jTabbedPane1 = new javax.swing.JTabbedPane();

        // Appointments Panel
        panelCitas = new javax.swing.JPanel();
        jScrollPaneCitas = new javax.swing.JScrollPane();
        tableCitas = new javax.swing.JTable();
        
        // Horarios Panel
        panelHorarios = new javax.swing.JPanel();
        jScrollPaneHorarios = new javax.swing.JScrollPane();
        tableHorarios = new javax.swing.JTable();

        // Inventory Panel
        panelInventario = new javax.swing.JPanel();
        jScrollPaneInventario = new javax.swing.JScrollPane();
        tableInventario = new javax.swing.JTable();

        // Sales Panel
        panelVentas = new javax.swing.JPanel();
        jScrollPaneVentas = new javax.swing.JScrollPane();
        tableVentas = new javax.swing.JTable();

        // Buttons
        btnAgregarCita = new javax.swing.JButton("Agregar Cita");
        btnEliminarCita = new javax.swing.JButton("Eliminar Cita");
        btnAgregarHorario = new javax.swing.JButton("Agregar Horario");
        btnEliminarHorario = new javax.swing.JButton("Eliminar Horario");
        
        btnAgregarProducto = new javax.swing.JButton("Agregar Producto");
        btnEditarProducto = new javax.swing.JButton("Editar Producto");
        btnEliminarProducto = new javax.swing.JButton("Eliminar Producto");
        
        btnGenerarReporte = new javax.swing.JButton("Generar Reporte");

        
        initializeCitasTable();
        initializeHorariosTable();
        initializeInventarioTable();
        initializeVentasTable();

        
        panelCitas.setLayout(new BorderLayout());
        panelCitas.add(jScrollPaneCitas, BorderLayout.CENTER);
        
        JPanel panelBotonesCitas = new JPanel();
        panelBotonesCitas.add(btnAgregarCita);
        panelBotonesCitas.add(btnEliminarCita);
        panelCitas.add(panelBotonesCitas, BorderLayout.SOUTH);

        
        panelHorarios.setLayout(new BorderLayout());
        panelHorarios.add(jScrollPaneHorarios, BorderLayout.CENTER);
        
        JPanel panelBotonesHorarios = new JPanel();
        panelBotonesHorarios.add(btnAgregarHorario);
        panelBotonesHorarios.add(btnEliminarHorario);
        panelHorarios.add(panelBotonesHorarios, BorderLayout.SOUTH);

        
        panelInventario.setLayout(new BorderLayout());
        panelInventario.add(jScrollPaneInventario, BorderLayout.CENTER);
        
        JPanel panelBotonesInventario = new JPanel();
        panelBotonesInventario.add(btnAgregarProducto);
        panelBotonesInventario.add(btnEditarProducto);
        panelBotonesInventario.add(btnEliminarProducto);
        panelInventario.add(panelBotonesInventario, BorderLayout.SOUTH);

       
        panelVentas.setLayout(new BorderLayout());
        panelVentas.add(jScrollPaneVentas, BorderLayout.CENTER);
        
        JPanel panelBotonesVentas = new JPanel();
        panelBotonesVentas.add(btnGenerarReporte);
        panelVentas.add(panelBotonesVentas, BorderLayout.SOUTH);

        
        jTabbedPane1.addTab("Citas", panelCitas);
        jTabbedPane1.addTab("Horarios", panelHorarios);
        jTabbedPane1.addTab("Inventario", panelInventario);
        jTabbedPane1.addTab("Ventas", panelVentas);

        // Set Layout
        setLayout(new BorderLayout());
        add(jTabbedPane1, BorderLayout.CENTER);
    }

    private void initializeCitasTable() {
        //traer datos de las citas  agendadas por los usuarios desde la BD, estos son datos de prueba
        String[] columnNames = {"ID", "Fecha", "Hora", "Cliente", "Servicio"};
        Object[][] data = {
            {"1", "2024-02-15", "10:00 AM", "Juan Pérez", "Consulta General"},
            {"2", "2024-02-16", "11:30 AM", "María García", "Tratamiento"}
        };
        
        tableCitas.setModel(new DefaultTableModel(data, columnNames));
        jScrollPaneCitas.setViewportView(tableCitas);
    }

    private void initializeHorariosTable() {
         //traer datos de los horaris desde la BD, estos son datos de prueba
        String[] columnNames = {"Día", "Hora Inicio", "Hora Fin", "Disponible"};
        Object[][] data = {
            {"Lunes", "08:00 AM", "12:00 PM", "Disponible"},
            {"Martes", "02:00 PM", "06:00 PM", "Disponible"}
        };
        
        tableHorarios.setModel(new DefaultTableModel(data, columnNames));
        jScrollPaneHorarios.setViewportView(tableHorarios);
    }

    private void initializeInventarioTable() {
        //traer datos del inventario desde la BD, estos son datos de prueba
        String[] columnNames = {"ID", "Producto", "Cantidad", "Precio"};
        Object[][] data = {
            {"1", "A", "50", "$10.00"},
            {"2", "B", "30", "$15.50"}
        };
        
        tableInventario.setModel(new DefaultTableModel(data, columnNames));
        jScrollPaneInventario.setViewportView(tableInventario);
    }

    private void initializeVentasTable() {
        //traer datos del las ventas desde la BD, estos son datos de prueba
        String[] columnNames = {"ID Venta", "Fecha", "Producto", "Cantidad", "Total"};
        Object[][] data = {
            {"001", "2024-02-14", "Medicamento A", "2", "$20.00"},
            {"002", "2024-02-15", "Suplemento B", "1", "$15.50"}
        };
        
        tableVentas.setModel(new DefaultTableModel(data, columnNames));
        jScrollPaneVentas.setViewportView(tableVentas);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PanelAdmin().setVisible(true);
        });
    }

    // Variables
    private javax.swing.JTabbedPane jTabbedPane1;
    
    // Panels
    private javax.swing.JPanel panelCitas;
    private javax.swing.JPanel panelHorarios;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JPanel panelVentas;
    
    // Scroll Panes
    private javax.swing.JScrollPane jScrollPaneCitas;
    private javax.swing.JScrollPane jScrollPaneHorarios;
    private javax.swing.JScrollPane jScrollPaneInventario;
    private javax.swing.JScrollPane jScrollPaneVentas;
    
    // Tables
    private javax.swing.JTable tableCitas;
    private javax.swing.JTable tableHorarios;
    private javax.swing.JTable tableInventario;
    private javax.swing.JTable tableVentas;
    
    // Buttons
    private javax.swing.JButton btnAgregarCita;
    private javax.swing.JButton btnEliminarCita;
    private javax.swing.JButton btnAgregarHorario;
    private javax.swing.JButton btnEliminarHorario;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnGenerarReporte;
}
