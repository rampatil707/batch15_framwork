package Com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {

	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement text_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement text_password;
	
	@FindBy(how=How.XPATH,using="//button[@id='loginbutton']")
	private WebElement loginbtn;

	public WebElement getText_email() {
		return text_email;
	}

	

	public WebElement getText_password() {
		return text_password;
	}

	

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	
	
	
}
