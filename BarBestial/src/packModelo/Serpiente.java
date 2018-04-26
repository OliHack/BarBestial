package packModelo;

public class Serpiente implements ICompAnimalada {

	public Serpiente() {

	}

	@Override
	public void animalada() {
		// TODO Auto-generated method stub
		
		CartaAnimal carta;
		int i=0;
		while (i < CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size()-1){
			int j=0;
			while(j< CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size()-1){
				if( (CartasEnJuego.getCartasEnJuego().getCartaDePos(j+1).getValor()) > (CartasEnJuego.getCartasEnJuego().getCartaDePos(j).getValor())){
					carta = CartasEnJuego.getCartasEnJuego().delCarta(j+1);
					CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(carta, j);
				}
				j++;
			}
			i++;
		}
	}


	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub
		
	}

}