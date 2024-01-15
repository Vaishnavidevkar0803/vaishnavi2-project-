package selenium_use;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1st_code {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		
			Thread.sleep(7000);
			
		
		driver.manage().window().minimize();
		
		Thread.sleep(7000);
		
		
		driver.close();
		
	}

}
