import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1. using basic xpath syntax
		
//		WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
//		WebElement pass = driver.findElement(By.xpath("//*[@type='password']"));
//		//WebElement login = driver.findElement(By.xpath("//label[@id='loginbutton']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
		
		//2. using and condition syntax
//		WebElement un = driver.findElement(By.xpath("//input[@type='text' and @id='email']"));
//		WebElement pass = driver.findElement(By.xpath("//input[@name='pass' and @tabindex='2']"));
//		WebElement login = driver.findElement(By.xpath("//input[@type='submit' and @value='Log In']"));
		
		//3. using or condition syntax
//		WebElement un = driver.findElement(By.xpath("//input[@type='text' or @id='email']"));
//		WebElement pass = driver.findElement(By.xpath("//input[@name='pass' or @tabindex='2']"));
//		WebElement login = driver.findElement(By.xpath("//input[@type='submit' or @value='Log In']"))

		//4. using contains method syntax
//		WebElement un = driver.findElement(By.xpath("//input[contains(@name,'em')]"));
//		WebElement pass = driver.findElement(By.xpath("//input[contains(@type,'ord')]"));
//		WebElement login = driver.findElement(By.xpath("//*[contains(@id,'butt')]"));
//
//			un.sendKeys("Paresh");
//			pass.sendKeys("paresh123");
//			login.click();
		
		//5. Using text method syntax
//		WebElement project = driver.findElement(By.xpath("//*[text()='Agile Project']"));
//		project.click();
			
		
		//6. using starts-with method syntax
			WebElement un = driver.findElement(By.xpath("//*[starts-with(@name,'em')]"));
			WebElement pass = driver.findElement(By.xpath("//*[starts-with(@type,'pas')]"));
			WebElement login = driver.findElement(By.xpath("//*[starts-with(@value,'Log')]"));
			un.sendKeys("Paresh");
			pass.sendKeys("paresh123");
			login.click();

	}

}
