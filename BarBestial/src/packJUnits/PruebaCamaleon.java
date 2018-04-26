package packJUnits;

import org.junit.Before;
import org.junit.Test;

import packModelo.Calle;
import packModelo.CartaAnimal;
import packModelo.CartaFactory;
import packModelo.CartasEnJuego;
import packModelo.EnumColor;

public class PruebaCamaleon {
	@Before
	public void setUp() throws Exception {
		CartasEnJuego.getCartasEnJuego().inicializar();
		Calle.getCalle().inicializar();
	}

	@Test
	public void test() {
		System.out.println(" #######################################################");
		System.out.println("#		PRUEBAS DE Camaleon				#");
		System.out.println(" ####################################################### \n");

		CartaAnimal focaVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Foca");
		CartaAnimal cocoAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Cocodrilo");
		CartaAnimal cebraAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Cebra");
		CartaAnimal focaRoja = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Foca");
		CartaAnimal camaVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Camaleon");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(focaVerde);
		CartasEnJuego.getCartasEnJuego().add(cocoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(focaRoja);
		CartasEnJuego.getCartasEnJuego().add(camaVerde);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. Caso copia a un animal<Cocodrilo>: -");
		System.out.println(" -------------------------------------------------------\n");

		// Inicialmente el leon est� en �ltima posicion(simulando que acaba de
		// ser echada por el jugador
		// En este caso, el Leon se colocar� el primero, ya que no hay ni otro
		// Leon ni ning�n Mono
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		// a1.hacerAnimalada();

		// Por lo que el Leon deber�a de ser el primero
		System.out.println(
				"\n --> En este momento el cocoAmarillo debería estar primero, seguido de la cebra y el camaVerde: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
	}

}
