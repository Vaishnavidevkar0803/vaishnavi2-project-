package selenium_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Use {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//css=tagname#id
		driver.findElement(By.cssSelector("input#email")).sendKeys("vaish@123");
		//css=tagname.class
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a._8esh")).click();
		//css=tagname[attribute name=attribute value]
		Thread.sleep(4000);
		//driver.findElement(By.cssSelector("input[type=password]")).sendKeys("vaish@0803");//-->password is hidden 
		//ElementNotInteractableException 
		//is an exception thrown by Selenium WebDriver when an element is present in the DOM,
		//but it is not interactable, meaning that the user cannot perform any action on it, 
		//such as clicking or sending keys. This exception indicates that the element you are trying 
		//to interact with is either hidden, disabled, or in a state that prevents user interaction.
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type=email]")).sendKeys("77-9914852");
//		//css=tag.class[attribute=attri.value]
		driver.findElement(By.cssSelector("input.inputtext[type=password]")).sendKeys("1455fjj");

	}

}
