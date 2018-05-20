package packJUnits;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

import packModelo.GestorBD;

public class HU9_Ranking {

	@Test
	public void test() throws SQLException {
		System.out.println("###################################");
		System.out.println("***PRUEBA DE RANKING DE USUARIO***");
		System.out.println("###################################");
		System.out.println("Caso 1: ranking de usuarios de la BBDD");
		System.out.println("Devuelve ranking de los usuarios");
		System.out.println("Resultado de ranking de usuarios : ");
		ResultSet rs = GestorBD.getGestorBD().ranking();
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= columnsNumber; i++) {
				if (i > 1) {
					System.out.print(",  ");
				}
				String columnValue = rs.getString(i);
				System.out.print(rsmd.getColumnName(i) + " " + columnValue);
			}
			System.out.println("Fin");
		}

	}

}
