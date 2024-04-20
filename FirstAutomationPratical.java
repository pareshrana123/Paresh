import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstAutomationPratical {

	public static void main(String[] args) {
		
		// To set the path for chrome driver
		//System.setProperty("webdriver.chrome.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\chromedriver.exe");
		
		//To set the path for firefox driver
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		//To create an object for firefox driver by using webdriver interface
		WebDriver driver = new FirefoxDriver();
	
		
		//1. To open the URL
		driver.get("https://www.amazon.in/");
		
		
		//2. to get the current open URL title
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		
		//3. to get the current open URL
		String url = driver.getCurrentUrl();
		System.out.println("The cureent opened url is "+url);
		
		//4. to get the source code of open URL
		String code = driver.getPageSource();
		System.out.println(code);
		
		//5.To close The URL
		driver.close();
		
		
	}

}
