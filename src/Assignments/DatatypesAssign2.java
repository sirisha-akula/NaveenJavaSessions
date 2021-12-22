package Assignments;

public class DatatypesAssign2 {
/*4. Write a Java program to print the result of the following operations. Change your test data accordingly.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9 
c. 20 + -3*5 / 8 
d. 5 + 15 / 3 * 2 - 8 % 3 
Expected Output :
43 
1 
19 
13 */

    public static void main(String[] args) {
//		int a = -5,b = 8, c = 6;
//		System.out.println(a+b*c);
    	
//    	int a = 55, b = 9;
//    	System.out.println((a+b)%b);
    	
    	int a = 20, b= -3, c= 5, d= 8;
    	System.out.println(a+b*c/d);
    	
//    	int a = 5, b = 15 , c = 3, d = 2 , e = 8;
//    	System.out.println(a+b/c*d-e%c);
    	
/*5. Write a Java program to compute the specified expressions and print the output. Go to the editor
Test Data:((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
Expected Output: 2.138888888888889   */
    	
    	float a1 = 25.5f, b1 = 3.5f, c1 = 40.5f, d1 = 4.5f;
    	System.out.println((a1*b1-b1*b1)/(c1-d1));
    	
//6. String concatenation : Try to concat "Hello Selenium" with a character 't'.
    	String s = "Hello Selenium";
    	System.out.println(s+"t");
    	
 /*7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
"Your Toal amount is. 3700".*/ 
    	int a2 = 100, b2 = 200, c2 = 3400;
    	System.out.println("Your Total amount is. "+ (a2+b2+c2));
    	
/*8. What should be the output for :
byte b3 = 065; 
System.out.println(b3);*/

    	byte b3 = 065; //number starts with 0 is called octal number.
    	//065 = 065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53

    	System.out.println(b3);

    	
    	
    	
    	
	}

}
