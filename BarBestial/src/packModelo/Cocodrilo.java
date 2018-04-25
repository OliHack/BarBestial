package packModelo;

public class Cocodrilo implements Recurrente, ICompAnimalada {

	public Cocodrilo() {

	}

	@Override
	public void animalada() {
		CartaAnimal cocodrilo=CartasEnJuego.getCartasEnJuego().getListaAnimales().getLast();
		int pos=CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size()-2;
		if(CartasEnJuego.getCartasEnJuego().getCartasEnJuego().numCartas()==1) {
			System.out.println("Cola con una carta de cocodrilo");
		}else if((CartasEnJuego.getCartasEnJuego().getCartasEnJuego().getCartaDePos(pos).getValor()<10)||
				(CartasEnJuego.getCartasEnJuego().getListaAnimales().getCarta(pos).getAnimalada() instanceof Cebra ==false)) {
			CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().add(pos, cocodrilo);
			CartasEnJuego.getCartasEnJuego().getListaAnimales().delLast();
			Calle.getCalle().addAnimal(CartasEnJuego.getCartasEnJuego().getListaAnimales().getLast());
			CartasEnJuego.getCartasEnJuego().getListaAnimales().delLast();
			this.animalada();
		}

	}

	@Override
	public void recurrir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void animalada(int pPos) {
		//pPos=0,1,2,3 o 4
		CartaAnimal cocodrilo=CartasEnJuego.getCartasEnJuego().getListaAnimales().getCarta(pPos);
		int pos=pPos-1;
		if(CartasEnJuego.getCartasEnJuego().getCartasEnJuego().numCartas()==1) {
			System.out.println("Cola con una carta de cocodrilo");
		}else if((CartasEnJuego.getCartasEnJuego().getCartasEnJuego().getCartaDePos(pos).getValor()<10)||
				(CartasEnJuego.getCartasEnJuego().getListaAnimales().getCarta(pos).getAnimalada() instanceof Cebra ==false)) {
			CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().add(pos, cocodrilo);
			CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().remove(pPos+1);
			Calle.getCalle().addAnimal(CartasEnJuego.getCartasEnJuego().getListaAnimales().getCarta(pPos));
			CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().remove(pPos);
			this.animalada(pos);
		}
		
	}

}