package tema1_14;

import java.util.Random;

public class GeneratorIntRandom {
	static public int generare() {
		Random random = new Random();
		return random.nextInt(100);
	}
	static public double generareDouble() {
		Random random = new Random();
		return random.nextDouble() *10;
	}
}
