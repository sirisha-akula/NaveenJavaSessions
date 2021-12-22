package Assignments;

import java.util.Arrays;

public class TestConstructor {

	public static void main(String[] args) {

		
		String[] array = {"Chrome","FireFox","Edge"};
		
		ConstructorAssignment ca = new ConstructorAssignment("Ravi", 123.45, array);
//		System.out.println(ca.getName());
//		System.out.println(ca.getVersion());
//		System.out.println(Arrays.toString(ca.getPlugin()));
		
		
		String[] array1 = {"MacOS","Windows","iOS"};
		ca.setName("Haari");
		ca.setVersion(456.87);
		ca.setPlugin(array1);
		
		System.out.println(ca.getName());
		System.out.println(ca.getVersion());
		System.out.println(Arrays.toString(ca.getPlugin()));
		
	}

}
