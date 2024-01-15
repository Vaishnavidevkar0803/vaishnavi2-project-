package coverFox_usingTestNG;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage5 
{
	//div[text()='49 matching Health Insurance Plans']
	   @FindBy(xpath="//div[contains(text(),'49 matching Health Insurance Plans')]")private WebElement text;	
	    // Matching the result of 49 matches using common webelement as used during table
		@FindBy(id="plans-list")private List<WebElement> totalSuggestedPlans;
		//find the size and match it to 49
		//get text store it in string separate it match it with .size
		public HomePage5(WebDriver driver) 
	    {
	    	PageFactory.initElements(driver,this);
	    }
	 //We will not use IF Else we will use Assertions.
	 //Splitting one method in Two.
		
		public int displayedNumber() 
		 {
			 String test = text.getText();
			 //49 matching Health Insurance Pans
			 
			 String ar[]=test.split(" ");
			 
			 String numberOfResultsInString = ar[0];
			 //convert String to Integer
			 int numberOfResultsInInt = Integer.parseInt(numberOfResultsInString);//49 in number
			 return numberOfResultsInInt;
		 }
		public int displayedPlans() 
		 {
			 int totalNumberOfPlans = totalSuggestedPlans.size();
			 return totalNumberOfPlans;
		 } 

}
