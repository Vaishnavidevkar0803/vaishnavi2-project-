package coverFox_POMclassFor_BaseEg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxGenderSelection {

	//@FindBy(linkText = "Female") private WebElement femaleRadioButton;
	
	@FindBy(xpath ="//button[@title='Get Started']")private WebElement getStartedField;
	
	public CoverFoxGenderSelection(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//	public void clickOnFemaleButton()
//	{
//	//	femaleRadioButton.click();
//	}
	public void getStartedButtonClick() 
    {
    	getStartedField.click();
    }

}
