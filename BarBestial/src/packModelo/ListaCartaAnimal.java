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
	
	public int size() {
		return ListaAnimales.size();
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

	public boolean otroAnimalExcepto(String pAnimal) {
		boolean esta=false;
		Iterator<CartaAnimal> lista = ListaAnimales.iterator();
		while(lista.hasNext()) {
			if(lista.next().getAnimalada() instanceof Camaleon ==false) {
				esta=true;
				break;
			}
			lista.next();
		}
		return esta;
	}
	public void delLast() {
		this.ListaAnimales.remove(getLastPosition());
	}
	public Iterator<CartaAnimal> getIterator() {
		return ListaAnimales.iterator();
	}

	public ArrayList<CartaAnimal> getListaAnimales() {
		return ListaAnimales;
	}

	public CartaAnimal getLast() {
		return ListaAnimales.get(ListaAnimales.size()-1);
	}
	
	public int getLastPosition() {
		return ListaAnimales.size()-1;
	}
	
	
	/**
	 *Este m�todo devuelve los que sean recurrentes teniendo 
	 *en cuenta si se ha ejecutado anteriormente
	 * 
	 * @return
	 */

	public ArrayList<CartaAnimal> getRecurrentes() {
		Iterator<CartaAnimal> it = ListaAnimales.iterator();
		ArrayList<CartaAnimal> lista=new ArrayList<CartaAnimal>();
		while(it.hasNext()) {
			if((it.next() instanceof Recurrente)&& it.next().getActivada()==false) {
				lista.add(it.next());
				it.next();
			}else {
				lista.add(null);
			}
		}
		return lista;
	}

	public boolean esta(CartaAnimal pCarta) {
		// TODO Auto-generated method stub
		return this.ListaAnimales.contains(pCarta);
	}
}