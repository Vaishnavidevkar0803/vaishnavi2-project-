package selenium_use;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs_Practice {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//TASK-->1
		//launch the url 
		//senkeys in username & password 
		//click on the loginbutton
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.className("btn_action"));
        
		//take actions on each web-element 
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginButton.click();//result-->go to the next page
		
		//TASK-->2
		//add items to the cart 
		//xpath by index
		//after adding items click on the cart 
		WebElement item_1 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]"));
		WebElement item_2 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[3]"));
		item_1.click();
		item_2.click();
		Thread.sleep(500);
		WebElement addtoCart = driver.findElement(By.id("shopping_cart_container"));
		addtoCart.click();
		
		//TASK-->3
		//check wheather the items in the cart are correct as u have selected 
		//inspect the cart items use .size methods to know how many items are added 
		//.gettext method to know the item names 
		
		List<WebElement> backpack = driver.findElements(By.className("inventory_item_name"));
		System.out.println("total items in the cart are "+backpack.size());
		//to get each items from the cart we have to traverse 
		//use for each loop
		
		for(WebElement it:backpack)
		{
			System.out.println("cart items are "+it.getText());
		}
		//use iterator to cheack the each item 
	     Iterator<WebElement> items = backpack.iterator();
	     WebElement it1 = items.next();
	     if(it1.getText().equals("Sauce Labs Backpack"))
	     {
	    	 System.out.println("cart item is correct");
	     }
	     else
	     {
	    	 System.out.println("cart item is wrong");
	     }
	     System.out.println("===============================");
	     Iterator<WebElement> item = backpack.iterator();
	     WebElement it2 = item.next();
	     if(it2.getText().equals("Sauce Labs Bolt T-Shirt"))
	     {
	    	 System.out.println("cart item is correct");
	     }
	     else
	     {
	    	 System.out.println("cart item is wrong");
	     }
		
		
		//TASK-->4
		//after clicking the cart click on the checkout button
		WebElement checkoutButton = driver.findElement(By.xpath("//a[@href='./checkout-step-one.html']"));
		checkoutButton.click();//result-->get on the new webpage for checkout processor
		
		
		//TASK-->5
		//fill the information -->first name ,lastname,zip code etc
		//click on continue button
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		WebElement lastName = driver.findElement(By.id("last-name"));
		WebElement zipCode = driver.findElement(By.id("postal-code"));
		WebElement continueButton = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
		
		 firstName.sendKeys("vaishnavi");
		 lastName.sendKeys("devkar");
		 zipCode.sendKeys("vd.123");
		 continueButton.click();
		 
		 //TASK-->6 click on the finish button 
		 WebElement finishButton = driver.findElement(By.xpath("//a[text()='FINISH']"));
		 finishButton.click();
		 
		 //TASK-->7
		 //logout
		WebElement thanksmsg = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']"));
		 if(thanksmsg.getText().equals("THANK YOU FOR YOUR ORDER"))
		 {
			 System.out.println("logging out from the page--> thankYou message displayed");
			 WebElement menu = driver.findElement(By.xpath("//button[text()='Open Menu']"));
			 Thread.sleep(500);
			 menu.click();
			 driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 }
		 else 
		 {
			System.out.println("logging out sucessfully not done-->thankYou message is not displayed"); 
		 }
		
	}

}
//StaleElementReferenceException: 
//This exception occurs when an element that was previously located on the page is no longer available. 
//There are a few reasons why this might happen, such as the element being removed from the page, 
//the page being refreshed, or the element's location changing.
