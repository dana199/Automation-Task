package core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	public static String propertyValue = "";

	public static String getPropertiesFile(String propertyKey ) throws IOException 
	{
			InputStream input = new FileInputStream("C:\\LinkedinTest\\src\\main\\resources\\data.properties"); //create object of class input stream
			Properties prop = new Properties();  //create an object from Properties class
			prop.load(input);
			propertyValue=prop.getProperty(propertyKey);
		   //System.out.print(prop.getProperty("email"));		
		return propertyValue;
	}
}
