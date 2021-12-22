package ConstructorConcept;

/*ConstructorConcept is explained in this class
 * 
 */
public class Employee {
	
	String name;
	int age;
	String empId;
	String dept;
	
	//Const...
	//1. const...name will be same as Class name
	//2. const...will not have any return type/no void/no return keyword
	//3. const...looks like a function but not a function
	//4. const...cannot be static only methods and variables can be static.
	//5. const...can be overloaded.
	//6. default const...depends on Use Cases...N number of Objects...
	
	//Const vs Function(Method)
	//1. const...name will remain same...but function name can be anything
	//2. const...will never have any return but fun may  or may not return the value.
	//3. const...will be called whenever you create the Object but method will be called with Object reference variable.
	//4. const...will help to create the object of the class, we can restrict unnecessary object creation
	//5. function should have the business logic/feature but the Const... should not have any bussiness logic.
	
	
	
	public Employee() { //0 parameter
		System.out.println("default constructor");
	}
	
	public Employee(int i) { //0 parameter
		System.out.println("1 constructor..." +i);
	}
	
	public Employee(int i, String p) { //0 parameter
		System.out.println("2 constructor..." +i+p);
	}

	public static void main(String[] args) {
		//5.const...will be called only when object is created.
		
		Employee e1 = new Employee(10, "test");
		Employee e2 = new Employee(20, "Helloworld");
		
		Employee e3 = new Employee(500);
		Employee e4 = new Employee();
	

	}

}
