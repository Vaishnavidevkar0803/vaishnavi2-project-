package selenium_use;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		//1st click on the create new ac 
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
		//find the locator of birthday month & store the value in refernce variable and create the local variable 
		WebElement birthdayMonth = driver.findElement(By.name("birthday_month"));
		
		
		Actions act=new Actions(driver);
		//keys=enum 
		//click on the birthmonth and 5 times arrowUp
		act.click(birthdayMonth).sendKeys(Keys.ARROW_UP).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);

			
		//2nd way to do that is by using for loop 
		
		act.click(birthdayMonth).perform();
		for(int i=0;i<=8;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(500);
		}
		act.sendKeys(Keys.ENTER);
		
	}

}
