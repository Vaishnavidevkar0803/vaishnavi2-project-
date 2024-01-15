package selenium_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Xpath {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//tagname [text()='textvalue']
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();

		
	}

}

