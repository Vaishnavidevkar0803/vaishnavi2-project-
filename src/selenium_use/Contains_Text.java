package selenium_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_Text {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//tagname[contains(text(),'text value')]
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),u_0_5_)]")).click();
		
		
		
	}

}
