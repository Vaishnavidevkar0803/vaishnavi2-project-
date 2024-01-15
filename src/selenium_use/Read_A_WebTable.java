package selenium_use;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_A_WebTable {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		//to find out the table go to the 1st header (1st column of the table ) above the header ull see the table 
		
		WebElement table = driver.findElement(By.name("BookTable"));
		
		//table contains 
		//tr(table row)
		//th(table header)-->heading 1st row 
		//td(test data )-->after 1st row rest table contains test data 
		
		//how to read the rows from the table ?????
		  List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		  int numOfRows = rows.size();
		  System.out.println("Total Rows in table are "+numOfRows);//7
		  
		  //how to read a colums (header)from a table 
		  
		 List<WebElement> header = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
	    int numOfColums = header.size();
	    System.out.println("Total no. of colums in table are "+numOfColums);//4
		

	}

}
