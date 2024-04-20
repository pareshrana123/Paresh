import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
//		WebElement username = driver.findElement(By.id("email"));
//		
		Actions action = new Actions(driver);
//		
//		//1. Keydown - it will press the key and does not release
//		action.keyDown(username, Keys.SHIFT).sendKeys("paresh");
//		action.perform();
//		action.keyDown(Keys.ENTER);
//		action.perform();
		
		//ways to refresh the webpage
		//driver.navigate().refresh();
		//driver.get(driver.getCurrentUrl());
		Thread.sleep(3000);
//		driver.navigate().to(driver.getCurrentUrl());
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(Keys.F5);
		
		
		
		
	}

}
