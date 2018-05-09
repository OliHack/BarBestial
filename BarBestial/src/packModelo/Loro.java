package packModelo;

import java.util.Random;

import javax.swing.JOptionPane;

public class Loro implements ICompAnimalada {

	public Loro() {

	}

	@Override
	public void animalada() {
		int num;
		if (CartasEnJuego.getCartasEnJuego().numCartas() == 1) {
			System.out.println("El loro esta solo");
		} else {
			if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getLast().getColor().equals(EnumColor.ROJO)) {
				String[] choices = { "1", "2", "3", "4" };
				String input = (String) JOptionPane.showInputDialog(null, "Loro: Elija el animal que quieres echar",
						"LORO", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
				num = Integer.parseInt(input) - 1;
			} else {
				int max = CartasEnJuego.getCartasEnJuego().numCartas();
				Random rand = new Random();
				num = rand.nextInt(max) + 1;
			}

			if (num > CartasEnJuego.getCartasEnJuego().size()) {
				JOptionPane.showInputDialog(null, "Elija otra posición correcta");
				this.animalada();
			} else {
				CartaAnimal animal = CartasEnJuego.getCartasEnJuego().delCarta(num);
				Calle.getCalle().addAnimal(animal);
			}
			int max = CartasEnJuego.getCartasEnJuego().numCartas();
			Random rand = new Random();
			num = rand.nextInt(max + 1);
		}
	}

	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub

	}

}