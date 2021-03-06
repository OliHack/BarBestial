package packModelo;

public class CartaAnimal {

	private final EnumColor	color;
	private int				valor;
	private final int		puntos;
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
	public CartaAnimal(EnumColor pCol, int pValor, String pTipo, String pPathImg, int pPts) {
		color = pCol;
		valor = pValor;
		tipo = pTipo;
		pathImg = pPathImg;
		activada = false;
		puntos = pPts;
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

	public int getPuntos() {
		return puntos;
	}

	public String getTipo() {
		return tipo;
	}

	public int getValor() {
		return valor;
	}

	public void hacerAnimalada() {
		this.setActivada(true);
		animalada.animalada();
	}

	public boolean hacerAnimaladaRec(int pPos) {
		if (this.animalada instanceof Recurrente && activada == false) {
			animalada.animalada(pPos);
			this.setActivada(true);
			return true;
		} else
			return false;
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