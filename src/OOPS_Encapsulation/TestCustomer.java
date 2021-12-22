package OOPS_Encapsulation;

public class TestCustomer {

	public static void main(String[] args) {

		Customer c1 = new Customer("Ravi" , 45, "LA"); //POST
	
		System.out.println(c1.getName());//GET
		System.out.println(c1.getAge());
		System.out.println(c1.getCity()); //LA
		
		c1.setCity("Banglore"); //Update PUT/PATCH
		System.out.println(c1.getName());//GET
		System.out.println(c1.getAge());
		System.out.println(c1.getCity()); //Banglore
	}

}
