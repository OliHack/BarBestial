package packModelo;

public class CartaAnimal {

	private final EnumColor color;
	private int valor;
	private String tipo;
	private boolean activada=false;
	private ICompAnimalada animalada;
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	/**
	 *
	 * @param pCol
	 * @param pValor
	 * @param pRec
	 */
	public CartaAnimal(EnumColor pCol, int pValor, String pTipo) {
		color = pCol;
		valor = pValor;
		tipo = pTipo;
	}

	public int getValor() {
		return valor;
	}

	public EnumColor getColor() {
		return color;
	}

	public void hacerAnimalada() {
		animalada.animalada();
		// TODO - implement CartaAnimal.hacerAnimalada
		throw new UnsupportedOperationException();
	}

	public void setICompAnimalada(ICompAnimalada pAnimalada) {
		animalada = pAnimalada;
	}

	public ICompAnimalada getAnimalada() {
		return animalada;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return color.toString() + " " + valor + " " + tipo;
	}

	public boolean activadaRec() {
		return this.activada;
	}
	public void setActivada(boolean param) {
		this.activada=param;
	}

}