package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis= new FileInputStream("C:\\Users\\Daniel\\Desktop\\Selenium notes by Mam\\Selenium Testdata-DDT\\EmailPassword.xlsx");
		
		//to access workbook
				
		Workbook book = WorkbookFactory.create(fis);
		//to access sheet
		 Sheet sh=book.getSheet("Sheet1");
		 //to access data from rows, we use nested for loop . in for loop we need till what row we need to iterate. so get lastrow from a mehtod
		 int lastRowNumber = sh.getPhysicalNumberOfRows();
		 System.out.println("last row num is :"+lastRowNumber);
		 //to get last col, we use row number and call method to get last column
		 int lastCellNumber = sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("last cell num is :"+lastCellNumber);
		
		//nested for loop to get all rows and cells
		for(int i=0; i<lastRowNumber; i++)
		{
			for(int j=0; j<lastCellNumber; j++)
			{
				System.out.print(sh.getRow(i).getCell(j).toString()+ " "); //to get email and passwrod printed in one line remove ln and add syso printing stt after j loop
				
			}
			System.out.println();
		}
		
		
		
	}

}
