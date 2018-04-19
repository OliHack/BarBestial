package packControlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import packInterfaces.IPartida;
import packModelo.EnumColor;
import packModelo.ListaJugador;

public class CBtnMazo implements MouseListener {
	private EnumColor jugadorColor;

	public EnumColor getJugadorColor() {
		return jugadorColor;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		ListaJugador.getListaJugador().getJugador(jugadorColor).robarMazo();
		IPartida.getIPartida().actualizarCartas();
	}

	public CBtnMazo(EnumColor color) {
		super();
		this.jugadorColor = color;
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
