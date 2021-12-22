package BuilderPattern;

//this is builder pattern
public class EcommApp {
	
	private int orderId;

	public EcommApp login() {
		System.out.println("login into app");
		return this; // here "this" refers to current class object "new EcommApp"
	}

	public EcommApp login(String un, String pwd) {
		System.out.println("login into app with un and pwd" + un + pwd);
		return this;
	}

	public EcommApp search(String productName) {
		System.out.println("searching the order with product name " + productName);
		return this;
	}

	public EcommApp search(String productName, int price) {
		System.out.println("searching the order with product name and price " + productName + price);
		return this;
	}

	public EcommApp clickOnProduct(String productName) {
		System.out.println("click on product " + productName);
		return this;
	}

	public EcommApp addToCart(String productName) {

		System.out.println("add to cart " + productName);
		return this;
	}

	public EcommApp doPayment(String cc, int cvv) {
		System.out.println("do payment with CC" + cc + cvv);
		return this;
	}

	public EcommApp doPayment(String cc, int cvv, int otp) {
		System.out.println("do payment with CC and OTP" + cc + cvv + otp);
		return this;
	}

	public EcommApp doPayment(String upi) {
		System.out.println("do payment with UPI" + upi);
		return this;
	}

	public EcommApp generateOrder() {
		System.out.println("generate order id" + 1234);
	    this.orderId = 12345;
		return this;
	}
  public int getorderId() {
	System.out.println("orderId : "+orderId);
	return this.orderId;
}
	public EcommApp sendEmail() {
		System.out.println("send order via email" + 1234);
		return this;
	}
	
	public EcommApp  logout() {
		System.out.println("log out");
		return this;
	}
}
