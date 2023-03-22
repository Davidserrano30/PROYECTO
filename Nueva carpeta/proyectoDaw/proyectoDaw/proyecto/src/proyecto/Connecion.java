package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connecion {

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	public String test1() {

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

			stmt = conn.createStatement();
			rs = stmt.executeQuery(	"SELECT COUNTRY_NAME " 
			                      + "FROM (SELECT * FROM COUNTRY_NAME ORDER BY DBMS_RANDOM.VALUE())"
					              + "WHERE ROWNUM = 1");

			if (rs.next()) {
				String randomValue = rs.getString("COUNTRY_NAME");
				return "es de : " + randomValue;
			} else {
				return "No se encontraron resultados.";
			}

		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				return "Error al cerrar la conexión: " + e.getMessage();
			}
		}
		return null;
	}

	/*
	 * try { // Conectar a la base de datos conn =
	 * DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM",
	 * "oracle");
	 * 
	 * // Crear un objeto Statement stmt = conn.createStatement();
	 * 
	 * // Ejecutar una consulta rs = stmt.executeQuery("SELECT * FROM depart");
	 * 
	 * // Procesar los resultados de la consulta while (rs.next()) { int DEPT_NO =
	 * rs.getInt("DEPT_NO"); String dpnom = rs.getString("DNOMBRE"); String loc =
	 * rs.getString("LOC");
	 * 
	 * 
	 * System.out.println("Departamento#" + DEPT_NO + ": " + dpnom + " localidad: "
	 * +loc); }} catch (SQLException e) {
	 * System.out.println("Error al ejecutar la consulta: " + e.getMessage()); }
	 * finally { try { if (rs != null) rs.close(); if (stmt != null) stmt.close();
	 * if (conn != null) conn.close(); } catch (SQLException e) {
	 * System.out.println("Error al cerrar la conexión: " + e.getMessage()); }
	 * 
	 * 
	 * }
	 */

}
