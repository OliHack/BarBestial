package packInterfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import packControlador.*;
import packModelo.BarBestial;
import packModelo.Calle;
import packModelo.CartasEnJuego;
import packModelo.EnumColor;
import packModelo.ListaJugador;
import packModelo.Partida;

public class IPartida extends JFrame implements Observer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static IPartida miPrincipal;
	private JPanel contentPane;

	// Componentes de la interfaz
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
	private JPanel tablero;
	private JPanel panel;
	private JLabel lblTurno;
	private JPanel panelInferior;
	private JPanel pCielo;
	private JPanel pCalle;
	private JButton btnJugar;
	private JLabel cCielo;
	private JLabel cCalle;
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
	private JButton btnEjecutarAnimaladas;
	private JButton btnPasarElTurno;

	// ciertos atributos para la gestión de estados
	private EnumColor turnoColor;
	private boolean cartaEchada;
	private boolean animaladasEjecutada;

	// colores personalizados para el apartado gráfico de la interfaz
	private final static Color miAmarillo = new Color(254, 238, 57);
	private final static Color miVerde = new Color(75, 217, 72);
	private final static Color miRojo = new Color(253, 61, 28);
	private final static Color miAzul = new Color(75, 89, 213);

	public static IPartida getIPartida() {
		if (miPrincipal == null) {
			miPrincipal = new IPartida();
		}
		return miPrincipal;
	}

	/**
	 * Launch the application.
	 */
	public void empezar() {
		EventQueue.invokeLater(() -> {
			try {
				String[] pNombres = new String[4];
				pNombres[0] = "Oliver";
				pNombres[1] = "Jonan";
				pNombres[2] = "Unai";
				pNombres[3] = "Frank";
				Partida.getPartida().inicializarPartida(pNombres);
				turnoColor = EnumColor.ROJO;
				animaladasEjecutada = true;
				cartaEchada = false;
				/*
				 * IPartida frame = getIPartida(); frame.setVisible(true);
				 */
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private IPartida() {
		empezar();
		setTitle("Bar Bestial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1041, 844);
		contentPane = new JPanel();

		CartasEnJuego.getCartasEnJuego().addObserver(this);

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel posicion1 = new JPanel();
		posicion1.setBackground(new Color(253, 61, 28));
		posicion1.setForeground(Color.BLACK);
		contentPane.add(posicion1, BorderLayout.NORTH);

		btnCarta11 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta1 cbCarta11 = new CBtnJugarCarta1(EnumColor.ROJO);
		btnCarta11.addMouseListener(cbCarta11);
		posicion1.add(btnCarta11);

		btnCarta12 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta2 cbCarta12 = new CBtnJugarCarta2(EnumColor.ROJO);
		btnCarta12.addMouseListener(cbCarta12);
		posicion1.add(btnCarta12);

		btnCarta13 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta3 cbCarta13 = new CBtnJugarCarta3(EnumColor.ROJO);
		btnCarta13.addMouseListener(cbCarta13);
		posicion1.add(btnCarta13);

		btnCarta14 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta4 cbCarta14 = new CBtnJugarCarta4(EnumColor.ROJO);
		btnCarta14.addMouseListener(cbCarta14);
		posicion1.add(btnCarta14);

		JButton btnMazo1 = new JButton("Mazo");
		CBtnMazo cbMazo1 = new CBtnMazo(EnumColor.ROJO);
		btnMazo1.addMouseListener(cbMazo1);
		posicion1.add(btnMazo1);

		JPanel posicion3 = new JPanel();
		posicion3.setBackground(new Color(75, 89, 213));
		contentPane.add(posicion3, BorderLayout.SOUTH);

		btnCarta31 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta1 cbCarta31 = new CBtnJugarCarta1(EnumColor.AZUL);
		btnCarta31.addMouseListener(cbCarta31);
		posicion3.add(btnCarta31);

		btnCarta32 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta2 cbCarta32 = new CBtnJugarCarta2(EnumColor.AZUL);
		btnCarta32.addMouseListener(cbCarta32);
		posicion3.add(btnCarta32);

		btnCarta33 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta3 cbCarta33 = new CBtnJugarCarta3(EnumColor.AZUL);
		btnCarta33.addMouseListener(cbCarta33);
		posicion3.add(btnCarta33);

		btnCarta34 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta4 cbCarta34 = new CBtnJugarCarta4(EnumColor.AZUL);
		btnCarta34.addMouseListener(cbCarta34);
		posicion3.add(btnCarta34);

		JButton btnMazo3 = new JButton("Mazo");
		CBtnMazo cbMazo3 = new CBtnMazo(EnumColor.AZUL);
		btnMazo3.addMouseListener(cbMazo3);
		posicion3.add(btnMazo3);

		JPanel posicion4 = new JPanel();
		posicion4.setBackground(new Color(254, 238, 57));
		contentPane.add(posicion4, BorderLayout.WEST);
		posicion4.setPreferredSize(new Dimension(85, 75));

		btnCarta41 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta1 cbCarta41 = new CBtnJugarCarta1(EnumColor.AMARILLO);
		btnCarta41.addMouseListener(cbCarta41);
		posicion4.add(btnCarta41);

		btnCarta42 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta2 cbCarta42 = new CBtnJugarCarta2(EnumColor.AMARILLO);
		btnCarta42.addMouseListener(cbCarta42);
		posicion4.add(btnCarta42);

		btnCarta43 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta3 cbCarta43 = new CBtnJugarCarta3(EnumColor.AMARILLO);
		btnCarta43.addMouseListener(cbCarta43);
		posicion4.add(btnCarta43);

		btnCarta44 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta4 cbCarta44 = new CBtnJugarCarta4(EnumColor.AMARILLO);
		btnCarta44.addMouseListener(cbCarta44);
		posicion4.add(btnCarta44);

		JButton btnMazo4 = new JButton("Mazo");
		CBtnMazo cbMazo4 = new CBtnMazo(EnumColor.AMARILLO);
		btnMazo4.addMouseListener(cbMazo4);
		posicion4.add(btnMazo4);

		JPanel posicion2 = new JPanel();
		posicion2.setBackground(new Color(75, 217, 72));
		contentPane.add(posicion2, BorderLayout.EAST);
		posicion2.setPreferredSize(new Dimension(85, 75));

		btnCarta21 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta1 cbCarta21 = new CBtnJugarCarta1(EnumColor.VERDE);
		btnCarta21.addMouseListener(cbCarta21);
		posicion2.add(btnCarta21);

		btnCarta22 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta2 cbCarta22 = new CBtnJugarCarta2(EnumColor.VERDE);
		btnCarta22.addMouseListener(cbCarta22);
		posicion2.add(btnCarta22);

		btnCarta23 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta3 cbCarta23 = new CBtnJugarCarta3(EnumColor.VERDE);
		btnCarta23.addMouseListener(cbCarta23);
		posicion2.add(btnCarta23);

		btnCarta24 = new JButton("", new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		CBtnJugarCarta4 cbCarta24 = new CBtnJugarCarta4(EnumColor.VERDE);
		btnCarta24.addMouseListener(cbCarta24);
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

		lblTurno = new JLabel("TURNO");
		lblTurno.setForeground(Color.white);
		lblTurno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTurno.setBackground(miRojo);
		lblTurno.setOpaque(true);
		panel.add(lblTurno);

		btnEjecutarAnimaladas = new JButton("Ejecutar Animaladas");
		CBtnEjecAnim cbEjecAnim = new CBtnEjecAnim();
		btnEjecutarAnimaladas.addMouseListener(cbEjecAnim);
		btnEjecutarAnimaladas.setEnabled(false);
		panel.add(btnEjecutarAnimaladas);

		btnPasarElTurno = new JButton("Pasar el turno");
		CBtnPasarTurno cbPasarTurno = new CBtnPasarTurno();
		btnPasarElTurno.addMouseListener(cbPasarTurno);
		btnPasarElTurno.setEnabled(false);
		panel.add(btnPasarElTurno);

		JPanel panelInferior = new JPanel();
		tablero.add(panelInferior, BorderLayout.SOUTH);
		panelInferior.setBackground(Color.GRAY);

		JPanel pCielo = new JPanel();
		tablero.add(pCielo, BorderLayout.WEST);
		pCielo.setBackground(Color.GRAY);
		pCielo.setPreferredSize(new Dimension(85, 75));

		JPanel pCalle = new JPanel();
		tablero.add(pCalle, BorderLayout.EAST);
		pCalle.setBackground(Color.GRAY);
		pCalle.setPreferredSize(new Dimension(85, 75));

		cCielo = new JLabel("Cielo");
		cCielo.setPreferredSize(new Dimension(79, 110));
		cCielo.setHorizontalAlignment(SwingConstants.CENTER);
		pCielo.add(cCielo);
		cCielo.setBackground(new Color(160, 82, 45));
		cCielo.setOpaque(true);

		cCalle = new JLabel("Calle");
		cCalle.setPreferredSize(new Dimension(79, 110));
		cCalle.setBackground(SystemColor.activeCaption);
		cCalle.setOpaque(true);
		pCalle.add(cCalle);

		JPanel pCola = new JPanel();
		pCola.setBackground(Color.GRAY);

		tablero.add(pCola, BorderLayout.CENTER);

		cola1 = new JLabel();
		cola1.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		cola1.setPreferredSize(new Dimension(120, 200));
		cola1.setOpaque(true);
		cola1.setForeground(Color.BLACK);
		cola1.setBackground(new Color(255, 102, 102));
		pCola.add(cola1);

		cola2 = new JLabel();
		cola2.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		cola2.setPreferredSize(new Dimension(120, 200));
		cola2.setOpaque(true);
		cola2.setForeground(Color.BLACK);
		cola2.setBackground(new Color(255, 102, 102));
		pCola.add(cola2);

		cola3 = new JLabel();
		cola3.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		cola3.setPreferredSize(new Dimension(120, 200));
		cola3.setOpaque(true);
		cola3.setForeground(Color.BLACK);
		cola3.setBackground(new Color(255, 102, 102));
		pCola.add(cola3);

		cola4 = new JLabel();
		cola4.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		cola4.setPreferredSize(new Dimension(120, 200));
		cola4.setOpaque(true);
		cola4.setForeground(Color.BLACK);
		cola4.setBackground(new Color(255, 102, 102));
		pCola.add(cola4);

		cola5 = new JLabel();
		cola5.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
		cola5.setPreferredSize(new Dimension(120, 200));
		cola5.setOpaque(true);
		cola5.setForeground(Color.BLACK);
		cola5.setBackground(new Color(255, 102, 102));
		pCola.add(cola5);

	}

	public void actualizarMazos() {
		int rojoSize = ListaJugador.getListaJugador().manoSize(EnumColor.ROJO);
		switch (rojoSize) {
		case 1:
			try {
				btnCarta11.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.ROJO, 0))));
				btnCarta12.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta13.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta14.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		case 2:
			try {
				btnCarta11.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.ROJO, 0))));
				btnCarta12.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.ROJO, 1))));
				btnCarta13.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta14.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		case 3:
			try {
				btnCarta11.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.ROJO, 0))));
				btnCarta12.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.ROJO, 1))));
				btnCarta13.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.ROJO, 2))));
				btnCarta14.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		case 4:
			try {
				btnCarta11.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.ROJO, 0))));
				btnCarta12.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.ROJO, 1))));
				btnCarta13.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.ROJO, 2))));
				btnCarta14.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.ROJO, 3))));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		default:
			try {
				btnCarta11.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta12.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta13.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta14.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		}
		int verdeSize = ListaJugador.getListaJugador().manoSize(EnumColor.VERDE);
		switch (verdeSize) {
		case 1:
			try {
				btnCarta21.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.VERDE, 0))));
				btnCarta22.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta23.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta24.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		case 2:
			try {
				btnCarta21.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.VERDE, 0))));
				btnCarta22.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.VERDE, 1))));
				btnCarta23.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta24.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		case 3:
			try {
				btnCarta21.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.VERDE, 0))));
				btnCarta22.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.VERDE, 1))));
				btnCarta23.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.VERDE, 2))));
				btnCarta24.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		case 4:
			try {
				btnCarta21.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.VERDE, 0))));
				btnCarta22.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.VERDE, 1))));
				btnCarta23.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.VERDE, 2))));
				btnCarta24.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.VERDE, 3))));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		default:
			try {
				btnCarta21.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta22.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta23.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta24.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		}

		int azulSize = ListaJugador.getListaJugador().manoSize(EnumColor.AZUL);
		switch (azulSize) {
		case 1:
			try {
				btnCarta31.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AZUL, 0))));
				btnCarta32.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta33.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta34.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		case 2:
			try {
				btnCarta31.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AZUL, 0))));
				btnCarta32.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AZUL, 1))));
				btnCarta33.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta34.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		case 3:
			try {
				btnCarta31.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AZUL, 0))));
				btnCarta32.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AZUL, 1))));
				btnCarta33.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AZUL, 2))));
				btnCarta34.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		case 4:
			try {
				btnCarta31.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AZUL, 0))));
				btnCarta32.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AZUL, 1))));
				btnCarta33.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AZUL, 2))));
				btnCarta34.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AZUL, 3))));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		default:
			try {
				btnCarta31.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta32.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta33.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta34.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		}

		int amarSize = ListaJugador.getListaJugador().manoSize(EnumColor.AMARILLO);
		switch (amarSize) {
		case 1:
			try {
				btnCarta41.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AMARILLO, 0))));
				btnCarta42.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta43.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta44.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		case 2:
			try {
				btnCarta41.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AMARILLO, 0))));
				btnCarta42.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AMARILLO, 1))));
				btnCarta43.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta44.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		case 3:
			try {
				btnCarta41.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AMARILLO, 0))));
				btnCarta42.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AMARILLO, 1))));
				btnCarta43.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AMARILLO, 2))));
				btnCarta44.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		case 4:
			try {
				btnCarta41.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AMARILLO, 0))));
				btnCarta42.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AMARILLO, 1))));
				btnCarta43.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AMARILLO, 2))));
				btnCarta44.setIcon(new ImageIcon(
						getClass().getResource(ListaJugador.getListaJugador().getImgPath(EnumColor.AMARILLO, 3))));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		default:
			try {
				btnCarta41.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta42.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta43.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
				btnCarta44.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			} catch (Exception ex) {
				System.out.println(ex);
			}
			break;
		}

	}

	public void actualizarCola() {
		int colaSize = CartasEnJuego.getCartasEnJuego().size();
		CartasEnJuego.getCartasEnJuego().getImgPath(0);
		switch (colaSize) {
		case 1:
			cola1.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(0))));
			cola2.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			cola3.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			cola4.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			cola5.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			break;
		case 2:
			cola1.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(0))));
			cola2.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(1))));
			cola3.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			cola4.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			cola5.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			break;
		case 3:
			cola1.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(0))));
			cola2.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(1))));
			cola3.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(2))));
			cola4.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			cola5.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			break;
		case 4:
			cola1.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(0))));
			cola2.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(1))));
			cola3.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(2))));
			cola4.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(3))));
			cola5.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			break;
		case 5:
			cola1.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(0))));
			cola2.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(1))));
			cola3.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(2))));
			cola4.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(3))));
			cola5.setIcon(new ImageIcon(getClass().getResource(CartasEnJuego.getCartasEnJuego().getImgPath(4))));
			break;
		default:
			cola1.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			cola2.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			cola3.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			cola4.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			cola5.setIcon(new ImageIcon(getClass().getResource("/packImagenes/NoCarta.png")));
			break;
		}
	}

	public void cambiarTurno() {
		switch (turnoColor) {
		case ROJO:
			turnoColor = EnumColor.AMARILLO;
			lblTurno.setBackground(miAmarillo);
			break;
		case AZUL:
			turnoColor = EnumColor.VERDE;
			lblTurno.setBackground(miVerde);
			break;
		case VERDE:
			turnoColor = EnumColor.ROJO;
			lblTurno.setBackground(miRojo);
			break;
		case AMARILLO:
			turnoColor = EnumColor.AZUL;
			lblTurno.setBackground(miAzul);
			break;
		default:
			break;
		}
		btnPasarElTurno.setEnabled(false);

	}

	public EnumColor getTurnoColor() {
		return turnoColor;
	}

	public JButton getBoton() {
		return btnJugar;
	}

	@Override
	public void update(Observable observable, Object parametro) {
		/*
		 * --observable-- es el objeto que activa su notify en cada momento, por lo que
		 * se verá en cada momento de que instancia es y se hará update en consecuencia
		 * --parametro-- es el parámetro del tipo que queramos que le vamos a pasar como
		 * información
		 */
		if (observable instanceof CartasEnJuego) {
			String cielo = String.format("%d Carta/s", BarBestial.getBarBestial().numCartas());
			String calle = String.format("%d Carta/s", Calle.getCalle().numCartas());
			cCielo.setText(cielo);
			cCalle.setText(calle);

		}

	}

	public boolean isAnimaladasEjecutada() {
		return animaladasEjecutada;
	}

	public void setAnimaladasEjecutada(boolean animaladasEjecutada) {
		this.animaladasEjecutada = animaladasEjecutada;
		if (animaladasEjecutada) {
			btnEjecutarAnimaladas.setEnabled(false);
			btnPasarElTurno.setEnabled(true);
		} else {
			btnEjecutarAnimaladas.setEnabled(true);
			btnPasarElTurno.setEnabled(false);
		}
	}

	public boolean isCartaEchada() {
		return cartaEchada;
	}

	public void setCartaEchada(boolean cartaEchada) {
		this.cartaEchada = cartaEchada;
	}

}
