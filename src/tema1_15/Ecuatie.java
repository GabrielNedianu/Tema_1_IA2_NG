package tema1_15;

public class Ecuatie {
	
	private double a,b;
	public Ecuatie(double a, double b) {
		this.a=a;
		this.b=b;
	}
	public double Rezolvare() {
		double x;
		try {
			x=-b/a;
		} catch (ArithmeticException e) {
			e.getMessage();
			x=-1;
		}
		
		return x;
	}

}
