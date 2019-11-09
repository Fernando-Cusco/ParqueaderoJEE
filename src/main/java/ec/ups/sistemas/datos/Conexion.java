package ec.ups.sistemas.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private Connection connection = null;
	
	public Connection conexion() {
		String url = "jdbc:mysql://localhost:3306/ticket";
		String usuario = "admin";
		String password = "admin";
		
		try {
			this.connection = DriverManager.getConnection(url, usuario, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public void cerrarConexion() {
		try {
			this.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
