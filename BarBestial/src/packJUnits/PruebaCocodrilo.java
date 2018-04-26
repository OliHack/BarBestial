package packJUnits;

import org.junit.Before;
import org.junit.Test;

import packModelo.Calle;
import packModelo.CartaAnimal;
import packModelo.CartaFactory;
import packModelo.CartasEnJuego;
import packModelo.EnumColor;

public class PruebaCocodrilo {
	@Before
	public void setUp() throws Exception {
		CartasEnJuego.getCartasEnJuego().inicializar();
		Calle.getCalle().inicializar();
	}

	@Test
	public void test() {
		System.out.println(" #######################################################");
		System.out.println("#		PRUEBAS DE Cocodrilo				#");
		System.out.println(" ####################################################### \n");

		CartaAnimal focaVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Foca");
		CartaAnimal cocoAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Cocodrilo");
		CartaAnimal cebraAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Cebra");
		CartaAnimal cocoRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Cocodrilo");
		CartaAnimal cocoVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Cocodrilo");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(focaVerde);
		CartasEnJuego.getCartasEnJuego().add(cocoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(cocoRojo);
		CartasEnJuego.getCartasEnJuego().add(cocoVerde);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. Caso animal más fuerte y animal más débil y cebra -");
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
				"\n --> En este momento el cocoAmarillo debería estar primero, seguido de la cebra y el cocoRojo y Verde: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		CartaAnimal jirafaVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Jirafa");
		CartaAnimal cocoAmarillo1 = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Cocodrilo");
		CartaAnimal cebraAzul1 = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Cebra");
		CartaAnimal focaVerde1 = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Foca");
		CartaAnimal cocoVerde1 = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Cocodrilo");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(jirafaVerde);
		CartasEnJuego.getCartasEnJuego().add(cocoAmarillo1);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul1);
		CartasEnJuego.getCartasEnJuego().add(focaVerde1);
		CartasEnJuego.getCartasEnJuego().add(cocoVerde1);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	2. Caso ejecutando el primero sin recurrencia -");
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
		System.out
				.println("\n --> En este momento el cocoAmarillo va primero luego la cebraAzul y luego cocoVerde: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(jirafaVerde);
		CartasEnJuego.getCartasEnJuego().add(cocoAmarillo1);
		CartasEnJuego.getCartasEnJuego().add(focaVerde);
		CartasEnJuego.getCartasEnJuego().add(focaVerde1);
		CartasEnJuego.getCartasEnJuego().add(cocoVerde1);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	3. Caso comiendo más de un animal -");
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
		System.out.println("\n --> En este momento el cocoAmarillo va primero luego el cocoVerde: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
	}

}
