package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod 
{
	
	// dependsOnMethods: If 1 TC execution depends on multiple TC then we need to use
	//"dependsOnMethods" TestNG keyword.

  @Test
  public void p()
  {
	  Reporter.log("method p is running ", true);
  }
  @Test
  public void q()
  {
	  Reporter.log("method q is running ", true);
  }
  @Test(dependsOnMethods ="q")
  public void r()
  {
	  Reporter.log("method r is running ", true);
  }
  //output-->(q p r)
}
