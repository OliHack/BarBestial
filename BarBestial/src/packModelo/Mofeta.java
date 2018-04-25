package packModelo;

import java.util.Iterator;

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
				//TODO terminar
			}
		}

	}

	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub
		
	}

}