import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select select = new Select(country);
		
		//1. select by value
		
		//select.selectByValue("ARGENTINA");
		
		//2. select by visible text
		
		//select.selectByVisibleText("INDIA");
		
		//3. select by index
		
		select.selectByIndex(4);
		
		
		
		
	}

}
