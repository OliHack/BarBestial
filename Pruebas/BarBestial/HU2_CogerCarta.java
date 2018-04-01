package BarBestial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packModelo.*;

class HU2_CogerCarta {

	private String[] nombres = {"JonAnder", "Unai", "Oliver", "Frank"};
	
	@BeforeEach
	void setUp() throws Exception {
		Partida.getPartida();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRobarMazo() {
		
		Partida.getPartida().inicializarPartida(nombres);
		
		/**Prueba Jugador**/
		
		// Al principio cuando un jugador roba una carta, tendra una carta en la mano
		// mientras que en el mazo le quedaran 11.
		ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).robarMazo();
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales().size(), 1);
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMazo().getListaAnimales().size(), 11);
		
		//Por lo que ninguna de las dos listas estara vacia
		assertFalse(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).comprobarCartas());
		
		// Cuantas mas cartas robemos del mazo, mas tendremos en la mano (max. 4)
		// y menos tendremos en el mazo
		
		for (int i = 0; i < 4 ; i++) {
			ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).robarMazo();
		}
		
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales().size(), Constantes.MANO);
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMazo().getListaAnimales().size(), Constantes.MAZO - Constantes.MANO);
		
	}

}
