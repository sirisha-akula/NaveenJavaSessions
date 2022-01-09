package AccessModifiers2;

import AccessModifiers.Employee;

public class Devloper extends Employee {

	public static void main(String[] args) {

		Devloper d = new Devloper();
		d.name = " sunny";
		d.dob = "12/05/16";
		
		d.empName("kittu");
		d.empStatus();
	}

}
