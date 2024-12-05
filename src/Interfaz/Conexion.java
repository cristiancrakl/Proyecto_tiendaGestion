package Interfaz;

import java.sql.*;

import javax.swing.JOptionPane;

public class Conexion {



    private Conexion(){
        //constructor privado para evitar instanciar directamente
    }




    // crear una variable en la cual voy a guardar el estado de la conexion a
    // nuestra base de datos

    private static Connection conexion;

    // creamos una variable para una sola instancia

    private static Conexion instancia;

    // crear las variables para conectarnos a la base de datos
    private static final String URL = "jdbc:mysql://localhost/bd_registro";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    // cree el metodo para conectar a la base de datos
    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa !!");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error: " + e);

        }

        return conexion;

    }

    // crear el metodo para cerrar la conexion

    public void cerrarConexion() throws SQLException {

        try {
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se desconecto de la base de datos !!");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error: " + e);
            conexion.close();
        } finally {
            conexion.close();
        }
    }

    // patron singleton

    public static Conexion getInstancia() {

        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;

    }

}
