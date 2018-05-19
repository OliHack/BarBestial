package packJUnits;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import packModelo.GestorBD;

public class HU8_Login {

	@Test
	public void test() throws SQLException {
		System.out.println("###################################");
		System.out.println("***PRUEBA DE LOGIN DE USUARIO***");
		System.out.println("###################################");
		System.out.println("Caso 1: login de un usuario que está en la BBDD");
		System.out.println("Devuelve true si se ha logeado bien, false si no");
		System.out.println("Resulatdo de login de usuario : " + GestorBD.getGestorBD().login("user1", "user1"));
		System.out.println("###################################");
		System.out.println("Caso 2: login de usuario y contraseña incorrectos");
		System.out.println("Devuelve true si se ha logeado bien, false si no");
		System.out.println("Resulatdo de login de usuario : " + GestorBD.getGestorBD().login("user1", "123654"));
	}

	@BeforeEach
	void setUp() throws Exception {

	}

}
