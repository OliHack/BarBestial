package packModelo;

public class Hipopotamo implements Recurrente, ICompAnimalada {

	public Hipopotamo() {
		
	}

	@Override
	public void animalada() {
		int pos=CartasEnJuego.getCartasEnJuego().getLastPosition(), max = pos;
		while(pos>0) {
			pos--;
			if(CartasEnJuego.getCartasEnJuego().getCartaDePos(pos).getValor()>=Constantes.VALOR_HIPO) {
				max=pos;
				break;
			}	
		}
		CartaAnimal
		CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(animal, pos);
		// TODO Auto-generated method stub

	}

	@Override
	public void ICompAnimalada() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Recurrente() {
		// TODO Auto-generated method stub

	}

	@Override
	public void recurrir() {
		// TODO Auto-generated method stub

	}

}