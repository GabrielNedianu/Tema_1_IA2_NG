package tema1_3;

class B{
	protected int x,y;
	
	B(){}
	
	B(int X,int Y){
		x=X;
		y=Y;
	}
	
	public int getX() {
		return x;
	}
	
	@Override
	public String toString() {
	return "x este "+x+"\ny este "+y;
	}
	
}

/*Asta returneaza toString-ul implementat deja
 * public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 */


public class Main {

	public static void main(String[] args) {
		
		B objB = new B(5,7);
		System.out.println(objB.toString());
		//System.out.println(objB.getClass());
	} 

}
