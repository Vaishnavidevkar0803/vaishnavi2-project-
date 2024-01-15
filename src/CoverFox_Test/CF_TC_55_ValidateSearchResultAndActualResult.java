package CoverFox_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import coverFoxBase.BaseClass;
import coverFoxUtility.CoverFoxUtilityClass;
import coverFox_POMclassFor_BaseEg.AddressDetails;
import coverFox_POMclassFor_BaseEg.CoverFoxGenderSelection;
import coverFox_POMclassFor_BaseEg.CoverFoxResultPage;
import coverFox_POMclassFor_BaseEg.HealthPlanPage;
import coverFox_POMclassFor_BaseEg.MemberDetails;
//import coverFox_Study.HomePage;

@Listeners(listeners.ListenerCoverFox.class)
public class CF_TC_55_ValidateSearchResultAndActualResult extends BaseClass 
{
	CoverFoxGenderSelection Ndriver = new CoverFoxGenderSelection(BaseClass.driver);
	CoverFoxGenderSelection genderselect;
	 HealthPlanPage healthPlan;
	AddressDetails addressdetails;
	MemberDetails memberDetails;
	CoverFoxResultPage resultPage;
	
	
	@BeforeClass
	public void launchBrowser1() throws InterruptedException
	{
		launchBrowser();
		genderselect=new CoverFoxGenderSelection (driver);
		healthPlan=new HealthPlanPage(driver);
		addressdetails=new AddressDetails(driver);
		memberDetails=new MemberDetails(driver);
		resultPage=new CoverFoxResultPage(driver);
	}
	
	@BeforeMethod
	public void enterMemberDetails() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("clicking on female gender button", true);
		genderselect.getStartedButtonClick();
		Thread.sleep(3000);
		
		Reporter.log("clicking on the next button", true);
		healthPlan.clickOnNextButton();
		Thread.sleep(4000);
		
		Reporter.log("entering the member details ", true);
		memberDetails.handleDropDown();
		Thread.sleep(3000);
		Reporter.log("clicking on the next button", true);
		memberDetails.clickOnNextButton();
		Thread.sleep(3000);
		
		Reporter.log("entering the pincode", true);
		String pc = CoverFoxUtilityClass.readDataFronExcelSheet(1, 1);
		addressdetails.enterPinCode(pc);
		Reporter.log("entering the mobile num", true);
		Thread.sleep(2000);
		String mB = CoverFoxUtilityClass.readDataFronExcelSheet(1, 2);
		addressdetails.enterMobNum(mB);
		Thread.sleep(3000);
		addressdetails.clickonContinue();
		Thread.sleep(4000);
	}
	@Test()//main test case 
	public void validateTestPlansFromTextAndBanners() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		Reporter.log("fetching the no.of policies from text", true);
		int textResult = resultPage.planNumberFromTextString();
		Thread.sleep(5000);
		Reporter.log("fetching the no. of policies count from the banner", true);
		int testResultFromBanner = resultPage.numOfPlansOnTheBanner();
		Thread.sleep(2000);
		Assert.assertEquals(textResult,testResultFromBanner ,"text result is equal to the banner result,TC is failed");
		
		//if the tc passed 
//		Reporter.log("textresult is equal to the bannerResult ,TC is passed", true);
//		CoverFoxUtilityClass.takescreenshot(driver, "CF_TC555");
//		Thread.sleep(2000);
		
	}

	@AfterMethod
	public void closeBrowser1() throws InterruptedException
	{
		Thread.sleep(4000);
		closeBrowser();
	}

}
