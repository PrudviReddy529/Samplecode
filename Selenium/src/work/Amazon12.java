package work;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon12 {
		static WebDriver driver;
	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
		
	   driver = new ChromeDriver();
	    
	   driver.manage().window().maximize();
	    
	   driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20785/nz-vs-ind-3rd-odi-india-tour-of-new-zealand-2019");
		
	 //div[@id='innings_1']//following-sibling::div[1]/child::div[13]
	   String row ="//div[@id='innings_1']//following-sibling::div[1]";
		int scrore = driver.findElements(By.xpath(row)).size();
	WebElement scrore1  =driver.findElement(By.xpath("//div[@id='innings_1']//following-sibling::div[1]/child::div[13]"));
		String Fpath = " //div[@id='innings_1']//following-sibling::div[";
		
		String Spath = "]/child::div[13]";
		ArrayList<Integer> value =new ArrayList<Integer>();
		for(int i=0;i<scrore;i++){
			String finalpart = "Fpath"+i+"Spath";
			System.out.println(finalpart);
			
		String finalscore=	driver.findElement(By.xpath("finalpart")).getText();
			Double dscore =Double.parseDouble(finalscore);
			int nz = dscore.intValue();
			System.out.println(nz);
			
			
			
			
			
			
			
			
			
		}
		
		
		
	}

}
