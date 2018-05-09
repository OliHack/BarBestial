package packControlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.ThreadLocalRandom;

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
		/*for (int i = 0; i < 50; i++) {
			System.out.println("Amarillo: " + ThreadLocalRandom.current().nextInt(0,
					ListaJugador.getListaJugador().manoSize(EnumColor.AMARILLO)));
			System.out.println("Verde: "
					+ ThreadLocalRandom.current().nextInt(0, ListaJugador.getListaJugador().manoSize(EnumColor.VERDE)));
			System.out.println("Azul: "
					+ ThreadLocalRandom.current().nextInt(0, ListaJugador.getListaJugador().manoSize(EnumColor.AZUL)));

		}*/
		ListaJugador.getListaJugador().robarMazo(jugadorColor);
		IPartida.getIPartida().actualizarMazos();
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
