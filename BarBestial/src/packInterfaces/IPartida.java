package packInterfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import packControlador.*;
import packModelo.EnumColor;
import packModelo.Jugador;
import packModelo.ListaJugador;
import packModelo.Partida;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IPartida extends JFrame implements Observer {
	private static IPartida miPrincipal;
	private JPanel contentPane;
	// inicializamos las variables del panel;
	private JPanel posicion1;
	private JLabel carta11;
	private JLabel carta12;
	private JLabel carta13;
	private JLabel carta14;
	private JPanel posicion2;
	private JLabel carta21;
	private JLabel carta22;
	private JLabel carta23;
	private JLabel carta24;
	private JPanel posicion3;
	private JLabel carta31;
	private JLabel carta32;
	private JLabel carta33;
	private JLabel carta34;
	private JPanel posicion4;
	private JLabel carta41;
	private JLabel carta42;
	private JLabel carta43;
	private JLabel carta44;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	private JComboBox comboBox3;
	private JComboBox comboBox4;
	private JPanel tablero;
	private JPanel panel;
	private JLabel lblTurno;
	private JPanel panelInferior;
	private JPanel pCielo;
	private JPanel pCalle;
	private JButton btnJugar;
	private JLabel cCielo;
	private JLabel cCalle;
	private final int numCartas = 0;
	private JPanel pCola;
	private JLabel cola1;
	private JLabel cola2;
	private JLabel cola3;
	private JLabel cola4;
	private JLabel cola5;
	private JButton btnCarta11;
	private JButton btnCarta12;
	private JButton btnCarta13;
	private JButton btnCarta14;
	private JButton btnCarta21;
	private JButton btnCarta22;
	private JButton btnCarta23;
	private JButton btnCarta24;
	private JButton btnCarta31;
	private JButton btnCarta32;
	private JButton btnCarta33;
	private JButton btnCarta34;
	private JButton btnCarta41;
	private JButton btnCarta42;
	private JButton btnCarta43;
	private JButton btnCarta44;

	/**
	 * Launch the application.
	 */
	public void empezar() {
		EventQueue.invokeLater(() -> {
			try {

				IPartida frame = getIPartida();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private IPartida() {
		setTitle("Bar Bestial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setBounds(100, 100, 676, 496);
		setBounds(100, 100, 1041, 663);
		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel posicion1 = new JPanel();
		posicion1.setBackground(Color.RED);
		posicion1.setForeground(Color.BLACK);
		contentPane.add(posicion1, BorderLayout.NORTH);

		btnCarta11 = new JButton("Carta11");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales().size() > 0) {
			btnCarta11.setText(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales()
					.get(0).toString());
		}
		posicion1.add(btnCarta11);

		btnCarta12 = new JButton("Carta12");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales().size() > 1) {
			btnCarta12.setText(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales()
					.get(1).toString());
		}
		posicion1.add(btnCarta12);

		btnCarta13 = new JButton("Carta13");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales().size() > 2) {
			btnCarta13.setText(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales()
					.get(2).toString());
		}
		posicion1.add(btnCarta13);

		btnCarta14 = new JButton("Carta14");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales().size() > 3) {
			btnCarta14.setText(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales()
					.get(3).toString());
		}
		posicion1.add(btnCarta14);

		JButton btnMazo1 = new JButton("Mazo");
		CBtnMazo cbMazo1 = new CBtnMazo(EnumColor.ROJO);
		btnMazo1.addMouseListener(cbMazo1);
		posicion1.add(btnMazo1);

		JPanel posicion3 = new JPanel();
		posicion3.setBackground(Color.BLUE);
		contentPane.add(posicion3, BorderLayout.SOUTH);

		btnCarta31 = new JButton("Carta31");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales().size() > 0) {
			btnCarta31.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales()
					.get(0).toString());
		}
		posicion3.add(btnCarta31);

		btnCarta32 = new JButton("Carta32");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales().size() > 1) {
			btnCarta32.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales()
					.get(1).toString());
		}
		posicion3.add(btnCarta32);

		btnCarta33 = new JButton("Carta33");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales().size() > 2) {
			btnCarta33.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales()
					.get(2).toString());
		}
		posicion3.add(btnCarta33);

		btnCarta34 = new JButton("Carta34");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales().size() > 3) {
			btnCarta34.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales()
					.get(3).toString());
		}
		posicion3.add(btnCarta34);

		JButton btnMazo3 = new JButton("Mazo");
		CBtnMazo cbMazo3 = new CBtnMazo(EnumColor.AZUL);
		btnMazo3.addMouseListener(cbMazo3);
		posicion3.add(btnMazo3);

		JPanel posicion4 = new JPanel();
		posicion4.setBackground(Color.YELLOW);
		contentPane.add(posicion4, BorderLayout.WEST);
		// posicion4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		posicion4.setPreferredSize(new Dimension(85, 75));

		btnCarta41 = new JButton("Carta41");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales().size() > 0) {
			btnCarta41.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano()
					.getListaAnimales().get(0).toString());
		}
		posicion4.add(btnCarta41);

		btnCarta42 = new JButton("Carta42");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales().size() > 1) {
			btnCarta42.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano()
					.getListaAnimales().get(1).toString());
		}
		posicion4.add(btnCarta42);

		btnCarta43 = new JButton("Carta43");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales().size() > 2) {
			btnCarta43.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano()
					.getListaAnimales().get(2).toString());
		}
		posicion4.add(btnCarta43);

		btnCarta44 = new JButton("Carta44");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales().size() > 3) {
			btnCarta44.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano()
					.getListaAnimales().get(3).toString());
		}
		posicion4.add(btnCarta44);

		JButton btnMazo4 = new JButton("Mazo");
		CBtnMazo cbMazo4 = new CBtnMazo(EnumColor.AMARILLO);
		btnMazo4.addMouseListener(cbMazo4);
		posicion4.add(btnMazo4);

		JPanel posicion2 = new JPanel();
		posicion2.setBackground(Color.GREEN);
		contentPane.add(posicion2, BorderLayout.EAST);
		posicion2.setPreferredSize(new Dimension(85, 75));

		btnCarta21 = new JButton("Carta21");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales().size() > 0) {
			btnCarta21.setText(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales()
					.get(0).toString());
		}
		posicion2.add(btnCarta21);

		btnCarta22 = new JButton("Carta22");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales().size() > 1) {
			btnCarta22.setText(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales()
					.get(1).toString());
		}
		posicion2.add(btnCarta22);

		btnCarta23 = new JButton("Carta23");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales().size() > 2) {
			btnCarta23.setText(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales()
					.get(2).toString());
		}
		posicion2.add(btnCarta23);

		btnCarta24 = new JButton("Carta24");
		if (ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales().size() > 3) {
			btnCarta24.setText(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales()
					.get(3).toString());
		}
		posicion2.add(btnCarta24);

		JButton btnMazo2 = new JButton("Mazo");
		CBtnMazo cbMazo2 = new CBtnMazo(EnumColor.VERDE);
		btnMazo2.addMouseListener(cbMazo2);
		posicion2.add(btnMazo2);

		JPanel tablero = new JPanel();
		tablero.setBackground(new Color(175, 238, 238));
		contentPane.add(tablero, BorderLayout.CENTER);
		tablero.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		tablero.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblTurno = new JLabel("TURNO");
		lblTurno.setForeground(new Color(102, 102, 102));
		panel.add(lblTurno);
		lblTurno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTurno.setBackground(Color.RED);
		lblTurno.setOpaque(true);

		JPanel panelInferior = new JPanel();
		tablero.add(panelInferior, BorderLayout.SOUTH);
		panelInferior.setBackground(Color.GRAY);

		JPanel pCielo = new JPanel();
		tablero.add(pCielo, BorderLayout.WEST);
		pCielo.setBackground(Color.GRAY);
		// posicion4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		pCielo.setPreferredSize(new Dimension(85, 75));

		JPanel pCalle = new JPanel();
		tablero.add(pCalle, BorderLayout.EAST);
		pCalle.setBackground(Color.GRAY);
		pCalle.setPreferredSize(new Dimension(85, 75));

		JButton btnJugar = new JButton("Hacer Jugada");
		// para llamar al controlador cuando se haga click al boton
		btnJugar.addMouseListener(new CBtnHacerJugada());
		btnJugar.addActionListener(e -> {
			if (lblTurno.getBackground().equals(Color.RED)) {
				lblTurno.setBackground(Color.GREEN);

			} else if (lblTurno.getBackground().equals(Color.GREEN)) {
				lblTurno.setBackground(Color.BLUE);

			} else if (lblTurno.getBackground().equals(Color.BLUE)) {
				lblTurno.setBackground(Color.YELLOW);

			} else if (lblTurno.getBackground().equals(Color.YELLOW)) {
				lblTurno.setBackground(Color.RED);

			}

		});
		btnJugar.setForeground(new Color(255, 255, 255));
		btnJugar.setBackground(Color.DARK_GRAY);
		btnJugar.setOpaque(true);
		panel.add(btnJugar);

		JLabel cCielo = new JLabel("Cielo");
		cCielo.setPreferredSize(new Dimension(79, 110));
		cCielo.setHorizontalAlignment(SwingConstants.CENTER);
		pCielo.add(cCielo);
		cCielo.setBackground(new Color(160, 82, 45));
		cCielo.setOpaque(true);

		JLabel cCalle = new JLabel("Calle");
		cCalle.setPreferredSize(new Dimension(79, 110));
		cCalle.setBackground(SystemColor.activeCaption);
		cCalle.setOpaque(true);
		pCalle.add(cCalle);

		JPanel pCola = new JPanel();
		pCola.setBackground(Color.GRAY);

		tablero.add(pCola, BorderLayout.CENTER);

		JLabel cola1 = new JLabel("Carta1");
		cola1.setPreferredSize(new Dimension(120, 200));
		cola1.setOpaque(true);
		cola1.setForeground(Color.BLACK);
		cola1.setBackground(new Color(255, 102, 102));
		pCola.add(cola1);

		JLabel cola2 = new JLabel("Carta2");
		cola2.setPreferredSize(new Dimension(120, 200));
		cola2.setOpaque(true);
		cola2.setForeground(Color.BLACK);
		cola2.setBackground(new Color(255, 102, 102));
		pCola.add(cola2);

		JLabel cola3 = new JLabel("Carta3");
		cola3.setPreferredSize(new Dimension(120, 200));
		cola3.setOpaque(true);
		cola3.setForeground(Color.BLACK);
		cola3.setBackground(new Color(255, 102, 102));
		pCola.add(cola3);

		JLabel cola4 = new JLabel("Carta4");
		cola4.setPreferredSize(new Dimension(120, 200));
		cola4.setOpaque(true);
		cola4.setForeground(Color.BLACK);
		cola4.setBackground(new Color(255, 102, 102));
		pCola.add(cola4);

		JLabel cola5 = new JLabel("Carta5");
		cola5.setPreferredSize(new Dimension(120, 200));
		cola5.setOpaque(true);
		cola5.setForeground(Color.BLACK);
		cola5.setBackground(new Color(255, 102, 102));
		pCola.add(cola5);

	}

	public void echarCarta(Color pColor) {
		String aux = null;
		if (pColor == Color.RED) {
			// pCola.add(comboBox1);
			aux = "carta" + comboBox1.getSelectedItem().toString().charAt(5);
		} else if (pColor == Color.GREEN) {
			// pCola.add(comboBox2);
			aux = "carta" + comboBox2.getSelectedItem().toString().charAt(5);
		} else if (pColor == Color.BLUE) {
			// pCola.add(comboBox3);
			aux = "carta" + comboBox3.getSelectedItem().toString().charAt(5);
		} else if (pColor == Color.YELLOW) {
			// pCola.add(comboBox4);
			aux = "carta" + comboBox4.getSelectedItem().toString().charAt(5);
		}

		if (numCartas == 0) {
			cola1.setText(aux);
		} else if (numCartas == 1) {
			cola2.setText(aux);
		} else if (numCartas == 2) {
			cola3.setText(aux);
		} else if (numCartas == 3) {
			cola4.setText(aux);
		} else if (numCartas == 5) {
			cola5.setText(aux);
		}

	}

	public void actualizarCartas() {
		switch (ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales().size()) {
		case 1:
			btnCarta11.setText(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales()
					.get(0).toString());
			break;
		case 2:
			btnCarta11.setText(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales()
					.get(0).toString());
			btnCarta12.setText(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales()
					.get(1).toString());
			break;
		case 3:
			btnCarta11.setText(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales()
					.get(0).toString());
			btnCarta12.setText(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales()
					.get(1).toString());
			btnCarta13.setText(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales()
					.get(2).toString());
			break;
		case 4:
			btnCarta11.setText(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales()
					.get(0).toString());
			btnCarta12.setText(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales()
					.get(1).toString());
			btnCarta13.setText(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales()
					.get(2).toString());
			btnCarta14.setText(ListaJugador.getListaJugador().getJugador(EnumColor.ROJO).getMano().getListaAnimales()
					.get(3).toString());
			break;
		default:
			break;
		}
		
		switch (ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales().size()) {
		case 1:
			btnCarta21.setText(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales()
					.get(0).toString());
			break;
		case 2:
			btnCarta21.setText(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales()
					.get(0).toString());
			btnCarta22.setText(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales()
					.get(1).toString());
			break;
		case 3:
			btnCarta21.setText(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales()
					.get(0).toString());
			btnCarta22.setText(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales()
					.get(1).toString());
			btnCarta23.setText(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales()
					.get(2).toString());
			break;
		case 4:
			btnCarta21.setText(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales()
					.get(0).toString());
			btnCarta22.setText(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales()
					.get(1).toString());
			btnCarta23.setText(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales()
					.get(2).toString());
			btnCarta24.setText(ListaJugador.getListaJugador().getJugador(EnumColor.VERDE).getMano().getListaAnimales()
					.get(3).toString());
			break;
		default:
			break;
		}
		
		switch (ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales().size()) {
		case 1:
			btnCarta31.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales()
					.get(0).toString());
			break;
		case 2:
			btnCarta31.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales()
					.get(0).toString());
			btnCarta32.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales()
					.get(1).toString());
			break;
		case 3:
			btnCarta31.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales()
					.get(0).toString());
			btnCarta32.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales()
					.get(1).toString());
			btnCarta33.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales()
					.get(2).toString());
			break;
		case 4:
			btnCarta31.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales()
					.get(0).toString());
			btnCarta32.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales()
					.get(1).toString());
			btnCarta33.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales()
					.get(2).toString());
			btnCarta34.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AZUL).getMano().getListaAnimales()
					.get(3).toString());
			break;
		default:
			break;
		}
		
		switch (ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales().size()) {
		case 1:
			btnCarta41.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales()
					.get(0).toString());
			break;
		case 2:
			btnCarta41.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales()
					.get(0).toString());
			btnCarta42.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales()
					.get(1).toString());
			break;
		case 3:
			btnCarta41.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales()
					.get(0).toString());
			btnCarta42.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales()
					.get(1).toString());
			btnCarta43.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales()
					.get(2).toString());
			break;
		case 4:
			btnCarta41.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales()
					.get(0).toString());
			btnCarta42.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales()
					.get(1).toString());
			btnCarta43.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales()
					.get(2).toString());
			btnCarta44.setText(ListaJugador.getListaJugador().getJugador(EnumColor.AMARILLO).getMano().getListaAnimales()
					.get(3).toString());
			break;
		default:
			break;
		}

	}

	public JButton getBoton() {
		return btnJugar;
	}

	public int getCartaElegida(EnumColor pColor) {
		Character aux = null;
		if (pColor == EnumColor.ROJO) {
			aux = comboBox1.getSelectedItem().toString().charAt(5);
		} else if (pColor == EnumColor.VERDE) {
			aux = comboBox2.getSelectedItem().toString().charAt(5);
		} else if (pColor == EnumColor.AZUL) {
			aux = comboBox3.getSelectedItem().toString().charAt(5);
		} else if (pColor == EnumColor.AMARILLO) {
			aux = comboBox4.getSelectedItem().toString().charAt(5);
		}
		String aux2 = aux.toString();
		int num = Integer.parseInt(aux2);
		return num;
	}

	public Color getTurno() {
		return lblTurno.getBackground();
	}

	@Override
	public void update(Observable observable, Object parametro) {
		/*
		 * --observable-- es el objeto que activa su notify en cada momento, por lo que
		 * se verá en cada momento de que instancia es y se hará update en consecuencia
		 * --parametro-- es el parámetro del tipo que queramos que le vamos a pasar como
		 * información
		 */
		if (observable instanceof Jugador) {
			/*
			 * significa que ha cambiado la mano del jugador en cuestion, entonces cambiamos
			 * las cartas de la mano del jugador en la interfaz como es jugador parametro es
			 * una "ListaCartaAnimal"
			 */
			int[] info = (int[]) parametro;
			this.cambiarMano(info);

		}

	}

	private void cambiarMano(int[] param) {
		/*
		 * vamos a cambiar las cartas de la mano del jugador con el color indicado
		 */
		if (param[0] == 1) {
			limpiarMano(param[0]);
			carta41.setText("Nº: " + param[1]);
			carta42.setText("Nº: " + param[2]);
			carta43.setText("Nº: " + param[3]);
			carta44.setText("Nº: " + param[4]);
		} else if (param[0] == 2) {
			limpiarMano(param[0]);
			carta21.setText("Nº: " + param[1]);
			carta22.setText("Nº: " + param[2]);
			carta23.setText("Nº: " + param[3]);
			carta24.setText("Nº: " + param[4]);
		} else if (param[0] == 3) {
			limpiarMano(param[0]);
			carta31.setText("Nº: " + param[1]);
			carta32.setText("Nº: " + param[2]);
			carta33.setText("Nº: " + param[3]);
			carta34.setText("Nº: " + param[4]);
		} else if (param[0] == 4) {
			limpiarMano(param[0]);
			carta41.setText("Nº: " + param[1]);
			carta42.setText("Nº: " + param[2]);
			carta43.setText("Nº: " + param[3]);
			carta44.setText("Nº: " + param[4]);
		}
	}

	private void limpiarMano(int param) {
		if (param == 1) {
			carta11.setText("");
			carta12.setText("");
			carta13.setText("");
			carta14.setText("");
		} else if (param == 2) {
			carta21.setText("");
			carta22.setText("");
			carta23.setText("");
			carta24.setText("");
		} else if (param == 3) {
			carta31.setText("");
			carta32.setText("");
			carta33.setText("");
			carta34.setText("");
		} else if (param == 4) {
			carta41.setText("");
			carta42.setText("");
			carta43.setText("");
			carta44.setText("");
		}
	}

	public static IPartida getIPartida() {
		if (miPrincipal == null) {
			miPrincipal = new IPartida();
		}
		return miPrincipal;
	}
}
