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

	public void delLast() {
		this.ListaAnimales.remove(getLastPosition());
	}

	public void desordenar() {
		Collections.shuffle(ListaAnimales);
	}

	public void ejecutarRec() {
		// TODO - implement ListaCartaAnimal.ejecutarRec
		throw new UnsupportedOperationException();
	}

	public boolean esta(CartaAnimal pCarta) {
		// TODO Auto-generated method stub
		return this.ListaAnimales.contains(pCarta);
	}

	/**
	 *
	 * @param pValor
	 */
	public CartaAnimal getCarta(int pValor) {
		CartaAnimal nueva = null;
		Iterator<CartaAnimal> lista = ListaAnimales.iterator();
		int i = 0;
		while (lista.hasNext()) {
			if (pValor == i) {
				nueva = lista.next();
				break;
			}
			i++;
			lista.next();
		}
		return nueva;
	}

	public Iterator<CartaAnimal> getIterator() {
		return ListaAnimales.iterator();
	}

	public CartaAnimal getLast() {
		return ListaAnimales.get(ListaAnimales.size() - 1);
	}

	public int getLastPosition() {
		return ListaAnimales.size() - 1;
	}

	public ArrayList<CartaAnimal> getListaAnimales() {
		return ListaAnimales;
	}

	/**
	 * Este m�todo devuelve los que sean recurrentes teniendo en cuenta si se ha
	 * ejecutado anteriormente, además de null en las posiciones donde las
	 * cartas no osn recurrentes
	 *
	 * @return
	 */
 
	public ArrayList<CartaAnimal> getRecurrentes() {
		ArrayList<CartaAnimal> recurrentes = new ArrayList<CartaAnimal>();
		ListaCartaAnimal cola = CartasEnJuego.getCartasEnJuego().getListaAnimales();
		for (int i = 0; i < cola.size(); i++) {
			if (cola.getListaAnimales().get(i).getAnimalada() instanceof Recurrente
					&& !cola.getListaAnimales().get(i).activadaRec()) {
				recurrentes.add(cola.getListaAnimales().get(i));
			} else {
				recurrentes.add(null);
			}
		}
		return recurrentes;
	}

	public void imprimir() {
		for (int i = 0; i < ListaAnimales.size(); i++) {
			System.out.println(ListaAnimales.get(i).getTipo() + ListaAnimales.get(i).getColor());
		}
	}
	
	public void imprimirConValor() {
		for(int i=0; i<ListaAnimales.size();i++) {
			System.out.println(ListaAnimales.get(i).getTipo()+ListaAnimales.get(i).getColor()+ " --> " + ListaAnimales.get(i).getValor());
		}
	}

	public boolean otroAnimalExcepto(String pAnimal) {
		boolean esta = false;
		Iterator<CartaAnimal> lista = ListaAnimales.iterator();
		while (lista.hasNext()) {
			if (lista.next().getAnimalada() instanceof Camaleon == false) {
				esta = true;
				break;
			}
			lista.next();
		}
		return esta;
	}

	public int size() {
		return ListaAnimales.size();
	}
}