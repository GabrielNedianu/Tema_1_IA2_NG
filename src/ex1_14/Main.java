package ex1_14;

import java.util.InputMismatchException;

public class Main {

public static void main(String[] args) {
	boolean ok=true;
	App app1 = new App();
	Integer nr, sum;
	sum=0;
	try {
		nr = app1.readNumber();
		sum+=nr;
	} catch (InputMismatchException ex) {
		System.err.println("Primul numar introdus gresit!");
		ok=false;
	}
	try {
		nr = app1.readNumber();
		sum+=nr;
	} catch (InputMismatchException ex) {
		System.err.println("Al doilea numar introdus gresit!");
		if(ok==false) {
			System.out.println("Ambele numere au fost introduse gresit.");
		}
	}
	System.out.println("Suma:" + sum);
	}
}
