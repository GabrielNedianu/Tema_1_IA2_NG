package tema1_15;

public class Main {

	public static void main(String[] args) {
		double a = 0,b = 0;
		System.out.println("Introduceti a apoi b");
		try {
			a = Read.DoubleVar();
		} catch (ExceptieEcuatie e1) {
			e1.printStackTrace();
			e1.getMessage();
		}
		try {
			b = Read.DoubleVar();
		} catch (ExceptieEcuatie e2) { 
			e2.printStackTrace();
		    e2.getMessage();
		}
		Ecuatie ecuatie = new Ecuatie(a, b);
		double x = ecuatie.Rezolvare();
		
		System.out.println("Rezultatul ecuatiei "+a+"x +"+b+" este:"+x);
	}

}
