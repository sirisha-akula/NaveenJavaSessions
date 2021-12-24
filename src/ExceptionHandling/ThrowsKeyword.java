package ExceptionHandling;

public class ThrowsKeyword {
	
	//throws keyword is to bypass the exception from one method to other method.

	
	public void m1() throws ArithmeticException{
		m2();
	}
	
	public void m2() throws ArithmeticException{ 
		m3();
	}

	public void m3() throws ArithmeticException{
		int  i = 9/0;
	
}
	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();
		try{
			obj.m1();
		}catch(NullPointerException e){
			System.out.println("NPE is coming....");
		}
	}

}
