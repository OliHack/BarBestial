package packModelo;

public class Jugador {

	private String nombre;
	private ListaCartaAnimal mano;
	private ListaCartaAnimal mazo;
	private EnumColor color;

	/**
	 * se crea e inicializa un jugador segun el nombre y un color concretamente se
	 * inicializan su mano (vacia) y su mazo (con las 12 cartas animales diferentes)
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

	public CartaAnimal robarMazo() {
		// TODO - implement Jugador.robarMazo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pCartaAnimal
	 */
	public void addMano(CartaAnimal pCartaAnimal) {
		// TODO - implement Jugador.addMano
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pValor
	 */
	public CartaAnimal getCartaMano(int pValor) {
		// TODO - implement Jugador.getCartaMano
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pCartaAnimal
	 */
	public void echarCarta(CartaAnimal pCartaAnimal) {
		// TODO - implement Jugador.echarCarta
		throw new UnsupportedOperationException();
	}

	public boolean comprobarCartas() {
		// TODO - implement Jugador.comprobarCartas
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Inicializa el mano del jugador con todas las cartas del mismo color de todos los animales
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
	}

}