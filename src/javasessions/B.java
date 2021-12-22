package javasessions;

public class B {
	//stack overflow error concept:
	public static void main(String[] args) {
		System.out.println("A---main");  // java.lang.StackOverflowError
		A.main(args);


	}

}
