package Assignments;
/**Example1:
Input: Array: [1,2,3,4,5,6,7,8] , sum: 3
Output: [1,2]

Example 2:
Input Array: [3,3,4,5,7,8] , sum: 11
Output: [3,8] , [7,4]
 *
 *
 */

public class test {

	public static void main(String[] args) {

		
		int ar[] = {1,2,3,4,5,6,7,8};
		int sum = 3;  //1,2
		int temp = ar[0]+ar[1];
		if(sum == temp) {
			System.out.println(ar[0]+" "+ar[1]);
		}
	
		
		
		int ar1[] = {3,3,4,5,7,8};
		int sum1 = 11;
		int count=0;
		for(int i = 0; i<ar1.length; i++) { //0/p  ; {3,8},{3,8},{7,4} if you want only{3,8},{7,4} then put i =1 instead of i =0
			for(int j = i; j<ar1.length; j++) {
				if(ar1[i] + ar1[j]==sum1) {
					System.out.println(ar1[i]+ " "+ar1[j]);
					
				}
			}
			
		
			
		}
		
		
	}

}
