package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutKeyword {
	@Test
	  public void payment()
	  {
		 Reporter.log("payment is done", true); 
	  }
	  @Test(timeOut = 5000)
	  public void couponCode() throws InterruptedException
	  {
		  Thread.sleep(1000);
		 Reporter.log("couponCode is applied", true); 
	  }
	  //
	  @Test
	  public void discount() 
	  {
		 Reporter.log("U got the 40% of discount", true); 
	  }
}
