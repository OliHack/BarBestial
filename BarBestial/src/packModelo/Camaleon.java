package packModelo;

import javax.swing.JOptionPane;

public class Camaleon implements ICompAnimalada {

	public Camaleon() {

	}

	@Override
	public void animalada() {
		if((CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().size()!=0)&&
				(CartasEnJuego.getCartasEnJuego().getListaAnimales().otroAnimalExcepto("Camaleon"))) {
				
			
			String[] choices = {"1","2","3","4","5"};
		    String input = (String) JOptionPane.showInputDialog(null, "Camaleón: Elija la posicion de la carta que desea copiar",
		        "The Choice of a Lifetime", JOptionPane.QUESTION_MESSAGE, null, // Use
		                                                                        // default
		                                                                        // icon
		        choices, // Array of choices
		        choices[0]); // Initial choice
		    System.out.println(input);
		    int num=Integer.parseInt(input);
			CartaAnimal carta = CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().get(num);
			CartaAnimal camaleon = CartasEnJuego.getCartasEnJuego().getListaAnimales().getLast();
				if(carta==null || carta.getAnimalada() instanceof Camaleon) {
					JOptionPane.showInputDialog("Seleccione otra carta");
					this.animalada();
				}else {
					CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(carta, CartasEnJuego.getCartasEnJuego().getLastPosition());
					CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
					CartasEnJuego.getCartasEnJuego().ponerAnimalEnPos(camaleon, CartasEnJuego.getCartasEnJuego().getListaAnimales().getListaAnimales().indexOf(carta));
				}
			}

	}

	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub
		
	}

}