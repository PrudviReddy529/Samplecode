package work;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ClassProperties {
       static WebDriver driver;
    
	public static void main(String[] args) throws IOException {

		//Map<String,String> map = new HashMap<String,String>();

		FileReader fr = new FileReader("G:\\SELENIUM\\new selenium\\Selenium\\properties.files\\config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		
		Set<Object> pro = prop.keySet();
		for(Object keys:pro){
			String value = prop.getProperty(keys.toString());
			System.out.println(keys+"  =  "+value);
			 
		}
	}

}
