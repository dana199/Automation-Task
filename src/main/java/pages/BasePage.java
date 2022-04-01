package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.Locators;

public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickelement(By locator) {
		driver.findElement(locator).click();	
	}
	public List<WebElement> ListOfElements(By locator) {
		List<WebElement> ele = driver.findElements(locator);
		return ele;
	}	
	public void setFieldtext(By locator, String text) {
		WebElement element = driver.findElement(locator);
		//element.clear();
		element.sendKeys(text);
	}
	public boolean getelement(By locator) {
		WebElement element = driver.findElement(locator);
		return element.isDisplayed();
	}
	public void sendKeysToInput(By locator) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(Keys.ENTER);				
	}
	public void clickcloseMessaging(By locator) {
		driver.findElement(locator).click();
	}
	public boolean ValidateLogin() {
		return (getelement(Locators.Avatar));
	}
	public boolean ValidateAccountError() {
		return (getelement(Locators.Please_enter_a_valid_email_address_or_mobile_number));		
	}
	public boolean ValidatepasswordError() {
		return (getelement(Locators.Thats_not_the_right_password));		
	}
	
}
