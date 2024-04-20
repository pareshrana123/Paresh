import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSLocatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1. by using tag and class in css selector
//		WebElement username = driver.findElement(By.cssSelector("input.inputtext"));
//		
//		username.sendKeys("Paresh");
//		
//		//2. by using tag and id in css selector
//		WebElement password = driver.findElement(By.cssSelector("input#pass"));
//		
//		password.sendKeys("Paresh@123");
		
		//3.by using tag and attributes
		
//		WebElement username = driver.findElement(By.cssSelector("input[tabindex='1'][name='email']"));
//		username.sendKeys("Paresh");
//		
//		WebElement password = driver.findElement(By.cssSelector("input[id='pass']"));
//		password.sendKeys("Paresh@123");
//		
//		//4. by using the tag, class and attributes
//		WebElement login = driver.findElement(By.cssSelector("label.uiButtonConfirm[for='u_0_b']"));
//		login.click();
		
		
		//5. by using tag, id and attributes
		WebElement username = driver.findElement(By.cssSelector("input#email[type='text']"));
		username.sendKeys("Paresh");
		
		
		
		
		
		
		

	}

}
