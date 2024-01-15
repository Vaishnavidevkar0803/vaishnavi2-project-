package selenium_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClickAction {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		//1 find the locator of the webelement & then store the value in a refernce variable & create a local variable of 
		//the reference variable 
		WebElement loginButton = driver.findElement(By.xpath("//button[@value='1']"));
		
		//2.create a object of Action class which will tale driver object asa parameter
		Actions act=new Actions(driver) ;
		
		//3.using one of the action class method perform a action
		System.out.println("========1st way to do action============");
//		act.moveToElement(loginButton).perform();
//		act.click().perform();
		
		System.out.println("=======2nd way to do action============");
		//act.click(loginButton).perform();
		
		System.out.println("=======3rd way to do action============");
		act.moveToElement(loginButton).click().build().perform();
		
		
		
	}
	}


