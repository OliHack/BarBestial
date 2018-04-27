package packModelo;

import javax.swing.JOptionPane;

public class Loro implements ICompAnimalada {

	public Loro() {

	}

	@Override
	public void animalada() {
		String[] choices = { "1", "2", "3", "4" };
		String input = (String) JOptionPane.showInputDialog(null, "Loro: Elija el animal que quieres echar", "LORO",
				JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
		int num = Integer.parseInt(input) - 1;
		CartaAnimal animal = CartasEnJuego.getCartasEnJuego().delCarta(num);
		Calle.getCalle().addAnimal(animal);
	}

	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub

	}

}