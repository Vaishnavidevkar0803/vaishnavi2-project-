package selenium_use;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_A_WholeDyanmicTable_2ndWay {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		//read a rows  
		 int numOfRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		//read a columns
		 int numOfColums = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size();
		 //use nested for loop to read the table 
		 for(int i=1;i<=numOfRows;i++)//outer loop--> for rows-->1 to 7 
		 {
			 for(int j=1;j<=numOfColums;j++)//inner for loop --> for colums --> 1 to 4
			 {
				 if(i==1)
				 {
					 WebElement header = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]"));
					 System.out.print(header.getText()+" ");
				 }
				 else
				 {
					 WebElement tabledata = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
					 System.out.print(tabledata.getText()+" ");
				 }
			 }
			 System.out.println();
		 }
		 
	}
}       //Invalid selector exception -->The most common cause of an InvalidSelectorException is a syntax error in CSS or XPath expressions. 
	    // This could be due to missing brackets or typos in the expression

        //The invalid selector error in WebDriver occurs when an element retrieval command is used with an unknown web element selector strategy. The available selector strategies are:
        //CSS, Link text, Partial link text, Tag name, XPath.

