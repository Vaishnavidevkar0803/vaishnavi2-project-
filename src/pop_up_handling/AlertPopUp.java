package pop_up_handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		//how to handle alert pop up 
		//1.colorless only blacl & white colors are visible 
		//2.could be confirmation msg on the pop up 
		//3. cancel & ok buttons are only present 
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		//handle alert popup 
		Alert alt = driver.switchTo().alert();
		//we have switched the focus from main page to alert popup after switching focus u can take actions on the popup
		//otherwise it can't be inspected 
		Thread.sleep(1000);
		alt.accept();
		//exception -->unhandledAlertPopup
		//without handling alert popup if you continues to do the work then it will shows this exception 
		//so we have to handle alert popup 1st then only we can move ahead for next action 
		
		

	}

}
