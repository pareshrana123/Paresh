import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
//		driver.get("https://demo.guru99.com/test/newtours/");
//		driver.manage().window().maximize();
//		
//		WebElement flights = driver.findElement(By.linkText("Flights"));
		
		Actions action = new Actions(driver);
		
//		//1. click and hold - it will click on the web element and hold that position
////		action.clickAndHold(flights).perform();
//////		//2. release - it will use to release the mouse
////		action.release().perform();
//		
//		//3. context click - it will use to right click of mouse at current location
//		action.contextClick(flights).perform();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
		WebElement checkbox = driver.findElement(By.id("persist_box"));
		//4. double click - it is used to double click on the element
		action.doubleClick(checkbox).perform();

	
	}

}
