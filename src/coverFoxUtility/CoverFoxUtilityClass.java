package coverFoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CoverFoxUtilityClass 
{

	public static String readDataFronExcelSheet(int row ,int cell) throws EncryptedDocumentException, IOException
	{
		Reporter.log("reading data from excel sheet", true);
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("CoverFoxData");
		String myData = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return myData;
	}
	
	public static void takescreenshot(WebDriver driver,String TCID) throws IOException
	{
		Reporter.log("taking screenshot", true);
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\admin\\Pictures\\screenshots\\coverFox"+TCID+"_"+timeStamp+".png");
		Reporter.log("Saved screenshot at "+dest, true);
		org.openqa.selenium.io.FileHandler.copy(src, dest);
				
	}
	
}
