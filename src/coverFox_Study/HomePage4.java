package coverFox_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage4 
{
	@FindBy(xpath ="(//input[@type='number'])[1]")private WebElement pincodeField;
	@FindBy(xpath ="(//input[@type='number'])[2]")private WebElement mobileNumbersField;
	@FindBy(xpath ="//div[@class='next-btn']")private WebElement continueButton;

	 public HomePage4(WebDriver driver) 
	    {
	    	PageFactory.initElements(driver,this);
	    }
	 //Hard Coding
	 public void enterPincodeField() 
	 {
		 pincodeField.sendKeys("413311");
		 
	 }
	 //Dynamic
	 public void enterPincodeField2(String pincode) 
	 {
		 pincodeField.sendKeys(pincode);
		 
	 }
	  //HardCoding
	 public void enterMobileNumber() 
	 {
		 mobileNumbersField.sendKeys("8275895172");
		 
	 }
	 //Dynamic
	 public void enterMobileNumber2(String mobileNumber) 
	 {
		 mobileNumbersField.sendKeys(mobileNumber);
		 
	 }
	 public void moveToNextPage() 
	 {
		 continueButton.click();
		 
	 }

}
