package packModelo;

public class CartaAnimal {

	private final EnumColor color;
	private int valor;
	private String tipo;
	private boolean activada = false;
	private ICompAnimalada animalada;
	private String pathImg;

	public String getPathImg() {
		return pathImg;
	}

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
	 * @param pPathImg
	 */
	public CartaAnimal(EnumColor pCol, int pValor, String pTipo, String pPathImg) {
		color = pCol;
		valor = pValor;
		tipo = pTipo;
		pathImg = pPathImg;
	}

	public int getValor() {
		return valor;
	}

	public EnumColor getColor() {
		return color;
	}

	public void hacerAnimalada() {
		animalada.animalada();
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
		this.activada = param;
	}

}