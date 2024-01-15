package selenium_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		//to drag & drop 1st we have click & hold the webelement & then relese to the targetted area 
		//refresh the page everytime to do drag n drop 
		WebElement dragButton = driver.findElement(By.id("draggable"));
		WebElement dropButton = driver.findElement(By.id("droppable"));
		
		//1st way
		Actions act=new Actions(driver);
		//act.moveToElement(dragButton).clickAndHold(dragButton).release(dropButton).build().perform();
		
		//2nd way
		//act.clickAndHold(dragButton).release(dropButton).build().perform();
		
		//3rd way 
		act.dragAndDrop(dragButton, dropButton).perform();
	}

}
