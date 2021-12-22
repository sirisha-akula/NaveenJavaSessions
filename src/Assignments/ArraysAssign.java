package Assignments;

public class ArraysAssign {
	
 /*Question 1: Write a program to print the following pattern using for loop:


	                        00 01 02 03 04 05 06 07 08 09 
	                        10 11 12 13 14 15 16 17 18 19 
	                        20 21 22 23 24 25 26 27 28 29 
	                        30 31 32 33 34 35 36 37 38 39   */

	public static void main(String[] args) {
		
//		for(int i= 0; i<4; i++) {
//			for(int j=0; j<=9; j++) {
//				System.out.print(i+""+j+" ");
//			}
//			System.out.println();
//		}
		
/* Question 2: Write a program to create a static Array, having following cricket data:
--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
--Try to create multiple Object Arrays for different players 
--Try to print all the values of each player on the console using normal for/while loop and for each loop  */
Object data[] = new Object[7];
data[0]= "Sachin";
data[1]= 35;
data[2]= "India";
data[3]= "22/04/1985";
data[4]= 'M';
data[5]= 99.93;
data[6]= false;

Object data1[] = new Object[7];
data1[0]= "Dhoni";
data1[1]= 30;
data1[2]= "India";
data1[3]= "22/04/1989";
data1[4]= 'M';
data1[5]= 101.93;
data1[6]= true;

Object data2[] = new Object[7];
data2[0]= "Kholi";
data2[1]= 20;
data2[2]= "India";
data2[3]= "22/04/1999";
data2[4]= 'M';
data2[5]= 11.93;
data2[6]= true;

for(int i = 0; i<data.length;i++) {
	System.out.println(data[i]);
}

System.out.println("********");
for(Object o : data1) {
	System.out.println(o);
}

System.out.println("********");
int j = 0;
while(j<data2.length) {
	System.out.println(data2[j]);
	j++;
}
System.out.println("********");

/*Question 3: Try to print the following pattern on the console:
n = 4
n = 3
n = 2
n = 1
n = 0 */

//int n = 4;
//while(n>=0) {
//	System.out.println("n = "+n);
//	n--;
//}

int n[] = new int[5];
n[0] = 4;
n[1] = 3;
n[2] = 2;
n[3] = 1;
n[4] = 0;

for(int l = 0; l<=4;l++) {
	System.out.println("n = " +n[l]);
}

	}

}
