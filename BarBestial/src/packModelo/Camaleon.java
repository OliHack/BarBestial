package packModelo;

import java.util.Random;

import javax.swing.JOptionPane;

public class Camaleon implements ICompAnimalada {

	public Camaleon() {

	}

	@Override
	public void animalada() {
		int num;
		int ult = CartasEnJuego.getCartasEnJuego().getLastPosition();
		if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size() != 0
				&& CartasEnJuego.getCartasEnJuego().getListaAnimales().otroAnimalExcepto("Camaleon")) {

			if (CartasEnJuego.getCartasEnJuego().getListaAnimales().getLast().getColor().equals(EnumColor.ROJO)) {
				String[] choices = { "1", "2", "3", "4" };
				String input = (String) JOptionPane.showInputDialog(null,
						"Camale�n: Elija la posicion de la carta que desea copiar", "The Choice of a Lifetime",
						JOptionPane.QUESTION_MESSAGE, null, // Use
															// default
															// icon
						choices, // Array of choices
						choices[0]); // Initial choice
				// System.out.println(input);
				num = Integer.parseInt(input) - 1;
			} else {
				int max = CartasEnJuego.getCartasEnJuego().numCartas();
				Random rand = new Random();
				num = rand.nextInt(max + 1);
			}
			CartaAnimal carta = CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().get(num);
			CartaAnimal camaleon = CartasEnJuego.getCartasEnJuego().delCarta(ult);
			if (carta == null || carta.getAnimalada() instanceof Camaleon) {
				JOptionPane.showInputDialog("Seleccione otra carta");
				this.animalada();
			} else {
				CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(carta, ult);
				/*
				 * System.out.println("\n --> El orden ahora es :\n");
				 * CartasEnJuego.getCartasEnJuego().imprimir();
				 */
				CartasEnJuego.getCartasEnJuego().jugarTurno();
				int rep = CartasEnJuego.getCartasEnJuego().getPosDeCartaRepetida(carta);
				CartasEnJuego.getCartasEnJuego().delCarta(rep);
				CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(camaleon, rep);
			}
		}

	}

	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub

	}

}