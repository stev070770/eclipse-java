package info.vehiculos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Connection conexion =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", 
					"banco", "fullstack");
//		Obtencion de un jeto de tipo Statement
		Statement instruccion = conexion.createStatement();
		// construir sentencia 
		String query = "INSERT INTO gestor (usuario, password, correo) VALUES"
				+ " ('gestor5','gthtegsvfeaef456787', 'gestor5@correo.com')";
		boolean resultado = instruccion.execute(query);// si es false, entonces la 		instrucción no devuelve un objeto de tipo ResultSet
		if (!resultado) {// mostrar el número de registros insertados
			System.out.println("Registros insertados: " + 		instruccion.getUpdateCount());}// ejecutar instrucción con el método 		executeUpdate
		int registrosInsertados = instruccion.executeUpdate(query);// mostrar el 		número de registros insertados
		System.out.println("Registros insertados: " + registrosInsertados);
		} catch (Exception e) {e.printStackTrace();}}
		}

	
