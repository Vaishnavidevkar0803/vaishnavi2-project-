package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountStudy
{
	//invocationCount: Sometimes same test method/TC need to be executed multiple times 
	//which can be possible by using TestNG keyword "invocationCount"
	//The number of times this method should be invoked
	//default value of invocation is 1

  @Test(invocationCount = 3)
  public void p() 
  {
	  Reporter.log("p is running", true);
  }
  @Test(invocationCount = 4)
  public void q() 
  {
	  Reporter.log("q is running", true);
  }
  @Test(invocationCount = 2)
  public void r() 
  {
	  Reporter.log("r is running", true);
  }
}
