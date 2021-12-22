package BuilderPattern;

public class UberTest {
	/*
	 *  adv: using the same object reference variable u1 we can access all the methods of builder pattern 
	 */

	public static void main(String[] args) {

		
		UberApp u1 = new UberApp();
		u1.login("vishnu", "testV")
		.searchCab()
		.rideCompleted()
		.billGenerated(12345)
		.giveFeedback("Tom")
		.logout();
		
		u1.login("vishnu", "testV")
		.searchCab("mazda", 4)
		.searchCab("Winnipeg", "Toronto")
		.ride("winnipeg")
		.rideCompleted()
		.billGenerated(343434)
		.logout();
		
		int billNo = u1.login("vishnu", "testV")
		.searchCab("mini")
		.rideCompleted()
		.billGenerated(1233)
		.logout()
		.billGenerated();  //methods which are not participated in builder pattern should be added in the last.
		System.out.println("Bill no is : " + billNo);
		
		UberApp u2 = new UberApp();
		u2.login("arjun", "testA")
		.logout();

		
	}

}
