package selenium_use;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Down {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.naukri.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;//casting
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,2700)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");
	}

}
