package packJUnits;

import org.junit.Before;
import org.junit.Test;

import packModelo.Calle;
import packModelo.CartaAnimal;
import packModelo.CartaFactory;
import packModelo.CartasEnJuego;
import packModelo.EnumColor;

public class PruebaCanguro {

	@Before
	public void setUp() throws Exception {
		CartasEnJuego.getCartasEnJuego().inicializar();
		Calle.getCalle().inicializar();
	}

	@Test
	public void test() {
		System.out.println(" #######################################################");
		System.out.println("#		PRUEBAS DE Canguro				#");
		System.out.println(" ####################################################### \n");

		CartaAnimal loroVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Loro");
		CartaAnimal cocoAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Cocodrilo");
		CartaAnimal mofetaAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Mofeta");
		CartaAnimal loroRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Loro");
		CartaAnimal canguVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Canguro");

		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(cocoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(mofetaAzul);
		CartasEnJuego.getCartasEnJuego().add(loroRojo);
		CartasEnJuego.getCartasEnJuego().add(canguVerde);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. Caso saltar animales-");
		System.out.println(" -------------------------------------------------------\n");

		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();

		System.out.println("\n --> El canguro debería de haber saltado una o dos posiciones: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	2. Caso saltar una o dos pos");
		System.out.println(" -------------------------------------------------------\n");

		CartasEnJuego.getCartasEnJuego().add(mofetaAzul);
		CartasEnJuego.getCartasEnJuego().add(loroRojo);
		CartasEnJuego.getCartasEnJuego().add(canguVerde);

		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();

		System.out.println("\n --> El canguro debería de haber saltado una o dos posiciones: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	3. Caso saltar una o dos pos en la primera pos-");
		System.out.println(" -------------------------------------------------------\n");

		CartasEnJuego.getCartasEnJuego().add(canguVerde);

		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();

		System.out.println("\n --> El canguro debería de haber saltado una o dos posiciones: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	4. Caso saltar una o dos pos en la segunda pos-");
		System.out.println(" -------------------------------------------------------\n");

		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(canguVerde);

		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();

		System.out.println("\n --> El canguro debería de haber saltado una o dos posiciones: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
	}

}
