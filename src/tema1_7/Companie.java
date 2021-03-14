package tema1_7;

import java.util.ArrayList;

public class Companie {
	protected ArrayList<Employee> angajati;
	public Companie() {
		angajati = new ArrayList<Employee>();
	}
	public void addEmployee(Employee employee) {
		angajati.add(employee);
	}
	public void displayEmployee() {
		for (Employee employee : angajati) {
			employee.displayEmployee();
			System.out.println("");
		}
	}
}
