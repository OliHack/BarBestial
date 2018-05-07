package packModelo;

import java.sql.*;

public class GestorBD {
	private static GestorBD miGestorBD;

	// ejecuta sentencias sql
	public ResultSet sqlExec(String sql) {
		ResultSet rs= null;
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection conn=DriverManager.getConnection(
			        "jdbc:ucanaccess://src/miDb.accdb");
			Statement s = conn.createStatement();
			rs = s.executeQuery(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	public int sqlUpdate(String sql) {
		int k = -1;
		try {
			//Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection conn=DriverManager.getConnection(
			        "jdbc:ucanaccess://src/miDb.accdb");
			Statement s = conn.createStatement();
			k = s.executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}

	public static GestorBD getGestorBD() {
		if (miGestorBD == null) {
			miGestorBD = new GestorBD();
		}
		return miGestorBD;
	}
}
