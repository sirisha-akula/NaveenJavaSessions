package javasessions;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		//String is the collection of characters, it internally maintains the character array.
		
		String str = "Hello this is my Java code i am so happy";
		
		System.out.println(str.length());
		
		
		System.out.println(str.charAt(0)); //H
		System.out.println(str.charAt(25)); //e
		System.out.println(str.charAt(str.length()-1)); //e
		//System.out.println(str.charAt(26)); //StringIndexOutOfBoundsException
		
		System.out.println(str.indexOf('H'));
		System.out.println(str.indexOf('i')); //8 it gives first occurrence of i.
		System.out.println(str.indexOf('i', 9)); //11, second occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//11, second occurrence of i
	
		//to get 3rd occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1));
		
		System.out.println(str.indexOf("Java"));
		System.out.println(str.indexOf("World"));
		
		String msg ="Hello Arjun";
		if(msg.indexOf("Harika")>-1) {
			System.out.println("msg is correct");
		}else {
			System.out.println("msg is Incorrect");

		}
		
		//
		String test = "Welcome to Java";
		System.out.println(test.toLowerCase());
		System.out.println(test.toUpperCase());
		
		//String literals
		String s1 = "Hello World";
		String s2 = "Hello World";
		System.out.println((s1==s2)); //true
		
		String s3 = new String("Hello Java"); //2 objects are created, 1 in SCP and 1 in Heap memory
		String s4 = new String("Hello Java"); //1 object is crearted in Heap memory, as "Hello Java" is already there on SCP.
		//In SCP, it will not create the duplicate entries.
		
		String s5 = "Hello Java"; //0 object is created as "Hello Java" is already there on SCP.
		//In SCP, it will not create the duplicate entries.
		String s6 = "Hello World";//0 object is created
		
		System.out.println(s3==s5);//false here we are comparing two different references.
		System.out.println(s3.equals(s5));//true
		
		String s7 = "Hello Phython";//1 object created in string constant pool(SCP)
		s7 = "Hello JS";//1 object created in string constant pool(SCP)
		System.out.println(s7);
		
		s4 = null;
	//	System.out.println(s4.equals(s5));//NPE
		System.out.println(s5.equals(s4));//false

		
//		if(s4.equals(s5)) { //NPE
//			System.out.println("PASSSSSSSSS");
//		}else {
//			System.out.println("FAILLLLLLL");
//		}
//		
		
	if(s5.equals(s4)) { 
		System.out.println("PASSSSSSSSS");
	}else {
		System.out.println("FAILLLLLLL");
	}	

	//equals:
	String t1 = "hello world";
	String t2 = "hello World ";
	System.out.println(t1.equals(t2)); //false
	System.out.println(t1.equalsIgnoreCase(t2.trim())); //true
		
	//contains:
	System.out.println(t1.contains("hello")); //true
		
	//trim: it removes only the corner spaces or edge spaces.
	String top = "    hello  testing    ";
	//System.out.println(top.trim());
	System.out.println(top.replace(" ", ""));
		
	//replace
	String tt = "hello world";
	System.out.println(tt.replace(" ",""));
	System.out.println(tt.replace('h', 'H'));
		
   String dob ="17-04-2020";
   System.out.println(dob.replace('-', '/'));
   
   //split
   String lang = "JAVA_PHYTHON_JS_RUBY";
  String languages[]= lang.split("_");
 
  System.out.println(Arrays.toString(languages));
  
  for(String e: languages) {
	  System.out.println(e);
  }
		
  String pop = "xXtestingxxXSeleniumXxXQTPXXxXCypress";
  String p[] = pop.split("xX");
  System.out.println("-------");
  System.out.println(p[0]); //empty
  System.out.println("-------");
  System.out.println(p[1]);//testingx
  System.out.println(p[2]);//XSeleniumX
  System.out.println(p[3]);//QTPXX
  System.out.println(p[4]);//Cypress
 // System.out.println(p[5]);//AIOB
  
  String empData = "Sirisha;akula;Winnipeg;Canada;SDET1;MPI";
  String data[] = empData.split(";");
  for(String d : data) {
	  System.out.println(d);
  }
		
  //Reverse of String: 
  
  String st = "SeleniumAutomation";
 System.out.println("Given string is : " +st);
  char arr[] =st.toCharArray();
 int len = arr.length;
 String rev = "";
 
 for(int i =len-1; i>=0; i--) {
	// System.out.println(arr[i]);
	 rev = rev+arr[i];
 }
 System.out.println("Reverse of String is : " +rev);
		
		
		
		
		
		
		
		
		
	}

}
