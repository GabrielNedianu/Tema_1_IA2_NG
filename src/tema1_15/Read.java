package tema1_15;

import java.util.Scanner;

public class Read {
	public static Double DoubleVar() throws ExceptieEcuatie {
		Scanner scanner = new Scanner(System.in);
		double x;
		x= scanner.nextDouble();
		if(x==0)
		{
			throw new ExceptieEcuatie("Ati introdus '0'");
		}
		return x;
	}
}
