package ConstructorConcept;

import java.util.ArrayList;

public class TestCompany {

	public static void main(String[] args) {
		
		Company c1 =  new Company("IBM");
		System.out.println(c1.name);
		System.out.println(c1.empCount);
		System.out.println(c1.catList);
		
		Company c2 =  new Company("Amazon",10000);
		System.out.println(c2.name);
		System.out.println(c2.empCount);
		System.out.println(c2.sharePrice);
		
		
		ArrayList<String> wmList = new ArrayList<String>();
		wmList.add("Fashion");
		wmList.add("Sports");
		wmList.add("electronics");
		Company c3 =  new Company("WM",20000, wmList, true, 20.89);
		
		System.out.println(c3.name);
		System.out.println(c3.sharePrice);
		System.out.println(c3.empCount);
		System.out.println(c3.catList);
		
		c3.getCompanyInfo();
		c3.getCompanyPlans();
		
	}

}
