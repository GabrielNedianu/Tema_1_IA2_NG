package tema1_9;

public class Cerc implements Shape {

	public Cerc(float R){
		r=R;
	}
	
	private float r;
	
	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	public float getArea() {
		return (float) (2*3.14*r);
	}

}
