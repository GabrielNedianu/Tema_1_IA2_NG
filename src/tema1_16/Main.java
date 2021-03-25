package tema1_16;

import java.util.InputMismatchException;
import java.lang.Math;

public class Main 
{
		public static void main(String[] args)
		{
			App app1 = new App();
			int nr ;
			int sum = 0;
			
			try 
			{
				/*nr = app1.readNumber();
				while(Math.floor(nr) != nr)
				{
					do {
				nr = app1.readNumber();
				}
				sum += nr;
				System.out.println("Suma: " + sum);
				*/
		    do
		     {
		      nr = app1.readNumber();
		      sum += nr;
		     }
		     while(nr/(int)nr != 1);
		     System.out.println("Suma:" + sum);
			}
			
		catch(InputMismatchException e)
			{
			System.out.println("Error occured.");
			e.printStackTrace();
			}
		}
			
		}	


