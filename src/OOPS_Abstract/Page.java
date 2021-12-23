package OOPS_Abstract;

public  abstract class Page extends WebPage implements W3C{
	
	//0 to 100% abstraction
	//0% --> no abstract methods
	//100% --> only abstract methods
	//paritial abstracation
	//cannot create the object of the abstract class.
	//but i can create the object of abstract class.
	
	public Page() {
		System.out.println("Page default const....");
	}
	
	public Page(int i) {
		System.out.println("Page one param const...." +i);
	}
	
	public abstract void title();
	public abstract void url();
	
	public void doLogin(String un, String pwd) {
		System.out.println("page --login");
	}
	
	public static void logo() { //static and final methods cannot be overriden
		//here static methods are not part of object they belong to class and they are stored CMA "meta space"
		System.out.println("company logo");
	}
	
	public final void calculatePrice() { //static and final methods cannot be overriden
		//final method copy will be given to all objects of the class.its a non-static method, its part of Object.
		System.out.println("calculate the price");
	}
	
	@Override
	public void webLoading() {
		System.out.println("Page---webLoading");
	}
	
	@Override
	public final void ajaxHandling() {
		System.out.println(" page--javascriptload");		
	}

}
