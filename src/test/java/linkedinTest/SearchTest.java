package linkedinTest;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.DataProvider;
import core.CSVDataReader;
import core.CompareTwoListsOfLinks;
import junit.framework.Assert;
import pages.GooglePage;
import pages.SearchPage;

public class SearchTest extends BaseTest {
	@Test(dataProvider = "csvData")
	public void User_Can_Search_Successfully(String SearchData,String Searchtype) throws IOException 
    {	
	SearchPage page = new SearchPage(driver);
	 page.FillTextInSearch(SearchData);
	 page.clickType(Searchtype);
	//page.StoreLinksInList();
	//page. writeData();
	 page.WriteNamestocsv();
	 page.WriteLocationtocsv();
	 page.WritePositionstocsv();
	 driver.get("https://www.google.com");
	 GooglePage googlepage = new GooglePage(driver);
	 String Search = SearchData+ "" + Searchtype + " " +"LinkedIn.com";
	 googlepage.GoogleSearch(Search);
	 List<String> linkedInLinkesLists=page.StoreLinksInList();
	 List<String> GoogleLinkesLists=googlepage.StoreResultLinksToList();
	 CompareTwoListsOfLinks.compareTwoListsOfLinkes(linkedInLinkesLists, GoogleLinkesLists);
	 Assert.assertNotSame(linkedInLinkesLists,GoogleLinkesLists);
    }
	
@DataProvider(name="csvData")
public Object[][] getData() throws IOException 
{
   return CSVDataReader.readCSVData();
}
/*@Test
public void writeData() throws Exception {
	  CSVDataWriter.writeData();
}*/
}
