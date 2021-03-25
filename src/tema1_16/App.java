package tema1_16;

import java.util.InputMismatchException;
import java.util.Scanner;

	public class App 
	{
		
		public int readNumber() throws InputMismatchException
		{
			 int value = 0;
	      	 System.out.println("Input a number: ");	
		     Scanner in = new Scanner(System.in);
		     if(in.hasNextInt())
		     {
		     value = in.nextInt();
		     }
		     
		return value;
			
		}
	}

