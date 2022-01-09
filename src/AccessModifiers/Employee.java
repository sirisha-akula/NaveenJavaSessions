package AccessModifiers;

public class Employee {
	
	public String name;
	private int salary;
	String city;
	protected String dob;
	

	public static void main(String[] args) {

		final int i = 20; //never use any public/private/protected/default modifiers with local variables and also static, local variables are not static, static is class level.
		//only final is permitted for local variables.
		
		Employee e = new  Employee();
		e.name = "Arjun";
		e.salary = 90000;
		e.city = "WINNIPEG";
		e.dob = "20/20/20";
		
		e.empName("siri");
		int sal = e.empSal("siri");
		System.out.println(sal);
		e.empStatus();
	}
	
	public void empName(String Name) {
		System.out.println("this is a public method");
	}
	
	private int empSal(String Name) {
		System.out.println("this is a private method");
	    return 2000;
	}
	
//	default void empCity() { default methods are only allowed in interfaces.
//Q: When tried to create default method it says 'default methods are only allowed in interfaces', we cannot create default methods in class as we created default variables?
//		System.out.println("this is a private method");
//
//	}
	
	protected void empStatus() {
		System.out.println("this is a protected method");
	}
	
	

}
