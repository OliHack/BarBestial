package packPrincipal;

import packInterfaces.*;

public class Principal {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		IPartida frame = IPartida.getIPartida();
		frame.setVisible(true);
	}

}
