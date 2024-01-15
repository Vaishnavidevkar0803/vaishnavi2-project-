package coverFox_POMclassFor_BaseEg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MemberDetails
{
  @FindBy(id = "Age-You") private WebElement selectAge;
  @FindBy(xpath ="//div[@class='next-btn']")private WebElement nextButton;
  
  public MemberDetails(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public  void handleDropDown()
  {
	  selectAge.click();
	  Select s= new Select(selectAge);
	  s.selectByVisibleText("21 years");
  }
  
  public void clickOnNextButton()
  {
	  nextButton.click();
  }
}
