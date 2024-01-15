package selenium_use;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		Dimension defaultSize = driver.manage().window().getSize();
		Thread.sleep(1000);
		System.out.println(defaultSize);//(1050,708)=(width height)
		Dimension d= new Dimension(100, 708);
		driver.manage().window().setSize(d);
	}

}
