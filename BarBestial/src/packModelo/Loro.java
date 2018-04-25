package packModelo;

import java.util.*;

public class Loro implements ICompAnimalada {

	public Loro() {

	}

	@Override
	public void animalada() {
		int pos;
		//Se le pide al jugador que indique que animal quiere que vaya a Calle
		System.out.println("Elige el animal que quieres mandar a 'ES LO QUE HAY' indicando su posicion (1 - 5) en la cola. ");
		Scanner aux = new Scanner(System.in);
		pos = aux.nextInt(); 
		
		CartaAnimal animal = CartasEnJuego.getCartasEnJuego().delCarta(pos);
		Calle.getCalle().addAnimal(animal);
		// TODO Auto-generated method stub

	}

	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub
		
	}


}