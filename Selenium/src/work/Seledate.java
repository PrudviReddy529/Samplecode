package work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Seledate {
	static WebDriver driver;
@Test
public static void dateSle(){
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
	//	c.add(Calendar.MONTH, 3);
		int dayNum = c.get(Calendar.DAY_OF_MONTH);
		int year = c.get(Calendar.YEAR);
    	String monthName = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
        driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
        driver.findElement(By.xpath("//span[text()='"+monthName+"']/following::table/descendant::td/a[text()='"+dayNum+"']")).click();
		}catch (ParseException e) {
		e.printStackTrace();
		}

	}

}
