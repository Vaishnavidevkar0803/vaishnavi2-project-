package sceenshots;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class ScreenShots {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// Why???
				//For Test proof
				//TakeScreeenShot Is A Different Interface
				//GetScreeenShotAs(); Is a method in Interface
				//TSS is a separate Interface So need to Cast with Webdriver.
				
				//Type Cast???Casting Concept
				/*
				 * short b=10; long a=(long)b;
				 */
				          //Changing the type of driver to other type from webdriver
				          //here we are converting object of webdriver to object of Takesscreenshot Interface
				//((TakescreenShot)Driver)
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.bcci.tv/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		       // System.out.println(myfile);//Random place saved so{temporary memory}
			    //To place @ desired place
//		        RandomString rs= new RandomString();
//		        String rs1 = rs.make(3);
				RandomString rs =new RandomString();
				
		        String rs1 = rs.make(4);//gs43
		        
		        String timeStamp=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
				System.out.println(timeStamp);
		        // File myFile= new File("C:\\Users\\sahil\\OneDrive\\Desktop\\Software Testing Notes\\ScreenShot\\1.png");
		        //Orrrrrrrrrrrrrr
		        File destination= new File("C:\\Users\\admin\\Pictures\\screenshots\\"+rs1+" "+ timeStamp +".png");
		        
	               FileHandler.copy(source, destination);
		        //FileHandler is a class
		        
		        //TypeCasting
		        //short a=4;
		      //long b=(long)a;
		        //driver typecast>>>store temp variable>>>permanent location>>>temp copy and paste
	               
	               
	               driver.close();
	              


	}

}
