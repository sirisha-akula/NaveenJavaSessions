package javasessions;

public class StaticConcept {
	
	String name;
	int price;
	String color;
	static int wheels = 4;

	public static void start() {
		System.out.println("car -- start");
	}
	
      public void stop() {
    	  System.out.println("car -- stop");
	}
	public static void main(String[] args) {
		
		StaticConcept s1 = new StaticConcept();
			s1.name ="Audi";
			s1.price = 100;
			s1.color = "black";
			System.out.println(s1.name);
			System.out.println(s1.wheels); //static variables should always be accessed in static way.
			
			//how to access static variables:
			//1.access directly
			System.out.println(wheels);
			
			//2.access via class name
			System.out.println(StaticConcept.wheels);
			
			
			//how to access the static methods:
			//1. access directly
			start();
			s1.stop(); //Ns-Non static method can be accessed using Object
			
			//2.access via class name
			StaticConcept.start();
			
			StaticConcept s2 = new StaticConcept();
			s2.name ="BMW";
			s2.price = 70;
			s2.color = "Red";
			System.out.println(s2.name);
			System.out.println(wheels);
			
			StaticConcept s3 = new StaticConcept();
			s3.name ="Honda";
			s3.price = 70;
			s3.color = "Red";
			System.out.println(wheels);
			System.out.println(s3.name);
	}

}
