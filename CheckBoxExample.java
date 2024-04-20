

import java.util.List;

import javax.xml.validation.Validator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
//		WebElement checkbox = driver.findElement(By.id("checkbox1"));
////		checkbox.click();
//		
//		//to check the checkbox or radio button is selected or not
//		if(checkbox.isSelected())
//		{
//			System.out.println("Checkbox is selected by default");
//		}
//		else
//		{
//			checkbox.click();
//		}
		
		//to select the all the checkbox
		List<WebElement> allCheckbox = driver.findElements(By.xpath("//*[@type='checkbox']"));
		
		int size = allCheckbox.size();
		
//		for(int i=0; i<size; i++)
//		{
//			allCheckbox.get(i).click();
//		}
		
		
		for(int i =0; i<size; i++)
		{
			String value = allCheckbox.get(i).getAttribute("value");
			if(value.equalsIgnoreCase("cricket"))
			{
				allCheckbox.get(i).click();
			}
			
		}
	
	}

}
