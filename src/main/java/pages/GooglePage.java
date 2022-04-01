package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.Locators;

public class GooglePage extends BasePage 
{

	public GooglePage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void GoogleSearch(String searchData)
	{
		setFieldtext(Locators.Google_SEARCH_BOX,searchData);
		sendKeysToInput(Locators.Google_SEARCH_BOX);
		StoreResultLinksToList();
	}
	public List<String> StoreResultLinksToList() 
	{	
			 List<WebElement> LinksFromGoogleSearch= ListOfElements(Locators.Google_Linkes);			 			
			 List<String> GoogleLinkes = new ArrayList<String>(5);	
				int j;
				 for(j=0;j<6;j++)
					{
					 GoogleLinkes.add(LinksFromGoogleSearch.get(j).getText());
					}
		
		return  GoogleLinkes;
	}
	
  }
