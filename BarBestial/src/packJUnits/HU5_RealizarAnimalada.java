package packJUnits;

import org.junit.Test;
import org.junit.jupiter.api.*;

import packModelo.Calle;
import packModelo.CartaAnimal;
import packModelo.CartaFactory;
import packModelo.CartasEnJuego;
import packModelo.EnumColor;

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
		/**
		 * Realizamos las pruebas de la animalada de cada animal, para ello, en
		 * cada caso, se inicializar� la cola CartasEnJuego de tal forma que se
		 * vea el correcto funcionamiento de las animaladas.
		 */

		// Cartas que vamos a necesitar para las pruebas
		CartaAnimal leonVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Leon");
		CartaAnimal hipoAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Hipopotamo");
		CartaAnimal cebraAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Cebra");
		CartaAnimal cocodRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Cocodrilo");
		CartaAnimal focaVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Foca");
		CartaAnimal mofetaAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Mofeta");
		CartaAnimal loroVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Loro");
		CartaAnimal camaleonAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Camaleon");
		CartaAnimal leonRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Leon");
		CartaAnimal canguroAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Canguro");
		CartaAnimal monoRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Mono");
		CartaAnimal monoAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Mono");
		CartaAnimal jirafaRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Jirafa");
		CartaAnimal serpAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Serpiente");

		/** Leon **/

		System.out.println(" ###################################################");
		System.out.println("#		PRUEBAS DE LEON			#");
		System.out.println(" ################################################### \n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO: UN LEON Y SIN MONOS 			-");
		System.out.println(" -------------------------------------------------------\n");

		// Inicialmente el leon est� en �ltima posicion(simulando que acaba de
		// ser echada por el jugador
		// En este caso, el Leon se colocar� el primero, ya que no hay ni otro
		// Leon ni ning�n Mono
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();
		// a1.hacerAnimalada();

		// Por lo que el Leon deber�a de ser el primero
		System.out.println("\n --> En este momento, el Leon deber�a de estar en primera posici�n: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	2. CASO: + DE UN LEON Y SIN MONOS 		-");
		System.out.println(" -------------------------------------------------------\n");

		// A�adimos animales a la cola (con dos Leones)
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(leonRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);

		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// Por lo que el Leon deber�a de acabar en la Calle (Patada)
		System.out.println(
				"\n --> En este momento, el LeonVerde, que realiza la animalada, deber�a de irse de la cola: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Y deber� estar en la calle
		System.out.println("\n --> Por lo que en Calle deber� encontrarse el LeonVERDE: \n");
		// System.out.println(Calle.getCalle().getListaAnimales().getLast().getTipo()+Calle.getCalle().getListaAnimales().getLast().getColor());
		Calle.getCalle().getListaAnimales().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();

		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	3. CASO: UN LEON Y CON MONOS 			-");
		System.out.println(" -------------------------------------------------------\n");

		// A�adimos animales a la cola (con dos Monos)
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);

		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// Por lo que el Leon deber�a estar primero de la cola y los monos en la
		// Calle.
		System.out.println(
				"\n --> En este momento, el LeonVerde, que realiza la animalada, deber�a estar primero y los monos fuera de la cola: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		System.out.println("\n --> Y vemos que los monos estan en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();

		/** Hipopotamo **/

		System.out.println("\n #######################################################");
		System.out.println("#		PRUEBAS DE HIPOPOTAMO			#");
		System.out.println(" ####################################################### \n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : TODAS CARTAS MAS DEBILES 		-");
		System.out.println(" -------------------------------------------------------\n");

		// En la cola todos los animales son mas debiles que el hipopotamo
		// por lo que cuando embista se colocar� primero.
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// Por lo que el Hipopotamo debria acabar primero
		System.out.println(
				"\n --> En este momento, el HipopotamoAmarillo, que realiza la animalada, deber�a colocarse primero al ser el animal con m�s fuerza: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	2. CASO : CARTAS + FUERTES EN LA COLA 		-");
		System.out.println(" -------------------------------------------------------\n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);

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
		System.out.println("-	3. CASO : CEBRA EN LA COLA 			-");
		System.out.println(" -------------------------------------------------------\n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);

		// En la cola hay un animal mas fuerte que el hipopotamo
		// y una cebra(posicion 3) por lo que se colocara detras de la cebra.
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// Por lo que el Hipopotamo derberia acabar detras de la Cebra
		System.out.println(
				"\n --> En este momento, el HipopotamoAmarillo, que realiza la animalada, deber�a colocarse detras de la Cebra, en cuarta posici�n: \n");
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
		System.out.println("-	1. CASO : TODAS CARTAS MAS DEBILES POR DELANTE	-");
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
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);

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
		System.out.println("-	3. CASO : CEBRA EN LA COLA 			-");
		System.out.println(" -------------------------------------------------------\n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);

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

		/** Serpiente **/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE SERPIENTE		#");
		System.out.println(" ################################################### \n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : ORDENAR TODAS LAS CARTAS		-");
		System.out.println(" -------------------------------------------------------\n");

		// La cola se ordena de mayor a menor
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimirConValor();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// Por lo que la cola ahora estar�a ordenada
		System.out.println("\n --> En este momento,la cola deber� haberse ordenado de mayor a menor: \n");
		CartasEnJuego.getCartasEnJuego().imprimirConValor();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		/** Jirafa **/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE JIRAFA		#");
		System.out.println(" ################################################### \n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : ANIMAL + DEBIL DELANTE 		-");
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
		System.out.println("-	2. CASO : ANIMAL + FUERTE DELANTE 			-");
		System.out.println(" -------------------------------------------------------\n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);

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

		/** Cebra **/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE CEBRA		#");
		System.out.println(" ################################################### \n");

		System.out.println(
				" --> La Cebra no tiene m�s animalada que no ser adelantadas por el Hipopotamo ni por el Cocodrilo.");

		/** Foca **/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE FOCA			#");
		System.out.println(" ################################################### \n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(leonRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(focaVerde);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : ORDEN INVERSO DE LA COLA 		-");
		System.out.println(" -------------------------------------------------------\n");

		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// La foca invierte el orden de la cola
		System.out.println(
				"\n --> En este momento, la FocaVerde, que realiza la animalada, habr� invertido el sentido de la cola: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		/** Camaleon **/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE CALAMELON		#");
		System.out.println(" ################################################### \n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(leonRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(camaleonAmarillo);

		System.out.println(" ********************************************** ");
		System.out.println("* EN EL CAMALEON VEREMOS UN PAR DE EJEMPLOS *");
		System.out.println(" ********************************************** ");

		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	1. EJEMPLO : SUPLANTACI�N DE SERPIENTE 		-");
		System.out.println(" -------------------------------------------------------\n");

		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		System.out.println("\n�Elige la opcion 3!");

		// Elegimos el animalar a suplantar en este turno
		// En este caso elegiremos la de la Serpiente
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		System.out.println(
				"\n --> En este momento, el CamaleonAmarillo har� la animalada de la serpiente(ordenar de mayor a menor). \n");
		System.out.println(" --> Por lo que el CamaleonAmarillo se colocar� cuarto: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	2. EJEMPLO : SUPLANTACI�N DE HIPOPOTAMO 	-");
		System.out.println(" -------------------------------------------------------\n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(camaleonAmarillo);

		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		System.out.println("\n�Elige la opcion 1!");

		// Elegimos el animalar a suplantar en este turno
		// En este caso elegiremos la del Hipopotamo
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		System.out.println("\n --> En este momento, el CamaleonAmarillo har� la animalada del Hipopotamo. \n");
		System.out.println(" --> Por lo que el CamaleonAmarillo se colocar� segundo: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		/** Mono **/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE MONO				#");
		System.out.println(" ################################################### \n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(focaVerde);
		CartasEnJuego.getCartasEnJuego().add(leonRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : �NICO MONO EN COLA 			-");
		System.out.println(" -------------------------------------------------------\n");

		// En la cola solo hay un mono
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// La animalada del mono no debe de tener efecto
		System.out.println(
				"\n --> En este momento, el MonoRojo no deber� de tener efecto, por lo que seguir� �ltimo: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		System.out.println("\n -------------------------------------------------------");
		System.out.println("-2. CASO : + DE UN MONO Y COCODRILOS/HIPOPOTAMOS	-");
		System.out.println(" -------------------------------------------------------\n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(leonRojo);
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);

		// En la cola hay + de un mono
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// El mono recien jugado se debera de poner primero, seguido de los
		// dem�s monos
		System.out.println("\n --> En este momento, el MonoRojo se colocar� primeo seguido de los dem�s monos: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		System.out.println("\n --> Y vemos que los Cocodrilos e Hipopotamos de la cola est�n en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();

		/** Canguro **/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE CANGURO		#");
		System.out.println(" ################################################### \n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(focaVerde);
		CartasEnJuego.getCartasEnJuego().add(leonRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(canguroAzul);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : SALTO DE ANIMALES 			-");
		System.out.println(" -------------------------------------------------------\n");

		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		System.out.println("\n --> En este momento, el CanguroAzul adelanta a uno o dos animales: \n");
		System.out.println("  +  Si seleccionas '1' el canguro se colocar� cuarto.");
		System.out.println("  +  Si seleccionas '2' el canguro se colocar� tercero.\n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		/** Loro **/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE LORO		#");
		System.out.println(" ################################################### \n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(focaVerde);
		CartasEnJuego.getCartasEnJuego().add(leonRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : ELEGIR ANIMAL 			-");
		System.out.println(" -------------------------------------------------------\n");

		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		System.out.println("\n --> En este momento, el LoroVerde echa a un animal de la cola: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		System.out.println("\n --> Y vemos que el animal echado ahora se ecuentra en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();

		/** Mofeta **/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE MOFETA		#");
		System.out.println(" ################################################### \n");

		// Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		CartasEnJuego.getCartasEnJuego().add(leonRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(mofetaAzul);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : ANIMALES + FUERTES 			-");
		System.out.println(" -------------------------------------------------------\n");

		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimirConValor();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		// La mofeta echar� al hipopotamo y a los leones
		System.out.println(
				"\n --> En este momento, la MofetaAzul echa a los 2 animales m�s fuertes(Leon & Hipopotamo) de la cola: \n");
		CartasEnJuego.getCartasEnJuego().imprimirConValor();

		System.out.println("\n --> Y vemos que los animales echados ahora se ecuentran en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimirConValor();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();

		/** CANGURO **/
		System.out.println(" #######################################################");
		System.out.println("#		PRUEBAS DE Canguro				#");
		System.out.println(" ####################################################### \n");

		CartaAnimal loroVerdee = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Loro");
		CartaAnimal cocoAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Cocodrilo");
		CartaAnimal mofetaAzull = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Mofeta");
		CartaAnimal loroRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Loro");
		CartaAnimal canguVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Canguro");

		CartasEnJuego.getCartasEnJuego().add(loroVerdee);
		CartasEnJuego.getCartasEnJuego().add(cocoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(mofetaAzull);
		CartasEnJuego.getCartasEnJuego().add(loroRojo);
		CartasEnJuego.getCartasEnJuego().add(canguVerde);

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. Caso saltar animales-");
		System.out.println(" -------------------------------------------------------\n");

		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().jugarTurno();

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
		CartasEnJuego.getCartasEnJuego().jugarTurno();

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
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		System.out.println("\n --> El canguro debería de haber saltado una o dos posiciones: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		System.out.println(" -------------------------------------------------------");
		System.out.println("-	4. Caso saltar una o dos pos en la segunda pos-");
		System.out.println(" -------------------------------------------------------\n");

		CartasEnJuego.getCartasEnJuego().add(loroVerdee);
		CartasEnJuego.getCartasEnJuego().add(canguVerde);

		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		// Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().jugarTurno();

		System.out.println("\n --> El canguro debería de haber saltado una o dos posiciones: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
	}

}