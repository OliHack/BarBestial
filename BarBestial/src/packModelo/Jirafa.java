package packModelo;

public class Jirafa implements Recurrente, ICompAnimalada {

	public Jirafa() {

	}

	@Override
	public void animalada() {
		int ult = CartasEnJuego.getCartasEnJuego().getLastPosition();

		if (ult > 0) {
			if (CartasEnJuego.getCartasEnJuego().getCartaDePos(ult).getValor() > CartasEnJuego.getCartasEnJuego()
					.getCartaDePos(ult - 1).getValor()) {
				CartaAnimal animal = CartasEnJuego.getCartasEnJuego().delCarta(ult);
				CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(animal, ult - 1);
			}
		}

	}

	@Override
	public void animalada(int pPos) {
		// pPos=0,1,2,3 o 4
		CartaAnimal jirafa = CartasEnJuego.getCartasEnJuego().getListaAnimales().getCarta(pPos);
		int pos = pPos - 1;
		if (CartasEnJuego.getCartasEnJuego().numCartas() == 1 || pPos == 0) {
			System.out.println("Cocodrilo no puede comer :(( ");
		} else {
			if (CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getValor() < 10 && CartasEnJuego.getCartasEnJuego()
					.getListaAnimales().getCarta(pos).getAnimalada() instanceof Cebra == false) {
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().add(pos, jirafa);
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().remove(pPos + 1);
			}
		}
		System.out.println("Terminada la recurrencia de la Jirafa");
	}

	@Override
	public void recurrir() {
		// TODO Auto-generated method stub

	}

}