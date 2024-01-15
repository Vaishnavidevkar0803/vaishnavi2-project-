package coverFoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass 
{
  //launch url 
	//to launch the url driver must be a global variable so declared in class and out of the method 
	//make it protected if we dont make it as a protected the acess specifier by default will be default 
	//we cant call default out of package only way to call out of package by making it public or protected 
	//here we making it as protected as we're working on alive application so the details should be protected 
	//for some saftey reasons 
	static protected WebDriver driver;
	
	//launch browser
	public void launchBrowser() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		Reporter.log("launching the browser", true);
		Thread.sleep(2000);
	}
	//close browser
	public void closeBrowser() throws InterruptedException
	{
		Reporter.log("closing the browser", true);
		Thread.sleep(2000);
		driver.close();
	}
}
