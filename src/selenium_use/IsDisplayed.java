package selenium_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
        Thread.sleep(1000);
		driver.findElement(By.id("show-textbox")).click();
		driver.findElement(By.id("hide-textbox")).click();
		//to see if its displayed or not we use is displayed method 
		//return type is boolean if the element is present it returns true or it shows exception 
		boolean result = driver.findElement(By.name("show-hide")).isDisplayed();
        System.out.println("status of displayed is "+result);
       // WARNING: Unable to find an exact match for CDP version 118, so returning the closest version found: 117
        //if the result is true
        Thread.sleep(1000);
        driver.findElement(By.id("show-textbox")).click();
        boolean result2 = driver.findElement(By.name("show-hide")).isDisplayed();
        System.out.println("status of displayed is "+result2);
	}

}
