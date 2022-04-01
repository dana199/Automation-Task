package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import core.Locators;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
    @SuppressWarnings("deprecation")
	public void fillEmail(String loginemail)
    {
    	setFieldtext(Locators.EMAIL_FIELD, loginemail);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @SuppressWarnings("deprecation")
	public void fillPassword(String loginpassword) 
    {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	setFieldtext(Locators.PASSWORD_FIELD,loginpassword);    	
    }
    public void clickSignin() 
    {  
    	clickelement(Locators.SIGN_IN_BUTT);
    }
    public void closeMessaging() {
    	clickcloseMessaging(Locators.close_messaging);
    }


}
