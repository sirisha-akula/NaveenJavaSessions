package oops_Interface;

public interface USMedical extends Medical {
	
	int min_fee = 10;
	//static and final
	
	//No method Body//only method declaration
	//only method prototype
	//only abstract method: means no method body
	//cannot create the object of Interfaces.
	//cannot have static abstract method

	public void physioServices();
	
	public void cardioServices();
	
	public void oncologyServices();

	
	public void emergencyServices();
	
	
	@Override //we can override the method from parent or grand parent interface, but it has no use as we are not giving method body
	public void vaccination();
	
	//after jdk 1.8
	//1.can have static method with method body;
	public static void billing() {
		System.out.println("USMedical -- billing");
	}
	
	//2. can have non-static default method:
	//default methods can be ovveriden in implemented class.
	default void optServices() {
		System.out.println("USMedical -- opt");
	}
	
		
}
