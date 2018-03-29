package packModelo;

public class CartaAnimal {

	private EnumColor color;
	private int valor;
	private ICompAnimalada animalada;

	/**
	 * 
	 * @param pCol
	 * @param pValor
	 * @param pRec
	 */
	public CartaAnimal(EnumColor pCol, int pValor) {
		color=pCol;
		valor=pValor;
	}

	public void hacerAnimalada() {
		// TODO - implement CartaAnimal.hacerAnimalada
		throw new UnsupportedOperationException();
	}
	public void setICompAnimalada (ICompAnimalada pAnimalada) {
		animalada=pAnimalada;
	}

}