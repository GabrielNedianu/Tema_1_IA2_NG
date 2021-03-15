package tema1_14;

public class Main {

	public static void main(String[] args) {
		try {
			GeneratorVector vec1 = new GeneratorVector(100, 99);
			vec1.afisare();
			vec1.calculare();
			vec1.afisare();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			GeneratorVector vec2 = new GeneratorVector(100, 200);
			vec2.afisare();
			vec2.calculare();
			vec2.afisare();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
