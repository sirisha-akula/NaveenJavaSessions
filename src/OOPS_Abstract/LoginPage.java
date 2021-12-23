package OOPS_Abstract;

public class LoginPage extends Page{
	
	public LoginPage() {
		System.out.println("LoginPage default const....");
	}
	
	public LoginPage(int i) {
		System.out.println("LoginPage one param const...."+i);
	}

	@Override
	public void title() {
		System.out.println("login page Title");		
	}

	@Override
	public void url() {
		System.out.println("login page URL");		
		
	}
	
	@Override
	public void doLogin(String un, String pwd) {
		System.out.println("Login Page--" +un + " : " +pwd);
	}
	
	public void forgotPwd() {
		System.out.println("LoginPage--forgot password link");
	}


	@Override
	public void webLoading() {
		System.out.println("LoginPage---webLoading");
	}

	
}
