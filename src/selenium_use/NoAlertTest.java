package selenium_use;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoAlertTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		//NoAlertPresentException: no such alert
		//there was a notification and tried to handle it as a alert popup 
		//get this exception when there is no alert popup still without recongnizing the popup u tried to hanle it as a
		//alert popup

	}

}
