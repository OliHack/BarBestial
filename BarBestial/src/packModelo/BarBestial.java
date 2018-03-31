package packModelo;

public class BarBestial {

	private static BarBestial miBarBestial;
	private ListaCartaAnimal ListaAnimales;

	private BarBestial() {
	}

	public static BarBestial getBarBestial() {
		if (miBarBestial == null)
			miBarBestial = new BarBestial();
		return miBarBestial;
	}

	/**
	 * 
	 * @param pColor
	 */
	public int calcularPuntos(String pColor) {
		// TODO - implement BarBestial.calcularPuntos
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pCartaAnimal
	 */
	public void addAnimal(CartaAnimal pCartaAnimal) {
		ListaAnimales.add(pCartaAnimal);
	}
	/**
	 * Inicializa la lista de cartas (vacia)
	 */
	public void inicializar() {
		ListaAnimales = new ListaCartaAnimal();
	}

}