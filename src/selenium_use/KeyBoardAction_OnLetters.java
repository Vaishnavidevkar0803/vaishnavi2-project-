package selenium_use;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction_OnLetters {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		
		Actions act=new Actions(driver);
		//act.click(email).sendKeys(email, "Vaishnavi@2112").build().perform();
		
		//keysdown used for to press so here press the shift key
		act.keyDown(email,Keys.SHIFT).sendKeys("vaiHNAVI").build().perform();
	}

}
