package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Pages.Loginpom;
import Com.Utility.Library;


public class Test_1 extends Com.Utility.BaseClass{
	
	
	// test cases Steps
	@Test
	public void verify_loginpage() {
		
		// elment --> emaiid,password,login
		
		Loginpom login=PageFactory.initElements(driver, Loginpom.class);
		
		Library.custem_sendKeys(login.getText_email(), excel.getStringData_Excel("Login", 0, 0));
		Library.custem_sendKeys(login.getText_password(), excel.getStringData_Excel("Login", 0, 1));
		Library.custem_click(login.getLoginbtn());
		
		
	}

}