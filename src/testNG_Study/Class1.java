package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1 {
  @Test//does the job of main method in testng 
  public void f() 
  {
	  System.out.println("normal printing statement");
	  //shows only on the console 
	  Reporter.log("this is reporter printing statment with string parameter ");
	  //shows on the emailable report not on the console  
	  Reporter.log("this is  reporter printing statment with string & boolean parameter ", false);
	  //shows on the emailable report ony
	  Reporter.log("this is  reporter printing statment 2 with string & boolean parameter ", true );
	  //shows on the emailable report as well as on the console 
  }
}
