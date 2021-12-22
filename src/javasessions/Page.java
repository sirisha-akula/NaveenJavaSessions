package javasessions;
/*Static and Non static Methods concept
 * No need to create an object to call NS methods from another NS Methods.
 * whenever we are calling NS method from Static method we have to create the Object.
 * And we call Static method from NS method, we can directly call using classname.
 */
public class Page {

	public void m1() {  //non static methods
		System.out.println("NS method m1");
		m2();
	}

	public void m2() {  //non static methods
		System.out.println("NS method m2");
		m3();
	}

	public void m3() {  //non static methods
		System.out.println("NS method m3");
		t2();
	}
	
	public static void t1() {  //static methods
		System.out.println("static method t1");
		t2();
		Page p2 = new Page();
		p2.m1();
	}
	
	public static void t2() {  //static methods
		System.out.println("static method t2");
		t3();
	}
	
	public static void t3() {  //static methods
		System.out.println("static method t3");
	}

	public static void main(String[] args) {
        Page p1 = new Page();
        p1.m1();
        Page.t1();
       
	}

}
