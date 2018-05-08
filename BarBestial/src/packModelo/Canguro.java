package packModelo;

import java.util.Random;

import javax.swing.JOptionPane;

public class Canguro implements ICompAnimalada {

	public Canguro() {
	}

	@Override
	public void animalada() {
		int num;
		if (CartasEnJuego.getCartasEnJuego().numCartas() == 1) {
			System.out.println("El canguro no puede saltar :(");
		} else {
			if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getLast().getColor().equals(EnumColor.ROJO)) {
				String[] choices = { "1", "2" };
				String input = (String) JOptionPane.showInputDialog(null, "Canguro: Elija los saltos a dar", "CANGURO",
						JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
				// System.out.println(input);
				num = Integer.parseInt(input);
			} else {
				Random rand = new Random();
				num = rand.nextInt(2) + 1;
			}
			if (num == 2) {
				CartaAnimal canguro = CartasEnJuego.getCartasEnJuego().getListaAnimales().getLast();
				int pos3 = CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size() - 3;
				if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size() >= 3) {
					CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().add(pos3, canguro);
					CartasEnJuego.getCartasEnJuego().getListaAnimales().delLast();
				} else if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size() == 2) {
					CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().add(0, canguro);
					CartasEnJuego.getCartasEnJuego().getListaAnimales().delLast();
				} else if (CartasEnJuego.getCartasEnJuego().numCartas() < 2) {
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
	}

	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub

	}

}
