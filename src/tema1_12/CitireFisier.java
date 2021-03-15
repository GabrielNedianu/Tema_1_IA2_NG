package tema1_12;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class CitireFisier {
	
	public static double citireDinFisier() {
		try {
		      File fisierInput = new File("src/Input");
		      Scanner myReader = new Scanner(fisierInput);
		      return myReader.nextDouble();
		    }catch (FileNotFoundException e) {
		      System.out.println("Nu s-a gasit fisierul.");
		      e.printStackTrace();
		      return 1;
		    }
		
	}
	
}
