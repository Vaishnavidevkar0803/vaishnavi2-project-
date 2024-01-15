package selenium_use;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		//read a header 
		List<WebElement> header = driver.findElements(By.xpath("//table[@class='dataTable']//tr/th"));
		for(WebElement firstrow:header)
		{
			System.out.print(firstrow.getText()+" ");
		}
		System.out.println();
		System.out.println("=================HEADER=================");
		
		//read rest of the table 
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr"));
		for(WebElement rows:allrows)
		{
			System.out.println(rows.getText()+" ");
		}
		System.out.println();
	}

}
