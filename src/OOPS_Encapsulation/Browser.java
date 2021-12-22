package OOPS_Encapsulation;

/**
 * Encapsulation: HERE in these class some private methods are there and these methods can be accessed through a public method
 *
 */
public class Browser {  //through this public method we can access the other private methods.
	
	public void launchBrowser() {
		System.out.println("launch the browser");
		checkOSCompatablitiy();
		checkBrowseVersion();
		enoughRAM();
		isBrowserUpgraded();
	}
	
	private void checkOSCompatablitiy() { //private method
		System.out.println("checkOSCompatablitiy");
	}
	
	private void checkBrowseVersion() {//private method
		System.out.println("checkBrowseVersion");
	}
	
	private void enoughRAM() { //private method
		System.out.println("enoughRAM");
	}
	
	private void isBrowserUpgraded() { //private method
		System.out.println("idBrowserUpgraded");
	}

}
