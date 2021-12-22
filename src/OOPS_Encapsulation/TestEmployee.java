package OOPS_Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setName("Balu");
		e1.setAge(34);
		e1.setSalary(20.56);
		e1.setInfo("Peter", 20, 98.98);
		
		System.out.println(e1.getInfo());
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		
		
	}

}
