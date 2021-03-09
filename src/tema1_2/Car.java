package tema1_2;

public class Car {
	
	protected int Speed;
	
	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
		Speed = speed;
	}

	public void start() {
		System.out.println("Masina a pornit");
	}
	
	public void stop() {
		System.out.println("Masina a oprit");
	}
	
	public void accelerate() {
		System.out.println("Masina a accelerat");
	}
	
	public void startEngie() {
		System.out.println("Pornim motorul");
	}
	
	public void stopEngie() {
		System.out.println("Oprim motorul");
	}
	
}
