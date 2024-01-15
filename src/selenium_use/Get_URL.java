package selenium_use;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_URL {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		String expectedresult = ("https://www.youtube.com/");
		String actualresult=driver.getCurrentUrl();
		if(expectedresult.equals(actualresult))
		{
			System.out.println("title is matching & test case is passed");
		}
		else
		{
			System.out.println("title is not matching & test case is failed");
		}
		

	}

}
