package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ExcelFile_Example {
	public static void main(String[] args) throws IOException {
		//create obj for FIS
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Daniel\\Desktop\\Selenium notes by Mam\\Selenium Testdata-DDT\\Untitled spreadsheet.xlsx");
		 	//to access the workbook
		Workbook book=WorkbookFactory.create(fis);
		//to access the sheet
	Sheet sh=book.getSheet("Sheet1");
	//to access row
	Row row=sh.getRow(1);

	//to access cell
	org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);

//	//to String Data
//	String value= cell.getStringCellValue();
//	System.out.println(value);
//
//	//to get number data from excel
//	double value2= sh.getRow(1).getCell(1).getNumericCellValue();//if we have n no of passwords with diff format say alphanumeric or only numeric or pnly ltters. we cant check each pw. so we use toString() to get all type of passwords or datas
//	System.out.println(value2);

String value1 = sh.getRow(2).getCell(0).toString(); 
System.out.println(value1);

String value2 = sh.getRow(2).getCell(1).toString();
		System.out.println(value2);
	}
	
	
	
	
	
	

}
