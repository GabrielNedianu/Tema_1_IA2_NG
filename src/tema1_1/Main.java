package tema1_1;
import java.util.Scanner;

class A{
	protected int x;
	
	public A(int x) {
		this.x=x;
	}
	
	public int getX(){
		return this.x;
	}
	
	public void displayX() {
		System.out.println(x);
	}

}

class B extends A{

	protected String s;
	
	public B(int x) {
			super(x);
		}
	
	public void readS() {
		Scanner scanner = new Scanner(System.in);
		this.s=scanner.nextLine();
	}
		
	
	@Override
	public void displayX() {
		System.out.println(x);
	}
	
}

class C extends B{

	private float y;
	
	public C(int x) {
		super(x);
	}
	
	public void readY(){
		Scanner scanner = new Scanner(System.in);
		this.y=scanner.nextFloat();
	}
	
	public void readX(){
		Scanner scanner = new Scanner(System.in);
		this.x=scanner.nextInt();
	}
	
	public void displayXYS() {
		System.out.println("X:"+x+" "+"Y:"+y+" "+"S:"+s);
	}

}

public class Main {
	
	public static void main(String args[]) {
		C objC = new C(5);
		objC.displayXYS();
		System.out.println("Introduceti de la tastatura int, float, string");
		objC.readX();
		objC.readY();
		objC.readS();
		objC.displayXYS();
		objC.displayX();
		System.out.println(objC.getX());
	}
}
