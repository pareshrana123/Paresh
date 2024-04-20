import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\AutomationPractical\\software\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.manage().window().maximize();
		
		//it will return the unique session id 
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		button.click();
		
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button"));
		button1.click();
		
		//to store the all the opened window after clicking on button
		Set<String> childWindow = driver.getWindowHandles();
		Iterator<String> i = childWindow.iterator();
		while(i.hasNext())
		{
			String childwindow1 = i.next();
			System.out.println(childwindow1);
			if(!parentWindow.equalsIgnoreCase(childwindow1))
			{
				driver.switchTo().window(childwindow1);
				WebElement download = driver.findElement(By.linkText("Downloads"));
				download.click();
				Thread.sleep(1000);
				driver.close();
			}
			
			
		}
		driver.switchTo().window(parentWindow);

	}

}
