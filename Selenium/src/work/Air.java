package work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Air {
	
	static WebDriver driver;
	
	 static String fieldName = "Return";
	 
	public static void main(String[] args) {
		
	   	   //********************************************************
	   System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
	   driver.get("https://www.americanairlines.in/i18n/moresearch.jsp?locale=en_IN");

	   String departDate = "15-03-2019";
	   Date dt = null;
	   SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	   try {
	   dt = sdf.parse(departDate);

	   Calendar c = Calendar.getInstance();	
	   c.setTime(dt);	
	   c.add(Calendar.MONTH, 3);
	   int dayNum = c.get(Calendar.DAY_OF_MONTH);
	   int year = c.get(Calendar.YEAR);
	   //String monthName = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Local.US);




	   } catch (ParseException e) {
	   // TODO Auto-generated catch blo
	   e.printStackTrace();
	   }
	   
	  
	   
	}

	
}



//	driver.findElement(By.xpath("(//label/following::button[@class='ui-datepicker-trigger'])[1]")).click();
	
	
	
	//*[contains(text(),'"+fieldName+"')]/ancestor::div[contains(@id, '"+fieldName.toLowerCase()+"')]/descendant::button
 //simple date format,calender,date: google ssearching 
















//driver.findElement(By.xpath("//*[contains(text(),'"+fieldName+"')]/ancestor::div[contains(@id, '"+fieldName.toLowerCase()+"')]/descendant::button")).click();




