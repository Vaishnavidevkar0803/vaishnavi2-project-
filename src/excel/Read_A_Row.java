package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_A_Row {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile= new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook myworkbook = WorkbookFactory.create(myfile);
		
		Sheet getSheet = myworkbook.getSheet("Sheet1");
		//lets read a row by using for loop 
		//nature of row is static =row no.(1)in excel 
		//nature of column is dyanamic =cell no.(1 2 3)in excel
		
		for(int i=0;i<=3;i++)
		{
			String value = getSheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
	}

	}


