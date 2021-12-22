package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
//arrays: used to store multiple similar type of data/values
//limitations: 
//1. size is static/fixed: to overcome this problem we need to use dynamic array
//2. stores only similar type of data, to overcome this problem we use object static array.
		
		
		//1. int array
		//int []a1 = new int[4];

		int a[] = new int[4];
		//li = 0;
		//length/size of array : 4
		//hi = length-1 :4-1=3
		//len; hi+1 : 3+1 =4
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		//a[4] = 40;-->AIOB	
	
		System.out.println(a[2]); //30
		System.out.println(a[3]); //40
//		System.out.println(a[4]); //ArrayIndexOutOfBoundException -->AIOB
//		System.out.println(a[-1]);//AIOB
		
		System.out.println(a[0]+a[1]); //30
		System.out.println("-------");
		
		//to print all the values of array : Index based for loop
		for(int i = 0; i<4; i++) {
			System.out.println(a[i]);
		}
		System.out.println("-------");
		
		System.out.println(a.length);
		int len = a.length;
		
		System.out.println("-------");
		for(int i = 0; i<=len-1; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("-------");
		//for each loop :enhanced loop
		for(int e : a) {
			System.out.println(e);
		}
		
		System.out.println("-------");
		System.out.println(a);  //a is name of array so it gives memory hashcode
		
		System.out.println(Arrays.toString(a));
	
		//2. double array
		double d[] = new double[2];
		d[0] = 10.87;
		d[1] = 12.11;
		

		System.out.println("-------");
		
		for(double e : d) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(d)); // .toString() method gives string representation of array
		
		for(int i = 0; i<=d.length-1; i++) {
			System.out.println(d[i]);
		}
		

		System.out.println("-------");
		//3. char array
		char c[] = new char[2];
		c[0] = '1'; //ascii 1 :49
		c[1] = 'a'; //ascii a: 97
		System.out.println(c[0]+c[1]);
		
		System.out.println("-------");
		//3. String array
		
		String emp[] = new String[3];
		emp[0] ="Arjun";
		emp[1] ="kittu";
		emp[2] ="harika";
		
		for(String e: emp) {
			System.out.println(e);
		}	
		System.out.println(Arrays.toString(emp));
		
		System.out.println("-------");
		//5. Object array is a Class in java, which is super class of all the classes.
		Object st[] = new Object[6];
		st[0] ="Arjun";
		st[1] = 2;
		st[2] = 'M';
		st[3] = 90.95;
		st[4] = true;
		System.out.println(st[5]); //default values of Object : null
		
		for(Object e : st) {
			System.out.println(e);
		}
		System.out.println(Arrays.toString(st));
		System.out.println("-------");
		for(int k = 0; k<=st.length-1;k++) {
			System.out.println(st[k]);
		}
		
		//default values:
		//int : 0
		//double : 0.0
		//boolean : true
		//char : space
		//string : null
		//Object : null
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
