package ConstructorConcept;

import java.util.ArrayList;

public class Company {
	//constructor restrict the end user to create any unnecessary obects. Can only create Object with 
	String name;
	int empCount;
	ArrayList<String> catList;
	boolean isFunded;
	double sharePrice;
	
	public Company(String name) {
		this.name = name;
	}
	
	public Company(String name, int empCount) {
		this.name = name;
		this.empCount = empCount;
	}
	
	public Company(String name, int empCount, ArrayList<String> catList) {
		this.name = name;
		this.empCount = empCount;
		this.catList = catList;
	}
	
	public Company(String name, int empCount, ArrayList<String> catList, boolean isFunded, double sharePrice) {
		this.name = name;
		this.empCount = empCount;
		this.catList = catList;
		this.isFunded = isFunded;
		this.sharePrice = sharePrice;
	}

	
	public void getCompanyInfo() {
		System.out.println("getting company information");
		
	}
	
	public String getCompanyPlans() {
		System.out.println("getting company plans-2022");
		return "plans-2022";
	}

}
