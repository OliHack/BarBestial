package packModelo;

public class CartaAnimal {

	private final EnumColor	color;
	private int				valor;
	private ICompAnimalada	animalada;

	/**
	 *
	 * @param pCol
	 * @param pValor
	 * @param pRec
	 */
	public CartaAnimal(EnumColor pCol, int pValor) {
		color = pCol;
		valor = pValor;
	}

	public int getValor() {
		return valor;
	}

	public void hacerAnimalada() {
		// TODO - implement CartaAnimal.hacerAnimalada
		throw new UnsupportedOperationException();
	}

	public void setICompAnimalada(ICompAnimalada pAnimalada) {
		animalada = pAnimalada;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}