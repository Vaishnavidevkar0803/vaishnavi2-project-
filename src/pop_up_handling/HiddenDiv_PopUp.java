package pop_up_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDiv_PopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		// handle --> hidden divsion popup
		// how to identify -->
		// 1.multiple colors will be present in the popup
		// 2.different webelements are present in the popup
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("women jeans");
		//Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@type='submit'] ")).click();

	}

}
