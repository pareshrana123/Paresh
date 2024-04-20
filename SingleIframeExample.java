import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleIframeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\AutomationPractical\\software\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();
		
		List<WebElement> noOfFrames = driver.findElements(By.tagName("iframe"));
		
		System.out.println("No of frames are "+ noOfFrames.size());
		
		//1. by index
		//driver.switchTo().frame(0);
		
		//2. by name
		//driver.switchTo().frame("SingleFrame");
		
		//3. by id
		//driver.switchTo().frame("singleframe");
		
		//4. by tagname
		WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		
		WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		text.sendKeys("Paresh");
		
		
		

	}

}
