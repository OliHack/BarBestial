package packJUnits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packModelo.*;

class HU4_RevisarElEstadoDeLaCola {
	
	private String[] nombres = {"JonAnder", "Unai", "Oliver", "Frank"};

	@BeforeEach
	void setUp() throws Exception {
		Partida.getPartida();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRevisarCola() {
		
		Partida.getPartida().inicializarPartida(nombres);
		
		for (int i = 0; i < 4 ; i++) {
			ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).robarMazo();
			ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).robarMazo();
			ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).robarMazo();
			ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).robarMazo();
		}
		
		//Jugamos 5 cartas para llenar la cola.
		ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).echarCarta(0);
		ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).echarCarta(0);
		ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).echarCarta(0);
		ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).echarCarta(0);
		ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).echarCarta(1);
		
		//Una vez que la cola este llena, el gorilla revisara la cola.
		CartasEnJuego.getCartasEnJuego().revisarCola();
		
		//Al revisar la cola, el BarBestial tendra dos cartas (las dos primeras de la cola).
		assertEquals(BarBestial.getBarBestial().numCartas(), 2);
		
		//Mietras tanto, en la Calle se habra quedado la ultima carta de la cola.
		assertEquals(Calle.getCalle().numCartas(), 1);
		
		//Por ultimo comprobamos que en la cola quedan 2 cartas.
		assertEquals(CartasEnJuego.getCartasEnJuego().numCartas(), 2);
		
		//Si volvemos  llenar la cola y volvemos a revisar, veremos como en BarBesial tendremos 4 cartas
		// y en la Calle tendremos 2.
		ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).echarCarta(1);
		ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).echarCarta(1);
		ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).echarCarta(1);
		
		CartasEnJuego.getCartasEnJuego().revisarCola();
		
		assertEquals(BarBestial.getBarBestial().numCartas(), 4);
		
		assertEquals(Calle.getCalle().numCartas(), 2);
		
		//Y en la cola volveremos a tener 2 cartas.
		assertEquals(CartasEnJuego.getCartasEnJuego().numCartas(), 2);
	}

}
