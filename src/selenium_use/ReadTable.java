package selenium_use;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTable {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//how to read only 1 header (single column name)
		String headerName = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th[2]")).getText();
		System.out.println("the header name is "+headerName);
		
		//how to read whole row of header 
		//to read whole row we have to perform iteration operation
		//for each loop to get all texts (data)
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println("========header===========");
		for(WebElement r:row1)
		{
			System.out.print(r.getText()+" ");
		}
		System.out.println();
		
		//get the single data from table
		System.out.println("===========Single TestData==========================");
		String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td[2]")).getText();
		System.out.println("from the row num 5 & column num 2 testdata is "+data);
		
		//read the complete row from the table 
		System.out.println("=============Read the whole Row=====================");
		List<WebElement> wholeRow = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[3]/td"));
		for(WebElement row:wholeRow)
		{
			System.out.print(row.getText()+" ");
		}
		System.out.println();
		
		//how to read the single column from the table 
		System.out.println("============read column=============");
		
		for(int i=2;i<=7;i++)
		{
		 WebElement wholeColumn = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[4]"));
		System.out.println(wholeColumn.getText()+" ");
		}
		System.out.println();
	}

}
