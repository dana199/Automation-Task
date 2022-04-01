package pages;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.Locators;

public class SearchPage extends BasePage
{ 
	public static String filepath = "/LinkedinTest/src/main/resources/ResultTowrite.csv";
	String SEPARATOR = "\n";
	public SearchPage(WebDriver driver)
	{
		super(driver);
	}
	public void FillTextInSearch(String searchData) 
	{
		setFieldtext(Locators.Search_Box,searchData);
		sendKeysToInput(Locators.Search_Box);	
	}
	public void clickType(String Texttype) 
	{
		 clickelement(By.xpath("//*[@aria-label=\'"+Texttype+"\']"));		 
	}
	public List<String> StoreLinksInList()
	{   
		List<WebElement> LinksFromLinkedInSearch = ListOfElements(Locators.LinkedIn_Profile_Linkes);
		List<String> LinkedInLinkes = new ArrayList<String>(5);	
		int i;
		 for(i=0;i<6;i++)
			{
			 LinkedInLinkes.add(LinksFromLinkedInSearch.get(i).getText());
			}
		return LinkedInLinkes;	
	}	
	/*public void writeData() throws IOException 
	{
		 String SEPARATOR = "\n";
		 try (FileWriter file = new FileWriter(filepath))
		 {
			//Add header
			 file.append("Names");
			 //Add a new line after the header
			 file.append(SEPARATOR);	
			 
		 List<String> Names = new ArrayList<String>(5);	
		 int i;
		 List<WebElement> LinkedInProfileNames= ListOfElements(Locators.LinkedIn_Profile_Names);
		 for(i=0;i<6;i++)
			{
			 Names.add(LinkedInProfileNames.get(i).getText());
			}				
		 for(i=1;i<Names.size();i++)
		 {
			 file.write(Names.get(i-i)+",");
			 file.append(SEPARATOR);
			 file.write(Names.get(i++));
	         file.append(SEPARATOR);		         
         }
		 //Add header
		 file.append("Locations");
		 //Add a new line after the header
		 file.append(SEPARATOR);
		   List<WebElement> LinkedInProfileLocations=  ListOfElements(Locators.LinkedIn_Profile_Locations);
		   List<String> Locations = new ArrayList<String>(5);	
		    for(i=0;i<6;i++)
			{
			 Locations.add(LinkedInProfileLocations.get(i).getText());
			}
		    for(i=1;i<Locations.size();i++)
			 {
				 file.write(Locations.get(i-i)+",");
				 file.append(SEPARATOR);
				 file.write(Locations.get(i++));
		         file.append(SEPARATOR);
	        }
		 }
	}*/
	public List<String> WriteNamestocsv() throws IOException 	
	{   
	     String Header ="Names";
	     try (FileWriter file = new FileWriter(filepath)) {
			//Add header
			 file.append(Header);
			 //Add a new line after the header
			 file.append(SEPARATOR);	    
			 int i;
			 List<WebElement> LinkedInProfileNames= ListOfElements(Locators.LinkedIn_Profile_Names);
			 List<String> Names = new ArrayList<String>(5);				 
			 for(i=0;i<6;i++)
				{
				 Names.add(LinkedInProfileNames.get(i).getText());
				}				
			 for(i=1;i<Names.size();i++)
			    {
				 file.write(Names.get(i-i)+",");
				 file.append(SEPARATOR);
				 file.write(Names.get(i++));
		         file.append(SEPARATOR);		         
	            }		          
			 System.out.println(Names);
			 return Names;
		}
	}
	
	public List<String> WriteLocationtocsv() throws IOException 
	{   
        String Header ="Locations";
        try (FileWriter file = new FileWriter(filepath)) {
		//Add header
		 file.append(Header);
		 //Add a new line after the header
		 file.append(SEPARATOR);
		int i;
	    List<WebElement> LinkedInProfileLocations=  ListOfElements(Locators.LinkedIn_Profile_Locations);
	    List<String> Locations = new ArrayList<String>(5);	
	    for(i=0;i<6;i++)
		{
		 Locations.add(LinkedInProfileLocations.get(i).getText());
		}
	    for(i=1;i<Locations.size();i++)
		 {
			 file.write(Locations.get(i-i)+",");
			 file.append(SEPARATOR);
			 file.write(Locations.get(i++));
	         file.append(SEPARATOR);
        }
	          
		 System.out.println(Locations);
		 return Locations;
	}
	 }
	public List<String> WritePositionstocsv() throws IOException {
	    String SEPARATOR = "\n";
        String Header ="Positions";
        try(FileWriter file = new FileWriter(filepath)) {
		//Add header
		 file.append(Header);
		 //Add a new line after the header
		 file.append(SEPARATOR);
		 int i;
		
		 List<WebElement> LinkedInProfilePositions= ListOfElements(Locators.LinkedIn_Profile_Positions);			
		 List<String> Positions = new ArrayList<String>(5);	
	     for(i=0;i<6;i++)
		  {
		   Positions.add(LinkedInProfilePositions.get(i).getText());
		  }
	     for(i=1;i<Positions.size();i++)
		  {
			 file.write(Positions.get(i-i)+",");
			 file.append(SEPARATOR);
			 file.write(Positions.get(i++));
	         file.append(SEPARATOR);
          }	          
		 System.out.println(Positions);
		 return Positions;
				
	}
	}

}
