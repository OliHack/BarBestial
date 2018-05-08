package packModelo;

import java.util.Iterator;

public class BarBestial {

	private static BarBestial miBarBestial;
	private ListaCartaAnimal ListaAnimales;

	public ListaCartaAnimal getListaAnimales() {
		return ListaAnimales;
	}

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
	public int calcularPuntos(EnumColor pColor) {
		int m = 0;
		Iterator<CartaAnimal> it = ListaAnimales.getIterator();
		while (it.hasNext()) {
			CartaAnimal x = it.next();
			if (x.getColor() == pColor) {
				m += x.getPuntos();
			}
		}
		return m;
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

	public int numCartas() {
		return ListaAnimales.size();
	}

}