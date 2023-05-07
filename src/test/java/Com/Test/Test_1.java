package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Pages.Loginpom;
import Com.Utility.BaseClass;
import Com.Utility.Library;

public class Test_1 extends BaseClass{

	
	
	//we write test case steps
	@Test
	public void verifylogin_page() {
		Loginpom login=PageFactory.initElements(driver, Loginpom.class);
		
		Library.custem_sendKeys(login.getText_email(), excel.getStringdata_Excel("login", 0, 0));
		Library.custem_sendKeys(login.getText_password(),excel.getStringdata_Excel("login", 0, 1) );
		Library.custem_click(login.getLoginbtn());
		
		
	}
	
	
}
