package tema1_7;

import java.util.Random;

public class Employee extends Driver {
	public Employee() {
		Random random = new Random();
		this.licenseNumber = random.nextInt(100000); 
	}
	
	public Employee(String nameEmployee) {
		this.name = nameEmployee;
		Random random = new Random();
		this.licenseNumber = random.nextInt(100000); 
	}
	protected void displayEmployee() {
		this.displayPerson();
		this.displayDriver();
	}
}
