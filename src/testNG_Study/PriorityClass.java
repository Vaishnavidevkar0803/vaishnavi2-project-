package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityClass
{
	//priority: To change test method/TC execution order we need to use TestNG keyword "priority
	//priority can +ve,-ve,duplicate,default
	//default priority is always 0
	//incase if the 2 methods have same priorities then sequence will be decided by alphabatical order 
	
	// (-2,1,0,2)(a,b,c,d,)
	//after priority set(-2,0,1,2)(a,c,b,d)
  @Test(priority = -2)
  public void a() 
  {
	  Reporter.log("a is running", true);
  }
  @Test(priority = 1)
  public void b() 
  {
	  Reporter.log("b is running", true);
  }
  @Test
  public void c() 
  {
	  Reporter.log("c is running", true);
  }
  @Test(priority = 2)
  public void d() 
  {
	  Reporter.log("d is running", true);
  }
  //incase of duplicate priorities it will go by alphabetical order
  //e & d has same priorities now it will choose the alphabetical sequnece to execuite 
  
	// (-2,1,0,2,2)(a,b,c,d,e)
	//after priority set(-2,0,1,2,2)(a,c,b,d,e)
  @Test(priority = 2)
  public void e() 
  {
	  Reporter.log("e is running", true);
  }
}
