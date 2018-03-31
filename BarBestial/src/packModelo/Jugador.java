package packModelo;

import java.util.Observable;

public class Jugador extends Observable {

	private final String			nombre;
	private final ListaCartaAnimal	mano;
	private final ListaCartaAnimal	mazo;
	private final EnumColor			color;

	/**
	 * se crea e inicializa un jugador segun el nombre y un color concretamente
	 * se inicializan su mano (vacia) y su mazo (con las 12 cartas animales
	 * diferentes)
	 *
	 * @param pNombre
	 * @param pCol
	 */
	public Jugador(String pNombre, EnumColor pCol) {
		nombre = pNombre;
		color = pCol;
		mano = new ListaCartaAnimal();
		mazo = new ListaCartaAnimal();
		inicializarMazo();
	}

	/**
	 * Agrega una carta a la mano
	 *
	 * @param pCartaAnimal
	 */
	public void addMano(CartaAnimal pCartaAnimal) {
		mano.add(pCartaAnimal);
		this.notificar();
	}

	public boolean comprobarCartas() {
		if (this.mano.getListaAnimales().isEmpty() && mazo.getListaAnimales().isEmpty())
			return true;
		else
			return false;
	}

	/**
	 *
	 * @param pCartaAnimal
	 */
	public void echarCarta(CartaAnimal pCartaAnimal) {
		CartasEnJuego.getCartasEnJuego().add(pCartaAnimal);
		this.mano.del(pCartaAnimal);
		ListaJugador.getListaJugador().comprobarCartas();
		this.notificar();
	}

	/**
	 *
	 * @param pValor
	 */
	public CartaAnimal getCartaMano(int pValor) {
		return this.mano.getCarta(pValor);
	}

	public EnumColor getColor() {
		return color;
	}

	public void notificar() {
		// el jugador va a notificar a la interfaz solo cuando cambie su mano
		setChanged();
		notifyObservers(mano);
	}

	public void robarMazo() {
		CartaAnimal miCarta = mazo.getCarta(0);
		mazo.del(miCarta);
		addMano(miCarta);
		this.notificar();
	}

	/**
	 * Inicializa el mano del jugador con todas las cartas del mismo color de
	 * todos los animales
	 *
	 *
	 */
	private void inicializarMazo() {
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Leon"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Hipopotamo"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Cocodrilo"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Serpiente"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Jirafa"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Cebra"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Foca"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Camaleon"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Mono"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Canguro"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Loro"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Mofeta"));
		mazo.desordenar();
	}
}