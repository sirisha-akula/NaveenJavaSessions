package javasessions;

public class StudentMethod {
//Method concept:
	//WAF
	//name: getStudentMarks
	//input param: name(String)
	//return : marks(int)
	
	public int getStudentMarks(String stname) {
		System.out.println("getting marks for student: " +stname);
		int marks = -1;
		if(stname.equals("Hari")) {
			marks= 90+5;
		}else if(stname.equals("swetha")) {
			marks= 94;
		}else if(stname.equals("priya")) {
			marks= 30;
		}else if(stname.equals("vishnu")) {
			marks= 40;
		}
		else {
			System.out.println("please give valid student name");
			
		}
        return marks;
	}
	
	public int getStudentMarksSwitch(String stname) {
		
		System.out.println("getting marks for student: " +stname);
		int marks = -1;
		switch (stname.toLowerCase()) {
		case "Hari":
			marks= 90+5;
            break;
		case "priya":
			marks= 40;
			break;
		case "somi":
			marks= 10;
			break;
		case "siri":
			marks= 100;
			break;
		default:
			System.out.println("please give valid student name");
			break;
		}
		return marks;
	}
	
	public static void main(String[] args) {
		StudentMethod obj = new StudentMethod();
		int m = obj.getStudentMarks("Hari");
		System.out.println(m+5-3);
		System.out.println("------");
		
		m = obj.getStudentMarks("abcd");
		System.out.println(m);
		if(m == -1) {
			System.out.println("dont generate the marksheet");
		}
		System.out.println("------");
		int marks = obj.getStudentMarksSwitch("xyz");
		System.out.println(marks);
		
		System.out.println("------");
	     marks = obj.getStudentMarksSwitch("siri");
		System.out.println(marks);
	}
	

}
