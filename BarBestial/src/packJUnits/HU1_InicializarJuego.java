package packJUnits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import packModelo.*;

class HU1_InicializarJuego {

	private String[] nombres = {"JonAnder", "Unai", "Oliver", "Frank"};
	
	@BeforeEach
	void setUp() throws Exception {
		Partida.getPartida();	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testInicializarPartida() {
		
		Partida.getPartida().inicializarPartida(nombres);
		
		/**Pruebas CartasEnJuego**/
		
		//Al iniciar la partida no habra cartas en juego.
		assertEquals(CartasEnJuego.getCartasEnJuego().numCartas(),0);
		//Y, por tanto, la cola de CartasEnJuego no estara llena
		assertFalse(CartasEnJuego.getCartasEnJuego().colaLlena());
		
		
		/**Pruebas BarBestial(Cielo)**/
		
		//Al iniciar la partida no habra cartas en el BarBestial.
		assertEquals(BarBestial.getBarBestial().numCartas(), 0);
		
		
		/**Pruebas Calle**/
		//Al iniciar la partida no habra cartas en la Calle.
		assertEquals(Calle.getCalle().numCartas(), 0);
		
		
		/**Pruebas Jugadores**/
		
		//Al inicializar la partida habra 4 jugadores.
		assertEquals(ListaJugador.getListaJugador().getNumJug(),4);
		
		//A cada uno se le asignara un color diferente.
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getNombre() , nombres[0]);
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getNombre() , nombres[1]);
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getNombre() , nombres[2]);
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getNombre() , nombres[3]);
		
		//Todos los jugadores comenzaran sin cartas en su mano.
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales().size(), 0);
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales().size(), 0);
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales().size(), 0);
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales().size(), 0);
		
		//Todos los jugdores comenzaran con todas las cartas(12) en su mazo.
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMazo().getListaAnimales().size(), Constantes.MAZO);
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMazo().getListaAnimales().size(), Constantes.MAZO);
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMazo().getListaAnimales().size(), Constantes.MAZO);		
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMazo().getListaAnimales().size(), Constantes.MAZO);
		
		//Cada jugador tendra todas las cartas del mismo color, en particular el que se le ha asignado.
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMazo().getCarta(1).getColor(), EnumColor.AMARILLO);
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMazo().getCarta(1).getColor(), EnumColor.AZUL);
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMazo().getCarta(1).getColor(), EnumColor.ROJO);
		assertEquals(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMazo().getCarta(1).getColor(), EnumColor.VERDE);
	}

}
