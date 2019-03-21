package work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Goibibo {
     static WebDriver driver;
	@Test
    public void SelectDate() throws InterruptedException, ParseException{
		
        String month = "";
        int day = 0;
        int year = 0;
    	String Selectdata = "24/06/2019";
    	String[] split = Selectdata.split("/");
    	SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
    	Date date = dt.parse(Selectdata);
    	Calendar cal = Calendar.getInstance();
    	cal.setTime(date);
    	month  =cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
    	day =  cal.get(Calendar.DAY_OF_MONTH);
    	year = cal.get(Calendar.YEAR);
System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://www.goibibo.com/");
    	driver.findElement(By.xpath("(//input[contains(@class,'form-control')])[3]")).click();
    	boolean monthDisplayed = true;
    	while(monthDisplayed){
    		try{
   driver.findElement(By.xpath("//div[contains(text(),'"+month+" "+year+"')]/ancestor::div[@class='DayPicker-Month']/descendant::div[text()='"+day+"']")).click();
    	break;
    		}catch(Exception e){
    			
    	driver.findElement(By.xpath("//div/span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
    			
   
    			
    		}
    	}
    }
}