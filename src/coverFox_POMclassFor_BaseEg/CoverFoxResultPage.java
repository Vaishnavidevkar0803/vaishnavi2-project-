package coverFox_POMclassFor_BaseEg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxResultPage
{
   @FindBy(xpath = "//div[contains(text(),'matching Health')]")private WebElement resultString;
   @FindBy(id = "plans-list")private List<WebElement> planlist;
   @FindBy(xpath = "//div[text()='Sort Plans']")private WebElement sortPlanButton;
   
   public CoverFoxResultPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public int planNumberFromTextString()
   {
	   String s=resultString.getText();
	 //49 matching Health Insurance Plans
	   
	   String ar[]=s.split(" ");//splitting by space
	 //ar[]={"49" "matching" "Health" "Insurance" "Plans"}
	   
	   String getOnlyOnestring=ar[0];
	   //49-->String convert String to integer
	   
	   int numOfResultInInteger=Integer.parseInt(getOnlyOnestring);
	  //49-->in number(int)
	   return numOfResultInInteger;
	 
   }
   
   public int numOfPlansOnTheBanner()
   {
	   int totalnumOfPlans=planlist.size();
	   return totalnumOfPlans;
   }
   public boolean sortPlanElementPresency()
   {
	   Reporter.log("validating sortplan button is present or not", true);
	  boolean result = sortPlanButton.isDisplayed();
	  return result;
   }
}
