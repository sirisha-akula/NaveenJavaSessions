package BuilderPattern;

public class EcommTest {

	public static void main(String[] args) {
		EcommApp e1 = new EcommApp();
		
		//usecase1:	
		e1.login("arjun@gmail.com", "test123")
		.search("airpods")
		.search("nike shoe", 123)
		.addToCart("airpods")
		.addToCart("nike shoe")
		.doPayment("arjun@upi.com")
		.generateOrder()
		.sendEmail()
		.logout();
		
		
		
		//usecase2:	
		e1.login()
		.search("toys")
		.logout();
		
		//uc3:
		e1.login().logout();
		
		//usecase4:
		e1.login("admin@gmail.com" ,"admin123")
		.search("macbook pro")
		.addToCart("macbook pro")
		.search("APple pencil")
		.addToCart("macbook pro")
		.doPayment("creditcard", 232, 343)
		.sendEmail()
		.logout();
		
		//uc5:
		e1.logout();
	
	
	EcommApp e2 = new EcommApp();
	int id = e2.login("kittu@gmail.com","kittu123")
				.search("airpods")
					.search("nike shoe", 123)
						.addToCart("airpods")
							.addToCart("nike shoe")
								.doPayment("arjun@upi.com")
									.generateOrder()
										.sendEmail()
											.logout()
												.getorderId();
	System.out.println(id);
	

}
}