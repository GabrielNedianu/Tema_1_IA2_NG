package scriereFisier;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fWriter = new FileWriter("src/scriereFisier/out.txt");
			String string;
			boolean ok = true;
			do {
				string=CitireString.citire();
				if(string.contains("end"))
					ok = false;
				fWriter.write(string+"\n");
			} while (ok);
			fWriter.close();
		} catch (IOException e) 
		{
			e.getMessage();
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			
		
	}
}
