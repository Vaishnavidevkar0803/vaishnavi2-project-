package testNG_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_Testng {
  @Test
  public void f() 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Reporter.log("FB launching", true );
  }
  
}
