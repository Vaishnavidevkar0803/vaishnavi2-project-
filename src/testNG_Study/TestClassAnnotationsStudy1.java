package testNG_Study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestClassAnnotationsStudy1 {
  @Test
  public void TC1()
  {
	  Reporter.log("TC1 IS Running", true);
  }
  @Test
  public void TC2()
  {
	  Reporter.log("TC2 IS Running", true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("before method is running", true);
  }

  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("after method IS Running", true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("before class IS Running", true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("After class IS Running", true);
  }

	/*
	 * @BeforeTest public void beforeTest() { Reporter.log("before test IS Running",
	 * true); }
	 * 
	 * @AfterTest public void afterTest() { Reporter.log("after test IS Running",
	 * true); }
	 */

	/*
	 * @BeforeSuite public void beforeSuite() {
	 * Reporter.log("before suite IS Running", true); }
	 * 
	 * @AfterSuite public void afterSuite() { Reporter.log("after suite IS Running",
	 * true); }
	 */

}
