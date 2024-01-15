package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_CellDataType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		
		Workbook myworkbook = WorkbookFactory.create(myfile);
		
		Sheet getsheet = myworkbook.getSheet("Sheet4");
		int lastrownum = getsheet.getLastRowNum();
		int totalnumofRows = lastrownum;
		
		short lastcellnum = getsheet.getRow(0).getLastCellNum();
		int totalnumofcells = lastcellnum-1;
		
		for(int i=0;i<=totalnumofRows;i++)
		{
			for(int j=0;j<=totalnumofcells;j++)
			{
				CellType celldatatype = getsheet.getRow(i).getCell(j).getCellType();
				
				if(celldatatype==CellType.STRING)
				{
					String stringvalue = getsheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(stringvalue+" ");
				}
				else if (celldatatype==CellType.NUMERIC)
				{
					double numvalue = getsheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(numvalue+" ");
				}
				else if (celldatatype==CellType.BOOLEAN)
				{
					boolean booleanvalue = getsheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(booleanvalue+" ");
				}
			}
		}
	}

}
