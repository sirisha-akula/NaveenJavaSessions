package OOPS_Inheritance;

/*Method Overriding: polymorphism --dynamic polymorphism or Runtime Polymorphism
 * when you have same method in parent class as well as in child class
 * with
 * 1.the same name
 * 2.same number of parameters
 * 3.same type of parameters
 * 4.same return type
 * 
 * private methods cannot be overriden
 * static methods cannot be overriden
 * 
 * Why inheritance is needed when we can access the methods of any class by creating the object of it?
 *Ans: code Reusaility, code is more readable. no need to create object unnecessarily
 */
public class BMW extends Car{
	
	@Override //this is overriden method
	public int start() {
		System.out.println("BMW----Start");
		return 500;
	}
	
	public void autoParking() { //individual method of BMW 
		System.out.println("BMW----AutoParking");

	}
	
	//method hiding: super class and sub class both have same static methods which is known as Method hiding.
	public static void price() {
		System.out.println("BMW--price");
	}

}
