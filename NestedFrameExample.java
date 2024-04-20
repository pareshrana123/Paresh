import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\AutomationPractical\\software\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		button.click();
		
		WebElement parentFrame = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		
		//switching on parent iframe
		driver.switchTo().frame(parentFrame);
		
		WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/h5"));
		System.out.println(text.getText());
		
		//switching on child iframe
		driver.switchTo().frame(0);
		
		WebElement un = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		un.sendKeys("Paresh");
		
		//to come out from iframe and redirect on main html page
		driver.switchTo().defaultContent();
		

	}

}
