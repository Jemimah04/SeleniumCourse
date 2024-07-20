package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {


//generic method to fetch data from properties file 
	
	//this n.s method is to keep the properties file 
	public String getDataFromProperties(String key) throws IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\Daniel\\Desktop\\PropertiesFile\\Common_Data.properties");
		Properties pobj= new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;
		
		
	}
	
	public String getDataFromExcel(String sheetName,int rowNum, int cellNum ) throws IOException {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Daniel\\Desktop\\PropertiesFile\\Untitled spreadsheet.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		
		
	Sheet sh=book.getSheet(sheetName);
		
		String value1=sh.getRow(rowNum).getCell(cellNum).toString();
		return value1;
		
		
	}

}
