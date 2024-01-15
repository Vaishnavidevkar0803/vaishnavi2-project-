package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_A_Execl {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook myworkbook = WorkbookFactory.create(myfile);
		
		Sheet getsheet = myworkbook.getSheet("Sheet3");
		
		int getlastrow = getsheet.getLastRowNum();
		int totalnumofRows = getlastrow;
		
		//when try to get lastcell it shows the no.in terms of excel 
		//to get the value in terms of java we did totalnumofcells-1 
		short getlastcell = getsheet.getRow(0).getLastCellNum();
		short totalnumofCells =  getlastcell;
		
		//nested for loop
		//outer loop
		for(int i=0;i<=totalnumofRows;i++)
		{
			//inner for loop
			for(int j=0;j<=totalnumofCells-1;j++)
			{
				String value = getsheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
		}
		//System.out.println();

	}

}
