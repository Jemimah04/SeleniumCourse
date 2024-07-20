package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_UtilityEx {
//properties file-generic method
	
	public String getDataFromProperties(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\Daniel\\Desktop\\PropertiesFile\\Common_Data.properties");
		
		Properties prop= new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
			
	}
	
	//generic method for excel file
	public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws IOException {
		FileInputStream fis1= new FileInputStream("C:\\Users\\Daniel\\Desktop\\PropertiesFile\\Untitled spreadsheet.xlsx");
		
	Workbook book = WorkbookFactory.create(fis1);
		Sheet sh= book.getSheet(sheetName);
	String value2=	sh.getRow(rowNum).getCell(cellNum).toString();
		return value2;
		
	}
	
	
	
	
	
	
	
	
	
}
