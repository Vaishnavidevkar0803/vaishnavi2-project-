package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_A_CompleteExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook myworkbook = WorkbookFactory.create(myfile);
		
		Sheet getsheet = myworkbook.getSheet("Sheet1");
		//get a whole excel sheet 
		//3 rows & 4 cells in excel sheet...
		//use nested for loop 
		for(int i=0;i<=2;i++)
		{
			Row getrow = getsheet.getRow(i);
			for(int j=0;j<=3;j++)
				
			{
				String value = getrow.getCell(j).getStringCellValue();
				System.out.println(value+" ");
			}
				System.out.println();
			}
		}
		

	}


