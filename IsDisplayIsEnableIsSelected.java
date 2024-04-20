import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayIsEnableIsSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		
		//to validate that element is visible and enable
		if(username.isDisplayed() && username.isEnabled())
		{
			username.sendKeys("Paresh");
		}
		
		WebElement password = driver.findElement(By.id("pass"));
		
		//to validate that element is visible and enable
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("Paresh");
		}
		
		WebElement checkbox = driver.findElement(By.id("persist_box"));
		
		if(checkbox.isSelected())
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			checkbox.click();
		}
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		if(login.isDisplayed() && login.isEnabled())
		{
			login.click();
		}
		
	}

}
