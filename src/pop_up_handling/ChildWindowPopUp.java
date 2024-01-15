package pop_up_handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://skpatro.github.io/demo/links/");
	//getting text from main page by creating refernce variable 
	WebElement getMainPageText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
	System.out.println("main page text is "+getMainPageText.getText());
	
	//clicking on new window tab
	driver.findElement(By.name("NewWindow")).click();
	Thread.sleep(2000);
	//driver.close();// as the selenium focus is on the main page ...main page will be closed 
	//child window will remain as it is 
	//driver.quit();//as this method will close the webpage (all tabs)
	
	//to switch to child window we should know the id of the child window 
	String mainPageId = driver.getWindowHandle();
	System.out.println("main page id is "+mainPageId);
	//use get window hadles()method to get all window id 
	
	Set<String> allWindowId = driver.getWindowHandles();
	Iterator<String> it = allWindowId.iterator();
	String mainPageID = it.next();//get the id from main page
	String child1ID = it.next();//get the id from child window (browser)
	
	System.out.println("id of main page is "+mainPageID);//get the same id
	System.out.println("id of child window is "+child1ID );
	
	//switching selenium focus from main page to childwindow 
	driver.switchTo().window(child1ID);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.id("the7-search")).sendKeys("hello there");
	
	System.out.println(driver.findElement(By.xpath("//h1[text()='About me']")).getText());
	Thread.sleep(1000);
	// again to work on main page--> we need to switch focus from child window to main page
	driver.switchTo().window(mainPageID);//if we use mainpageId then it will get session not created exception
	Thread.sleep(1000);
	String mainPageText = driver.findElement(By.xpath("//p[contains(text(),'new browser window')] ")).getText();
	System.out.println("main page text is "+mainPageText);
	}

}
