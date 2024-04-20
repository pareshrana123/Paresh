import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
//		WebElement male = driver.findElement(By.xpath("//*[@value='Male']"));
//		male.click();
//		
//		boolean isSelected = male.isSelected();
//		
//		if(isSelected == true)
//		{
//			System.out.println("Radio button is selected");
//		}
//		else
//		{
//			System.out.println("Radio button is not selected");
//			male.click();
//			
//		}
		
		List<WebElement> radio = driver.findElements(By.xpath("//*[@type='radio']"));
		
		for(int i =0; i<radio.size(); i++)
		{
			String value = radio.get(i).getAttribute("value");
			if(value.equalsIgnoreCase("male"))
			{
				radio.get(i).click();
			}
		}

	}

}
