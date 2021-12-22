package Assignments;

import java.util.List;

public class ConstructorAssign2 {
	
	private String name;
	private String HQ;
	private List<String> courses;
	
	
	public ConstructorAssign2(String name, String hQ) {
		this.name = name;
		this.HQ = hQ;
	}


	public ConstructorAssign2(String name, List<String> courses) {
		this.name = name;
		this.courses = courses;
	}


	public  ConstructorAssign2(String name, String HQ, List<String> courses) {
		this.name = name;
		this.HQ = HQ;
		this.courses = courses;
	}
	
	public String getInfo() {
		return name +" "+HQ+" "+courses;
	}
	

}
