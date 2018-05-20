package packJUnits;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import packModelo.GestorBD;

public class HU7_Registrarse {

	@Test
	public void test() {
		System.out.println("###################################");
		System.out.println("***PRUEBA DE REGISTRO DE USUARIO***");
		System.out.println("###################################");
		System.out.println("Caso 1: registrar un usuario por primera vez");
		System.out.println("Número -1 si no se ha hecho nada");
		System.out.println("Número de filas afectadas si se ha ejecutado la operaión");
		System.out.println("Resultado de registro de usuario : " + GestorBD.getGestorBD().registrar("user1", "user1"));
		System.out.println("###################################");
		System.out.println("Caso 2: registrar el mismo usuario por segunda vez");
		System.out.println("Número -1 si no se ha hecho nada");
		System.out.println("Número de filas afectadas si se ha ejecutado la operaión");
		System.out.println("Resultado de registro de usuario : " + GestorBD.getGestorBD().registrar("user1", "user1"));
	}

	@BeforeEach
	void setUp() throws Exception {

	}

}
