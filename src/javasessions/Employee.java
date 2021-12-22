package javasessions;

public class Employee {

	String name;
	int age;
	double salary;
	
	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name ="varsha";
		e1.age = 23;
		e1.salary = 10.98;
		
		Employee e2 = new Employee();
		e2.name ="rohini";
		e2.age = 45;
		e2.salary = 12.23;
		
		Employee e3 = new Employee();
		e3.name ="seshi";
		e3.age = 30;
		e3.salary = 14.79;
		
		System.out.println(e1.name+ " "+e1.age+" "+e1.salary);
		System.out.println(e2.name+ " "+e2.age+" "+e2.salary);
		System.out.println(e3.name+ " "+e2.age+" "+e3.salary);
		System.out.println("-----");
		
		e1 = e2;
		
		System.out.println(e1.name+ " "+e1.age+" "+e1.salary);
		System.out.println(e2.name+ " "+e2.age+" "+e2.salary);
		System.out.println(e3.name+ " "+e2.age+" "+e3.salary);
		System.out.println("-----");
		
		e2 = e3;
		System.out.println(e1.name+ " "+e1.age+" "+e1.salary);
		System.out.println(e2.name+ " "+e2.age+" "+e2.salary);
		System.out.println(e3.name+ " "+e2.age+" "+e3.salary);
		System.out.println("-----");
		
		e2 = e3;
		System.out.println(e1.name+ " "+e1.age+" "+e1.salary);
		System.out.println(e2.name+ " "+e2.age+" "+e2.salary);
		System.out.println(e3.name+ " "+e2.age+" "+e3.salary);
		System.out.println("-----");
		
		e3 = e1;
		System.out.println(e1.name+ " "+e1.age+" "+e1.salary);
		System.out.println(e2.name+ " "+e2.age+" "+e2.salary);
		System.out.println(e3.name+ " "+e2.age+" "+e3.salary);
		System.out.println("-----");

		//creating object without any reference variable-->NO Object Reference"
//		new Employee().name ="Siri";
//		new Employee().salary = 12.98;
//		
//		new Employee();
		
		Employee e4 = new Employee();
		e4 = null;
		System.out.println(e4.name); //NPE null pointer exception as e4 is pointing to null
			
		System.gc(); //it will call garbage collector
		

	}

}
