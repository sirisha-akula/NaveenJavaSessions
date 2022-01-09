package FinalizeMethod;

public class Employee {
	String name;
	

	public static void main(String[] args) {

		Employee e = new Employee();
		e = null;
		
		Company c = new Company();
		c = null;
		
		System.gc();
		
//		e.name="Tom"; //we get NPE as object is pointed to null
//		System.out.println(e.name);
		
		System.out.println("this is emp class....");
	
	}
	
	/*finalize() method is available in Object class, every class in java inbuilt/custom class by default virtually extends Object class
	that is y we are able to override the finalize method. Here Employee class has overridden finalize() method.
	finalize() is called with 'System.gc()'.If there are null value objects are there or objects without reference are there
	we use system.gc() to destory this objects.And before cleaning up this objects if you want to perform any action on these objects that
	can be done in finalize(), that y we need to override finalize method.
	without system.gc() method we cannot call finalize().*/
	
	/* In order to call finalize() method for the Company class, we need to override finalize method in company class also 
	 * just by creating company class object, without overriding finalize() in Company class we cannot call finalize().
	 * 
	 */
	
	
	
	@Override
	public void finalize() {  //This finalize method is overridden by Employee class
		System.out.println("inside finalize method....Emp class");
	}

}
