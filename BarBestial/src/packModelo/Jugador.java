package packModelo;

import java.util.Observable;

import javax.swing.JOptionPane;

public class Jugador extends Observable {

	private String nombre;
	private ListaCartaAnimal mano;
	private ListaCartaAnimal mazo;
	private EnumColor color;
	private int[] info;

	/**
	 * se crea e inicializa un jugador segun el nombre y un color concretamente se
	 * inicializan su mano (vacia) y su mazo (con las 12 cartas animales diferentes)
	 *
	 * @param pNombre
	 * @param pCol
	 */
	public Jugador(String pNombre, EnumColor pCol) {
		nombre = pNombre;
		color = pCol;

		inicializarMazo();
		inicializarMano();
	}

	/**
	 * Agrega una carta a la mano
	 *
	 * @param pCartaAnimal
	 */
	public void addMano(CartaAnimal pCartaAnimal) {
		mano.add(pCartaAnimal);
		this.notificar();
	}

	public boolean comprobarCartas() {
		if (this.mano.getListaAnimales().isEmpty() && mazo.getListaAnimales().isEmpty())
			return true;
		else
			return false;
	}

	/**
	 *
	 * @param pCartaAnimal
	 */
	public boolean echarCarta(int pCual) {
		if (mano.getListaAnimales().size() > pCual) {
			if (!CartasEnJuego.getCartasEnJuego().colaLlena()) {
				CartaAnimal pCartaAnimal = mano.getListaAnimales().get(pCual);
				CartasEnJuego.getCartasEnJuego().add(pCartaAnimal);
				this.mano.del(pCartaAnimal);
				ListaJugador.getListaJugador().comprobarCartas();
				this.notificar();
				return true;
			}else {
				JOptionPane.showMessageDialog(null, "La cola está llena, no puedes echar más cartas");
			}
		}
		return false;
	}

	/**
	 *
	 * @param pValor
	 */
	public CartaAnimal getCartaMano(int pValor) {
		return this.mano.getCarta(pValor);
	}

	public EnumColor getColor() {
		return color;
	}

	public ListaCartaAnimal getMano() {
		return mano;
	}

	public ListaCartaAnimal getMazo() {
		return mazo;
	}

	public String getNombre() {
		return nombre;
	}

	public void notificar() {
		// el jugador va a notificar a la interfaz solo cuando cambie su mano
		// this.actualizarInfo();
		setChanged();
		notifyObservers(info);
	}

	public void robarMazo() {
		if (!mazo.getListaAnimales().isEmpty()) {
			if (mano.getListaAnimales().size() < 4) {
				CartaAnimal miCarta = mazo.getListaAnimales().get(0);
				mazo.del(miCarta);
				addMano(miCarta);
			}
		}else {
			JOptionPane.showMessageDialog(null, "¡No tienes más cartas!");
		}
	}

	private void inicializarMano() {
		mano = new ListaCartaAnimal();
	}

	/**
	 * Inicializa el mano del jugador con todas las cartas del mismo color de todos
	 * los animales
	 *
	 *
	 */
	private void inicializarMazo() {
		mazo = new ListaCartaAnimal();
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Leon"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Hipopotamo"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Cocodrilo"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Serpiente"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Jirafa"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Cebra"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Foca"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Camaleon"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Mono"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Canguro"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Loro"));
		mazo.add(CartaFactory.getCartaFactory().crearCarta(color, "Mofeta"));
		mazo.desordenar();
	}

}