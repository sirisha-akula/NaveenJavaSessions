package javasessions;

public class IfElseLogic {

	public static void main(String[] args) {

		
		String  browser = "opera";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browser.equals("ff")) {
			System.out.println("launch ff");
		}
		else if(browser.equals("ie")) {
			System.out.println("launch ie");
		}
		else if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else {
			System.out.println("pleae enter valid browser");
		}
	}

}
