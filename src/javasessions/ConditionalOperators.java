package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		byte b = 065;
		System.out.println(b); // number starts with 0 is called octal number.
		//065 = 065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53
		
		
		//whenever we have to do comparsion b/w to two primitive datatypes we have to use comparsion operatpor
		int x = 10;
		int y = 20;
		System.out.println(x==y);
		
		if(x==y) {  //in if condition we should always give boolean , here it checks(x==y) true or false
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		if(false) {
			System.out.println("HI");
		}else {
			System.out.println("Bye"); //here it is a dead code as we have given if(false, a hard coded value) else part wont be executed
		}
		
		boolean flag = true;
		if(flag) {
			System.out.println("selenium");
		}else {
			System.out.println("UFT");
		}
		
		
		String s1 = "Hello";
		String s2 = "Hello";
		if(s1.equals(s2)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("PASS123");
		}else {
			System.out.println("FAIL123");
		}
		
		if(s1 == s2) { // this is not recommended for strings we have use '.equals'
			System.out.println("PASS*");
		}else {
			System.out.println("FAIL*");
		}
		int total = 95;
		if(total <= 100) {
			if(total >=95) {
				System.out.println("A++");
			}else {
				System.out.println("Grade A");
			}
		}
		//
		String  browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		if(browser.equals("ff")) {
			System.out.println("launch ff");
		}
		if(browser.equals("ie")) {
			System.out.println("launch ie");
		}
		if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else {
			System.out.println("pleae enter valid browser");
		}
		
	}

}
