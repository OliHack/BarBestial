package packInterfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import packControlador.CBtnHacerJugada;

public class Partida extends JFrame {

	private final JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Partida() {
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
		posicion3.setBackground(new Color(0, 0, 205));
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

		JLabel cola2 = new JLabel("Carta3");
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Partida frame = new Partida();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}