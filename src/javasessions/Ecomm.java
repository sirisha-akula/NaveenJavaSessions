package javasessions;

//This class is related to MethodOverloading concept

public class Ecomm {
	//Meethod Overloading
	//when we have different methods:
	//1.within the same class
	//2.with same method name  
	//3.with different input param
	//4.with different sequence/order of param

	//poly(many) +morphism(forms)-->compile time polymorphism or static polymorphism
	public static int test() { //0
		System.out.println("test method");
		return 10;
	}
	
	
	public String test(int i) { //1
		System.out.println("test method" +i);
		return "Hello";
	}
	
	public void test(String i) { //1
		System.out.println("test method" +i);
	}
	
	public void test(int i, int j) { //2
		System.out.println("test method" +(i+j));
	}
	
//	public void test(int j, int i) { //2 this is a duplicate method and its not allowed
//		System.out.println("test method" +(i+j));
//	}
	public void test(int i, double j) { //2
		System.out.println("test method" +(i+j));
	}
	
	public void test(int i, String j) { //2
		System.out.println("test method" +(i+j));
	}
	
	public void test(String i, int j) { //2
		System.out.println("test method" +(i+j));
	}
	//login feature
	public void login() {
		
	}
	
	public void login(String un, String pwd) {
		
	}
    public void login(String un, String pwd, String role) {
		
	}
    
    public void login(String un, String pwd, long phonenum) {
		
   	}
    public void login(String socialmedia , int otp) {
		
   	}
    
    //search feature
    public void search() { //default search
    	
    }
    public void search(String prodName) { //default search
    	
    }
    public void search(String prodName, String color) { //default search
    	
    }
	
    public void search(String prodName, String color, int price) { //default search
    	
    }
    //payment feature:
    public void doPayment() {
    	
    }
    public void doPayment(String upi, int otp) {
    	
    }
  
    public void doPayment(String cc, String pwd) {
  	
    }
    public void doPayment(String paypal, String pwd, int otp) {
	  	
    }
    //Uber:
    public void booking() {
    	
    }
    public void booking(String cartype) {
    	
    }
    public void booking(String cartype, String pickup, String DropPoint) {
    	
    }
    
   public void booking(String cartype, String pickup, String DropPoint, int passengers) {
    	
    }
	public static void main(String[] args) {
       Ecomm obj = new Ecomm();
    	  int p =  obj.test();
          System.out.println(p);
	}
	
	public void main(int i) { //yes we can overload main method.
		
	}

}
