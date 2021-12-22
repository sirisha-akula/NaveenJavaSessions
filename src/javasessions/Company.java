package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
	//This class is related "method return".
	//Function/method can only return one thing at time.
	
	//WAF
	//name: getCompanyInfo
	//input param: compName(string)
	//return : name, Banglore, 1000,5.5, TOM--Object Array(method return Object[])
	public Object[] getComapnayInfo(String compName) {
		System.out.println("getting infor for company :"  +compName);
		Object info[] = new Object[5];
		
		if(compName.equals("IBM")) {
			info[0] = "IBM";
			info[1] = 1000;
			info[2] = 5.5;
			info[3] = "Banglore";
			info[4] = "TOM";
		}else if(compName.equals("Wipro")) {
			info[0] = "Wipro";
			info[1] = 500;
			info[2] = 10.3;
			info[3] = "Hyderbad";
			info[4] = "Siri";
		}
		else {
			System.out.println("comp name not found...." +compName);
		}
		return info;
	}
	
	//WAF
	//name:getProductList
	//input param: compName(String)
	//return: List of products
	public ArrayList<String> getProductList(String compName) {
		
		System.out.println("getting product list of company :"  +compName);
		ArrayList<String> prodList = new ArrayList<String>();
		
		switch (compName.toLowerCase()) {
		case "amazon":
			prodList.add("MacBook");
			prodList.add("Samsung");
			prodList.add("Airpods");	
			break;
		case "walmart":
			prodList.add("nike");
			prodList.add("reebok");
			prodList.add("adidas");	
			break;
		case "flipkart":
			prodList.add("zara");
			prodList.add("H&M");
			prodList.add("Bata");	
			break;

		default:
			System.out.println("comp name not found...." +compName);			
			break;
		}
		
		return prodList;
	}
	
	
	public static void main(String[] args) {
		Company obj = new Company();
	Object comp[]	= obj.getComapnayInfo("Wipro");
	System.out.println(Arrays.toString(comp));
    System.out.println("-----");
    
    for(int i = 0; i<=comp.length-1;i++) {
    	System.out.println(comp[i]);
    }
    System.out.println("-----");
    for(Object o : comp) {
    	System.out.println(o);
    }
    System.out.println("-----");
    Company obj1 = new Company();
	Object comp1[]	= obj.getComapnayInfo("ABCD");
	System.out.println(Arrays.toString(comp1));
	
	 System.out.println("-----");
	 Company obj2 = new Company();
	ArrayList<String> wmList =  obj2.getProductList("walmart");
	for(String s : wmList) {
		System.out.println(s);
	}
	System.out.println("-----");	 
	ArrayList<String> amzList =  obj2.getProductList("Amazon");
	System.out.println(amzList);
	
	System.out.println("-----");
	ArrayList<String> List =  obj2.getProductList("XYZ");
	System.out.println(List);
	

	System.out.println("-----");
	ArrayList<String> fkList =  obj2.getProductList("FLIPKART");
	System.out.println(fkList.size());
	
	for(int i = 0; i<=fkList.size()-1; i++) {
		System.out.println(fkList.get(i));
	}
	
	
}
}