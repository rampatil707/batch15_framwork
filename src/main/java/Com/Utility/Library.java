package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Library {
   //generic method get data by using excel
	public static String getTestData(String Sheetname,int Row,int Cell) throws Exception {
		String Path="C:\\Users\\Hp\\eclipse-workspace\\Batch15_Framwork\\TestData\\test_data.xlsx";
		FileInputStream file=new FileInputStream(Path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		String data2=wb.getSheet(Sheetname).getRow(Row).getCell(Cell).getStringCellValue();
		
		return data2;
		
	}
	//generic method Scroll Element by page
	public static void ScrollToElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}
	//geric method of custom sendKeys
	public static void custem_sendKeys(WebElement element,String value) {
		try{
			element.sendKeys(value);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
	     //custom click method
		public static void custem_click(WebElement element) {
		try {
			element.click();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		    }
		}
		  /// handdle drop Down by generic method
		public static void Handle_DropDown(WebElement element,String text) {
			
			try {
				Select sel=new Select(element);
				sel.selectByVisibleText(text);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			}
		//     Alert Handle
		public static Alert HandleAlert(WebDriver driver) {
			
			return driver.switchTo().alert();
			}
		//// MoveTo Element
		public static void MovetoElement_click(WebDriver driver,WebElement element) {
			
			try {
				Actions act=new Actions(driver);
				act.moveToElement(element).click().build().perform();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		//Right click on webelement
		
		public static void right_clickElement(WebDriver driver,WebElement element) {
			try {
				Actions act=new Actions(driver);
				act.contextClick(element).click().build().perform();
			}catch(Exception e){
				System.out.println(e.getMessage());
				
			}
		}
		  ///doubble click on wbelement
		public static void double_clickElement(WebDriver driver,WebElement element) {
			try {
				Actions act=new Actions(driver);
				act.doubleClick(element).click().build().perform();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		///get text method
		 public static String getText_Element(WebElement element) {
			 return element.getText();
		 }
		//Keybord Actions copy text
		 public static void copy_text(WebDriver driver) {
			 try {
				 Actions act=new Actions(driver);
				 act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
			 }catch(Exception e) {
				 System.out.println(e.getMessage());
			 }
		 }
		 
		 
		
	}
	

