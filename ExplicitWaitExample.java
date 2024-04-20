import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Paresh");
		
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.id("loginbutton"));
		
		
		//Created an object of webdriverwait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		//used Expected condition's class methods to check element is present or not
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass")));
		password.sendKeys("Paresh123");
		
		//used Expected condition's class methods to check element is clickable or not
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		
		
		wait.until(ExpectedConditions.visibilityOf(password));
		
	
	}

}
