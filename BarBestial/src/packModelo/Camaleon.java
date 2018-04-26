package packModelo;

import javax.swing.JOptionPane;

public class Camaleon implements ICompAnimalada {

	public Camaleon() {

	}

	@Override
	public void animalada() {

		if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size() != 0
				&& CartasEnJuego.getCartasEnJuego().getListaAnimales().otroAnimalExcepto("Camaleon")) {

			int num = joption();
			CartaAnimal carta = null;
			try {
				carta = CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().get(num - 1);

			} catch (Exception e) {
				carta = null;
				e.printStackTrace();
			}
			if (carta != null) {
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getLast().setICompAnimalada(carta.getAnimalada());
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getLast().hacerAnimalada();
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getLast().setICompAnimalada(new Camaleon());
			} else {
				System.out.println("Carta no disponible, vuelva a elegir");
			}
		} else {
			System.out.println("Vaya el camaleón no puede copiar a nadie :(");
		}

	}

	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub

	}

	public int joption() {
		String input;
		String[] choices = { "1", "2", "3", "4", "5" };

		input = (String) JOptionPane.showInputDialog(null, "Elija la carta", "CAMALEON", JOptionPane.QUESTION_MESSAGE,
				null, choices, choices[0]);

		System.out.println(input);
		return Integer.parseInt(input);
	}

}