package core;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CSVDataReader
{
	private static Object[][] SearchTextfromCSV ;
	private static Reader reader = null;
	static String Texttype;

	public static Object[][] readCSVData()  
	{
		String csvFile = "/LinkedinTest/src/main/resources/SearchDataToRead.csv"; 		
				
		try
		{
			int i=0;
			reader = new FileReader(csvFile);
			SearchTextfromCSV=new Object[1][2];
			Iterable <CSVRecord> records = CSVFormat.EXCEL.parse(reader);
			
			 for (CSVRecord record : records) 
		        {
				 SearchTextfromCSV[i][i]= record.get(i);
				 Texttype =(SearchTextfromCSV[i][i+1]= record.get(i+1)).toString();
			     }   
			 
		} 
		catch ( IOException e ) 
		{   e.printStackTrace();	} 
		//System.out.print(Texttype);
		return SearchTextfromCSV;
	}
}
