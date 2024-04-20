import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts-stage.maersk.com/ocean-maeu/auth/login");
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.xpath("//*[@id='username']"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login-submit-button\"]"));
		un.click();
		un.sendKeys("Paresh");
		pass.click();
		pass.sendKeys("paresh123");
		login.click();

	}

}
