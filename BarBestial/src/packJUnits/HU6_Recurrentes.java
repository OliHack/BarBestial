package packJUnits;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import packModelo.Calle;
import packModelo.CartaAnimal;
import packModelo.CartaFactory;
import packModelo.CartasEnJuego;
import packModelo.EnumColor;

public class HU6_Recurrentes {
	
	@BeforeEach
	void setUp() throws Exception {
		CartasEnJuego.getCartasEnJuego().inicializar();
		Calle.getCalle().inicializar();
	}

	@Test
	public void test() {
		CartasEnJuego.getCartasEnJuego().inicializar();
		Calle.getCalle().inicializar();
		CartaAnimal leonVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Leon");
		CartaAnimal hipoAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Hipopotamo");
		CartaAnimal cebraAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Cebra");
		CartaAnimal cocodRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Cocodrilo");
		CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Foca");
		CartaAnimal mofetAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Mofeta");
		CartaAnimal loroVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Loro");
		CartaAnimal camAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Camaleon");
		CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Leon");
		CartaAnimal canguroAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Canguro");
		CartaAnimal monoRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Mono");
		CartaAnimal monoAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Mono");
		CartaAnimal jirafaRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Jirafa");
		CartaAnimal serpAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Serpiente");

		System.out.println("\n #######################################################");
		System.out.println("#		PRUEBAS DE HIPOPOTAMO			#");
		System.out.println(" ####################################################### \n");

		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	1. CASO : CARTAS + FUERTES EN LA COLA 	en recurrencia	-");
		System.out.println(" -------------------------------------------------------\n");

		// Las a�adimos a CartasEnJuego
		
		
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(canguroAzul);

		// En la cola hay un animal mas fuerte que el hipopotamo
		// por lo que cuando embista se colocar� detras de este.
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// Por lo que el LHipopotamo deberia acabar detras del Leon
		System.out.println(
				"\n --> En este momento, el HipopotamoAmarillo, que realiza la animalada, deber�a colocarse detras del Leon, ya que este es m�s fuerte: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	2. CASO : CEBRA EN LA COLA 	en recurrencia		-");
		System.out.println(" -------------------------------------------------------\n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);

		// En la cola hay un animal mas fuerte que el hipopotamo
		// y una cebra(posicion 3) por lo que se colocara detras de la cebra.
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// Por lo que el Hipopotamo derberia acabar detras de la Cebra
		System.out.println(
				"\n --> En este momento, el HipopotamoAmarillo, que realiza la animalada, deber�a colocarse detras de la Cebra: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		/** Cocodrilo **/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE COCODRILO		#");
		System.out.println(" ################################################### \n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : TODAS CARTAS MAS DEBILES POR DELANTE en recurrencia	-");
		System.out.println(" -------------------------------------------------------\n");

		// En la cola todos los animales por delante son mas debiles que el
		// cocodrilo
		// por lo que cuando haga la animalada se colocar� primero.
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// Por lo que el Cocodrilo deber�a de acabar primero
		System.out.println(
				"\n --> En este momento, el CocodriloRojo, que realiza la animalada, deber�a colocarse primero, ya que todos los de delante son m�s d�biles: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		System.out.println("\n --> Y vemos que los animales que el Cocodrilo se ha 'comido' estan en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	2. CASO : CARTAS MAS FUERTES POR DELANTE	-");
		System.out.println(" -------------------------------------------------------\n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);

		// En la cola hay animales por delante que son mas fuertes que el
		// cocodrilo
		// por lo que cuando haga la animalada se colocar� detras de un animal
		// mas fuerte que �l.
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// Por lo que el Cocodrilo deber�a de acabar detras del hipoAmarillo
		System.out.println(
				"\n --> En este momento, el CocodriloRojo, que realiza la animalada, deber�a colocarse detras del HipopotanoAmarillo, ya que es m�s fuerte que �l: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		System.out.println(
				"\n --> Y vemos que los animales que el Cocodrilo se ha 'comido' antes de llegar a su posici�n estan en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();

		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	3. CASO : CEBRA EN LA COLA 	recurrente		-");
		System.out.println(" -------------------------------------------------------\n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);

		// En la cola hay un animal mas fuerte que el cocodrilo
		// y una cebra(posicion 3) por lo que se colocara detras de la cebra.
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// Por lo que el Cocodrilo debr�a acabar detr�s de la cebra
		System.out.println(
				"\n --> En este momento, el CocodriloRojo, que realiza la animalada, deber�a colocarse detras de la Cebra, en tercera posici�n: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		System.out.println(
				"\n --> Y vemos que los animales que el Cocodrilo se ha 'comido' antes de llegar a su posici�n estan en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();

		/** Jirafa **/
		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE JIRAFA		#");
		System.out.println(" ################################################### \n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(mofetAzul);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : ANIMAL + DEBIL DELANTE en recurrencia		-");
		System.out.println(" -------------------------------------------------------\n");

		// En la cola hay un animal m�s d�bil inmediatamente delante
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// Por lo que el Cocodrilo debr�a acabar detr�s de la cebra
		System.out.println(
				"\n --> En este momento, la JirafaRojo, que realiza la animalada, deber�a colocarse por delante del Loro ya que es un animal m�s d�bil: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	2. CASO : ANIMAL + FUERTE DELANTE 	en recurrencia		-");
		System.out.println(" -------------------------------------------------------\n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(camAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);

		// En la cola hay un animal m�s d�bil inmediatamente delante
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// Por lo que el Cocodrilo debr�a acabar detr�s de la cebra
		System.out.println(
				"\n --> En este momento, la JirafaRojo, que realiza la animalada, deber�a deberia de quedarse donde est� ya que la Serpiente es un animal m�s fuerte: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

	}

}
