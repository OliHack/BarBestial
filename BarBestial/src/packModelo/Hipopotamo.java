package packModelo;

public class Hipopotamo implements Recurrente, ICompAnimalada {

	public Hipopotamo() {

	}

	@Override
	public void animalada() {
		int pos = CartasEnJuego.getCartasEnJuego().getListaAnimales().getLastPosition();
		this.animalada(pos);
	}

	@Override
	public void animalada(int pPos) {
		// pPos=0,1,2,3 o 4
		/*
		 * CartaAnimal hipo =
		 * CartasEnJuego.getCartasEnJuego().getListaAnimales().getCarta(pPos); int pos =
		 * pPos - 1; if (CartasEnJuego.getCartasEnJuego().numCartas() == 1 || pPos == 0)
		 * { System.out.println("Cocodrilo no puede comer :(( "); } else { if
		 * (CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getValor() < 10 &&
		 * CartasEnJuego.getCartasEnJuego()
		 * .getListaAnimales().getCarta(pos).getAnimalada() instanceof Cebra == false) {
		 * CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().add(
		 * pos, hipo);
		 * CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().remove
		 * (pPos + 1); this.animalada(pos); } }
		 */ // ESTA ANIMALADA ES LA DEL COCODRILO ?????

		int pos = pPos, max = pos;
		pos--;
		while (pos >= 0) {
			if (CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getValor() >= Constantes.VALOR_HIPO
					|| CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getAnimalada() instanceof Cebra) {
				
				break;
			}
			
			max = pos;
			pos--;
		}
		CartaAnimal hipo = CartasEnJuego.getCartasEnJuego().delCarta(pPos);
		CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(hipo, max);
		System.out.println("Terminada la recurrencia del Hipopotamo");
	}

	@Override
	public void recurrir() {
		// TODO Auto-generated method stub

	}

}