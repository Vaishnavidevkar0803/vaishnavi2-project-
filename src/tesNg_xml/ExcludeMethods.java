package tesNg_xml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExcludeMethods {
  @Test
  public void TC1()
  {
	  Reporter.log("TC1 is running",true);
  }
  @Test
  public void TC2()
  {
	  Reporter.log("TC2 is running",true);
  }
  @Test
  public void TC3()
  {
	  Reporter.log("TC3 is running",true);
  }
  @Test
  public void TC4()
  {
	  Reporter.log("TC4 is running",true);
  }
}
