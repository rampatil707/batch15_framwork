package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws Exception {
		
		String filepath="C:\\Users\\Hp\\eclipse-workspace\\Batch15_Framwork\\Config\\config.properties";
		FileInputStream fis=new FileInputStream(filepath);
		pro=new Properties();
		pro.load(fis);
	}
	public String Baseurl() {
		return pro.getProperty("Baseurl");
		
	}
	public String getExcelDataPath() {
		return pro.getProperty("ExcelDataPath");
	}
	
}
