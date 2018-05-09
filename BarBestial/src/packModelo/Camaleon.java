package packModelo;

import java.util.ArrayList;
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
				ArrayList<String> list = new ArrayList<String>();
				for (int i = 0; i < CartasEnJuego.getCartasEnJuego().getListaAnimales().size(); i++) {
					list.add(Integer.toString(i + 1));
				}
				list.remove(list.size() - 1);
				String[] choices = new String[list.size()];
				choices = list.toArray(choices);
				String input = (String) JOptionPane.showInputDialog(null,
						"Camale�n: Elija la posicion de la carta que desea copiar", "Camaleon",
						JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
				num = Integer.parseInt(input) - 1;
			} else {
				int max = CartasEnJuego.getCartasEnJuego().numCartas() - 1;
				Random rand = new Random();
				num = rand.nextInt(max);
			}

			CartaAnimal carta = CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().get(num);
			if (carta == null || carta.getAnimalada() instanceof Camaleon) {
				JOptionPane.showMessageDialog(null, "Seleccione otra carta");
				this.animalada();
			} else {
				CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().get(ult)
						.setICompAnimalada(carta.getAnimalada());
				CartasEnJuego.getCartasEnJuego().getListaAnimales().hacerAnimalada();
			}
		}

	}

	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub

	}

}