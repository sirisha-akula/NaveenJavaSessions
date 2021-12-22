package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
    ArrayList<String> empList = new ArrayList<String>();
    empList.add("chetan");
    empList.add("vishnu");
    empList.add("ramya");
    empList.add("arjun");
    
    System.out.println(empList);
    
    System.out.println("--------"); //it will sort on alphabetical order i.e., from a to z
    Collections.sort(empList);
    System.out.println(empList);
    
     System.out.println("--------");  //it will do reverse sort on alphabetical order i.e., from z to a
    Collections.sort(empList,Collections.reverseOrder());
   // System.out.println(empList);
    
  //  System.out.println("--------");
  
    ArrayList<String> stList = new ArrayList<String>();
    stList.add("kittu"); //0
    stList.add("udit"); //1
    stList.add("srihaan"); //2
    stList.add("rishi"); //3
    
    System.out.println(stList);
    
    //to print the stList in reverse order using index based for loop
    for(int i = stList.size()-1; i>=0; i-- ) {
    	System.out.println(stList.get(i));
    }
    //to print in reverse order using "Collections class: reverse() method.
    Collections.reverse(stList);
    
    ArrayList<String> trList = new ArrayList<String>();
    trList.add("murali"); //0
    trList.add("sonal"); //1
    trList.add("harika"); //2
    trList.add("pranitha"); //3
    
    trList.addAll(stList); // to add 2 arraylist
    System.out.println(trList);
    
    ArrayList<Integer> trnum = new ArrayList<Integer>();
    trnum.add(001); //0
    trnum.add(045); //1
    trnum.add(021); //2
    trnum.add(017); //3
    
    //trList.addAll(trnum); //you cannot add one string arraylist with other Integer arraylist.
   
    ArrayList<Integer> ar = new ArrayList<Integer>();
    List<Integer> num = Arrays.asList(1,2,3,5,6,7);
    System.out.println(num);
    
    List<String> names = Arrays.asList("Rob","Tom","David");
    System.out.println(names);
    
    //Static array
    int d[] = new int[3]; //using new keyword
    d[0] = 10;
    
    int a[] = {10,20,30,40}; //int literal array
    System.out.println(Arrays.toString(a));
   
    int aa[] = new int[] {10,20,30,40}; //literal array + new
    
String s1 = "hello"; //String literal
String s2 = new String("hello"); //String Object
    
	}

}
