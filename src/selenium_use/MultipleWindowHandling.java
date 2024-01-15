package selenium_use;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/ ");
		Thread.sleep(500);
		//we are clicking on multiple tabs to handle multiple windows 
		//1st click on fresher tab
		driver.findElement(By.xpath("//a[@title='Fresher']")).click();
		//2nd click on Banking & Finance 
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Banking & Finance']")).click();
		Thread.sleep(500);
		//3rd click on enginerring 
		//driver.findElement(By.xpath("//span[text()='Engineering']")).click();????
		Thread.sleep(1000);
		//ElementClickInterceptedException=when on the webpage we tried to click on some webelement at that time selenium
		//got interrupted by some popup at the same time 
		
		//to handle multiple windows use method allWindowsHandle
		Set<String> allWindowsId = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<>(allWindowsId);
		
        for(int i=0;i<al.size();i++)
		{
			Thread.sleep(1000);
			driver.switchTo().window(al.get(i));
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
			driver.close();
		}
        //faulty app got awork on another 

	}

}
