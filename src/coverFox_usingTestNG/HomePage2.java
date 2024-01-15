package coverFox_usingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 
{
@FindBy(xpath ="//div[@class='next-btn']")private WebElement personSelection;

	
	public HomePage2(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public void selectPerson() 
	{
		personSelection.click();
	}

}
