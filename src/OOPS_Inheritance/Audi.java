package OOPS_Inheritance;

public class Audi extends Car {
	
	public void theftSafety() {
		System.out.println("Audi---theftSafety");
	}
	
	public void autoGear() {
		System.out.println("Audi---theftSafety");
	}

	@Override
	public void stop() {
		System.out.println("Audi----Stop");
	}
}
