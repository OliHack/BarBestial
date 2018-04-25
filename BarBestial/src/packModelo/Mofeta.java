package packModelo;

public class Mofeta implements ICompAnimalada {

	public Mofeta() {

	}

	@Override
	public void animalada() {
		int max = 0;
		int max2nd = 0;
		ListaCartaAnimal repelidas = new ListaCartaAnimal();
		for (int i = 0; i < CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size(); i++) {
			if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().get(i)
					.getAnimalada() instanceof Mofeta) {
				// Ignorar
			} else {
				if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().get(i).getValor() > max) {
					max2nd = max;
					max = CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().get(i).getValor();
				} else if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().get(i)
						.getValor() > max2nd) {
					max2nd = CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().get(i).getValor();
				}
			}
		}
		for (int i = 0; i < CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size(); i++) {
			if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().get(i).getValor() == max
					|| CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().get(i)
							.getValor() == max2nd) {
				CartaAnimal repelido = CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().get(i);
				repelidas.add(repelido);
				CartasEnJuego.getCartasEnJuego().getListaAnimales().del(repelido);
				Calle.getCalle().addAnimal(repelido);
			}
		}
		for (int j = 0; j < repelidas.getListaAnimales().size(); j++) {
			CartasEnJuego.getCartasEnJuego().getListaAnimales().del(repelidas.getListaAnimales().get(j));
			Calle.getCalle().addAnimal(repelidas.getListaAnimales().get(j));
		}

	}

	@Override
	public void animalada(int pos) {
		animalada();

	}

}