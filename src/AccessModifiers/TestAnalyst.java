package AccessModifiers;

public class TestAnalyst extends Employee {

	public static void main(String[] args) {

		
		TestAnalyst t = new TestAnalyst();
		t.name = "kittu";
		t.city = "tornoto";
		t.dob = " 12/12/12";
		
		
		t.empName("arjun");
		t.empStatus();
	}

}
