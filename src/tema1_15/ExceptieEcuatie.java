package tema1_15;

@SuppressWarnings("serial")
public class ExceptieEcuatie extends Exception{
	
	public ExceptieEcuatie(String exc) {
	 super(exc);
	 }
	
	public String getMessage() {
		return super.getMessage();
	}

}
