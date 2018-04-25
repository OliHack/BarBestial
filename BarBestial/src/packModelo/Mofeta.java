package packModelo;

public class Mofeta implements ICompAnimalada {

	public Mofeta() {

	}

	/**
	 * 
	 * La animalada de Mofeta consiste en que se obtienen los dos Valores más altos
	 * de entre todas las cartas de la cola, para posteriormente borrar todas las
	 * cartas que posean ese Valor.
	 * 
	 */
	@Override
	public void animalada() {
		int max = 0;
		int max2nd = 0;

		ListaCartaAnimal cola = CartasEnJuego.getCartasEnJuego().getListaAnimales();
		ListaCartaAnimal repelidas = new ListaCartaAnimal();
		for (int i = 0; i < cola.size(); i++) {
			if (cola.getListaAnimales().get(i).getAnimalada() instanceof Mofeta) {
				// Se ignora porque es una carta Mofeta
			} else {
				if (cola.getListaAnimales().get(i).getValor() > max) {
					max2nd = max;
					max = cola.getListaAnimales().get(i).getValor();
				} else if (cola.getListaAnimales().get(i).getValor() > max2nd) {
					max2nd = cola.getListaAnimales().get(i).getValor();
				}
			}
		}
		for (int i = 0; i < cola.size(); i++) {
			CartaAnimal x = cola.getListaAnimales().get(i);
			if (x.getValor() == max || x.getValor() == max2nd) {
				repelidas.add(x);
			}
		}
		for (int j = 0; j < repelidas.size(); j++) {
			CartasEnJuego.getCartasEnJuego().getListaAnimales().del(repelidas.getListaAnimales().get(j));
			Calle.getCalle().addAnimal(repelidas.getListaAnimales().get(j));
		}

	}

	@Override
	public void animalada(int pos) {
		animalada();

	}

}