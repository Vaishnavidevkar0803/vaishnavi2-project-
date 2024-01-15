package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutsKeyWord 
{
	//TimeOut: If test class contains multiple test methods if one of the test method is time 
	//consuming to execute then TestNG bydefault fail that TC & executes the other TC.
    //The maximum number of milliseconds this test should take. If it hasn't returned after thistime, it will be marked as a FAIL.
	//Returns:the value (default 0)
  @Test
  public void payment()
  {
	 Reporter.log("payment is done", true); 
  }
  @Test(timeOut = 500)
  public void couponCode() throws InterruptedException
  {
	  Thread.sleep(1000);
	 Reporter.log("couponCode is applied", true); 
  }
  //ThreadTimeoutException-->as the couponcode method should be execute in 5 seconds but it takes 10 sec of pause 
  //so compiler will fail this method and throws an exception 
  @Test
  public void discount() 
  {
	 Reporter.log("U got the 40% of discount", true); 
  }
}
