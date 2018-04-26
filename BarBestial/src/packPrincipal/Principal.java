package packPrincipal;

import packInterfaces.*;
import packModelo.*;

public class Principal {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] pNombres = new String[4];
		pNombres[0] = "Oliver";
		pNombres[1] = "Jonan";
		pNombres[2] = "Unai";
		pNombres[3] = "Frank";
		Partida.getPartida().inicializarPartida(pNombres);
		IPartida.getIPartida().empezar();
	}

}
