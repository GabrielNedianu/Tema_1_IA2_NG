package tema1_13;

import java.util.InputMismatchException;

public class Main {

public static void main(String[] args) {
	boolean ok=false;
	App app1 = new App();
	Integer nr, sum;
	sum=0;
	while(!ok) {
		try {
			nr = app1.readNumber();
			sum+=nr;
			ok=true;
			} catch (InputMismatchException ex) {
				System.err.println("Primul numar introdus gresit!Reintroduceti-l pana este unul corect:");		
				}
	}
	
	ok=false;
	while(!ok) {
		try {
			nr = app1.readNumber();
			sum+=nr;
			ok=true;
			} catch (InputMismatchException ex) {
				System.err.println("Al doilea numar introdus gresit!Reintroduceti-l pana este unul corect:");
				}
	}
	
	System.out.println("Suma:" + sum);
	}
	
}

