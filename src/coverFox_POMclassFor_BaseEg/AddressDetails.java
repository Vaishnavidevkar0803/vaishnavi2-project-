package coverFox_POMclassFor_BaseEg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressDetails 
{
  @FindBy(className = "mp-input-text")private WebElement pincode ;
  @FindBy(id = "want-expert")private WebElement mobNum;
  @FindBy(xpath ="//div[@class='next-btn']")private WebElement nextButton;
  
  public AddressDetails(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void enterPinCode(String pinCode)
  {
	  pincode.sendKeys(pinCode);
	  
  }
  public void enterMobNum(String enteringMobNum)
  {
	  mobNum.sendKeys(enteringMobNum);
  }
  public void clickonContinue()
  {
	  nextButton.click();
  }
}
  

