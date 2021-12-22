package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// Collection
		//ArrayList --default class
		//dynamic array
		
		//object of arraylist:
		ArrayList ar = new ArrayList();
		System.out.println(ar.size()); //0
		
		ar.add(100);  //0
		ar.add(200);  //1	
		System.out.println(ar.size()); //2
		
		ar.add("tom"); //2
		ar.add('M'); //3		
		System.out.println(ar.size()); //4
		
		//li = 0;
		//hi = 3
		//len/size = hi+1 = 4;
		
		ar.add(300);
		System.out.println(ar.size()); //5
		System.out.println(ar.get(0)); //100
		//System.out.println(ar.get(-1)); //Index out of Bound Exception--IOB
		//System.out.println(ar.get(5)); //Index out of Bound Exception--IOB, as size of array is 4, we get IOB when we try to get ar.get(5)
		//size(), get() methods always works on Physical capacity(PC).
		
		
		ArrayList ar1 = new ArrayList(20); //vc = 20
		ArrayList ar2 = new ArrayList(5); //vc = 5
		ar2.add(100); //0
		ar2.add(100); //1
		ar2.add(null); //2
		ar2.add(null); //3
		
		
		System.out.println(ar2.size());  //4
		System.out.println(ar2.get(1));
		System.out.println(ar2.get(2));
		System.out.println(ar2.get(3));
		ar2.add(2, 300);
		//ar2.add(9,1000); //IOB
		ar2.add(5,1000);
		System.out.println(ar2.get(4));
		//System.out.println(ar2.get(9));  //IOB
		System.out.println(ar2.get(5)); //1000		
		
		
		ar2.add(3,1100);
		System.out.println(ar2.get(3)); //1100
		
		ArrayList prod = new ArrayList();
		prod.add("A");
		prod.add("B");
		prod.add("C");
		prod.add("D");
		prod.add("E");
		System.out.println(prod.size());
		System.out.println(prod.get(3)); //D
		prod.remove(3);
		System.out.println(prod.size());
		System.out.println(prod.get(3)); //E
		
		
		//int arraylist
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		
		//double arraylist
		ArrayList<Double> sal = new ArrayList<Double>();
		sal.add(12.44);
		
		//String arraylist
		ArrayList<String> names = new ArrayList<String>();
		names.add("Arjun");	
		names.add("Kittu");
		names.add("Arjun");
		names.add("Arjun");
		System.out.println(names);
		
		System.out.println("-----");
		for(String s : names) {
			System.out.println(s);
		}
		//name, age, gender,sal, boolean
		//Object ArrayList
		
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("sirisha"); //0
		empData.add(30); //1
		empData.add('F'); //2
		empData.add(90000); //3
		empData.add(true); ///4
		
		//to print all values from AL
		for(int i =0; i<empData.size(); i++) {
			System.out.println(empData.get(i));
		}
		System.out.println("-----");
		//foreach
		for(Object e : empData) {
			System.out.println(e);
			if(e.equals('F')) {
				System.out.println("Female emp");
				//break;
			}
		}
		
		System.out.println("-----");
		System.out.println(empData);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
