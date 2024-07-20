
package datadriventesting;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Ex_PropertiesFile {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub

		FileInputStream fis= new FileInputStream("C:\\Users\\Daniel\\Desktop\\Selenium notes by Mam\\Selenium Testdata-DDT\\commondata.properties");
		Properties pobj= new Properties();
		pobj.load(fis);
		
		String link = pobj.getProperty("url");
		System.out.println("url is :" +link);
		
		String email=pobj.getProperty("email");//key is case sensitive
		System.out.println("email : "+email);
		
	String password=pobj.getProperty("password");
		System.out.println("password: "+password);
		
		
		
		
		
		
		
	}

}
