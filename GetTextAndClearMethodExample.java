import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextAndClearMethodExample {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Paresh");
		
		Thread.sleep(3000);
		//to delete the value from textbox
		username.clear();
		
		WebElement text = driver.findElement(By.tagName("h1"));
		
		//to get the value of displayed text on web page
		String value = text.getText();
		System.out.println(value);
		
		WebElement test = driver.findElement(By.className("html7magic"));
		System.out.println(test.getText());
	}

}
