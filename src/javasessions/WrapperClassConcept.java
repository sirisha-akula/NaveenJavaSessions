package javasessions;

public class WrapperClassConcept {

	public static void main(String[] args) {

		
		String x = "100";
		System.out.println(x+20);
		
	int i = Integer.parseInt(x);
	System.out.println(i+20);
	
	String y = "100A";
//	int k = Integer.parseInt(y);//NumberFormatException
	String str = y.substring(0,3);
	System.out.println(str);
	String y1= y.replace("A", "");
	int k = Integer.parseInt(y1);
	System.out.println(k*40);
	
	//String to double
	String total = "120.33";
	double d  = Double.parseDouble(total);
	System.out.println(d+10.33);
	
	//String to boolean
	String b = "true";
	boolean flag = Boolean.parseBoolean(b);
	if(flag) {
		System.out.println("run the test case");
	}
		
	
	//int to String
	int bal = 500;
	String s= String.valueOf(bal); //"500"
	System.out.println(s+10);
	
	
	String msg = "your order id is 12345";
	//substring: getting smaller string from large string
	String OrderId = msg.substring(msg.indexOf("is")+3);
	System.out.println(OrderId);
	
	String m1 = msg.substring(1, 11).trim();
	System.out.println(m1);
	
	String st = WrapperClassConcept.getOrderId("your order id is 341890");
	System.out.println("Order id of given message : " +st);

	}
	
	//WAF
	//name: getOrderId
	//input parameters(String mesg)
	//return type: String
	public static String getOrderId(String mesg) {
		String OrderId = mesg.substring(mesg.indexOf("is")+3);
		return OrderId;
		
	}

}
