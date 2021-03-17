package Supliment;

public abstract class AutoVehicul implements Vehicul {

	protected boolean motor;
	protected double speed,CC;
	static double pow;
	protected String culoare,marca;
	
	public void pornesteMotor() {
		motor=true;
	}

	public void opresteMotor() {
		motor=false;
	}

	public void accelerare() {
		speed=speed+pow;
	}

	public void decelerare() {
		speed=speed-pow;
	}

}
