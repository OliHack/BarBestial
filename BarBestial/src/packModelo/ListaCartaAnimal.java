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
		for (int k = 0; k < ListaAnimales.size(); k++) {
			if (ListaAnimales.get(k).hacerAnimaladaRec(k)) {
				break;
			}
		}
		if (todasActivas() == false) {
			this.ejecutarRec();
		}
		setAll(false);
	}

	public boolean esta(CartaAnimal pCarta) {
		return this.ListaAnimales.contains(pCarta);
	}

	/**
	 *
	 * @param pPos
	 */
	public CartaAnimal getCarta(int pPos) {
		CartaAnimal nueva = null;
		Iterator<CartaAnimal> lista = ListaAnimales.iterator();
		int i = 0;
		while (lista.hasNext()) {
			CartaAnimal x = lista.next();
			if (pPos == i) {
				nueva = x;
				break;
			}
			i++;
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

	public String getPathImg(int pos) {
		return ListaAnimales.get(pos).getPathImg();
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

	public void hacerAnimalada() {
		this.getLast().hacerAnimalada();

	}

	public void imprimir() {
		for (int i = 0; i < ListaAnimales.size(); i++) {
			System.out.println(ListaAnimales.get(i).getTipo() + ListaAnimales.get(i).getColor());
		}
	}

	public void imprimirConValor() {
		for (int i = 0; i < ListaAnimales.size(); i++) {
			System.out.println(ListaAnimales.get(i).getTipo() + ListaAnimales.get(i).getColor() + " --> "
					+ ListaAnimales.get(i).getValor());
		}
	}

	public boolean otroAnimalExcepto(String pAnimal) {
		boolean esta = false;
		Iterator<CartaAnimal> lista = ListaAnimales.iterator();
		while (lista.hasNext()) {
			CartaAnimal x = lista.next();
			if (x.getAnimalada() instanceof Camaleon == false) {
				esta = true;
				break;
			}
		}
		return esta;
	}

	public void setAll(boolean t) {
		for (int i = 0; i < ListaAnimales.size(); i++) {
			ListaAnimales.get(i).setActivada(t);
		}
	}

	public int size() {
		return ListaAnimales.size();
	}

	private boolean todasActivas() {
		// devuelve false si hay inactivas
		boolean act = true;
		for (int k = 0; k < ListaAnimales.size(); k++) {

			if (ListaAnimales.get(k).getAnimalada() instanceof Recurrente
					&& ListaAnimales.get(k).activadaRec() == false) {
				act = false;
				break;
			}
		}
		return act;
	}
}