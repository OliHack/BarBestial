package packModelo;

public class Cebra implements Recurrente, ICompAnimalada {

	public Cebra() {

	}

	@Override
	public void animalada() {
		// la animalada de la cebra se tendr� en cuenta en la animalada de los
		// hipop�tamos
		// y en la de los cocodrilos

	}

	@Override
	public void animalada(int pos) {
		System.out.println("Esta cebra no deja a un hipopótamo o a un cocodrilo hacerle nada");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void recurrir() {
		// TODO Auto-generated method stub

	}

}