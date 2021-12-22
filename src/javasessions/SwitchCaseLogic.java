package javasessions;

public class SwitchCaseLogic {
	/*trime(): will remove corner spaces i.e., before space and after space.
	 * toLowerCase(); converts into lowercase
	 */

	public static void main(String[] args) {
     String browser = " CHR OME ";
     
     switch (browser.toLowerCase().trim().replace(" ", "")) {  //it will check the key:browser is safari, it directly goes to case: safari and print statments under it and then break comess out of switch case
	case "chrome":
		System.out.println("launch chrome");
		break;
		
	case "ff":
		System.out.println("launch ff");
		break;
		
	case "safari":
		System.out.println("launch safari");
		break;
		
	case "ie":
		System.out.println("launch ie");
		break;

	default:
		System.out.println("please enter valid browser");
		break;
	}

	
	int total = 70;
	switch (total) {
	case 100:
		System.out.println("A++");
		break;
		
	case 90:
		System.out.println("B++");
		break;
		
	case 80:
		System.out.println("c++");
		break;

	default:
		System.out.println("FAIL");
		break;
	}
	
	}		
	//switch case for partical uses cases:
	//user level - admin, manager, supervisior(permission level)
	//test env - QA, dev, Stage
	//cross browser logic
	//cross devices
	//cross cloud - MS Azure, AWS, Docker,local
    //localization - english, chinese, japense
}
