package packModelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListaCartaAnimal {

	private final ArrayList<CartaAnimal> ListaAnimales;

	public ListaCartaAnimal() {
		ListaAnimales = new ArrayList<CartaAnimal>();
	}

	/**
	 * Añade la carta de entrada a la lista
	 *
	 * @param pCartaAnimal
	 */
	public void add(CartaAnimal pCartaAnimal) {
		ListaAnimales.add(pCartaAnimal);
	}

	/**
	 * Borra la carta de entrada de la lista
	 *
	 * @param pCartaAnimal
	 */
	public void del(CartaAnimal pCartaAnimal) {
		ListaAnimales.remove(pCartaAnimal);
	}

	public void desordenar() {
		Collections.shuffle(ListaAnimales);
	}

	public void ejecutarRec() {
		// TODO - implement ListaCartaAnimal.ejecutarRec
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param pValor
	 */
	public CartaAnimal getCarta(int pValor) {
		CartaAnimal nueva = null;
		Iterator<CartaAnimal> lista = ListaAnimales.iterator();
		int i = 1;
		while (lista.hasNext()) {
			if (pValor == i) {
				nueva = lista.next();
			}
		}
		return nueva;
	}

	public Iterator<CartaAnimal> getIterator() {
		return ListaAnimales.iterator();
	}

	public ArrayList<CartaAnimal> getListaAnimales() {
		return ListaAnimales;
	}
}