package tema1_8;

public class Robot implements Computer, Mechanism {

	@Override
	public void on() {
		System.out.println("Device -> on");

	}

	@Override
	public void off() {
		System.out.println("Device -> off");

	}

	@Override
	public void Move() {
		System.out.println("Mechanism -> Move");

	}

	@Override
	public void boot() {
		System.out.println("Computer -> boot");
	}
	
	public void pornireRobot() {
		System.out.println("Pornim robotul");
		on();
		boot();
	}
	public void miscaRobot() {
		System.out.println("Se misca robotul");
		Move();
	}
	public void oprimRobot() {
		System.out.println("Se opreste robotul");
		off();
	}

}
