package packControlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

import packInterfaces.IPartida;
import packModelo.BarBestial;
import packModelo.CartasEnJuego;
import packModelo.EnumColor;
import packModelo.GestorBD;
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
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e1) {
		// e1.printStackTrace();
		// }
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
			if (ListaJugador.getListaJugador().echarCarta(EnumColor.AZUL,
					ThreadLocalRandom.current().nextInt(0, ListaJugador.getListaJugador().manoSize(EnumColor.AZUL)))) {
				ListaJugador.getListaJugador().robarMazo(EnumColor.AZUL);
				IPartida.getIPartida().actualizarCola();
				IPartida.getIPartida().actualizarMazos();
				IPartida.getIPartida().setAnimaladasEjecutada(false);
				IPartida.getIPartida().setCartaEchada(true);
			}
			break;
		case VERDE:
			if (ListaJugador.getListaJugador().echarCarta(EnumColor.VERDE,
					ThreadLocalRandom.current().nextInt(0, ListaJugador.getListaJugador().manoSize(EnumColor.VERDE)))) {
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
		if (Partida.getPartida().terminado()) {
			int ptsRojo = BarBestial.getBarBestial().calcularPuntos(EnumColor.ROJO);
			int ptsAmar = BarBestial.getBarBestial().calcularPuntos(EnumColor.AMARILLO);
			int ptsAzul = BarBestial.getBarBestial().calcularPuntos(EnumColor.AZUL);
			int ptsVerde = BarBestial.getBarBestial().calcularPuntos(EnumColor.VERDE);

			int max = Math.max(Math.max(ptsRojo, ptsAmar), Math.max(ptsAzul, ptsVerde));
			String ganador = "Ganador/es: \n";
			if (max == ptsRojo) {
				ganador += "Jugador Rojo\n";
			}
			if (max == ptsAmar) {
				ganador += "Jugador Amarillo\n";
			}
			if (max == ptsAzul) {
				ganador += "Jugador Azul\n";
			}
			if (max == ptsVerde) {
				ganador += "Jugador Verde\n";
			}
			ganador += "Con una puntuación de " + max + " puntos";

			JOptionPane.showMessageDialog(null, ganador);
			GestorBD.getGestorBD()
					.sqlUpdate("INSERT into Puntuaciones (nombreJugador, Puntuacion, FechaPartida) VALUES ('"
							+ IPartida.getIPartida().getJugador() + "'," + ptsRojo + ",NOW());");
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
