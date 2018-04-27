package packModelo;

public class CartaAnimal {

	private final EnumColor	color;
	private int				valor;
	private String			tipo;
	private boolean			activada;
	private ICompAnimalada	animalada;
	private final String	pathImg;

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
		activada = false;
	}

	public boolean activadaRec() {
		return this.activada;
	}

	public ICompAnimalada getAnimalada() {
		return animalada;
	}

	public EnumColor getColor() {
		return color;
	}

	public String getPathImg() {
		return pathImg;
	}

	public String getTipo() {
		return tipo;
	}

	public int getValor() {
		return valor;
	}

	public void hacerAnimalada() {
		animalada.animalada();
	}

	public void hacerAnimaladaRec(int pPos) {
		animalada.animalada(pPos);
	}

	public void setActivada(boolean param) {
		activada = param;
	}

	public void setICompAnimalada(ICompAnimalada pAnimalada) {
		animalada = pAnimalada;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return color.toString() + " " + valor + " " + tipo;
	}

}