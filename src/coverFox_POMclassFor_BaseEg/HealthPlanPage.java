package coverFox_POMclassFor_BaseEg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthPlanPage 
{
	@FindBy(xpath ="//div[@class='next-btn']")private WebElement nextButton;
public HealthPlanPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickOnNextButton()
{
	nextButton.click();
}

}