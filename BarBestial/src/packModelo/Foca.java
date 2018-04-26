package packModelo;

import java.util.*;

public class Foca implements ICompAnimalada {

	public Foca() {

	}

	@Override
	public void animalada() {
		Collections.reverse(CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales());
	}

	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub
		
	}


}