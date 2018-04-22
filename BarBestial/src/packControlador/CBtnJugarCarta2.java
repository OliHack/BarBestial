package packControlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import packInterfaces.IPartida;
import packModelo.EnumColor;
import packModelo.ListaJugador;
import packModelo.Partida;

public class CBtnJugarCarta2 implements MouseListener {
	private EnumColor colorJBoton;

	public CBtnJugarCarta2(EnumColor colorJBoton) {
		super();
		this.colorJBoton = colorJBoton;
	}

	public EnumColor getColorJBoton() {
		return colorJBoton;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (IPartida.getIPartida().getTurnoColor() == Partida.getPartida().getTurnoColor()
				&& IPartida.getIPartida().getTurnoColor() == colorJBoton) {
			if (ListaJugador.getListaJugador().getJugador(Partida.getPartida().getTurnoColor()).echarCarta(1)) {
				IPartida.getIPartida().actualizarCola();
				IPartida.getIPartida().actualizarCartas();
				IPartida.getIPartida().cambiarTurno();
			}
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