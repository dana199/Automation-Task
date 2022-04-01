package core;

import org.openqa.selenium.By;

public class Locators 
 {
	 public static final By EMAIL_FIELD = By.id("session_key");
     public static final By PASSWORD_FIELD = By.id("session_password");
     public static final By SIGN_IN_BUTT = By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/button");
     public static final By Avatar = By.id("ember35"); 
     public static final By Please_enter_a_valid_email_address_or_mobile_number =By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[1]/div/p");
     public static final By Thats_not_the_right_password = By.id("error-for-password");
     public static final By Search_Box = By.xpath("//*[@id=\"global-nav-typeahead\"]/input");
     public static final By People_BTN = By.xpath("//*[@aria-label=\"People\"]"); 
     public static final By close_messaging = By.xpath("/html/body/div[6]/aside/div[1]/header/div[3]/button[2]/li-icon");
     public static final By Google_SEARCH_BOX = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
     public static final By LinkedIn_Profile_Linkes = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/main/div/div/div[2]/ul/li/div/div/div[1]/div/a");
     public static final By LinkedIn_Profile_Names = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/main/div/div/div[2]/ul/li/div/div/div[2]/div/div[1]/div/span[1]/span/a/span/span[1]");
     public static final By LinkedIn_Profile_Locations = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/main/div/div/div[2]/ul/li/div/div/div[2]/div/div[2]/div/div[2]");
     public static final By LinkedIn_Profile_Positions = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/main/div/div/div[2]/ul/li/div/div/div[2]/div/div[2]/div/div[1]");
     public static final By Google_Linkes = By.xpath("/html/body/div[7]/div/div[10]/div/div[2]/div[2]/div/div/div/div/div[1]/div/a");
 }

