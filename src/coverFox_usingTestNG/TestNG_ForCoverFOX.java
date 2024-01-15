package coverFox_usingTestNG;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestNG_ForCoverFOX {

	    //Need Objects of Diff classes
		//Objects only defined (No main method = only declaration, no initialisation)
		HomePage h1;
		HomePage2 h2;
		HomePage3 h3;
		HomePage4 h4;
		HomePage5 h5;
		WebDriver driver;//Globally
		
		@BeforeClass//permanent work
		public void launch() 
		{
			driver= new ChromeDriver();
			h1= new HomePage(driver);
			h2= new HomePage2(driver);
			h3= new HomePage3(driver);
			h4= new HomePage4(driver);
			h5= new HomePage5(driver);
			
			Reporter.log("Open Browser",true);
			driver.get("https://www.coverfox.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		}
		
		@BeforeMethod
		  public void getStartedButtonClick() throws InterruptedException 
	    {
			Reporter.log("Page1",true);
			h1.getStartedButtonClick();
			Thread.sleep(200);
			
			
			Reporter.log("Page2",true);
			h2.selectPerson();
			Thread.sleep(200);
			
			Reporter.log("Page3",true);
			h3.selectAge();
			Thread.sleep(200);
			h3.clickNextButton();
			Thread.sleep(200);
			
			Reporter.log("Page4",true);
			h4.enterPincodeField();
			Thread.sleep(200);
			h4.enterMobileNumber();
			Thread.sleep(200);
			h4.moveToNextPage();
			Thread.sleep(200);
		 }
		@Test
	    public void validateTestPlans() 
	   {  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  int result1=h5.displayedNumber();
		  Reporter.log("Number Displayed "+result1,true);
		  int result2=h5.displayedPlans();
		  Reporter.log("Number of Plans Displayed "+result2,true);
	
		  Assert.assertEquals(result1,result2,"Results are not matching hence TestCase is Failed");
		  Reporter.log("Results Are Matching Hence Test Case Is Passed",true);
	   }
		@AfterClass
	    public void closeBrowser() throws InterruptedException 
	    {
	    	Thread.sleep(5000);
	    	Reporter.log("Closing Browser",true);
	    	driver.close();
	    }
 
}
