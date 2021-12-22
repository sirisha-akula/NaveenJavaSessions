package Assignments;

public class LoopAssign {

	public static void main(String[] args) {
//		int i = 1;
//		while(i<=5) {
//			System.out.println("I am SuperWomen");
//			i++;
//		}
		
//		int i = 1;
//		while(i<10) {
//			System.out.println("I am SuperWomen" +i);
//			i++;
//		}
		
//3. WAP to print 10 to 1 using for, while and do-while loop
		
		for(int i = 10; i>=1; i--) {
			System.out.println(i);
		}
		
		System.out.println("-----");
		int i = 10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		System.out.println("-----");
		int j = 10;
		do {
			System.out.println(j);
			j--;
			
		}while(j>=1);
		System.out.println("-----");
//4. Write a program in Java to print "Hello World" ten times using while loop
		
	int k = 1;
	while(k<=10) {
		System.out.println("Hello World");
		k++;
	}
//5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		
	}

}
