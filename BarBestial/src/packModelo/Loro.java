package packModelo;

import java.util.*;

import javax.swing.JOptionPane;

public class Loro implements ICompAnimalada {

	public Loro() {

	}

	@Override
	public void animalada() {
		String[] choices = {"1","2","3","4"};
	    String input = (String) JOptionPane.showInputDialog(null, "Loro: Elija el animal que quieres echar",
	        "The Choice of a Lifetime", JOptionPane.QUESTION_MESSAGE, null, // Use
	                                                                        // default
	                                                                        // icon
	        choices, // Array of choices
	        choices[0]); // Initial choice
	    //System.out.println(input);
	    int num=Integer.parseInt(input)-1; 
		
		CartaAnimal animal = CartasEnJuego.getCartasEnJuego().delCarta(num);
		Calle.getCalle().addAnimal(animal);

	}

	@Override
	public void animalada(int pos) {
		// TODO Auto-generated method stub
		
	}


}