package selenium_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		////tagname[@attribute name = ‘attribute value’]
		//driver.findelement(By.Xpath("//input[@ attribute name = ‘attribute value’]
		driver.findElement(By.xpath("//select[@title='Search in']")).click();
		
	}
		

}
