package tema1_12;

import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		double x = CitireFisier.citireDinFisier();
		double rezultat =0;
		try {
			rezultat = Math.pow(2,x);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Rezultatul este: "+rezultat);
	}

}
