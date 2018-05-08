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
	 * Crea una carta y la devuelve segun el color y el tipo. Ademas de añadirle el
	 * comportamiento de la animalda correspondiente
	 * 
	 * @param pColor
	 *            color de la carta
	 * @param pTipo
	 *            tipo de CartaAnimal
	 */
	public CartaAnimal crearCarta(EnumColor pColor, String pTipo) {
		CartaAnimal newCarta = null;
		switch (pTipo) {
		case "Leon":
			switch (pColor) {
			case ROJO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_LEON, pTipo, "/packImagenes/rojo/Carta12.png",
						Constantes.PTS_LEON);
				break;
			case AMARILLO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_LEON, pTipo, "/packImagenes/amarillo/Carta12.png",
						Constantes.PTS_LEON);
				break;
			case AZUL:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_LEON, pTipo, "/packImagenes/azul/Carta12.png",
						Constantes.PTS_LEON);
				break;
			case VERDE:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_LEON, pTipo, "/packImagenes/verde/Carta12.png",
						Constantes.PTS_LEON);
				break;
			default:
				break;
			}
			newCarta.setICompAnimalada(new Leon());
			break;
		case "Hipopotamo":
			switch (pColor) {
			case ROJO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_HIPO, pTipo, "/packImagenes/rojo/Carta11.png",
						Constantes.PTS_HIPO);
				break;
			case AMARILLO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_HIPO, pTipo, "/packImagenes/amarillo/Carta11.png",
						Constantes.PTS_HIPO);
				break;
			case AZUL:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_HIPO, pTipo, "/packImagenes/azul/Carta11.png",
						Constantes.PTS_HIPO);
				break;
			case VERDE:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_HIPO, pTipo, "/packImagenes/verde/Carta11.png",
						Constantes.PTS_HIPO);
				break;
			default:
				break;
			}
			newCarta.setICompAnimalada(new Hipopotamo());
			break;
		case "Cocodrilo":
			switch (pColor) {
			case ROJO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_COCO, pTipo, "/packImagenes/rojo/Carta10.png",
						Constantes.PTS_COCO);
				break;
			case AMARILLO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_COCO, pTipo, "/packImagenes/amarillo/Carta10.png",
						Constantes.PTS_COCO);
				break;
			case AZUL:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_COCO, pTipo, "/packImagenes/azul/Carta10.png",
						Constantes.PTS_COCO);
				break;
			case VERDE:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_COCO, pTipo, "/packImagenes/verde/Carta10.png",
						Constantes.PTS_COCO);
				break;
			default:
				break;
			}
			newCarta.setICompAnimalada(new Cocodrilo());
			break;
		case "Serpiente":
			switch (pColor) {
			case ROJO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_SERPIENTE, pTipo, "/packImagenes/rojo/Carta9.png",
						Constantes.PTS_SERPIENTE);
				break;
			case AMARILLO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_SERPIENTE, pTipo,
						"/packImagenes/amarillo/Carta9.png", Constantes.PTS_SERPIENTE);
				break;
			case AZUL:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_SERPIENTE, pTipo, "/packImagenes/azul/Carta9.png",
						Constantes.PTS_SERPIENTE);
				break;
			case VERDE:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_SERPIENTE, pTipo, "/packImagenes/verde/Carta9.png",
						Constantes.PTS_SERPIENTE);
				break;
			default:
				break;
			}
			newCarta.setICompAnimalada(new Serpiente());
			break;
		case "Jirafa":
			switch (pColor) {
			case ROJO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_JIRAFA, pTipo, "/packImagenes/rojo/Carta8.png",
						Constantes.PTS_JIRAFA);
				break;
			case AMARILLO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_JIRAFA, pTipo, "/packImagenes/amarillo/Carta8.png",
						Constantes.PTS_JIRAFA);
				break;
			case AZUL:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_JIRAFA, pTipo, "/packImagenes/azul/Carta8.png",
						Constantes.PTS_JIRAFA);
				break;
			case VERDE:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_JIRAFA, pTipo, "/packImagenes/verde/Carta8.png",
						Constantes.PTS_JIRAFA);
				break;
			default:
				break;
			}
			newCarta.setICompAnimalada(new Jirafa());
			break;
		case "Cebra":
			switch (pColor) {
			case ROJO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_CEBRA, pTipo, "/packImagenes/rojo/Carta7.png",
						Constantes.PTS_CEBRA);
				break;
			case AMARILLO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_CEBRA, pTipo, "/packImagenes/amarillo/Carta7.png",
						Constantes.PTS_CEBRA);
				break;
			case AZUL:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_CEBRA, pTipo, "/packImagenes/azul/Carta7.png",
						Constantes.PTS_CEBRA);
				break;
			case VERDE:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_CEBRA, pTipo, "/packImagenes/verde/Carta7.png",
						Constantes.PTS_CEBRA);
				break;
			default:
				break;
			}
			newCarta.setICompAnimalada(new Cebra());
			break;
		case "Foca":
			switch (pColor) {
			case ROJO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_FOCA, pTipo, "/packImagenes/rojo/Carta6.png",
						Constantes.PTS_FOCA);
				break;
			case AMARILLO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_FOCA, pTipo, "/packImagenes/amarillo/Carta6.png",
						Constantes.PTS_FOCA);
				break;
			case AZUL:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_FOCA, pTipo, "/packImagenes/azul/Carta6.png",
						Constantes.PTS_FOCA);
				break;
			case VERDE:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_FOCA, pTipo, "/packImagenes/verde/Carta6.png",
						Constantes.PTS_FOCA);
				break;
			default:
				break;
			}
			newCarta.setICompAnimalada(new Foca());
			break;
		case "Camaleon":
			switch (pColor) {
			case ROJO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_CAMALEON, pTipo, "/packImagenes/rojo/Carta5.png",
						Constantes.PTS_CAMALEON);
				break;
			case AMARILLO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_CAMALEON, pTipo,
						"/packImagenes/amarillo/Carta5.png", Constantes.PTS_CAMALEON);
				break;
			case AZUL:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_CAMALEON, pTipo, "/packImagenes/azul/Carta5.png",
						Constantes.PTS_CAMALEON);
				break;
			case VERDE:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_CAMALEON, pTipo, "/packImagenes/verde/Carta5.png",
						Constantes.PTS_CAMALEON);
				break;
			default:
				break;
			}
			newCarta.setICompAnimalada(new Camaleon());
			break;
		case "Mono":
			switch (pColor) {
			case ROJO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_MONO, pTipo, "/packImagenes/rojo/Carta4.png",
						Constantes.PTS_MONO);
				break;
			case AMARILLO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_MONO, pTipo, "/packImagenes/amarillo/Carta4.png",
						Constantes.PTS_MONO);
				break;
			case AZUL:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_MONO, pTipo, "/packImagenes/azul/Carta4.png",
						Constantes.PTS_MONO);
				break;
			case VERDE:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_MONO, pTipo, "/packImagenes/verde/Carta4.png",
						Constantes.PTS_MONO);
				break;
			default:
				break;
			}
			newCarta.setICompAnimalada(new Mono());
			break;
		case "Canguro":
			switch (pColor) {
			case ROJO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_CANGURO, pTipo, "/packImagenes/rojo/Carta3.png",
						Constantes.PTS_CANGURO);
				break;
			case AMARILLO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_CANGURO, pTipo, "/packImagenes/amarillo/Carta3.png",
						Constantes.PTS_CANGURO);
				break;
			case AZUL:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_CANGURO, pTipo, "/packImagenes/azul/Carta3.png",
						Constantes.PTS_CANGURO);
				break;
			case VERDE:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_CANGURO, pTipo, "/packImagenes/verde/Carta3.png",
						Constantes.PTS_CANGURO);
				break;
			default:
				break;
			}
			newCarta.setICompAnimalada(new Canguro());
			break;
		case "Loro":
			switch (pColor) {
			case ROJO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_LORO, pTipo, "/packImagenes/rojo/Carta2.png",
						Constantes.PTS_LORO);
				break;
			case AMARILLO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_LORO, pTipo, "/packImagenes/amarillo/Carta2.png",
						Constantes.PTS_LORO);
				break;
			case AZUL:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_LORO, pTipo, "/packImagenes/azul/Carta2.png",
						Constantes.PTS_LORO);
				break;
			case VERDE:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_LORO, pTipo, "/packImagenes/verde/Carta2.png",
						Constantes.PTS_LORO);
				break;
			default:
				break;
			}
			newCarta.setICompAnimalada(new Loro());
			break;
		case "Mofeta":
			switch (pColor) {
			case ROJO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_MOFETA, pTipo, "/packImagenes/rojo/Carta1.png",
						Constantes.PTS_MOFETA);
				break;
			case AMARILLO:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_MOFETA, pTipo, "/packImagenes/amarillo/Carta1.png",
						Constantes.PTS_MOFETA);
				break;
			case AZUL:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_MOFETA, pTipo, "/packImagenes/azul/Carta1.png",
						Constantes.PTS_MOFETA);
				break;
			case VERDE:
				newCarta = new CartaAnimal(pColor, Constantes.VALOR_MOFETA, pTipo, "/packImagenes/verde/Carta1.png",
						Constantes.PTS_MOFETA);
				break;
			default:
				break;
			}
			newCarta.setICompAnimalada(new Mofeta());
			break;
		default:
			break;
		}
		return newCarta;
	}

}