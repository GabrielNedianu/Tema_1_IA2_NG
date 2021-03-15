package ex1_14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	int readNumber() throws InputMismatchException {
	Scanner in = new Scanner(System.in);
	return in.nextInt();
	}
}