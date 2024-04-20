import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\AutomationPractical\\software\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");

		driver.manage().window().maximize();
		
		//this code is for column
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("No of coulmns are "+columns.size());
		
		int size = columns.size();
		for(int i=0;i<size;i++)
		{
			System.out.println("Column name is "+columns.get(i).getText());
		}
		
		//this code is for rows
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("No of rows are "+rows.size());
		
		int size1 = rows.size();
		for(int j= 0;j<size1;j++)
		{
			System.out.println("Row name is "+rows.get(j).getText());
		}
		
		WebElement cellData = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[2]/td[3]"));
		System.out.println("Cell data for 2nd row and 3rd column is "+cellData.getText());

	}

}
