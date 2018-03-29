package packModelo;

public class Constantes {

	private int mano = 4;
	private int mazo = 12;
	private static Constantes misConstantes;
	private int numJugadores = 4;

	private Constantes() {
		// TODO - implement Constantes.Constantes
		throw new UnsupportedOperationException();
	}

	public int getMano() {
		return this.mano;
	}

	/**
	 * 
	 * @param mano
	 */
	public void setMano(int mano) {
		this.mano = mano;
	}

	public int getMazo() {
		return this.mazo;
	}

	/**
	 * 
	 * @param mazo
	 */
	public void setMazo(int mazo) {
		this.mazo = mazo;
	}

	public Constantes getConstantes() {
		// TODO - implement Constantes.getConstantes
		throw new UnsupportedOperationException();
	}

	public int getNumJugadores() {
		return this.numJugadores;
	}

	/**
	 * 
	 * @param numJugadores
	 */
	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}

}