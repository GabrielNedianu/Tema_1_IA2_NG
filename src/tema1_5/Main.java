package tema1_5;

interface Mechanism{
	void move();
}

class Wheel implements Mechanism{

	@Override
	public void move() {
		System.out.println("Mechanism -> move() ");
	}
	
	public void goTo() {
		move();
		System.out.println("Mechanism -> goTO() ");
	}
	
}

public class Main {

	public static void main(String[] args) {
		//Mechanism mec = new Mechanism();
		Wheel wheel = new Wheel();
		wheel.goTo();

	}

}


//Implement se foloseste cand implementam o interfata
//Extends se foloseste cand extindem o alta clasa deja existenda
//clasa abstracta poate avea metode implementate 