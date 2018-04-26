package packModelo;

public class Jirafa implements Recurrente, ICompAnimalada {

	public Jirafa() {

	}

	@Override
	public void animalada() {
		int ult = CartasEnJuego.getCartasEnJuego().getLastPosition();
		if (CartasEnJuego.getCartasEnJuego().getCartaDePos(ult).getValor() > CartasEnJuego.getCartasEnJuego().getCartaDePos(ult-1).getValor()){
			CartaAnimal animal = CartasEnJuego.getCartasEnJuego().delCarta(ult);
			CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(animal, ult-1);
		}

	}


	@Override
	public void recurrir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void animalada (int i){
		if (CartasEnJuego.getCartasEnJuego().getCartaDePos(i).getValor() > CartasEnJuego.getCartasEnJuego().getCartaDePos(i-1).getValor()){
			CartaAnimal animal = CartasEnJuego.getCartasEnJuego().delCarta(i);
			CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(animal, i-1);
		}
	}

}