package packModelo;

public class Cocodrilo implements Recurrente, ICompAnimalada {

	public Cocodrilo() {

	}

	@Override
	public void animalada() {
		int pos = CartasEnJuego.getCartasEnJuego().getListaAnimales().getLastPosition();
		this.animalada(pos);
	}

	@Override
	public void animalada(int pPos) {
		// pPos=0,1,2,3 o 4
		CartaAnimal cocodrilo = CartasEnJuego.getCartasEnJuego().getListaAnimales().getCarta(pPos);
		int pos = pPos - 1;
		if (CartasEnJuego.getCartasEnJuego().numCartas() == 1 || pPos == 0) {
			System.out.println("Cocodrilo no puede comer más ");
		} else {
			if (CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getValor() < 10 && !(CartasEnJuego
					.getCartasEnJuego().getListaAnimales().getCarta(pos).getAnimalada() instanceof Cebra)) {
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().add(pos, cocodrilo);
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().remove(pPos + 1);
				Calle.getCalle().addAnimal(CartasEnJuego.getCartasEnJuego().getListaAnimales().getCarta(pPos));
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().remove(pPos);
				this.animalada(pos);
			}
		}
		System.out.println("Terminada la recurrencia del cocodrilo");
		/*
		 * try { Thread.sleep(4000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	}

	@Override
	public void recurrir() {
		// TODO Auto-generated method stub

	}

}