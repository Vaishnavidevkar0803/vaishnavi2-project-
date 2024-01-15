package tesNg_xml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeTestcases 
{
	//if i want to run only particular methods then include & exclude keywords in xml files will be used 
	//include --> to run the methods which are included so others will excluded automatically 
	//exclude--> if u want to run tc1 only then exculde tc2 tc3 tc4 means run all the methods except the excluded one 
	//but the excluded methds will not be failed or skipped they will not involve in the excution 
  @Test
  public void TC1()
  {
	  Reporter.log("TC1 is running", true);
  }
  @Test
  public void TC2()
  {
	  Reporter.log("TC2 is running", true);
  }
  @Test
  public void TC3()
  {
	  Reporter.log("TC3 is running", true);
  }
  @Test
  public void TC4()
  {
	  Reporter.log("TC4 is running", true);
  }
}
