package ConstructorConcept;
//Constructor chaining: we can call one constructor inside other constructor using "this" keyword.
public class ConstructorCalling {
	
	String name;
	int age;
	double salary;
	

	public ConstructorCalling(String name) {
		
		this.name = name;
	}

	public ConstructorCalling(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	public ConstructorCalling(String name, int age, double salary) {
		this("Harika"); //this keyword will help to call constructor
		//this.name = name;
		this.age = age;
		this.salary = salary;
		
		//ConstructorCalling(name); it gives error u cannot call other constructor like this, we can use this("Harika") to call another constructor
		
	}

	public ConstructorCalling(int age, double salary) {
		this("Vishnu", 12); //calling another const...using this keyword
		this.age = age;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		ConstructorCalling obj = new ConstructorCalling("David", 34, 5000);
		System.out.println(obj.name);
		
		ConstructorCalling obj1 = new ConstructorCalling(78, 9900);
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.salary);
	}
	
	
}
