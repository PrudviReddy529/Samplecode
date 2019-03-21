package work;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class propertiesfiles {	
	static WebDriver driver;		
	public static void main(String[] args) throws IOException {
		
		HashMap<String,String> map = new HashMap<String,String>();

		FileReader fr = new FileReader("G:\\SELENIUM\\new selenium\\Selenium\\properties.files\\config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		
		Set<Object> pro = prop.keySet();
		for(Object map1:pro){	
		String value =prop.getProperty((String) map1);
		map.put(map1.toString(), value);
		}
		for(String kvs : map.keySet())
	
  System.out.println(kvs +  " : " +map.get(kvs));
	}

}
