package coverFox_Study;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutomateCoverFox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		HomePage h1=new HomePage(driver);
		h1.getStartedButtonClick();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		HomePage2 h2=new HomePage2(driver);
		h2.selectPerson();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		HomePage3 h3=new HomePage3(driver);
		h3.selectAge();
		
		//h3.selectAge2("24");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		h3.clickNextButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		HomePage4 h4=new HomePage4(driver);
		h4.enterPincodeField();//Hardcodinng
		//h4.enterMobileNumber2("8275895172");
		h4.enterMobileNumber();//HardCoding
		//h4.enterPincodeField2("413308");;
		
		h4.moveToNextPage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		HomePage5 h5=new HomePage5(driver);
		h5.listOfSuggestion();
		Thread.sleep(5000);
		driver.close();


	}

}
