package packJUnits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packModelo.*;

class HU5_RealizarAnimalada {

	
	
	@BeforeEach
	void setUp() throws Exception {
		CartasEnJuego.getCartasEnJuego().inicializar();
		Calle.getCalle().inicializar();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEjecutarAnimalada() {
		/**Realizamos las pruebas de la animalada de cada animal, para ello, en cada caso, se inicializar�
		 * la cola CartasEnJuego de tal forma que se vea el correcto funcionamiento de las animaladas.
		 */
		
		/**Leon**/

		System.out.println(" #######################################################");
		System.out.println("#		PRUEBAS DE LEON				#");
		System.out.println(" ####################################################### \n");
		CartaAnimal leonVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Leon");
		CartaAnimal hipoAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Hipopotamo");
		CartaAnimal cebraAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Cebra");
		CartaAnimal cocodRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Cocodrilo");
		CartaAnimal loroVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Loro");
		
		//Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		
		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO DE LEON(�NICO) Y SIN MONOS 		-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Inicialmente el leon est� en �ltima posicion(simulando que acaba de ser echada por el jugador
		//En este caso, el Leon se colocar� el primero, ya que no hay ni otro Leon ni ning�n Mono
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		//a1.hacerAnimalada();
		
		//Por lo que el Leon deber�a de ser el primero
		System.out.println("\n --> En este momento, el Leon deber�a de estar en primera posici�n: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		
		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	2. CASO DE LEON(+ DE 1) Y SIN MONOS 		-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Creamos otro Leon para colocarlo en la cola
		CartaAnimal leonRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Leon");
		
		//A�adimos animales a la cola (con dos Leones)
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(leonRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		
		//Por lo que el Leon deber�a de acabar en la Calle (Patada)
		System.out.println("\n --> En este momento, el LeonVerde, que realiza la animalada, deber�a de irse de la cola: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Y deber� estar en la calle
		System.out.println("\n --> Por lo que en Calle deber� encontrarse el LeonVERDE: \n");
		//System.out.println(Calle.getCalle().getListaAnimales().getLast().getTipo()+Calle.getCalle().getListaAnimales().getLast().getColor());
		Calle.getCalle().getListaAnimales().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();

		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	3. CASO DE LEON(�NICO) Y CON MONOS 		-");
		System.out.println(" -------------------------------------------------------\n");
	
		//Creamos cartas de Monos para probar este caso	
		CartaAnimal monoRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Mono");
		CartaAnimal monoAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Mono");

		//A�adimos animales a la cola (con dos Monos)
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		
		//Por lo que el Leon deber�a estar primero de la cola y los monos en la Calle.
		System.out.println("\n --> En este momento, el LeonVerde, que realiza la animalada, deber�a estar primero y los monos fuera de la cola: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		System.out.println("\n --> Y vemos que los monos estan en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();
		
		/**Hipopotamo**/

		System.out.println("\n #######################################################");
		System.out.println("#		PRUEBAS DE HIPOPOTAMO			#");
		System.out.println(" ####################################################### \n");
	}

}
