package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import selenium_use.selenium1st_code;

public class Fbdate {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//locator-->text
		//in link there should be text
		//for link its tagname should be a(anchor)
		
		//driver.findElement(By.linkText("Create new account")).click();
		
		//partial link text 
		driver.findElement(By.partialLinkText("Create new")).click();
		Thread.sleep(1000);
		//1.Identify list box to be handled and store it in reference variable
		//2.Create an object of Select class which will accept WebElement as argument
		//3.By using one of the select class methods we can select values form list box like 
		//       1. selectByVisibleText: selectByVisibleText(String arg0) 
		//       2. selectByIndex: selectByIndex(int arg0) 
		//       3. selectByValue: selectByValue(String args)
		//index never present u have to count manuallay

		WebElement date = driver.findElement(By.id("day"));
		Select sDay = new Select(date);
		 sDay.selectByVisibleText("30");
		 
		WebElement Month = driver.findElement(By.id("month"));
		Select sMonth=new Select(Month);
		sMonth.selectByValue("4");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select sYear= new Select(year);
		sYear.selectByIndex(22);
	
		
		
		
		
		
		
	}

}
