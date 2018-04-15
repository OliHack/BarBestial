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

import packControlador.CBtnHacerJugada;
import packModelo.EnumColor;
import packModelo.Jugador;
import packModelo.Partida;

public class IPartida extends JFrame implements Observer {
	private static IPartida	miPrincipal;
	private final JPanel	contentPane;
	// inicializamos las variables del panel;
	private JPanel			posicion1;
	private JLabel			carta11;
	private JLabel			carta12;
	private JLabel			carta13;
	private JLabel			carta14;
	private JPanel			posicion2;
	private JLabel			carta21;
	private JLabel			carta22;
	private JLabel			carta23;
	private JLabel			carta24;
	private JPanel			posicion3;
	private JLabel			carta31;
	private JLabel			carta32;
	private JLabel			carta33;
	private JLabel			carta34;
	private JPanel			posicion4;
	private JLabel			carta41;
	private JLabel			carta42;
	private JLabel			carta43;
	private JLabel			carta44;
	private JComboBox		comboBox1;
	private JComboBox		comboBox2;
	private JComboBox		comboBox3;
	private JComboBox		comboBox4;
	private JPanel			tablero;
	private JPanel			panel;
	private JLabel			lblTurno;
	private JPanel			panelInferior;
	private JPanel			pCielo;
	private JPanel			pCalle;
	private JButton			btnJugar;
	private JLabel			cCielo;
	private JLabel			cCalle;
	private final int		numCartas	= 0;
	private JPanel			pCola;
	private JLabel			cola1;
	private JLabel			cola2;
	private JLabel			cola3;
	private JLabel			cola4;
	private JLabel			cola5;

	/**
	 * Create the frame.
	 */
	/*--Descargar--
	 * fecth
	 * pull
	 * --Subir--
	 * add to index
	 * commit
	 * push*/

	public IPartida() {
		setTitle("Principal");
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

		JLabel carta11 = new JLabel("Carta1");
		carta11.setForeground(new Color(0, 0, 0));
		carta11.setPreferredSize(new Dimension(50, 75));
		carta11.setBackground(new Color(255, 102, 102));
		carta11.setOpaque(true);
		posicion1.add(carta11);

		JLabel carta12 = new JLabel("Carta2");
		carta12.setBackground(new Color(255, 102, 102));
		carta12.setPreferredSize(new Dimension(50, 75));
		carta12.setBackground(new Color(255, 102, 102));
		carta12.setOpaque(true);
		posicion1.add(carta12);

		JLabel carta13 = new JLabel("Carta3");
		carta13.setPreferredSize(new Dimension(50, 75));
		carta13.setBackground(new Color(255, 102, 102));
		carta13.setOpaque(true);
		posicion1.add(carta13);

		JLabel carta14 = new JLabel("Carta4");
		carta14.setPreferredSize(new Dimension(50, 75));
		carta14.setBackground(new Color(255, 102, 102));
		carta14.setOpaque(true);
		posicion1.add(carta14);

		JComboBox comboBox1 = new JComboBox();
		comboBox1.setMaximumRowCount(4);
		comboBox1.setToolTipText("Mano");
		comboBox1.addItem("Carta1");
		comboBox1.addItem("Carta2");
		comboBox1.addItem("Carta3");
		comboBox1.addItem("Carta4");
		posicion1.add(comboBox1);

		JPanel posicion3 = new JPanel();
		posicion3.setBackground(Color.BLUE);
		contentPane.add(posicion3, BorderLayout.SOUTH);

		JLabel carta31 = new JLabel("Carta1");
		carta31.setPreferredSize(new Dimension(50, 75));
		posicion3.add(carta31);
		carta31.setBackground(new Color(0, 153, 255));
		carta31.setOpaque(true);

		JLabel carta32 = new JLabel("Carta2");
		carta32.setPreferredSize(new Dimension(50, 75));
		posicion3.add(carta32);
		carta32.setBackground(new Color(0, 153, 255));
		carta32.setOpaque(true);

		JLabel carta33 = new JLabel("Carta3");
		carta33.setPreferredSize(new Dimension(50, 75));
		posicion3.add(carta33);
		carta33.setBackground(new Color(0, 153, 255));
		carta33.setOpaque(true);

		JLabel carta34 = new JLabel("Carta4");
		carta34.setPreferredSize(new Dimension(50, 75));
		posicion3.add(carta34);
		carta34.setBackground(new Color(0, 153, 255));
		carta34.setOpaque(true);

		JComboBox comboBox3 = new JComboBox();
		comboBox3.setMaximumRowCount(4);
		comboBox3.setToolTipText("Mano");
		comboBox3.addItem("Carta1");
		comboBox3.addItem("Carta2");
		comboBox3.addItem("Carta3");
		comboBox3.addItem("Carta4");
		posicion3.add(comboBox3);

		JPanel posicion4 = new JPanel();
		posicion4.setBackground(Color.YELLOW);
		contentPane.add(posicion4, BorderLayout.WEST);
		// posicion4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		posicion4.setPreferredSize(new Dimension(85, 75));

		JLabel carta41 = new JLabel("Carta1");
		carta41.setPreferredSize(new Dimension(50, 75));
		carta41.setHorizontalAlignment(SwingConstants.CENTER);
		posicion4.add(carta41);
		carta41.setBackground(new Color(255, 255, 153));
		carta41.setOpaque(true);

		JLabel carta42 = new JLabel("Carta2");
		carta42.setPreferredSize(new Dimension(50, 75));
		carta42.setHorizontalAlignment(SwingConstants.CENTER);
		posicion4.add(carta42);
		carta42.setBackground(new Color(255, 255, 153));
		carta42.setOpaque(true);

		JLabel carta43 = new JLabel("Carta3");
		carta43.setPreferredSize(new Dimension(50, 75));
		carta43.setHorizontalAlignment(SwingConstants.CENTER);
		posicion4.add(carta43);
		carta43.setBackground(new Color(255, 255, 153));
		carta43.setOpaque(true);

		JLabel carta44 = new JLabel("Carta4");
		carta44.setPreferredSize(new Dimension(50, 75));
		carta44.setHorizontalAlignment(SwingConstants.CENTER);
		posicion4.add(carta44);
		carta44.setBackground(new Color(255, 255, 153));
		carta44.setOpaque(true);

		JComboBox comboBox4 = new JComboBox();
		comboBox4.setMaximumRowCount(4);
		comboBox4.setToolTipText("Mano");
		comboBox4.addItem("Carta1");
		comboBox4.addItem("Carta2");
		comboBox4.addItem("Carta3");
		comboBox4.addItem("Carta4");
		posicion4.add(comboBox4);

		JPanel posicion2 = new JPanel();
		posicion2.setBackground(Color.GREEN);
		contentPane.add(posicion2, BorderLayout.EAST);
		posicion2.setPreferredSize(new Dimension(85, 75));

		JLabel carta21 = new JLabel("Carta1");
		carta21.setPreferredSize(new Dimension(50, 75));
		carta21.setBackground(new Color(102, 255, 153));
		carta21.setOpaque(true);
		posicion2.add(carta21);

		JLabel carta22 = new JLabel("Carta2");
		posicion2.add(carta22);
		carta22.setPreferredSize(new Dimension(50, 75));
		carta22.setBackground(new Color(102, 255, 153));
		carta22.setOpaque(true);

		JLabel carta23 = new JLabel("Carta3");
		posicion2.add(carta23);
		carta23.setPreferredSize(new Dimension(50, 75));
		carta23.setBackground(new Color(102, 255, 153));
		carta23.setOpaque(true);

		JLabel carta24 = new JLabel("Carta4");
		posicion2.add(carta24);
		carta24.setPreferredSize(new Dimension(50, 75));
		carta24.setBackground(new Color(102, 255, 153));
		carta24.setOpaque(true);

		// se puede hacer un string para el combobox:::::
		/*
		 * String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
		 *
		 * Create the combo box, select item at index 4. //Indices start at 0,
		 * so 4 specifies the pig. JComboBox petList = new
		 * JComboBox(petStrings); petList.setSelectedIndex(4);
		 * petList.addActionListener(this);
		 */
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setMaximumRowCount(4);
		comboBox2.setToolTipText("Mano");
		comboBox2.addItem("Carta1");
		comboBox2.addItem("Carta2");
		comboBox2.addItem("Carta3");
		comboBox2.addItem("Carta4");
		posicion2.add(comboBox2);

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
		 * --observable-- es el objeto que activa su notify en cada momento, por
		 * lo que se verá en cada momento de que instancia es y se hará update
		 * en consecuencia --parametro-- es el parámetro del tipo que queramos
		 * que le vamos a pasar como información
		 */
		if (observable instanceof Jugador) {
			/*
			 * significa que ha cambiado la mano del jugador en cuestion,
			 * entonces cambiamos las cartas de la mano del jugador en la
			 * interfaz como es jugador parametro es una "ListaCartaAnimal"
			 */
			int[] info = (int[]) parametro;
			this.cambiarMano(info);

		}

	}

	private void cambiarMano(int[] param) {
		/*
		 * vamos a cambiar las cartas de la mano del jugador con el color
		 * indicado
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

	/**
	 * Launch the application.
	 */
	public static void empezar() {
		EventQueue.invokeLater(() -> {
			try {
				String[] pNombres = new String[4];
				pNombres[0] = "Jugador1";
				pNombres[1] = "Jugador2";
				pNombres[2] = "Jugador3";
				pNombres[3] = "Jugador4";
				Partida.getPartida().inicializarPartida(pNombres);
				IPartida frame = new IPartida();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public static IPartida getIPartida() {
		if (IPartida.miPrincipal == null) {
			IPartida.miPrincipal = new IPartida();
		}
		return IPartida.miPrincipal;
	}
}
