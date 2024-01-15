package data_Provider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FbAccount_dataProvider {
  
@Test(dataProvider = "fbregression",dataProviderClass = DataProvider.class)
  public void fbtest(String firstname,String LastName,String Email) throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Create new account")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	  driver.findElement(By.name("firstname")).sendKeys(firstname);
	  driver.findElement(By.name("lastname")).sendKeys(LastName);
	  driver.findElement(By.name("reg_email__")).sendKeys(Email);
	  Thread.sleep(2400);
	  
  }
}
