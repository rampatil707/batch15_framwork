package Com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	public static ExtentReports getReport(){
	
	String filepath="C:\\Users\\Hp\\eclipse-workspace\\Batch15_Framwork\\Reports\\index.html";
	
	ExtentSparkReporter reporter=new ExtentSparkReporter(filepath);
	
	reporter.config().setDocumentTitle("automation Test Report");
	reporter.config().setReportName("project Batch 15");
	reporter.config().setTheme(Theme.DARK);
	
	ExtentReports extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Project Name", "Batch 15");
	extent.setSystemInfo("Module name", "abcd");
	extent.setSystemInfo("Automation", "selenium WebDriver");
	extent.setSystemInfo("QA", "Ram patil");
	return extent;
	}	
}


