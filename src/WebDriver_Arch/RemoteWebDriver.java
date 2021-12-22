package WebDriver_Arch;

public class RemoteWebDriver implements WebDriver {

	@Override
	public void findElement() {
		System.out.println("Find Element");		
	}

	@Override
	public void findElements() {
		System.out.println("Find Elements");			
	}

	@Override
	public void get(String url) {
		System.out.println("enter url");			
	}

	@Override
	public String getTitle() {
		return "some Title";
	}

	@Override
	public String getUrl() {
		return "https://www.google.com";
	}

	@Override
	public void click() {
		System.out.println("click on element");			
	}

	@Override
	public void sendKeys(String username, String password) {
		System.out.println("enter value "+username);	
		System.out.println("enter value "+password);
	}

	@Override
	public void close() {
		System.out.println("close the browser");		
	}

}
