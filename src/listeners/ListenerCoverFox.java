package listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import coverFoxBase.BaseClass;
import coverFoxUtility.CoverFoxUtilityClass;

public class ListenerCoverFox extends BaseClass implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result)
	{
	
		Reporter.log("TC execution started", true);
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		try {
			CoverFoxUtilityClass.takescreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC execution successfully completed ", true);
	}
}
