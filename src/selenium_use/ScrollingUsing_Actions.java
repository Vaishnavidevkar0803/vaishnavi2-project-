package selenium_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUsing_Actions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		WebElement monday = driver.findElement(By.id("monday"));
		WebElement sunday = driver.findElement(By.id("sunday"));
		WebElement tuesday= driver.findElement(By.id("tuesday"));
		
		Actions act=new Actions(driver);
		
		act.scrollToElement(monday).perform();
		Thread.sleep(500);
		tuesday.click();
		Thread.sleep(500);
		sunday.click();
		monday.click();
		

	}

}
