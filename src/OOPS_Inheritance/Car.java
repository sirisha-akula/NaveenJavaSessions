package OOPS_Inheritance;

public class Car extends Vehicle{
	
	//final:
	//used to prvoide constant variable(local var)
	//used to prevent method overidding
	//used to prevent inheritance
	
	String name;
	static int wheels = 4;

	public static void price() {
		System.out.println("car--price");
	}
	
	public int start() {
		System.out.println("Car----Start");
		return 100;
	}
	
	public void stop() {
		System.out.println("Car----Stop");
	}
	
	
	public void refuel() {
		System.out.println("Car----Refuel");
	}
	
	
	
}
