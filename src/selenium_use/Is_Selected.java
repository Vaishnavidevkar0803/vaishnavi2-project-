package selenium_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(1000);
		WebElement femalegender = driver.findElement(By.xpath("//input[@value='1']"));
		boolean result = femalegender.isSelected();
		System.out.println("gender selection status is "+result);//-->false
		//result-->false we only checking whether it is selected or not 
		//haven't passed the command .select so result will be false 
		femalegender.click();
		boolean result2 = femalegender.isSelected();
		System.out.println("gender selection status is "+result2);//-->true
		//code optimization
		//Use Efficient Data Structures. ...
		//Avoid Creating Unnecessary Objects. ...
		//Use StringBuilder Instead of String Concatenation. ...
		//Use Static Methods and Variables. ...
		//Use Primitives Instead of Wrapper Classes. ...
		//Use Try−With−Resources. ...
		//Use the Final keyword. ...
		//Minimize Method Calls.
	}

}
