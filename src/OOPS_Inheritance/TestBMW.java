package OOPS_Inheritance;

public class TestBMW {

	public static void main(String[] args) {

		
		BMW b = new BMW();
		
		b.start();//Overriden method
		b.stop(); //inherited method
		b.refuel(); //inherited method
		b.autoParking(); //indivual method of BMW
		b.engine();
		b.name = "520d";
		System.out.println(b.name);
	//	System.out.println(b.wheels );
		System.out.println(Car.wheels);
		System.out.println(BMW.wheels); //static variables can also be accessed using child class name(BMW.wheels) in Inheritance.
		
		BMW.price();
		Car.price();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		
		Audi au = new Audi();
		au.start();
		au.stop();
		au.refuel();
		au.engine();
		au.theftSafety();
		au.autoGear();
	    
		//Topcasting: child class object can be referred by parent class reference variable.
		Car c1 = new BMW(); //Topcasting: in topcasting we can only call method of parent class(Car) but not individual methods of BMW.
		c1.start();
		c1.stop();
		c1.refuel();
		
		Car c2 = new Audi();
		c2.start();
		c2.stop();
		c2.refuel();
		c2.engine();
			
	
		
		//Child class object can be referred by Grand Parent class reference variable.
		//Topcasting: in topcasting we can only call methods of parent class(Vehicle) but not individual methods of BMW.
		Vehicle v = new BMW();
		v.engine();
	
		//DownCasting: Parent class object is referred by child class reference variable.
		//in Java Down casting is not allowed.
		//BMW b1 = (BMW) new Car();//ClassCastException
		
		
		System.out.println("*********");
		BMW b1 = new BMW();
		b1.start(); //overriden method
		b1.stop(); //inherited method
		b1.refuel(); //inherited method
		b1.autoParking(); //Individual method
		b1.engine(); //inherited method
		b1.airBags(); //inherited method
		b1.strength(); //inherited method
		b1.hardness(); //inherited method
		b1.civil(); //inherited method
		b1.computerScience(); //inherited method
		b1.aeroDynamics(); //inherited method
		b1.bodyMass(); //inherited method
		

		System.out.println("*********");  
//top casting it gives all methods of Automobile class along with its Parent class(Mechanical)methods and grand parents class(Engineering and physics) methods
		Automobile at = new BMW();
		at.airBags();
		at.strength();
		at.hardness();
		at.civil();
		at.computerScience();
		at.aeroDynamics();
		at.bodyMass();
		

		System.out.println("*********");
//top casting it gives all methods of Mechanical class along with its Parent class(Engineering)methods and grand parents class(physics) methods

		Mechanical mh = new BMW();
		mh.strength();
		mh.hardness();
		mh.civil();
		mh.computerScience();
		mh.aeroDynamics();
		mh.bodyMass();
		
		System.out.println("*********");
//top casting it gives all methods of Engineering class along with its Parent class(Physics)methods

		Engineering eng = new BMW();
		eng.civil();
		eng.computerScience();
		eng.aeroDynamics();
		eng.bodyMass();
		
		
		System.out.println("*********");
//top casting it gives all methods of Physics class only as physics class does not have Parent class(extends any other class)

		Physics phy = new BMW();
		phy.aeroDynamics();
		phy.bodyMass();
	

		
		
	}

}
