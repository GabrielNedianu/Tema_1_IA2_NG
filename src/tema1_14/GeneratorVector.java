package tema1_14;


public class GeneratorVector {
	int[] vector;
	int nrElemV;
	public GeneratorVector(int nrElementeV,int nrElementeGenerateRandom) {
		vector = new int[nrElementeV];
		try {
			for (int i = 0; i < nrElementeGenerateRandom; i++) {
				vector[i] = GeneratorIntRandom.generare();		
				}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Ati depasit limita vectorului.");
		}
		this.nrElemV=nrElementeV;
	}
		
	public void calculare() {
		for (int i = 0; i< nrElemV;i++) {
			try {
				vector[i]= 100 / vector[i];
				} catch (ArithmeticException e) {
					System.err.println("S-a realizat o impartire imposibila, vom salva valoarea -1.");
					vector[i]=-1;
					}
				catch(ArrayIndexOutOfBoundsException e) {
					System.err.println("Ati depasit limita vectorului.");
				}
			}
	}
	
	public void afisare() {
		System.out.println("\nVectorul este:");
		for ( int i : vector) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
		
}

