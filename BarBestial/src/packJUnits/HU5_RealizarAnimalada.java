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
		/**Realizamos las pruebas de la animalada de cada animal, para ello, en cada caso, se inicializará
		 * la cola CartasEnJuego de tal forma que se vea el correcto funcionamiento de las animaladas.
		 */
		
		//Cartas que vamos a necesitar para las pruebas
		CartaAnimal leonVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Leon");
		CartaAnimal hipoAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Hipopotamo");
		CartaAnimal cebraAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Cebra");
		CartaAnimal cocodRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Cocodrilo");
		CartaAnimal focaVerde= CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Foca");
		CartaAnimal mofetaAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Mofeta");
		CartaAnimal loroVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Loro");
		CartaAnimal camaleonAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Camaleon");
		CartaAnimal leonRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Leon");
		CartaAnimal canguroAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Canguro");
		CartaAnimal monoRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Mono");
		CartaAnimal monoAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Mono");
		CartaAnimal jirafaRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Jirafa");
		CartaAnimal serpAzul= CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Serpiente");
		
		/**Leon**/

		System.out.println(" ###################################################");
		System.out.println("#		PRUEBAS DE LEON			#");
		System.out.println(" ################################################### \n");
		
		
		//Las añadimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		
		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO: UN LEON Y SIN MONOS 			-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Inicialmente el leon está en última posicion(simulando que acaba de ser echada por el jugador
		//En este caso, el Leon se colocará el primero, ya que no hay ni otro Leon ni ningún Mono
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		//a1.hacerAnimalada();
		
		//Por lo que el Leon debería de ser el primero
		System.out.println("\n --> En este momento, el Leon debería de estar en primera posición: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();

		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		
		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	2. CASO: + DE UN LEON Y SIN MONOS 		-");
		System.out.println(" -------------------------------------------------------\n");		
		
		//Añadimos animales a la cola (con dos Leones)
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(leonRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		
		//Por lo que el Leon debería de acabar en la Calle (Patada)
		System.out.println("\n --> En este momento, el LeonVerde, que realiza la animalada, debería de irse de la cola: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Y deberá estar en la calle
		System.out.println("\n --> Por lo que en Calle deberá encontrarse el LeonVERDE: \n");
		//System.out.println(Calle.getCalle().getListaAnimales().getLast().getTipo()+Calle.getCalle().getListaAnimales().getLast().getColor());
		Calle.getCalle().getListaAnimales().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();

		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	3. CASO: UN LEON Y CON MONOS 			-");
		System.out.println(" -------------------------------------------------------\n");

		//Añadimos animales a la cola (con dos Monos)
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		
		//Por lo que el Leon debería estar primero de la cola y los monos en la Calle.
		System.out.println("\n --> En este momento, el LeonVerde, que realiza la animalada, debería estar primero y los monos fuera de la cola: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		System.out.println("\n --> Y vemos que los monos estan en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();
		
		
		
		/**Hipopotamo**/

		System.out.println("\n #######################################################");
		System.out.println("#		PRUEBAS DE HIPOPOTAMO			#");
		System.out.println(" ####################################################### \n");
	
		//Las añadimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		
		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : TODAS CARTAS MAS DEBILES 		-");
		System.out.println(" -------------------------------------------------------\n");
		
		//En la cola todos los animales son mas debiles que el hipopotamo
		//por lo que cuando embista se colocará primero.		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		
		//Por lo que el Hipopotamo debria acabar primero
		System.out.println("\n --> En este momento, el HipopotamoAmarillo, que realiza la animalada, debería colocarse primero al ser el animal con más fuerza: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		
		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	2. CASO : CARTAS + FUERTES EN LA COLA 		-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Las añadimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
	
		//En la cola hay un animal mas fuerte que el hipopotamo
		//por lo que cuando embista se colocará detras de este.		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		
		//Por lo que el LHipopotamo deberia acabar detras del Leon
		System.out.println("\n --> En este momento, el HipopotamoAmarillo, que realiza la animalada, debería colocarse detras del Leon, ya que este es más fuerte: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
			
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
	
		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	3. CASO : CEBRA EN LA COLA 			-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Las añadimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
	
		//En la cola hay un animal mas fuerte que el hipopotamo
		//y una cebra(posicion 3) por lo que se colocara detras de la cebra.		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		
		//Por lo que el Hipopotamo derberia acabar detras de la Cebra
		System.out.println("\n --> En este momento, el HipopotamoAmarillo, que realiza la animalada, debería colocarse detras de la Cebra, en cuarta posición: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
			
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		
		
		
		/**Cocodrilo**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE COCODRILO		#");
		System.out.println(" ################################################### \n");
		
		//Las añadimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		
		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : TODAS CARTAS MAS DEBILES POR DELANTE	-");
		System.out.println(" -------------------------------------------------------\n");
				
		//En la cola todos los animales por delante son mas debiles que el cocodrilo
		//por lo que cuando haga la animalada se colocará primero.		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
				
		//Por lo que el Cocodrilo debería de acabar primero
		System.out.println("\n --> En este momento, el CocodriloRojo, que realiza la animalada, debería colocarse primero, ya que todos los de delante son más débiles: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		System.out.println("\n --> Y vemos que los animales que el Cocodrilo se ha 'comido' estan en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();
		
		System.out.println(" -------------------------------------------------------");
		System.out.println("-	2. CASO : CARTAS MAS FUERTES POR DELANTE	-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Las añadimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		
		
		//En la cola hay animales por delante que son mas fuertes que el cocodrilo
		//por lo que cuando haga la animalada se colocará detras de un animal mas fuerte que él.		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
				
		//Por lo que el Cocodrilo debería de acabar detras del hipoAmarillo
		System.out.println("\n --> En este momento, el CocodriloRojo, que realiza la animalada, debería colocarse detras del HipopotanoAmarillo, ya que es más fuerte que él: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		System.out.println("\n --> Y vemos que los animales que el Cocodrilo se ha 'comido' antes de llegar a su posición estan en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();
	
		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	3. CASO : CEBRA EN LA COLA 			-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Las añadimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
	
		//En la cola hay un animal mas fuerte que el cocodrilo
		//y una cebra(posicion 3) por lo que se colocara detras de la cebra.		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		
		//Por lo que el Cocodrilo debría acabar detrás de la cebra
		System.out.println("\n --> En este momento, el CocodriloRojo, que realiza la animalada, debería colocarse detras de la Cebra, en tercera posición: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		System.out.println("\n --> Y vemos que los animales que el Cocodrilo se ha 'comido' antes de llegar a su posición estan en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();
			
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();
		
		
		
		/**Serpiente**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE SERPIENTE		#");
		System.out.println(" ################################################### \n");
		
		//Las añadimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		
		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : ORDENAR TODAS LAS CARTAS		-");
		System.out.println(" -------------------------------------------------------\n");
		
		//La cola se ordena de mayor a menor 		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimirConValor();
			
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		
		//Por lo que la cola ahora estaría ordenada
		System.out.println("\n --> En este momento,la cola deberá haberse ordenado de mayor a menor: \n");
		CartasEnJuego.getCartasEnJuego().imprimirConValor();
					
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		
		
		
		/**Jirafa**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE JIRAFA		#");
		System.out.println(" ################################################### \n");
		
		//Las añadimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		
		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : ANIMAL + DEBIL DELANTE 		-");
		System.out.println(" -------------------------------------------------------\n");
		
		//En la cola hay un animal más débil inmediatamente delante	
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
				
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
				
		//Por lo que el Cocodrilo debría acabar detrás de la cebra
		System.out.println("\n --> En este momento, la JirafaRojo, que realiza la animalada, debería colocarse por delante del Loro ya que es un animal más débil: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		
		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	2. CASO : ANIMAL + FUERTE DELANTE 			-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Las añadimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
				
		//En la cola hay un animal más débil inmediatamente delante	
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
				
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
				
		//Por lo que el Cocodrilo debría acabar detrás de la cebra
		System.out.println("\n --> En este momento, la JirafaRojo, que realiza la animalada, debería deberia de quedarse donde está ya que la Serpiente es un animal más fuerte: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		
		
		/**Cebra**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE CEBRA		#");
		System.out.println(" ################################################### \n");
		
		System.out.println(" --> La Cebra no tiene más animalada que no ser adelantadas por el Hipopotamo ni por el Cocodrilo.");
	
	
		
		
		/**Foca**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE FOCA			#");
		System.out.println(" ################################################### \n");
		
		//Las añadimos a CartasEnJuego
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
						
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
						
		//La foca invierte el orden de la cola
		System.out.println("\n --> En este momento, la FocaVerde, que realiza la animalada, habrá invertido el sentido de la cola: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
				
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		
		

		/**Camaleon**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE CALAMELON		#");
		System.out.println(" ################################################### \n");
		
		//Las añadimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(leonRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(camaleonAmarillo);
		
		System.out.println(" ********************************************** ");
		System.out.println("* EN EL CAMALEON VEREMOS UN PAR DE EJEMPLOS *");
		System.out.println(" ********************************************** ");

		
		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	1. EJEMPLO : SUPLANTACIÓN DE SERPIENTE 		-");
		System.out.println(" -------------------------------------------------------\n");
		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		System.out.println("\n¡Elige la opcion 3!");
		
		//Elegimos el animalar a suplantar en este turno
		//En este caso elegiremos la de la Serpiente
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		
		System.out.println("\n --> En este momento, el CamaleonAmarillo hará la animalada de la serpiente(ordenar de mayor a menor). \n");
		System.out.println(" --> Por lo que el CamaleonAmarillo se colocará cuarto: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	2. EJEMPLO : SUPLANTACIÓN DE HIPOPOTAMO 	-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Las añadimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(camaleonAmarillo);
		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();	
		
		System.out.println("\n¡Elige la opcion 1!");
		
		//Elegimos el animalar a suplantar en este turno
		//En este caso elegiremos la del Hipopotamo
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		
		System.out.println("\n --> En este momento, el CamaleonAmarillo hará la animalada del Hipopotamo. \n");
		System.out.println(" --> Por lo que el CamaleonAmarillo se colocará segundo: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		
		
		
		/**Mono**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE MONO				#");
		System.out.println(" ################################################### \n");
		
		//Las añadimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(focaVerde);
		CartasEnJuego.getCartasEnJuego().add(leonRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		
		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : ÚNICO MONO EN COLA 			-");
		System.out.println(" -------------------------------------------------------\n");
		
		//En la cola solo hay un mono
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
				
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
				
		//La animalada del mono no debe de tener efecto
		System.out.println("\n --> En este momento, el MonoRojo no deberá de tener efecto, por lo que seguirá último: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		
		System.out.println("\n -------------------------------------------------------");
		System.out.println("-2. CASO : + DE UN MONO Y COCODRILOS/HIPOPOTAMOS	-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Las añadimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(leonRojo);
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		
		//En la cola hay + de un mono
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
				
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
				
		//El mono recien jugado se debera de poner primero, seguido de los demás monos 
		System.out.println("\n --> En este momento, el MonoRojo se colocará primeo seguido de los demás monos: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();		
		
		System.out.println("\n --> Y vemos que los Cocodrilos e Hipopotamos de la cola están en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();
			
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();
		
		
		
		/**Canguro**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE CANGURO		#");
		System.out.println(" ################################################### \n");
		
		//Las añadimos a CartasEnJuego
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
				
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
				
		System.out.println("\n --> En este momento, el CanguroAzul adelanta a uno o dos animales: \n");
		System.out.println("  +  Si seleccionas '1' el canguro se colocará cuarto.");
		System.out.println("  +  Si seleccionas '2' el canguro se colocará tercero.\n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		
		
		
		/**Loro**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE LORO		#");
		System.out.println(" ################################################### \n");
		
		//Las añadimos a CartasEnJuego
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
				
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
				
		System.out.println("\n --> En este momento, el LoroVerde echa a un animal de la cola: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		System.out.println("\n --> Y vemos que el animal echado ahora se ecuentra en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();
			
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();
		
		
		
		/**Mofeta**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE MOFETA		#");
		System.out.println(" ################################################### \n");
		
		//Las añadimos a CartasEnJuego
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
				
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
				
		//La mofeta echará al hipopotamo y a los leones
		System.out.println("\n --> En este momento, la MofetaAzul echa a los 2 animales más fuertes(Leon & Hipopotamo) de la cola: \n");
		CartasEnJuego.getCartasEnJuego().imprimirConValor();
		
		System.out.println("\n --> Y vemos que los animales echados ahora se ecuentran en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimirConValor();
			
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();
	}

}