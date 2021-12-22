package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {

		String browser = "ie";

		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// SafariDriver driver = new SafariDriver();
		
		WebDriver driver = null;
		//cross browser logic
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Please enter the valid browser.....");
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
