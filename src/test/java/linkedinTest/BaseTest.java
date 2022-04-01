package linkedinTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import core.PropertyReader;

public class BaseTest {
	public String Browser = "" ;
	public static WebDriver driver;
	public String baseUrl="https://www.linkedin.com/home";
	String driverPathCHROME="/LinkedinTest/src/main/resources/Driver/chromedriver.exe";
	String driverPathFIREFOX="/LinkedinTest/src/main/resources/Driver/geckodriver.exe";
	public String login_email = "" ;
	public String login_password = "" ;	
		  
		@BeforeSuite
		public void launchBrowser() throws IOException 
		{
			  Browser= getbrowser();
			  System.out.println("launching browser . . . ");
			  //Setter and Getter Email & Pass
			    this.login_email=this.getloginemail();
			    this.login_password=this.getloginpassword();
		      switch(Browser)
		      {
		      case "chrome":
		    	  System.setProperty("webdriver.chrome.driver", driverPathCHROME);
		    	  driver = new ChromeDriver();
		    	  driver.manage().window().maximize();  // maximize the browser window
		    	  driver.get(baseUrl); //open the application url	    	   
		    	  break;
		      case "firefox":
		    	  System.setProperty("webdriver.gecko.driver", driverPathFIREFOX);
		    	  driver = new FirefoxDriver();
		    	  driver.manage().window().maximize();  // maximize the browser window
		    	  driver.get(baseUrl); //open the application url
		    	  break;
		      }
		}

		private String getloginpassword() throws IOException {
			return PropertyReader.getPropertiesFile("Password");
			// TODO Auto-generated method stub		
		}

		private String getloginemail() throws IOException {
			// TODO Auto-generated method stub
			return PropertyReader.getPropertiesFile("Email");
		}

		private String getbrowser() throws IOException {
			// TODO Auto-generated method stub
			return  PropertyReader.getPropertiesFile("Browser");
		}	
}
