package javasessions;

public class Car {
	//class prop: class variables
	  String name ="TOM";
	  int price;
	  String color;
	  String model;

	public static void main(String[] args) {
       // String name = "arjun"; //local variable
		//System.out.println(name);
		
		//to access class vars/prop, you have to create the object of the class.
		//use new keyword
		
		Car c = new Car();
		
		c.name="Audi";
		c.price=30;
		c.color="black";
		c.model="A10";
		System.out.println(c.name+ " "+c.price+" "+c.color+" "+c.model);
		
		Car c1 = new Car(); //here we have created object but not assigned values to variables
		// then it prints default values of String and int which are null and 0
		System.out.println(c1.name+ " "+c1.price+" "+c1.color+" "+c1.model);
		
		
		
		Car c2 = new Car();
		c2.name="BMW";
		c2.model="BSeries";
		System.out.println(c2.name+ " "+c2.price+" "+c2.color+" "+c2.model);

	}

}
