package packModelo;

import javax.swing.JOptionPane;

public class Canguro implements ICompAnimalada {

	public Canguro() {
	}

	@Override
	public void animalada() {
		String[] choices = { "1", "2" };
		String input = (String) JOptionPane.showInputDialog(null, "Camale�n: Elija los saltos a dar", "CANGURO",
				JOptionPane.QUESTION_MESSAGE, null, // Use
													// default
													// icon
				choices, // Array of choices
				choices[0]); // Initial choice
		System.out.println(input);
		int num = Integer.parseInt(input);
		if (num == 2) {
			CartaAnimal canguro = CartasEnJuego.getCartasEnJuego().getListaAnimales().getLast();
			int pos3 = CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size() - 3;
			if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size() >= 3) {
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().add(pos3, canguro);
				CartasEnJuego.getCartasEnJuego().getListaAnimales().delLast();
			} else if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size() == 2) {
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().add(0, canguro);
				CartasEnJuego.getCartasEnJuego().getListaAnimales().delLast();
			}
		} else if (num == 1) {
			CartaAnimal canguro = CartasEnJuego.getCartasEnJuego().getListaAnimales().getLast();
			int pos3 = CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size() - 2;
			if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size() >= 3) {
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().add(pos3, canguro);
				CartasEnJuego.getCartasEnJuego().getListaAnimales().delLast();
			} else if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size() == 2) {
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().add(0, canguro);
				CartasEnJuego.getCartasEnJuego().getListaAnimales().delLast();
			}
		}

	}

	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub

	}

}