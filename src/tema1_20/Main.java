package tema1_20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti doua numere:");
		double a = 0, b= 0;
		
		try {
			a = scanner.nextDouble();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			b = scanner.nextDouble();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		double suma = a + b;
		System.out.println(suma);
	}

}	
