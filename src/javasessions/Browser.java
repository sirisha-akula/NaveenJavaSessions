package javasessions;

public class Browser {

	// launch browser
	// input parameter : name (string) FF/IE/CH
	// no return: void

	public boolean launchBrowser(String name) {
		System.out.println("broswer name is " + name);
		if (name.equalsIgnoreCase("chrome")) {
			System.out.println("launch chrome");
			return true;
		} else if (name.equalsIgnoreCase("firefox")) {
			System.out.println("launch firefox");
			return true;
		} else if (name.equalsIgnoreCase("safari")) {
			System.out.println("launch safari");
			return true;
		} else {
			System.out.println("please give correct browser");
			return false;
		}
	}
	
	public boolean launchBrSwitch(String name) {
		System.out.println("broswer entered is :" + name);
		boolean flag = false;
		switch (name	) {
		case "chrome":
			System.out.println("launch chrome");
			flag = true;
			break;
		case "firefox":
			System.out.println("launch firefox");
			flag = true;
			break;
		case "safari":
			System.out.println("launch safari");
			flag = true;
			break;
		default:
			System.out.println("please give correct browser");
			break;
			
		}
		return flag;

	}

	// main method will never return anything so by default its void
	public static void main(String[] args) {
		Browser br = new Browser();
//		if (br.launchBrowser("CHROME")) {
//			System.out.println("br is launched");
//		} else {
//			System.out.println("Tc is FAILED...");
//			}
		if(br.launchBrSwitch("abcd")) {
			System.out.println("br is launched");
		}else {
			System.out.println("Tc is FAILED...");
			}
	}

	
	
}
