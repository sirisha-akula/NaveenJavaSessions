package HashMapConcept;

import java.util.HashMap;

public class Product {

	public static void main(String[] args) {
		
		
		//Key-Value pair, Hashmap stores data in key-value pair, it also dynamic
		//HashMap is a class, we have to create the object of it.
		//<k,v> HashMap, is not order based collection

		HashMap<String, String> prodMap = new HashMap<String, String>();
		prodMap.put("name", "Macbook pro");
		prodMap.put("seller", "XYZ sales");
		prodMap.put("size", "Macbook pro 17 inches");
		prodMap.put("Model", "Macbook pro abc12model");
		prodMap.put("color", "Grey");
		
		//to reterive the value based on'Key'
		System.out.println(prodMap.get("name"));
		System.out.println(prodMap.get("seller"));
		System.out.println(prodMap.size()); //3 it gives size of hasmap
		
		System.out.println("*******");
		prodMap.forEach((a,b)-> System.out.println(a+":"+b));
		System.out.println("*******");
		
//o/p:		seller:XYZ sales
//		size:Macbook pro 17 inches
//		color:Grey
//		name:Macbook pro
//		Model:Macbook pro abc12model
		
		HashMap<Integer, String> stMap = new HashMap<Integer, String>();
		stMap.put(1, "Tom");
		stMap.put(2, "David");
		stMap.put(3, "Rahul");
		stMap.put(4, "Kat");
		
		//to reterive the value based on'Key'
		System.out.println(stMap.get(2));
		System.out.println(stMap.get(4));
		System.out.println(stMap.size()); //4 it gives size of hasmap
		
		//to iterate hasmap using Lambda expression
		stMap.forEach((k,v) -> System.out.println(k+":"+ v));

	}

}
