package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_A_Cell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		
		Sheet getSheet = myWorkBook.getSheet("sheet1");
		//how to read a cell???row is dynamic & cell is varying static
		//create a for loop
		for(int i=0;i<=2;i++)
		{
			String value = getSheet.getRow(i).getCell(0).getStringCellValue();
			System.out.print(value+" ");
			
		}

	}

}
