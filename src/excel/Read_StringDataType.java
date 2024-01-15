package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_StringDataType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream files=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook myworkbook = WorkbookFactory.create(files);
		
		Sheet getsheet = myworkbook.getSheet("Sheet3");
		
		int lastrowNum = getsheet.getLastRowNum();
		int totalnumofRows = lastrowNum ;
		
		short lastcellnum = getsheet.getRow(0).getLastCellNum();
		int totalnumofCells = lastcellnum-1;
		
		for(int i=0;i<=totalnumofRows;i++)
		{
			for(int j=0;j<=totalnumofCells;j++)
			{
				CellType celldatatype = getsheet.getRow(i).getCell(j).getCellType();
				System.out.print(celldatatype+" ");
			}
		}


	}

}
