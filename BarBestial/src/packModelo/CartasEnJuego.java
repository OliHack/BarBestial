package packModelo;

public class CartasEnJuego {

	private static CartasEnJuego misCartasEnJuego;
	private ListaCartaAnimal ListaAnimales;

	private CartasEnJuego() {
	}

	public static CartasEnJuego getCartasEnJuego() {
		if (misCartasEnJuego == null) {
			misCartasEnJuego = new CartasEnJuego();
		}
		return misCartasEnJuego;
	}

	/**
	 * 
	 * @param pCartaAnimal
	 */
	public void add(CartaAnimal pCartaAnimal) {
		// TODO - implement CartasEnJuego.add
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pPos
	 */
	public void delCarta(int pPos) {
		// TODO - implement CartasEnJuego.delCarta
		throw new UnsupportedOperationException();
	}

	public void ejecutarRec() {
		// TODO - implement CartasEnJuego.ejecutarRec
		throw new UnsupportedOperationException();
	}

	public boolean colaLlena() {
		// TODO - implement CartasEnJuego.colaLlena
		throw new UnsupportedOperationException();
	}

	public ListaCartaAnimal getCartasCielo() {
		// TODO - implement CartasEnJuego.getCartasCielo
		throw new UnsupportedOperationException();
	}

	public CartaAnimal getCartaPatada() {
		// TODO - implement CartasEnJuego.getCartaPatada
		throw new UnsupportedOperationException();
	}
	/**
	 * Inicializa la lista de cartas (vacia)
	 */
	public void inicializar() {
		ListaAnimales = new ListaCartaAnimal();
	}

}