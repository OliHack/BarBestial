package packControlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

import packInterfaces.IPartida;
import packModelo.CartasEnJuego;
import packModelo.EnumColor;
import packModelo.ListaJugador;
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
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		switch (IPartida.getIPartida().getTurnoColor()) {
		case AMARILLO:
			if (ListaJugador.getListaJugador().echarCarta(EnumColor.AMARILLO, ThreadLocalRandom.current().nextInt(0,
					ListaJugador.getListaJugador().manoSize(EnumColor.AMARILLO)))) {
				ListaJugador.getListaJugador().robarMazo(EnumColor.AMARILLO);
				IPartida.getIPartida().actualizarCola();
				IPartida.getIPartida().actualizarMazos();
				IPartida.getIPartida().setAnimaladasEjecutada(false);
				IPartida.getIPartida().setCartaEchada(true);
			}
			break;
		case AZUL:
			if (ListaJugador.getListaJugador().echarCarta(EnumColor.AZUL, ThreadLocalRandom.current().nextInt(0,
					ListaJugador.getListaJugador().manoSize(EnumColor.AZUL)))) {
				ListaJugador.getListaJugador().robarMazo(EnumColor.AZUL);
				IPartida.getIPartida().actualizarCola();
				IPartida.getIPartida().actualizarMazos();
				IPartida.getIPartida().setAnimaladasEjecutada(false);
				IPartida.getIPartida().setCartaEchada(true);
			}
			break;
		case VERDE:
			if (ListaJugador.getListaJugador().echarCarta(EnumColor.VERDE, ThreadLocalRandom.current().nextInt(0,
					ListaJugador.getListaJugador().manoSize(EnumColor.VERDE)))) {
				ListaJugador.getListaJugador().robarMazo(EnumColor.VERDE);
				IPartida.getIPartida().actualizarCola();
				IPartida.getIPartida().actualizarMazos();
				IPartida.getIPartida().setAnimaladasEjecutada(false);
				IPartida.getIPartida().setCartaEchada(true);
			}
			break;
		default:
			break;
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
