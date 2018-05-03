package packModelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;

public class CartasEnJuego extends Observable {

	private static CartasEnJuego misCartasEnJuego;
	private static ListaCartaAnimal ListaAnimales;

	private CartasEnJuego() {
	}

	/**
	 *
	 * @param pCartaAnimal
	 */
	public void add(CartaAnimal pCartaAnimal) {
		CartasEnJuego.ListaAnimales.getListaAnimales().add(pCartaAnimal);
	}

	public CartaAnimal animalMasFuerte() {
		Iterator<CartaAnimal> it = CartasEnJuego.ListaAnimales.getListaAnimales().iterator();
		int max = 0;
		CartaAnimal animal = null;
		while (it.hasNext()) {
			CartaAnimal carta = it.next();
			if (carta.getValor() > max) {
				animal = carta;
				max = carta.getValor();
			}
		}
		return animal;
	}

	/**
	 * Devuelve un boolean indicando si la cola actual está llena (true) o no
	 * (false)
	 *
	 * @return
	 */
	public boolean colaLlena() {
		if (CartasEnJuego.ListaAnimales.getListaAnimales().size() < 5)
			return false;
		else
			return true;

	}
	public int size() {
		return ListaAnimales.size();
	}
	
	public String getImgPath(int pos){
		return ListaAnimales.getPathImg(pos);
	}
	public boolean contieneAnimal(String animal) {
		Iterator<CartaAnimal> it = CartasEnJuego.ListaAnimales.getIterator();
		while (it.hasNext()) {
			CartaAnimal carta = it.next();
			if (animal.equals(carta.getTipo()))
				return true;

		}
		return false;
	}

	public boolean contieneAnimalRepetido(String animal) {
		Iterator<CartaAnimal> it = CartasEnJuego.ListaAnimales.getIterator();
		int i = 0;
		while (it.hasNext()) {
			CartaAnimal carta = it.next();
			if (animal.equals(carta.getTipo())) {
				i++;
			}
		}
		if (i > 1)
			return true;
		return false;
	}

	/**
	 *
	 * @param pPos
	 */
	public CartaAnimal delCarta(int pPos) {
		CartaAnimal animal = CartasEnJuego.ListaAnimales.getListaAnimales().get(pPos);
		CartasEnJuego.ListaAnimales.getListaAnimales().remove(pPos);
		return animal;
	}

	/**
	 * se ejecutar� la animalada del �ltimo animal que se encuentre en la cola
	 * cuando se ejecute el m�todo
	 *
	 * @param
	 */
	public void ejecutarAnimalada() {
		CartasEnJuego.ListaAnimales.getLast().setActivada(true);
		CartasEnJuego.ListaAnimales.getLast().hacerAnimalada();
		CartasEnJuego.getCartasEnJuego().ejecutarRec();
		setAll(false);
	}

	public void setAll(boolean t) {
		ListaAnimales.setAll(t);
	}

	public void ejecutarRec() {
		ArrayList<CartaAnimal> lista = CartasEnJuego.ListaAnimales.getRecurrentes();
		for (int k = 0; k < lista.size(); k++) {
			if (lista.get(k) != null) {
				lista.get(k).hacerAnimaladaRec(k);
			}
		}
	}

	public CartaAnimal getCartaDePos(int pos) {
		return CartasEnJuego.ListaAnimales.getListaAnimales().get(pos);
	}

	/**
	 * Devuelve la última carta de la cola actual además de eliminarla de la misma
	 *
	 * @return
	 */
	public CartaAnimal getCartaPatada() {
		final Iterator<CartaAnimal> itr = CartasEnJuego.ListaAnimales.getIterator();
		CartaAnimal last = itr.next();

		while (itr.hasNext()) {
			last = itr.next();
		}
		itr.remove();
		return last;
	}

	/**
	 * Devuelve las dos primeras cartas de la cola actual, y las elimina de la misma
	 *
	 * @return
	 */
	public ListaCartaAnimal getCartasCielo() {
		Iterator<CartaAnimal> it = CartasEnJuego.ListaAnimales.getIterator();
		ListaCartaAnimal cielo = new ListaCartaAnimal();
		for (int i = 0; i < 2; i++) {
			cielo.add(it.next());
		}

		CartasEnJuego.getCartasEnJuego().delCarta(0);
		CartasEnJuego.getCartasEnJuego().delCarta(0);
		return cielo;

	}

	public int getLastPosition() {
		return CartasEnJuego.ListaAnimales.getLastPosition();
	}

	public ListaCartaAnimal getListaAnimales() {
		return CartasEnJuego.ListaAnimales;
	}

	public int getPosDeCartaRepetida(CartaAnimal animal) {
		Iterator<CartaAnimal> it = CartasEnJuego.ListaAnimales.getIterator();
		int i = 0, j = 0;
		while (it.hasNext()) {
			CartaAnimal carta = it.next();
			if (animal == carta) {
				j++;
			}
			if (j == 2) {
				break;
			}
			i++;
		}
		return i;
	}

	public void imprimir() {
		CartasEnJuego.getCartasEnJuego().getListaAnimales().imprimir();
	}

	public void imprimirConValor() {
		CartasEnJuego.getCartasEnJuego().getListaAnimales().imprimirConValor();
	}

	/**
	 * Inicializa la lista de cartas (vacia)
	 */
	public void inicializar() {
		CartasEnJuego.ListaAnimales = new ListaCartaAnimal();
	}

	public void mandarAnimalACalle(String animal) {
		Iterator<CartaAnimal> it = CartasEnJuego.ListaAnimales.getListaAnimales().iterator();
		while (it.hasNext()) {
			CartaAnimal carta = it.next();
			if (carta.getTipo().equals(animal)) {
				Calle.getCalle().addAnimal(carta);
				it.remove();
				setChanged();
				notifyObservers();
			}
		}
	}

	public int numCartas() {
		return CartasEnJuego.ListaAnimales.getListaAnimales().size();
	}

	public void ponerAnimalEnPos(CartaAnimal animal, int pos) {
		CartasEnJuego.ListaAnimales.getListaAnimales().add(pos, animal);
	}

	/**
	 * Revisa las cartas en juego (o cola) para ve si está llena, si lo está, mueve
	 * las dos primeras cartas de la cola al Bar Bestial y la última le da la
	 * patada.
	 *
	 *
	 */
	public void revisarCola() {
		if (colaLlena()) {
			ListaCartaAnimal sky = getCartasCielo();
			for (int j = 0; j < sky.getListaAnimales().size(); j++) {
				BarBestial.getBarBestial().addAnimal(sky.getIterator().next());
			}

			Calle.getCalle().addAnimal(getCartaPatada());
			setChanged();
			notifyObservers();
		}
	}

	public static CartasEnJuego getCartasEnJuego() {
		if (CartasEnJuego.misCartasEnJuego == null) {
			CartasEnJuego.misCartasEnJuego = new CartasEnJuego();
		}
		return CartasEnJuego.misCartasEnJuego;
	}

}
