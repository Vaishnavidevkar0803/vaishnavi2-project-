package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		//double value2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getcCellValue();
		
		
		System.out.println(value);
		//System.out.println(value2);
		
		

	}

}
