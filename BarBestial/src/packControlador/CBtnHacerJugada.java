package packControlador;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import packModelo.ListaJugador;
import packModelo.*;
import packInterfaces.*;
import java.awt.Color;

public class CBtnHacerJugada implements MouseListener {

	
	private Partida part;
	
    
    
	@Override
	public void mouseClicked(MouseEvent e) {
		// cuando se pressiona y se suelta
		// este método nos servirá para cuando cliquemos el boton de Hacer
		// Jugada y hacer sus respectivas funciones, dependiendo del turno y la
		// carta seleccionada
		
		JButton btn = (JButton) e.getSource();
		
		JLabel lblTurno = new JLabel("TURNO");
		lblTurno.setForeground(new Color(102, 102, 102));
		lblTurno.setBackground(Color.RED);

		
		// ejemplo de código
		if (btn.isSelected()) {
		
			if(lblTurno.getBackground().equals(Color.RED)){
				Jugador jug = ListaJugador.getListaJugador().getJugador(EnumColor.ROJO);
			  	jug.echarCarta(jug.getCartaMano(IPartida.getIPartida().getCartaElegida(EnumColor.ROJO)));
			  	IPartida.getIPartida().echarCarta(Color.RED);
			  	lblTurno.setBackground(Color.GREEN);
			}
			else if(IPartida.getIPartida().getTurno().equals(Color.GREEN)){
				Jugador jug = ListaJugador.getListaJugador().getJugador(EnumColor.VERDE);
			  	jug.echarCarta(jug.getCartaMano(IPartida.getIPartida().getCartaElegida(EnumColor.VERDE)));
			  	IPartida.getIPartida().echarCarta(Color.GREEN);
			}
			else if(IPartida.getIPartida().getTurno().equals(Color.BLUE)){
				Jugador jug = ListaJugador.getListaJugador().getJugador(EnumColor.AZUL);
			  	jug.echarCarta(jug.getCartaMano(IPartida.getIPartida().getCartaElegida(EnumColor.AZUL)));
			  	IPartida.getIPartida().echarCarta(Color.BLUE);
			}
			else if(IPartida.getIPartida().getTurno().equals(Color.YELLOW)){
				Jugador jug = ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO);
			  	jug.echarCarta(jug.getCartaMano(IPartida.getIPartida().getCartaElegida(EnumColor.AMARILLO)));
			  	IPartida.getIPartida().echarCarta(Color.YELLOW);
			}
		}
			// aquí se podrían llamar a los métodos del Modelo de clases
		//}
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
