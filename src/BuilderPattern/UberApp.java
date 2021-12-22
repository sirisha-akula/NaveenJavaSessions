package BuilderPattern;
/*
 * Builder pattern: means every method in class should return the current class object. This is kind of workflow application 
 * it creates the chain of actions.	
 * the method which does not return current class object will not participate in builder pattern.
 * adv: using the same object reference variable e1 we can access all the methods of builder pattern 
 */

public class UberApp {

	private int invoicenumber;

	public UberApp login(String username, String password) {
		System.out.println("user logged into Uber APP" + username + password);
		return this;
	}

	public UberApp searchCab() {
		System.out.println("user search for the cab");
		return this;
	}

	public UberApp searchCab(String pickuppoint, String droppoint) {
		System.out.println("user is search for the cab from " + pickuppoint + droppoint);
		return this;
	}

	public UberApp searchCab(String CarType, int passengers) {
		System.out.println("user is search for the cab " + CarType + passengers);
		return this;
	}

	public UberApp searchCab(String CarType) {
		System.out.println("user is search for the mini cab " + CarType);
		return this;
	}

	public UberApp ride(String pickupPoint) {
		System.out.println("user ride is started from " +pickupPoint);
		return this;
	}
	
	public UberApp rideCompleted() {
		System.out.println("user ride is completed");
		return this;
	}

	public UberApp doPayment(int Cash) {
		System.out.println("user doing payment via cash " + Cash);
		return this;
	}


	public UberApp doPayment(String cc, int otp) {
		System.out.println("user doing payment via creditcard " + cc + otp);
		return this;
	}

	public UberApp billGenerated(int invoicenumber) {
		System.out.println("user bill is generated " + invoicenumber);
		this.invoicenumber = invoicenumber;
		return this;
	}
	
	//This method does not return current class object, so this does not participate in Builder Pattern.
	public int billGenerated() {  
		System.out.println("user bill is generated " +invoicenumber);
		return this.invoicenumber;
	}

	public UberApp giveFeedback(String driver) {
		System.out.println("user gave the feedback for driver " + driver);
		return this;

	}

	public UberApp logout() {
		System.out.println("user logged out of Uber App");
		return this;
	}

}
