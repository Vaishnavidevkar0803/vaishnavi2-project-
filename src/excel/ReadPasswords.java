package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadPasswords {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		Sheet getSheet = WorkbookFactory.create(file).getSheet("Sheet5");
		
		CellType cellType = getSheet.getRow(1).getCell(1).getCellType();
		System.out.println(cellType);//numeric
		
		double value = getSheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(value);//12344.0
		
		//how to read a value as only 12344 (passwords)as it is from excel 
		//give '12344 in excel before the number to read without point zero
	
		CellType cellType1 = getSheet.getRow(3).getCell(1).getCellType();
		System.out.println(cellType1);//string
		
		String value1 = getSheet.getRow(3).getCell(1).getStringCellValue();
		System.out.println(value1);//938372 without point zero as we have save the num with '938372 in excel
	}

}
