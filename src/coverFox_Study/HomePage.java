package coverFox_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath ="//button[@title='Get Started']")private WebElement getStartedField;

    public HomePage(WebDriver driver) 
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void getStartedButtonClick() 
    {
    	getStartedField.click();
    }

}
