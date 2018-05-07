package packModelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GestorBD {
	private static GestorBD miGestorBD;

	// ejecuta sentencias sql
	public ResultSet execSql(String sql) {
		ResultSet rs= null;
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection conn=DriverManager.getConnection(
			        "jdbc:ucanaccess://src/miDB.accdb");
			Statement s = conn.createStatement();
			rs = s.executeQuery(sql);
			
		} catch (Exception e) {
			System.out.println("Errorcito");
		}
		return rs;
	}

	public static GestorBD getGestorBD() {
		if (miGestorBD == null) {
			miGestorBD = new GestorBD();
		}
		return miGestorBD;
	}
}
