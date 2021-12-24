package ExceptionHandling;

public class TryCatchBlock {
	String name;

	// compile time: checked Exception
	// Run time: Unchecked Exception

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		TryCatchBlock obj = new TryCatchBlock();
		obj = null;

		try {
			obj.name = "Ravi";

		} catch (NullPointerException e) {
			System.out.println("NPE IS COMING......");
			e.printStackTrace();

		}
		try {
			int i = 9 / 0;
			int k[] = new int[2];
			k[4] = 34;

		} // Exception is super class of Arthemtic exception,AIOB,NPE,ClasscastException
			// etc...
//catch(Throwable e) { //(Exception e)
//	System.out.println("SOME EXCEPTION IS COMING......");
//	e.printStackTrace();
//}
		catch (ArithmeticException e) {
			System.out.println("ARTHMETIC IS COMING......");
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB IS COMING......");
			e.printStackTrace();

		}

		System.out.println("BYE");
		System.out.println("BYE");
		System.out.println("BYE");
		System.out.println("BYE");

	}

}
