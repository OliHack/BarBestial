package packControlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class CBtnHacerJugada implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// cuando se pressiona y se suelta
		// este método nos servirá para cuando cliquemos el boton de Hacer
		// Jugada y hacer sus respectivas funciones, dependiendo del turno y la
		// carta seleccionada
		JButton btn = (JButton) e.getSource();
		// ejemplo de código
		if (btn.isSelected()) {
			// aquí se podrían llamar a los métodos del Modelo de clases
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
