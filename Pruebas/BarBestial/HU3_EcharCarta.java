package BarBestial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packModelo.*;

class HU3_EcharCarta {
	
	private String[] nombres = {"JonAnder", "Unai", "Oliver", "Frank"};

	@BeforeEach
	void setUp() throws Exception {
		Partida.getPartida();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEcharCarta() {
		
		Partida.getPartida().inicializarPartida(nombres);
		
		for (int i = 0; i < 4 ; i++) {
			ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).robarMazo();
			ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).robarMazo();
			ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).robarMazo();
			ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).robarMazo();
		}
		
		
		/**Prueba Mano Jugador**/
		
		//Cuando un jugador echa una carta, pasara a tener una carta menos en su mano
		ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).echarCarta(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales().get(0));
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales().size(), Constantes.MANO - 1);
		
		
		/**Prueba CartasEnJuego**/
		
		//Como un jugador ha echado una carta, en la cola habra tan solo una carta.
		assertEquals(CartasEnJuego.getCartasEnJuego().numCartas(), 1);
		
		//Si echamos mas cartas, se ira llenando (max. 5)
		ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).echarCarta(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales().get(0));
		ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).echarCarta(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales().get(0));
		ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).echarCarta(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales().get(0));
		ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).echarCarta(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales().get(1));
		
		assertEquals(CartasEnJuego.getCartasEnJuego().numCartas(), 5);
		
		
		/**Prueba Fin Del Juego**/
		
		//Si todos los jugadores se quedan sin cartas en la mano y la cola esta vacia, el juego finalizara.
		
		//Para comprobarlo, vaciamos todas las manos de los jugadores, todos los mazos (menos una carta del jugador AZUL) y la cola.
		ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales().clear();
		ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales().clear();
		ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales().clear();
		ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales().clear();
		
		ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).robarMazo();
		
		ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMazo().getListaAnimales().clear();
		ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMazo().getListaAnimales().clear();
		ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMazo().getListaAnimales().clear();
		ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMazo().getListaAnimales().clear();
		
		CartasEnJuego.getCartasEnJuego().inicializar();
				
		System.out.println("¡¡ ATENCION !!Todos los jugadores se han quedado sin cartas,");
		System.out.println("		por lo que ahora tendria que aparecer el mensaje que indica el final del juego.\n");
		
		ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).echarCarta(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales().get(0));

		
		
	}

}
