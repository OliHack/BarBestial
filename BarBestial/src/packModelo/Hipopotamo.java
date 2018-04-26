package packModelo;

public class Hipopotamo implements Recurrente, ICompAnimalada {

	public Hipopotamo() {
		
	}

	@Override
	public void animalada() {
		int pos=CartasEnJuego.getCartasEnJuego().getLastPosition(), max = 0;
		while(pos>0) {
			pos--;
			if(CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getValor()>=Constantes.VALOR_HIPO || CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getTipo().equals("Cebra")) {
				max=pos+1;
				break;
			}	
		}
		CartaAnimal hipo = CartasEnJuego.getCartasEnJuego().delCarta(CartasEnJuego.getCartasEnJuego().getLastPosition());
		CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(hipo, max);

	}
	@Override
	public void animalada(int i) {
		int pos=i, max = pos;
		while(pos>0) {
			pos--;
			if(CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getValor()>=Constantes.VALOR_HIPO || CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getTipo().equals("Cebra")) {
				max=pos;
				break;
			}	
		}
		CartaAnimal hipo = CartasEnJuego.getCartasEnJuego().delCarta(pos);
		CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(hipo, max);
	}

	@Override
	public void recurrir() {
		// TODO Auto-generated method stub

	}

}