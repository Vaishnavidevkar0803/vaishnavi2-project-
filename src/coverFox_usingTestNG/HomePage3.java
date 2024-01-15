package coverFox_usingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage3 
{
	@FindBy(id="Age-You")private WebElement ageSelection;
	@FindBy(xpath ="//div[@class='next-btn']")private WebElement nextButton;

	 public HomePage3(WebDriver driver) 
	    {
	    	PageFactory.initElements(driver,this);
	    }
	///HardCoding
	 public void selectAge()
		{   
			ageSelection.click();
			Select s1=new Select(ageSelection);
	        s1.selectByValue("27y");
		}
	//value @Method Selection
	 public void selectAge2(String age)
		{   
			ageSelection.click();
			Select s1=new Select(ageSelection);
			 s1.selectByValue(age+"y");
		}
	 public void clickNextButton() 
	 {
		 nextButton.click();
	 }

}
