package tema1_7;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Companie companie = new Companie();
		for (int i = 0; i < 10; i++) {		//Adaugam cativa angajati fictivi
			companie.addEmployee(new Employee(generareString()));
		}
		companie.displayEmployee();
	}
	
	public static String generareString() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";
		String nume="";
		Random random = new Random();
		
		 for(int i = 0; i < 9; i++) {
		      int index = random.nextInt(alphabet.length()); //Generam un index random din alphabet
		      char randomChar = alphabet.charAt(index);		//Extragem char ul de la acea pozitie
		      nume = nume+randomChar;						//Creem numele adaugand char cu char
		    }
		
		return nume;
	}

}
