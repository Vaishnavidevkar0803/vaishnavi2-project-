package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class EnableKeyword
{
	//enabled: Disabling a test method/TC in TestNG can be achieved by setting
	//the enabled attribute of the @Test annotation to false.
	//with the help of enable keyword we can disable the method by passing the boolean return type 
	//@enable=false like that we can have record of the test in class but it will not appear at the console
	//the default value of the enable is true
	

  @Test
  public void TC1() 
  {
	  Reporter.log("TC1 is running", true);
  }
  @Test(enabled = false)
  public void TC2() 
  {
	  Reporter.log("TC2 is running", true);
  }
  @Test
  public void TC3() 
  {
	  Reporter.log("TC3 is running", true);
  }
  //output=passed-->TC1 & TC2 
  //console will not show TC2 (not skipped nor failed )
}
