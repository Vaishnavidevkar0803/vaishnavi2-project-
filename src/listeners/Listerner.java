package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listerner implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("tc execution started",true);
	}

}
