package tema1_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int suma = 0;
		try {
		File fisierInput = new File("src/Input");
		Scanner myReader = new Scanner(fisierInput);
		String buffString;
		ArrayList<Integer> lista = new ArrayList<>();
		while(myReader.hasNext()) {
			if(myReader.hasNextInt())
			{
				lista.add(myReader.nextInt());
			}
			else {
				System.out.println(myReader.next());
			}
		}
		
		for (Integer integer : lista) {
			suma = suma + integer;
		}

		} catch (FileNotFoundException e) {
			System.out.println("N-am gasit fisierul");
			e.printStackTrace();
		} catch (Exception ee2) {
			ee2.printStackTrace();
		}
		finally {
			System.out.println("Suma este : " + suma);
		}
			
	}
}
		
	



