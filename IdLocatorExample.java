import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdLocatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//to find the element by using ID locators
		WebElement username = driver.findElement(By.id("email"));
		
		//WebElement interface method to send the value in text box
		username.sendKeys("Paresh");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Paresh123");
		
		WebElement login = driver.findElement(By.id("u_0_b"));
		login.click();
		
		


	}

}
