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
		
		//Cartas que vamos a necesitar para las pruebas
		CartaAnimal leonVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Leon");
		CartaAnimal hipoAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Hipopotamo");
		CartaAnimal cebraAzul = CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Cebra");
		CartaAnimal cocodRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Cocodrilo");
		CartaAnimal focaVerde= CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Foca");
		CartaAnimal loroVerde = CartaFactory.getCartaFactory().crearCarta(EnumColor.VERDE, "Loro");
		CartaAnimal leonRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Leon");
		CartaAnimal monoRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Mono");
		CartaAnimal monoAmarillo = CartaFactory.getCartaFactory().crearCarta(EnumColor.AMARILLO, "Mono");
		CartaAnimal jirafaRojo = CartaFactory.getCartaFactory().crearCarta(EnumColor.ROJO, "Jirafa");
		CartaAnimal serpAzul= CartaFactory.getCartaFactory().crearCarta(EnumColor.AZUL, "Serpiente");
		
		/**Leon**/

		System.out.println(" ###################################################");
		System.out.println("#		PRUEBAS DE LEON			#");
		System.out.println(" ################################################### \n");
		
		
		//Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(cebraAzul);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		
		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO: UN LEON Y SIN MONOS 			-");
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
		System.out.println("-	2. CASO: + DE UN LEON Y SIN MONOS 		-");
		System.out.println(" -------------------------------------------------------\n");		
		
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
		System.out.println("-	3. CASO: UN LEON Y CON MONOS 			-");
		System.out.println(" -------------------------------------------------------\n");

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
	
		//Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		
		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : TODAS CARTAS MAS DEBILES 		-");
		System.out.println(" -------------------------------------------------------\n");
		
		//En la cola todos los animales son mas debiles que el hipopotamo
		//por lo que cuando embista se colocar� primero.		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		
		//Por lo que el Hipopotamo debria acabar primero
		System.out.println("\n --> En este momento, el HipopotamoAmarillo, que realiza la animalada, deber�a colocarse primero al ser el animal con m�s fuerza: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		
		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	2. CASO : CARTAS + FUERTES EN LA COLA 		-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(leonVerde);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
	
		//En la cola hay un animal mas fuerte que el hipopotamo
		//por lo que cuando embista se colocar� detras de este.		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
		
		//Por lo que el LHipopotamo deberia acabar detras del Leon
		System.out.println("\n --> En este momento, el HipopotamoAmarillo, que realiza la animalada, deber�a colocarse detras del Leon, ya que este es m�s fuerte: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
			
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
	
		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	3. CASO : CEBRA EN LA COLA 			-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Las a�adimos a CartasEnJuego
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
		System.out.println("\n --> En este momento, el HipopotamoAmarillo, que realiza la animalada, deber�a colocarse detras de la Cebra, en cuarta posici�n: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
			
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		
		
		
		/**Cocodrilo**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE COCODRILO		#");
		System.out.println(" ################################################### \n");
		
		//Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		
		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : TODAS CARTAS MAS DEBILES POR DELANTE	-");
		System.out.println(" -------------------------------------------------------\n");
				
		//En la cola todos los animales por delante son mas debiles que el cocodrilo
		//por lo que cuando haga la animalada se colocar� primero.		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
				
		//Por lo que el Cocodrilo deber�a de acabar primero
		System.out.println("\n --> En este momento, el CocodriloRojo, que realiza la animalada, deber�a colocarse primero, ya que todos los de delante son m�s d�biles: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		System.out.println("\n --> Y vemos que los animales que el Cocodrilo se ha 'comido' estan en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();
		
		System.out.println(" -------------------------------------------------------");
		System.out.println("-	2. CASO : CARTAS MAS FUERTES POR DELANTE	-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(hipoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		CartasEnJuego.getCartasEnJuego().add(cocodRojo);
		
		
		//En la cola hay animales por delante que son mas fuertes que el cocodrilo
		//por lo que cuando haga la animalada se colocar� detras de un animal mas fuerte que �l.		
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
				
		//Por lo que el Cocodrilo deber�a de acabar detras del hipoAmarillo
		System.out.println("\n --> En este momento, el CocodriloRojo, que realiza la animalada, deber�a colocarse detras del HipopotanoAmarillo, ya que es m�s fuerte que �l: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		System.out.println("\n --> Y vemos que los animales que el Cocodrilo se ha 'comido' antes de llegar a su posici�n estan en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();
	
		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	3. CASO : CEBRA EN LA COLA 			-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Las a�adimos a CartasEnJuego
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
		
		//Por lo que el Cocodrilo debr�a acabar detr�s de la cebra
		System.out.println("\n --> En este momento, el CocodriloRojo, que realiza la animalada, deber�a colocarse detras de la Cebra, en tercera posici�n: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		System.out.println("\n --> Y vemos que los animales que el Cocodrilo se ha 'comido' antes de llegar a su posici�n estan en la Calle: \n");
		Calle.getCalle().getListaAnimales().imprimir();
			
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		Calle.getCalle().getListaAnimales().getListaAnimales().clear();
		
		
		
		/**Serpiente**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE SERPIENTE		#");
		System.out.println(" ################################################### \n");
		
		//Las a�adimos a CartasEnJuego
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
		
		//Por lo que la cola ahora estar�a ordenada
		System.out.println("\n --> En este momento,la cola deber� haberse ordenado de mayor a menor: \n");
		CartasEnJuego.getCartasEnJuego().imprimirConValor();
					
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		
		
		
		/**Jirafa**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE JIRAFA		#");
		System.out.println(" ################################################### \n");
		
		//Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
		
		System.out.println(" -------------------------------------------------------");
		System.out.println("-	1. CASO : ANIMAL + DEBIL DELANTE 		-");
		System.out.println(" -------------------------------------------------------\n");
		
		//En la cola hay un animal m�s d�bil inmediatamente delante	
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
				
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
				
		//Por lo que el Cocodrilo debr�a acabar detr�s de la cebra
		System.out.println("\n --> En este momento, la JirafaRojo, que realiza la animalada, deber�a colocarse por delante del Loro ya que es un animal m�s d�bil: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		
		System.out.println("\n -------------------------------------------------------");
		System.out.println("-	2. CASO : ANIMAL + FUERTE DELANTE 			-");
		System.out.println(" -------------------------------------------------------\n");
		
		//Las a�adimos a CartasEnJuego
		CartasEnJuego.getCartasEnJuego().add(monoAmarillo);
		CartasEnJuego.getCartasEnJuego().add(loroVerde);
		CartasEnJuego.getCartasEnJuego().add(monoRojo);
		CartasEnJuego.getCartasEnJuego().add(serpAzul);
		CartasEnJuego.getCartasEnJuego().add(jirafaRojo);
				
		//En la cola hay un animal m�s d�bil inmediatamente delante	
		System.out.println(" --> El orden inicial de la cola es: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
				
		//Ejecutamos la animalada
		CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
				
		//Por lo que el Cocodrilo debr�a acabar detr�s de la cebra
		System.out.println("\n --> En este momento, la JirafaRojo, que realiza la animalada, deber�a deberia de quedarse donde est� ya que la Serpiente es un animal m�s fuerte: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
		
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();

		
		
		/**Cebra**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE CEBRA		#");
		System.out.println(" ################################################### \n");
		
		System.out.println(" --> La Cebra no tiene m�s animalada que no ser adelantadas por el Hipopotamo ni por el Cocodrilo.");
	
	
		
		
		/**Foca**/

		System.out.println("\n ###################################################");
		System.out.println("#		PRUEBAS DE FOCA			#");
		System.out.println(" ################################################### \n");
		
		//Las a�adimos a CartasEnJuego
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
		System.out.println("\n --> En este momento, la FocaVerde, que realiza la animalada, habr� invertido el sentido de la cola: \n");
		CartasEnJuego.getCartasEnJuego().imprimir();
				
		CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().clear();
		
		}

}
