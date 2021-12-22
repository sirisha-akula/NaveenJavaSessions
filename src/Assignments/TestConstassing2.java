package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestConstassing2 {

	public static void main(String[] args) {

		
		ConstructorAssign2 obj = new ConstructorAssign2("JNTU", "Hyderbad");
		
		List<String> courses = Arrays.asList("B.tech", "PG", "Degree","MBA", "MCA");	
		ConstructorAssign2 obj1 = new ConstructorAssign2("JNTU", courses);
		
		List<String> newList = Arrays.asList("SSC", "Inter", "MBBS");
		ConstructorAssign2 obj2 = new ConstructorAssign2("JNTU", newList);

		
		System.out.println(obj2.getInfo());
		
		
		
	}

}
