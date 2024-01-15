package selenium_use;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWhole_DynamicWebTable {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//find the xpath of the webtable ;
		 WebElement webtable = driver.findElement(By.xpath("//table[@name='BookTable']"));
		 System.out.println("==================================");
		 System.out.println(webtable.getText());
		System.out.println("====================================");
	}


	}


