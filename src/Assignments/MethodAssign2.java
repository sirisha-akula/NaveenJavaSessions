package Assignments;

public class MethodAssign2 {
    //WAF
	//name: displayGrade
	//input params: int marks
	//return: void
	
	public void displayGrade(int marks) {
		if(marks>91 && marks<=100) {
			System.out.println("Grade is AA");
		}else if(marks>81 && marks<=90) {
			System.out.println("Grade is AB");
		}else if(marks>71 && marks<=80) {
			System.out.println("Grade is BB");
		}else if(marks>61 && marks<=70) {
			System.out.println("Grade is BC");
		}else if(marks>51 && marks<=60) {
			System.out.println("Grade is CD");
		}else if(marks>41 && marks<=50) {
			System.out.println("Grade is DD");
		}else 
			System.out.println("FAIL");
		
	}
	
	public static void main(String[] args) {
		MethodAssign2 obj = new MethodAssign2();
		
		obj.displayGrade(39);
		obj.displayGrade(100);
		obj.displayGrade(500);
		obj.displayGrade(50);
		
	}

}
