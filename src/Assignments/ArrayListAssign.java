package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListAssign {

	public static void main(String args[]) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Red");
		ar.add("Blue");
		ar.add("Violet");
		ar.add("Yellow");
		
		System.out.println(ar);
		System.out.println("----");
		for(int i = 0; i<=ar.size()-1;i++) {
			System.out.println(ar.get(i));
		}
		
		/* 2. Write a Java program to insert
		 *  an element into the array list at the first and last positions.*/
		System.out.println("----");
		ar.add(0, "Pink");
		ar.add(ar.size(), "Green");
		System.out.println(ar);
		
		/* 3. Write a Java program to retrieve an element (at a specified index) from a given array list.*/
		System.out.println("----");
		System.out.println(ar.get(3));
		System.out.println(ar.get(5));
		
		//4. Write a Java program to update specific array element by given element.
		System.out.println("----");
		ar.set(3, "Black");
		ar.set(0, "White");
		System.out.println(ar);
		
		//5. Write a Java program to remove the third  element from a array list
		System.out.println("----");
		ar.remove(3);
		System.out.println(ar);
		
		//6. Write a Java program to search an element in a array list.
		System.out.println("----");
		if(ar.contains("Gold")) {
			System.out.println("element found");
		}else {
			System.out.println("element not found");
		}
		
		//7. Write a Java program to reverse elements in a array list
		System.out.println("----");
		System.out.println(ar);
		for(int i = ar.size()-1; i>=0; i--) {
			System.out.println(ar.get(i));
		}
		Collections.reverse(ar);
		System.out.println("----");
		
		//8. Write a Java program to extract a portion of a array list.
		List<String> newList = ar.subList(2, 4);
		System.out.println(newList);
		
		System.out.println("----");
		//convert static array to dynamic array
		//String players[] = new String[5];
		String players[] = {"Dhoni", "kholi", "Dravid", "pant", "jadeja"};
		
		List<String> playersList = Arrays.asList(players);
		System.out.println(playersList);
		//using for loop also we can extract a portion of arraylist
		for(int i = 3; i<=playersList.size()-1; i++) {
			System.out.println(playersList.get(i));
		}
		System.out.println("----");
		
		
		//9. Write Java program of swap two elements in an array list
		Collections.swap(playersList, 4, 0);
		System.out.println(playersList);
		
		//10. Write a java program to empty an arraylist
	   // playersList.remove("jadeja");
		//System.out.println(playersList);
       // playersList.removeAll(playersList);
		
		//11. Write a program to trim virtual capacity of arraylist
		
		System.out.println("----");
		//12. write a program to convert dynamic array to static array?
		List<Object> places = Arrays.asList("HYderabad",123, 12.67f, "Delhi", "Goa");
		Object o[] = places.toArray();
		for(Object pl: o) {
			System.out.println(pl);
		}
		
		
	}

}
