package linkedinTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	private String Invalid_Email = "123@dd";
	private String Invalid_pass = "invalidpass";
	
	 @Test(priority=0)
		public void User_Can_login_Successfully() 
	    {	
	        LoginPage login_page = new LoginPage(driver);
			login_page.fillEmail(login_email);
			login_page.fillPassword(login_password);
			login_page.clickSignin();
			login_page.closeMessaging();
			AssertJUnit.assertTrue(login_page.ValidateLogin());
		 } 
		
	 /*  @Test(priority=1)
	   public void User_Cant_login_with_Invalid_Email()
	   {   
		    LoginPage login_page = new LoginPage(driver);
		    login_page.fillEmail(Invalid_Email);
			login_page.fillPassword(login_password);
			login_page.clickSignin();			
		    AssertJUnit.assertTrue(login_page.ValidateAccountError());		   
	   }
	 
	   @Test(priority=2)
	   public void User_Cant_login_with_Invalid_pass() {
		   LoginPage login_page = new LoginPage(driver);
		   login_page.fillEmail(login_email);
		   login_page.fillPassword(Invalid_pass);
		   login_page.clickSignin();
		   AssertJUnit.assertTrue(login_page.ValidatepasswordError());
	   }
	   
	   @Test(priority=3)
	   public void User_Cant_login_with_Invalid_Email_and_Invalid_pass() {
		   LoginPage login_page = new LoginPage(driver);
		   login_page.fillEmail(Invalid_Email);
		   login_page.fillPassword(Invalid_pass);
		   login_page.clickSignin();
		   AssertJUnit.assertTrue(login_page.ValidateAccountError());
	   }*/
	   

}
