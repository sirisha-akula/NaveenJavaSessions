package ExceptionHandling;

public class FinallyInterviewQ {
	
	public static int getMarks(String name) {
			System.out.println("please enter student name :" + " " +name);
		int marks = 0;

		if (name.equals("Ram")) {
			try {
			marks = 90/2;
			//System.exit(1); //shut down JVM status code 0 or 1 it will shutdown jvm.
			return marks;
			}catch(ArithmeticException e) {
				System.out.println("AE is coming.....");
				return -2;
			}
			finally {
				System.out.println("student is failed...");
				return -3;
			}
		} else if (name.equals("Sunny")) {
			marks = 60;
		} else if (name.equals("Ravi")) {
			marks = 76;
		} else {
			System.out.println("please enter valid student name");
			return -1;
		}

		return marks;
	}
	
	
	
	

	public static void main(String[] args) {
		int m = getMarks("Ram");
		System.out.println(m);
	}

}
