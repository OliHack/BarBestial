package packModelo;

public class CartaFactory {

	private static CartaFactory miCartaFactory;

	private CartaFactory() {
	}

	public static CartaFactory getCartaFactory() {
		if (miCartaFactory == null)
			miCartaFactory = new CartaFactory();
		return miCartaFactory;
	}

	/**
	 * Crea una carta y la devuelve segun el color y el tipo. Ademas de añadirle el comportamiento de la animalda correspondiente
	 * 
	 * @param pColor color de la carta
	 * @param pTipo tipo de CartaAnimal
	 */
	public CartaAnimal crearCarta(EnumColor pColor, String pTipo) {
		CartaAnimal newCarta = null;
		switch (pTipo) {
		case "Leon":
			newCarta = new CartaAnimal(pColor, Constantes.VALOR_LEON,pTipo);
			newCarta.setICompAnimalada(new Leon());
			break;
		case "Hipopotamo":
			newCarta = new CartaAnimal(pColor, Constantes.VALOR_HIPO,pTipo);
			newCarta.setICompAnimalada(new Hipopotamo());
			break;
		case "Cocodrilo":
			newCarta = new CartaAnimal(pColor, Constantes.VALOR_COCO,pTipo);
			newCarta.setICompAnimalada(new Cocodrilo());
			break;
		case "Serpiente":
			newCarta = new CartaAnimal(pColor, Constantes.VALOR_SERPIENTE,pTipo);
			newCarta.setICompAnimalada(new Serpiente());
			break;
		case "Jirafa":
			newCarta = new CartaAnimal(pColor, Constantes.VALOR_JIRAFA,pTipo);
			newCarta.setICompAnimalada(new Jirafa());
			break;
		case "Cebra":
			newCarta = new CartaAnimal(pColor, Constantes.VALOR_CEBRA,pTipo);
			newCarta.setICompAnimalada(new Cebra());
			break;
		case "Foca":
			newCarta = new CartaAnimal(pColor, Constantes.VALOR_FOCA,pTipo);
			newCarta.setICompAnimalada(new Foca());
			break;
		case "Camaleon":
			newCarta = new CartaAnimal(pColor, Constantes.VALOR_CAMALEON,pTipo);
			newCarta.setICompAnimalada(new Camaleon());
			break;
		case "Mono":
			newCarta = new CartaAnimal(pColor, Constantes.VALOR_MONO,pTipo);
			newCarta.setICompAnimalada(new Mono());
			break;
		case "Canguro":
			newCarta = new CartaAnimal(pColor, Constantes.VALOR_CANGURO,pTipo);
			newCarta.setICompAnimalada(new Canguro());
			break;
		case "Loro":
			newCarta = new CartaAnimal(pColor, Constantes.VALOR_LORO,pTipo);
			newCarta.setICompAnimalada(new Loro());
			break;
		case "Mofeta":
			newCarta = new CartaAnimal(pColor, Constantes.VALOR_MOFETA,pTipo);
			newCarta.setICompAnimalada(new Mofeta());
			break;
		}
		return newCarta;
	}

}