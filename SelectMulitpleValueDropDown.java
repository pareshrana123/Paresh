import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMulitpleValueDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\AutomationPractical\\software\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		Select select = new Select(driver.findElement(By.id("fruits")));
		
		//to check are we able to select the multiple value from dropdown
		
		if(select.isMultiple())
		{
			select.selectByIndex(0);
			select.selectByValue("apple");
			select.selectByVisibleText("Grape");
		}
		
		//to deselect the value from dropdown
//		select.deselectByIndex(0);
//		select.deselectByValue("apple");
//		select.deselectByVisibleText("Grape");
		
		select.deselectAll();

	}

}
