package Assignments;

public class TestEncapAssign {

	public static void main(String[] args) {

		
		EnacapAssign obj = new EnacapAssign();
		obj.setActive(true);
		obj.setName("Paul");
		obj.setSalary(12.87);
		obj.setGender('M');
		obj.setAge(120);
		
		System.out.println(obj.getEmplyeeInfo());
	}

}
