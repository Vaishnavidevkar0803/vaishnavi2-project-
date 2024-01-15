package selenium_use;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanmicTable2nd_Way_ToRead {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		//rows
		int noOfRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		System.out.println(noOfRows);//27
		//columns
        int numOfColums = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();
		System.out.println(numOfColums);//5
		System.out.println("========================================================");
		
		//get the header with using for loop 
		
		for(int h=1;h<=numOfColums;h++)
		{
			String header = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/th["+h+"]")).getText();
			System.out.print(header+" ");
		}
		System.out.println();
		System.out.println("==============HEADER=================");
		//get the rest of the rows using nested for loop
		for(int i=1;i<=noOfRows;i++)//outer for loop for the rows
		{
			for (int j=1;j<=numOfColums;j++)//inner for loop for the colums
			{
				WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
				System.out.print(table.getText()+" ");
			}
			System.out.println();
		}
	}

}
