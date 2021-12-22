package WebDriver_Arch;

public class WalmartTest {

	public static void main(String[] args) {
		RemoteWebDriver  driver = null;
		String browser = "chrome";
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("please enter vlaid browser....");
			break;
		}
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("title of page is :" + title);

		String url = driver.getUrl();
		System.out.println("URL of page is :" + url);

		driver.findElement();

		driver.findElements();

		driver.sendKeys("Arjun@123.com", "Arjuntest123");

		driver.click();

		driver.close();
		
		}
  
	}


