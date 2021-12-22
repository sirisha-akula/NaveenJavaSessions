package ConstructorConcept;

public class Users {
//constructor is called when object is created.
	String name;
	int userId;
	boolean isPrime;
	String city;
	
	public Users(String name, int userId) {
		this.name = name;
		this.userId = userId;
	}
	public Users(String name) {
		this.name = name;
		
	}
	
	public Users(String name, int userId, boolean isPrime, String city) {
		this.name = name;
		this.userId = userId;
		this.isPrime = isPrime;
		this.city = city;
	}
	public static void main(String[] args) {
		Users u1 = new Users("Sita", 001);
		System.out.println(u1.name);
		System.out.println(u1.userId);
		System.out.println(u1.isPrime);
		System.out.println(u1.city);
		
		//Users u2 = new Users(); restricting the user to create unnecessary objects in heap. u cannot create any random objects
		//as we dont have default constructor we cannot create object with 0 parameter const...
		
		Users u2 = new Users("Geeta");
		Users u3 = new Users("Meena", 002, true, "Pune");
		
		System.out.println(u3.name + " " +u3.userId + " " + u3.isPrime + " " + u3.city);
				
	}

}
