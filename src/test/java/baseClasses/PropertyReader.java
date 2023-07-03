package baseClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	private static Properties properties=null; 
	
	public static Properties load()
	{
		if(properties==null)
		{
			properties= new Properties();
			try {
				properties.load(new FileInputStream("src\\test\\resources\\Data\\data.properties"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return properties;
	}

    public static String  getProperty(String str)
    {
    	return properties.getProperty(str);
		
		//added to github by venky
    }
	
}
