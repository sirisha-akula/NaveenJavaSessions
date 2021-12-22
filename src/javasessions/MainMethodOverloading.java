package javasessions;

public class MainMethodOverloading {
/*Yes, main method can be overloaded but at the run time JVM will look for "public static void main(String a[])" signature method
 * 
 */
				
	public static void main(String a[]) {
		System.out.println("main method...");
		System.out.println(main(10));
		main(3,4);
	}
	
	public static int main(int a) {
		System.out.println("main method..." + a);
		main(20,30);
		return 100;

	}
	
	public static void main(int a , int b) {
		System.out.println("main method..." +(a+b));
	}

}
