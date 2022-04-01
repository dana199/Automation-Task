package core;

import java.io.FileWriter;
import java.util.List;
import com.opencsv.CSVWriter;
import pages.SearchPage;

public class CSVDataWriter 
{
	public static void writeData() throws Exception
	{
	      //Instantiating the CSVWriter class
	      CSVWriter writer = new CSVWriter(new FileWriter("C:\\LinkedinTest\\src\\main\\resources\\TestResultTowrite.csv"));
	    
	      //SearchPage page = new SearchPage(null);
	      
	      // List<String> X=page.WriteNamestocsv();
	      
	      //Writing data to a csv file
	         
	      //Writing data to the csv file
	     
	      //Flushing data from writer to file  
    }
}