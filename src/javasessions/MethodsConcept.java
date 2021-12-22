package javasessions;

public class MethodsConcept {
    //methods:class data member
	//method should be independent it means parallel to each other
	//method cannot be created inside a method
	//cannot create duplicate methods - but i can overload
	//method name should start with small letter
	
	//1.no input and no return:
	//void : can not return anything
	public void testFeature() {
		System.out.println("test method...");
	}
	
	//2.no input and some return
	public int getNumber() {
		System.out.println("get number method...");
	    return 100;
	}
	
	public String getTrainerName() {
		System.out.println("get trainer name...");
		String trainer = "Naveen";
		return trainer;
	}
	
	public boolean isForgotPwdLink() {
		System.out.println("check for forgot pwd link");
		return true;
	}
	
	//3.some input and some return
	public int add(int a , int b) { //function parameters/method parameters
		System.out.println("sum of two numbers...");
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		
		MethodsConcept obj = new MethodsConcept();
		obj.testFeature();
		
		System.out.println(obj.getNumber());
		
		String name = obj.getTrainerName();
		System.out.println(name+ " sir ");
		
		boolean flag = obj.isForgotPwdLink(); //flag is called holding variable as it holds the value given by method.
		if(flag) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		int sum = obj.add(10,20);  //arguments
		System.out.println(sum*8);
		
		sum =obj.add(30, 40);
		System.out.println(sum+90);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
