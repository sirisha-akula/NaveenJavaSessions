package OOPS_Encapsulation;

public class LoginPageTest {

	public static void main(String[] args) {

		//user1 : Naveen
		LoginPage u1 = new LoginPage("Naveen" , "Test123");
		System.out.println(u1.getUsername());
		System.out.println(u1.getPassword());
		
		//user1 : Sirisha
				LoginPage u2 = new LoginPage("sirisha" , "Siritest123");
				System.out.println(u2.getUsername());
				System.out.println(u2.getPassword());
				
				u2.setPassword("Auto123");
				System.out.println(u2.getUsername());
				System.out.println(u2.getPassword());
				u2.doLogin(u2.getUsername(), u2.getPassword());
				
				LoginPage u3 = new LoginPage("sirisha" , "Siritest123");	
				u3.doLogin();
				
				Browser b1 = new Browser();
				b1.launchBrowser();
		
		
	}

}
