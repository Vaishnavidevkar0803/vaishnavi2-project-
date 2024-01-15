package testNG_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listerner.class)
public class MyClass2 {
  @Test
  public void a()
  {
  Reporter.log("Hi a is running", true);
  }
  @Test
  public void b()
  {
  Assert.fail();
  Reporter.log("Hi b is running", true);
  }
  @Test(dependsOnMethods = {"f"})
  public void c()
  {
  Reporter.log("Hi c is running", true);
  }
  @Test
  public void d()
  {
  Reporter.log("Hi d is running", true);
  }
}
