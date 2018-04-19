package packControlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import packInterfaces.IPartida;
import packModelo.EnumColor;
import packModelo.ListaJugador;
import packModelo.Partida;

public class CBtnJugarCarta3 implements MouseListener {
	private EnumColor colorJBoton;

	public CBtnJugarCarta3(EnumColor colorJBoton) {
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
			ListaJugador.getListaJugador().getJugador(Partida.getPartida().getTurnoColor()).echarCarta(2);
			IPartida.getIPartida().actualizarCola();
			IPartida.getIPartida().actualizarCartas();
			IPartida.getIPartida().cambiarTurno();
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
