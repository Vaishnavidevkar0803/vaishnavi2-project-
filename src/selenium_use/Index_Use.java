package selenium_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Index_Use {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@data-type,'text')]")).sendKeys("vaishnavi");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//data-type[contains(@text,'u_2_d_')]")).sendKeys("devkar");
		//driver.close();
	}

}
