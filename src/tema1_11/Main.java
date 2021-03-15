package tema1_11;

public class Main {

	public static void main(String[] args) {
		try {
			impartireLaX(0);
		} catch (ArithmeticException e) {
			System.out.println("Impartire prin 0.");
			System.out.println(e.getMessage());
		}
		
		}
	
	public static int impartireLaX(int x) throws ArithmeticException{
		return 10/x;
	}

}
