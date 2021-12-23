package OOPS_Abstract;

public class LoginPageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.url();
		lp.doLogin("Arjun@gmail.com", "arjuntest");
		lp.forgotPwd();
		lp.calculatePrice();
	
		Page.logo(); //static method called using classname.
		
		lp.webLoading();//webloading coming from grandparent "Webpage" class
		lp.ajaxHandling();
		System.out.println("***********");
		
		//topcasting:we can do topcasting for abstract class(child class object is referred by parent class reference vairable);
		Page p = new LoginPage();
		p.title();
		p.url();
		p.doLogin("kitt", "kittu");
		p.calculatePrice();
		
		//downcasting: as we cannot create object of interface we cannot do downcasting.
		
	}

}
