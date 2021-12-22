package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
//1. while loop
		// 1 to 10
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++; // if we dont increment i , it will generate infinite loop.
			// i = i+1;
			// ++i
		}
//usecases: when we are not sure how many iterations we have to perform, then we use while loop.
		//page loading
		//coursel
		//webelement is coming on page after 5/10/25 secs
		//pagination: 1 2 3 4 5 .....100 pages
		//waiting for server to respond
		
		
//		//infinte loop: here condition is always true
//		while(true) {
//			System.out.println("Hello World");
//		}

		boolean flag = true;
		int num = 1;
		while (flag) {
			System.out.println("Hello World");
			num++;
			if (num == 5) {
				break;
			}

		}

		// 2. for loop
		
		for(int k = 1; k<=10; k++) {
			System.out.println(k);
		}
//		int k = 1;
//		for(; k<=10; k++) {
//			System.out.println(k);
//		}
//		int k1 = 1;
//		for(; k1<=10; ) {
//			System.out.println(k);
//			k1++;
//		}
		
		System.out.println("-------");
		//infinte loop
//		for(;;) {
//			System.out.println("Helloworld");
//		}
		
		System.out.println("-------");
		for(double d = 1.1; d<=10.5; d++) {
			System.out.println(d);
		}
		
		System.out.println("-------");//to print ascii values for a- z
		for(char c = 'a'; c<='z'; c++) {
			System.out.println(c + ":" + (int)c);
			System.out.println();
		}
		System.out.println("-------");//to print 1,3,5,7,9 odd numbers
		for(int odd = 1; odd<10; odd = odd+2) {
			System.out.println(odd);
			
			//num % 2 ==0 even
			//num % 2 ==0 odd
			
		}
		
		System.out.println("-------");
		for(int l = 1; l<=100; l++) {
			System.out.println(l);
			if(l%5 == 0) {
				System.out.println("Hi");
			}
		}
		//usecase: we have to use for loop when we know how many iterations we have to perform
		//1 to 10 : array/arraylist
		//month dropdown: jan to dec (1 to 12)
		//calendar days/date selection
		
		System.out.println("-------");
		
		//3. do-while loop
		
		int p = 1;
		do {
			p++;
			System.out.println(p); // 2 to 11
			
		}
		while(p<=10);
	}

}
