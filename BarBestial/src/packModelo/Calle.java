package packModelo;

import java.util.Observable;

public class Calle extends Observable{

	private static Calle miCalle;
	private ListaCartaAnimal ListaAnimales;

	public ListaCartaAnimal getListaAnimales() {
		return ListaAnimales;
	}

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
		ListaAnimales.add(pCartaAnimal);
		setChanged();
		notifyObservers();
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