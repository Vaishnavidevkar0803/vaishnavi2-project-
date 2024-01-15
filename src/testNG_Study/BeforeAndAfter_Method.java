package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfter_Method 
{
  @Test
  public void TestClass1() 
  {
	  Reporter.log("running test class 1", true);
  }
  
  @Test
  public void TestClass2()
  {
	  Reporter.log("running text class 2", true);
  }
  
   @BeforeMethod()
   public void beforeMethod()  
  {
	  Reporter.log("running before method ", true);
  }
   @AfterMethod()
   public void afterMethod()
   {
	   Reporter.log("running after method", true);
   }
   
}
