import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\AutomationPractical\\software\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//to maximize the window
//		Options op = driver.manage();
//		Window win = op.window();
//		win.maximize();
		driver.manage().window().maximize();
		
		
		//1. Simple alert which has only accept button
//		WebElement button = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
//		button.click();
//		// to switch from window to alert
////		driver.switchTo().alert();
//		//method to get the text of alert
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
//		//method to accept the alert
//		driver.switchTo().alert().accept();
		
		//2. alert which has ok and cancel button
//		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
//		button.click();
//		
//		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
//		button1.click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().dismiss();
		
		//3. alert which has text field and ok as well as cancel button
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		button.click();
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		button1.click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Paresh");
		driver.switchTo().alert().accept();


	}

}
