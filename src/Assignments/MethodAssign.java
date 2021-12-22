package Assignments;

public class MethodAssign {
	
	//WAF
	//name: sum
	//input params: int a, int b
	//return: int
	public int sum(int a, int b) {
		return a+b;
		
	}

	//WAF
	//name: mul
	//input params:  int a, int b
	//return: int
	public int mul(int a, int b) {
		return a*b;
		
	}
	
	//WAF
	//name: area
	//input params: int radius
	//return: int
	public float area(int radius) {
		float pi = 3.14f;
		float area = pi * radius *radius;		
		return area;
		
	}
	
	public float circumference(int radius) {
		float pi = 3.14f;
		float cc = 2* pi * radius;
		return cc;
		
	}
	
	public void minNum(int a, int b, int c) {
		if(a<b && a<c) {
			System.out.println(a+ ": a is small number");
		}else if(b<c) {
			System.out.println(b+ ": b is small number");
		}else {
			System.out.println(c+ ": c is small number");
		}
	}
	
	public void maxNum(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println(a+ ": a is large number");
		}else if(b>c) {
			System.out.println(b+ ": b is large number");
		}else {
			System.out.println(c+ ": c is large number");
		}
	}
	
	public void chkEvenOdd(int num) {
		if(num % 2 == 0) {
			System.out.println(num + " Even Number");
		}else {
			System.out.println(num + " Odd Number");
		}
	}
	
	public void voteEligible(int num) {
		if(num >= 18) {
			System.out.println("Person is eligible to cast vote");
		}else {
			System.out.println("Person is not eligible to cast vote");
		}
	}
	
	public void isPrime(int num) {
		
			
	}
	
	public static void main(String[] args) {
		MethodAssign obj = new MethodAssign();
		int c = obj.sum(10, 20);
		System.out.println(c);
		
		int d = obj.mul(10, 20);
		System.out.println(d);
		
		float area = obj.area(2);
		System.out.println("area of Circle :" +area);
		
		float circum = obj.area(2);
		System.out.println("circumference of Circle :" +circum);
		
	     obj.minNum(0, -1, 67);
	     
	     obj.maxNum(190, 04, 67);
	     
	     obj.chkEvenOdd(6);
	     obj.chkEvenOdd(0);
	     obj.chkEvenOdd(15);
	     
	     obj.voteEligible(17);
	     obj.voteEligible(18);
			
	     
	     obj.isPrime(13);
			
		
		
		
	}

}
