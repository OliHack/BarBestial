package packModelo;

import java.sql.*;

public class GestorBD {
	private static GestorBD miGestorBD;

	// ejecuta sentencias sql
	public ResultSet sqlExec(String sql) {
		ResultSet rs = null;
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess://src/miDb.accdb");
			Statement s = conn.createStatement();
			rs = s.executeQuery(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	public int registrar(String user, String pass) {
		return sqlUpdate("Insert into Usuarios (Usuario,Pass) values('" + user + "','" + pass + "');");
	}
	
	public int rowsRanking() {
		String sql1 = "SELECT COUNT(*) FROM Puntuaciones";
		ResultSet rk = GestorBD.getGestorBD().sqlExec(sql1);
		try {
			rk.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int size = 0;
		try {
			size = rk.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return size;
	}
	
	public ResultSet ranking() {
		String sql = "SELECT nombreJugador, Puntuacion, FechaPartida from Puntuaciones ORDER BY Puntuacion DESC LIMIT 10";
		ResultSet rs = GestorBD.getGestorBD().sqlExec(sql);
		return rs;
	}

	public boolean login(String user, String pass) throws SQLException {
		ResultSet rs = null;
		rs = sqlExec("Select * from Usuarios where usuario = '" + user + "' and pass = '" + pass + "';");
		return rs.next();
	}

	public int sqlUpdate(String sql) {
		int k = -1;
		try {
			// Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess://src/miDb.accdb");
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
