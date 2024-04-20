import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		
		//1. to open the URL
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		//2. to refresh the page
		driver.navigate().refresh();
		
		//3. to redirect in one step back on page
		
		WebElement flight = driver.findElement(By.linkText("Flights"));
		flight.click();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		//4. to redirect in one step forward on page
		
		driver.navigate().forward();
		
		
		
		

	}

}
