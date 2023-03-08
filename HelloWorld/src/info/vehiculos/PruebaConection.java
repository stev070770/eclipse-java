package info.vehiculos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConection {

	public static void main(String[] args) {
		try {
			/*subprotocolo: mysqlhost :
				localhostpuerto: 3306
				base de datos: banco
				 usuario: banco
	 			contraseña:fullstack*/
			Connection conexion =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "fullstack");
			// muestra información del tipo de sistema de base de datos (MySQL)
			System.out.println("Base de datos: " +
			conexion.getMetaData().getDatabaseProductName());
			// muestra información sobre la versión del sistema de base de datos (5.5.5-10.4.11-MariaDB)
			System.out.println("Versión: " +
			conexion.getMetaData().getDatabaseProductVersion()); 
			// muestra información del diver MySQL (MySQL Connector/J)
			System.out.println("Driver: " + conexion.getMetaData().getDriverName());
			// muestra información de la versión del driver MySQL (mysql-connector-java-8.0.18)
			System.out.println("Versión del driver: " +
			conexion.getMetaData().getDriverVersion());} 
			catch (SQLException e) {e.printStackTrace();
		}
	}
}
