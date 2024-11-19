/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base_de_datos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author DanteLiamPower DanteLiamPower
 */

   



public class Main {

    public static void main(String[] args) {
        ConexionSQL conexionSQL = new ConexionSQL(); // Instancia de la clase de conexión
        Connection conn = conexionSQL.conectarMySQL(); // Intentar conectar

        if (conn != null) {
            System.out.println("Conexión establecida. Ejecutando consulta...");
            try {
                // Crear un objeto Statement para ejecutar consultas
                Statement stmt = conn.createStatement();
                
                // Consulta SQL
                String query = "SELECT * FROM productos";
                
                // Ejecutar la consulta y obtener resultados
                ResultSet rs = stmt.executeQuery(query);
                
                // Iterar sobre los resultados
                System.out.println("Resultados:");
                while (rs.next()) {
                    int id =rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    int cantidad = rs.getInt("cantidad");
                    System.out.println( "Nombre: " + nombre + ", Cantidad: " + cantidad+", id: "+id);
                }
                
                // Cerrar ResultSet y Statement
                rs.close();
                stmt.close();
            } catch (SQLException e) {
                System.err.println("Error al ejecutar la consulta.");
                e.printStackTrace();
            } finally {
                // Cerrar la conexión
                try {
                    conn.close();
                    System.out.println("Conexión cerrada.");
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión.");
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }
    }
}


