package selenium_use;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		Point defaultPosition = driver.manage().window().getPosition();
		System.out.println(defaultPosition);//(10 10)----(x y)
		Thread.sleep(2000);
		
		Point p=new Point(300, 300);//(+ +)
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		Point p1=new Point(150, -150);//(+ -)
		driver.manage().window().setPosition(p1);
		Thread.sleep(2000);
		
		Point p2=new Point(-200, -250);//(- -)
		driver.manage().window().setPosition(p2);
		Thread.sleep(2000);
		
		Point p3=new Point(-340, 100);//(- +)
		driver.manage().window().setPosition(p3);
		Thread.sleep(2000);
		
		
	}

}
