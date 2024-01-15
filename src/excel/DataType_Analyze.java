package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataType_Analyze {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//analyse the data type 
		//pass the path of the workbook
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook myworkBook = WorkbookFactory.create(myfile);
		
		Sheet sheet1 = myworkBook.getSheet("Sheet1");
		
		Row getRow = sheet1.getRow(0);
		
		Cell getCell = getRow.getCell(3);
		
		CellType dataType = getCell.getCellType();
		
		//after changing the data in excelsheet save that data & run the code then only it will show the ans 
		//otherwise it will throw some exception....u ididot 
		System.out.println(dataType);
		
		
		
	}

}
