package packModelo;

public class Leon implements ICompAnimalada {


	public Leon() {

	}

	@Override
	public void animalada() {
		if(!CartasEnJuego.getCartasEnJuego().contieneAnimalRepetido("Leon")) {
			CartasEnJuego.getCartasEnJuego().mandarAnimalACalle("Mono");
			CartaAnimal animal = CartasEnJuego.getCartasEnJuego().delCarta(CartasEnJuego.getCartasEnJuego().getLastPosition());
			CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(animal, 0);
		}
		else {
			CartaAnimal animal = CartasEnJuego.getCartasEnJuego().delCarta(CartasEnJuego.getCartasEnJuego().getLastPosition());
			Calle.getCalle().addAnimal(animal);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub
		
	}


}