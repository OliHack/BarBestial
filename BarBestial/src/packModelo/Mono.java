package packModelo;

public class Mono implements ICompAnimalada {

	public Mono() {

	}

	@Override
	public void animalada() {
		if(CartasEnJuego.getCartasEnJuego().contieneAnimalRepetido("Mono")){
			CartasEnJuego.getCartasEnJuego().mandarAnimalACalle("Hipopotamo");
			CartasEnJuego.getCartasEnJuego().mandarAnimalACalle("Cocodrilo");
			for(int i=0; i < CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size(); i++){
				if(CartasEnJuego.getCartasEnJuego().getCartaDePos(i).getTipo().equals("Mono")){
					CartaAnimal mono = CartasEnJuego.getCartasEnJuego().delCarta(i);
					CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(mono, 0);
				}
			}
		}
	}

	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub
		
	}

}