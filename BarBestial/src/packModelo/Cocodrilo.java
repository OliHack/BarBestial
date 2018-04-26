package packModelo;

public class Cocodrilo implements Recurrente, ICompAnimalada {

	public Cocodrilo() {

	}

	@Override
	public void animalada() {
		int pos=CartasEnJuego.getCartasEnJuego().getLastPosition(), max = 0;
		while(pos>0) {
			pos--;
			if(CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getValor()>=Constantes.VALOR_COCO || CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getTipo().equals("Cebra")) {
				max=pos+1;
				break;
			}	
			else {
				CartaAnimal animal = CartasEnJuego.getCartasEnJuego().delCarta(pos);
				Calle.getCalle().addAnimal(animal);
			}
		}
		CartaAnimal coco = CartasEnJuego.getCartasEnJuego().delCarta(CartasEnJuego.getCartasEnJuego().getLastPosition());
		CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(coco, max);

	}

	@Override
	public void animalada(int pPos) {
		// pPos=0,1,2,3 o 4
		
		int pos=pPos, max = 0;
		while(pos>0) {
			pos--;
			if(CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getValor()>=Constantes.VALOR_COCO || CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getTipo().equals("Cebra")) {
				max=pos+1;
				break;
			}	
			else {
				CartaAnimal animal = CartasEnJuego.getCartasEnJuego().delCarta(pos);
				Calle.getCalle().addAnimal(animal);
			}
		}
		CartaAnimal coco = CartasEnJuego.getCartasEnJuego().delCarta(CartasEnJuego.getCartasEnJuego().getLastPosition());
		CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(coco, max);
		
		/*CartaAnimal cocodrilo = CartasEnJuego.getCartasEnJuego().getListaAnimales().getCarta(pPos);
		int pos = pPos - 1;
		CartasEnJuego.getCartasEnJuego();
		if (CartasEnJuego.getCartasEnJuego().numCartas() == 1) {
			System.out.println("Cola con una carta de cocodrilo");
		} else {
			CartasEnJuego.getCartasEnJuego();
			if (CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getValor() < 10 || CartasEnJuego.getCartasEnJuego()
					.getListaAnimales().getCarta(pos).getAnimalada() instanceof Cebra == false) {
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().add(pos, cocodrilo);
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().remove(pPos + 1);
				Calle.getCalle().addAnimal(CartasEnJuego.getCartasEnJuego().getListaAnimales().getCarta(pPos));
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().remove(pPos);
				this.animalada(pos);
			}
		}
		System.out.println("Terminada la recurrencia del cocodrilo");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	@Override
	public void recurrir() {
		// TODO Auto-generated method stub

	}

}