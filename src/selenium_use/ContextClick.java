package selenium_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException 
	{
		//context click=double click
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		//eg for right click
		//1st way 
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
//		
		Actions act=new Actions(driver);
//		act.moveToElement(rightClickButton).perform();
//		act.contextClick().perform();
		
		//2nd way 
	    //act.moveToElement(rightClickButton).contextClick().build().perform();
	    
	    //3rd way
		act.contextClick(rightClickButton).perform();
		
		System.out.println("=========Double Click============");
		WebElement DoubleClickButton = driver.findElement(By.xpath("//button[contains(text(),'Double-Click ')]"));
		Actions act1 =new Actions(driver);
		//1st way
//		act1.moveToElement(DoubleClickButton).perform();
//		act.doubleClick().perform();
		
		//2nd way
		//act1.moveToElement(DoubleClickButton).doubleClick().build().perform();
		
		//3rd way
		act1.doubleClick(DoubleClickButton).perform();
		
	}

}
