package selenium_use;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingEg1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;//typecasting
		Thread.sleep(1000);
		 js.executeScript("window.scrollBy(0,1000)");
		 
		 //javascriptexception= happens a user script execution fails. 
		 //The reason for the execution failure is generally provided in the error message

	}

}
