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
		int j =0;
		while(j!=2) {
			CartaAnimal animal = CartasEnJuego.getCartasEnJuego().animalMasFuerte();
			System.out.println(animal.getTipo());
			for(int i=0; i < CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size();i++) {
				if(CartasEnJuego.getCartasEnJuego().getCartaDePos(i).getTipo().equals(animal.getTipo())) {
					CartasEnJuego.getCartasEnJuego().mandarAnimalACalle(CartasEnJuego.getCartasEnJuego().getCartaDePos(i).getTipo());
					break;
				}
			}
			j++;
		}
	}

	@Override
	public void animalada(int pos) {
		animalada();

	}

}