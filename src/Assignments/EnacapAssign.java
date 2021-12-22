package Assignments;

public class EnacapAssign {
	
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	private char gender;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public boolean getIsActive() {
		return isActive;
	}	
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getEmplyeeInfo() {
		return name+" : "+age+" : "+salary+" : "+isActive+" : "+gender;
	}
	

	
	
	
	

}
