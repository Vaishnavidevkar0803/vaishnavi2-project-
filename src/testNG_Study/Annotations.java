package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void TestClass1() 
  {
	 Reporter.log("TC1 running ", true); 
  }
  @Test
  public void TestClass2()
  {
	  Reporter.log("TC2 running ", true);
  }
  @Test
  public void TestClass3()
  {
	  Reporter.log("TC3 running", true);
  }
  @Test
  public void TestClass4()
  {
	  Reporter.log("TC4 running", true);
  }
  @BeforeMethod()
  public void BeforeMethod()
  {
	  Reporter.log("before method is running", true);
  }
  @AfterMethod()
  public void afterMethod()
  {
	  Reporter.log("after method is running",true);
  }
  @BeforeClass()
  public void beforeClass()
  {
	  Reporter.log("before class is running",true);
  }
  @AfterClass()
  public void AfterClass()
  {
	  Reporter.log("after class is running ",true);
  }
  
  @BeforeSuite()
  public void BeforeSuite()
  {
	  Reporter.log("before suite is running", true);
  }
  @AfterSuite()
  public void AfterSuite()
  {
	  Reporter.log("after suite is running", true);
  }
  
  @BeforeTest()
  public void BeforeTest() 
  {
	  Reporter.log("before test is running ", true);
  }
  @AfterTest()
  public void AfterTest()
  {
	  Reporter.log("after test is running ", true);
  }
  
  
  
}
