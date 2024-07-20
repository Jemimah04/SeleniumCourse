package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTheDataInExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Daniel\\Desktop\\Selenium notes by Mam\\Selenium Testdata-DDT\\EmailPassword.xlsx");
		//to access book
		Workbook book = WorkbookFactory.create(fis);
		//to access sheet
		Sheet sh=book.getSheet("Sheet4");
		
		sh.createRow(0).createCell(0).setCellValue("Tryphena");
		sh.createRow(1).createCell(0).setCellValue("Tryphosa");
		sh.createRow(2).createCell(0).setCellValue("Osteen");
		sh.createRow(3).createCell(0).setCellValue("Leah");
		sh.createRow(0).createCell(1).setCellValue("31.01.2013");
		sh.createRow(1).createCell(1).setCellValue("26.7.2016");
		sh.createRow(2).createCell(1).setCellValue("28.7.2018");
		sh.createRow(3).createCell(1).setCellValue("13.5.2020");
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\Daniel\\Desktop\\Selenium notes by Mam\\Selenium Testdata-DDT\\EmailPassword.xlsx");
		//write the data in excel
		book.write(fos);
		//to save data in excel --this is compulsory
		fos.flush();
		

	}

}
