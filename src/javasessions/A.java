package javasessions;

public class A {

	//stack overflow error concept:
	public static void main(String[] args) {
		System.out.println("A---main"); // java.lang.StackOverflowError
		B.main(args);
	}

}
