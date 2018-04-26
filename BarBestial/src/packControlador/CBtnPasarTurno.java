package packControlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import packInterfaces.IPartida;
import packModelo.CartasEnJuego;
import packModelo.Partida;

public class CBtnPasarTurno implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		String msg = "";
		if (IPartida.getIPartida().isAnimaladasEjecutada() && IPartida.getIPartida().isCartaEchada()) {
			CartasEnJuego.getCartasEnJuego().revisarCola();
			IPartida.getIPartida().actualizarCola();
			Partida.getPartida().cambiarTurno();
			IPartida.getIPartida().cambiarTurno();
			IPartida.getIPartida().setCartaEchada(false);
		} else if (!IPartida.getIPartida().isCartaEchada()) {
			msg += "¡Debes jugar una carta!";
			JOptionPane.showMessageDialog(null, msg);
		} else if (!IPartida.getIPartida().isAnimaladasEjecutada()) {
			msg += "¡Debes ejecutar las animaladas!";
			JOptionPane.showMessageDialog(null, msg);
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
