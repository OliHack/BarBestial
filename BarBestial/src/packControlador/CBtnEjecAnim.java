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
			CartasEnJuego.getCartasEnJuego().ejecutarAnimalada();
			System.out.println("Se ha ejecutado animaladas");
			IPartida.getIPartida().setAnimaladasEjecutada(true);
			IPartida.getIPartida().actualizarCola();
		} else {
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
