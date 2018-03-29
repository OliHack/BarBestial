package packModelo;

public class Calle {

	private static Calle miCalle;
	private ListaCartaAnimal ListaAnimales;

	private Calle() {
	}

	public static Calle getCalle() {
		if (miCalle==null)
			miCalle= new Calle();
		return miCalle;
	}

	/**
	 * 
	 * @param pCartaAnimal
	 */
	public void addAnimal(CartaAnimal pCartaAnimal) {
		// TODO - implement Calle.addAnimal
		throw new UnsupportedOperationException();
	}
	/**
	 * Inicializa la lista de cartas (vacia)
	 */
	public void inicializar() {
		ListaAnimales = new ListaCartaAnimal();
	}
}