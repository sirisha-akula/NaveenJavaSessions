package Assignments;

import java.util.ArrayList;

public class Practice {
//Method return: static array and dynamic array return practice:
	
	//WAF
	//Name
	//input parameters: String(studentName)
	//return Object[]{name,age, marks,grade}
	public static Object[] studentInfo(String studentName) {
		
		System.out.println("Student name is : " +studentName);
		
		Object stinfo[] = new Object[5];
		
		switch (studentName.toLowerCase()) {
		case "ram":
			stinfo[0] = "Ram";
			stinfo[1] =  19;
			stinfo[2] =  98.21f;
			stinfo[3] =  'M';
			stinfo[4] =  "B+";
		     break;

		case "pooja":
			stinfo[0] = "Pooja";
			stinfo[1] =  13;
			stinfo[2] =  89.19f;
			stinfo[3] =  'F';
			stinfo[4] =  "C+";
		     break;
		     
		case "balu":
			stinfo[0] = "Balu";
			stinfo[1] =  21;
			stinfo[2] =  99.19f;
			//stinfo[3] =  'M';
			//stinfo[4] =  "A+";
		     break;

		     
		default:
			System.out.println("Please enter valid student name");
			break;
		}
		
		return stinfo;
	}
	
		//WAF
		//Name
		//input parameters: String(menuType)
		//return ArrayList{item,price, availability}
	public static ArrayList<String> menuItems(String menuType) {
		System.out.println("Enter the menuType veg or non-veg: " +menuType);
		
		ArrayList<String> list = new ArrayList<String>();
		if(menuType.equalsIgnoreCase("Non-veg")) {
			list.add("Chicken Curry");
			list.add("$12.00");
			list.add("NO");

		}
		else if(menuType.equalsIgnoreCase("veg")) {
			list.add("Paneer Tikka");
			list.add("$29.00");
			list.add("YES");

			}	
		
		Object info[] = Practice.studentInfo("BALU"); //calling another static method "practice.studentInfo("balu")
		for(Object o : info) {
			System.out.println(o);
		}
		return list;
			
		}
	
	public static void main(String[] args) {
			
//	Object info[] = Practice.studentInfo("BALU");
//	for(Object o : info) {
//		System.out.println(o);
//	}
//	
	ArrayList<String> ar = Practice.menuItems("veg");
	System.out.println(ar);
	
	
	}

}
