package packControlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import packInterfaces.IPartida;
import packModelo.CartasEnJuego;

public class CBtnEjecAnim implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		if (!IPartida.getIPartida().isAnimaladasEjecutada() && IPartida.getIPartida().isCartaEchada()) {
			//descomentar cuando esten implementadas las animaladas
			// CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
			// CartasEnJuego.getCartasEnJuego().ejecutarRec();
			System.out.println("Se ha ejecutado animaladas");
			IPartida.getIPartida().setAnimaladasEjecutada(true);
		}else {
			JOptionPane.showMessageDialog(null, "¡Debes de jugar una carta!");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}