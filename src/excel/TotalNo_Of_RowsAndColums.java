package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TotalNo_Of_RowsAndColums {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\Documents\\excel_selenium\\Eg 1.xlsx");
		Workbook mybook = WorkbookFactory.create(myfile);
		Sheet getsheet = mybook.getSheet("Sheet2");
		int totalrows = getsheet.getLastRowNum();
		System.out.println(totalrows);
		
		short totalcells = getsheet.getRow(totalrows).getLastCellNum();
		System.out.println(totalcells);//error????
	}

}
