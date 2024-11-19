package base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class ConexionSQL {

    // Nombre del driver de MySQL
    private final String driver = "com.mysql.cj.jdbc.Driver"; // Correcto para JDBC en Java 9
    // Detalles de la base de datos
    private final String base_dato = "dbGenerica";
    private final String nombre_host = "127.0.0.1";
    private final String port = "3306";
    private final String url = "jdbc:mysql://" + nombre_host + ":" + port + "/" + base_dato + "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
   

    private final String nombre_usuario = "root";
    private final String contraseña_usuario = "1234";

    public Connection conectarMySQL() {
        Connection conn = null;
        

        try {

            Class.forName(driver);

            conn = DriverManager.getConnection(url, nombre_usuario, contraseña_usuario);
            System.out.println("Conexión a MySQL exitosa!");
        } catch (ClassNotFoundException e) {
            System.err.println("Error: No se encontró el driver de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos.");
            e.printStackTrace();
        }
        

        return conn;
    }

    public boolean insertarProducto(String nombre, int cantidad) {
        String sql = "INSERT INTO productos (nombre, cantidad) VALUES (?, ?)";
        try (Connection conn = conectarMySQL();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {

            
            pstmt.setString(1, nombre);
            pstmt.setInt(2, cantidad);

            
            int filasInsertadas = pstmt.executeUpdate();
            return filasInsertadas > 0; // Retorna true si se insertaron filas
        } catch (SQLException e) {
            System.err.println("Error al insertar producto: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminarProducto(int id, String nombre, int cantidad) {
        String borrar = "DELETE FROM productos WHERE id = ? AND nombre = ? AND cantidad = ?";
        try (Connection conn = conectarMySQL(); // Obtener la conexión
                 PreparedStatement pstmt = conn.prepareStatement(borrar)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, nombre);
            pstmt.setInt(3, cantidad);

            int filasInsertadas = pstmt.executeUpdate();
            return filasInsertadas > 0; // Retorna true si se insertaron filas
        } catch (SQLException e) {
            System.err.println("Error al borrar producto: " + e.getMessage());
            e.printStackTrace();
            return false;
        }

    }

    public boolean editarProducto(int id, String nombre, int cantidad) {
        String editar = "UPDATE productos SET nombre = ?, cantidad = ? WHERE id = ?";
        try (Connection conn = conectarMySQL(); // Obtener la conexión
                 PreparedStatement pstmt = conn.prepareStatement(editar)) {
            
            pstmt.setString(1, nombre);
            pstmt.setInt(2, cantidad);
            pstmt.setInt(3, id);
            int filasInsertadas = pstmt.executeUpdate();
            return filasInsertadas > 0; // Retorna true si se insertaron filas
        } catch (SQLException e) {
            System.err.println("Error al editar producto: " + e.getMessage());
            e.printStackTrace();
            return false;
        }

    }
}
