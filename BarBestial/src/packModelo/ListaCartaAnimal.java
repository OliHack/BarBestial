package packModelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListaCartaAnimal {

	private Collection<CartaAnimal> ListaAnimales;

	public ListaCartaAnimal() {
		ListaAnimales = new ArrayList<CartaAnimal>();
	}

	/**
	 * 
	 * @param pCartaAnimal
	 */
	public void add(CartaAnimal pCartaAnimal) {
		ListaAnimales.add(pCartaAnimal);
	}

	/**
	 * 
	 * @param pCartaAnimal
	 */
	public void del(CartaAnimal pCartaAnimal) {
		ListaAnimales.remove(pCartaAnimal);
	}

	/**
	 * 
	 * @param pValor
	 */
	public CartaAnimal getCarta(int pValor) {
		// TODO - implement ListaCartaAnimal.getCarta
		throw new UnsupportedOperationException();
	}

	public void desordenar() {
		// TODO - implement ListaCartaAnimal.desordenar
		throw new UnsupportedOperationException();
	}

	public void ejecutarRec() {
		// TODO - implement ListaCartaAnimal.ejecutarRec
		throw new UnsupportedOperationException();
	}

	public Iterator<CartaAnimal> getIterator() {
		return ListaAnimales.iterator();
	}

}