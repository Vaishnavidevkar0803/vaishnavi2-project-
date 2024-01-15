package selenium_use;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=FYOzVWrwLoE");
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println("title is"+title);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
}

}
