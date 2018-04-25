package packModelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;


public class CartasEnJuego extends Observable {

	private static CartasEnJuego	misCartasEnJuego;
	private static ListaCartaAnimal		ListaAnimales;

	public ListaCartaAnimal getListaAnimales() {
		return ListaAnimales;
	}

	private CartasEnJuego() {
	}

	/**
	 *
	 * @param pCartaAnimal
	 */
	public void add(CartaAnimal pCartaAnimal) {
		ListaAnimales.getListaAnimales().add(pCartaAnimal);
	}

	/**
	 * Devuelve un boolean indicando si la cola actual está llena (true) o no
	 * (false)
	 * 
	 * @return
	 */
	public boolean colaLlena() {
		if (ListaAnimales.getListaAnimales().size() < 5)
			return false;
		else
			return true;

	}
	/**
	 * se ejecutar� la animalada del �ltimo animal que se encuentre en 
	 * la cola cuando se ejecute el m�todo
	 * @param 
	 */
	public void ejecutarAnimalada() {
		ListaAnimales.getLast().hacerAnimalada();;
		this.ejecutarRec();
	}

	/**
	 *
	 * @param pPos
	 */
	public CartaAnimal delCarta(int pPos) {
		CartaAnimal animal = ListaAnimales.getListaAnimales().get(pPos);
		ListaAnimales.getListaAnimales().remove(pPos);
		return animal;
	}
	
	public CartaAnimal getCartaDePos(int pos) {
		return ListaAnimales.getListaAnimales().get(pos);
	}

	public void ejecutarRec() {
		ArrayList<CartaAnimal> lista= ListaAnimales.getRecurrentes();
		Iterator<CartaAnimal> it = lista.iterator();
		while(it.hasNext()) {
			if(CartasEnJuego.ListaAnimales.esta(it.next())) {
				it.next().hacerAnimalada();
			}
			it.next();
		}
	}


	public boolean contieneAnimal(String animal) {
		Iterator<CartaAnimal> it = ListaAnimales.getIterator();		
		while(it.hasNext()) {
			CartaAnimal carta = it.next();
			if(animal.equals(carta.getClass().toString())) {
				return true;
			}
			
		}
		return false;
	}
	
	public boolean contieneAnimalRepetido(String animal) {
		Iterator<CartaAnimal> it = ListaAnimales.getIterator();		
		int i=0;
		while(it.hasNext()) {
			CartaAnimal carta = it.next();
			if(animal.equals(carta.getClass().toString())) {
				i++;
			}		
		}
		if (i>1) {
			return true;
		}
		return false;
	}
	
	public void ponerAnimalEnPos(CartaAnimal animal, int pos) {
		ListaAnimales.getListaAnimales().add(pos, animal);
	}
	
	public int getLastPosition() {
		return ListaAnimales.getLastPosition();
	}
	
	public void mandarAnimalACalle(String animal){
		ArrayList<CartaAnimal> lista = new ArrayList<CartaAnimal>();
		Iterator<CartaAnimal> it = ListaAnimales.getIterator();	
		int i = 0;
		while(it.hasNext()) {
			CartaAnimal carta = it.next();
			if(contieneAnimal(animal)) {
				CartaAnimal aux = delCarta(i);
				Calle.getCalle().addAnimal(aux);
			}
			i++;
		}
	}
	
	
	/**
	 * Devuelve la última carta de la cola actual además de eliminarla de la
	 * misma
	 *
	 * @return
	 */
	public CartaAnimal getCartaPatada() {
		final Iterator<CartaAnimal> itr = ListaAnimales.getIterator();
		CartaAnimal last = itr.next();

		while (itr.hasNext()) {
			last = itr.next();
		}
		itr.remove();
		return last;
	}

	/**
	 * Devuelve las dos primeras cartas de la cola actual, y las elimina de la
	 * misma
	 *
	 * @return
	 */
	public ListaCartaAnimal getCartasCielo() {
		Iterator<CartaAnimal> it = ListaAnimales.getIterator();
		ListaCartaAnimal cielo = new ListaCartaAnimal();
		for (int i = 0; i < 2; i++) {
			cielo.add(it.next());
		}
		
		CartasEnJuego.getCartasEnJuego().delCarta(0);
		CartasEnJuego.getCartasEnJuego().delCarta(0);
		return cielo;

	}

	/**
	 * Inicializa la lista de cartas (vacia)
	 */
	public void inicializar() {
		ListaAnimales = new ListaCartaAnimal();
	}

	public int numCartas() {
		return ListaAnimales.getListaAnimales().size();
	}
	
	/**
	 * Revisa las cartas en juego (o cola) para ve si está llena, si lo está,
	 * mueve las dos primeras cartas de la cola al Bar Bestial y la última le da
	 * la patada.
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