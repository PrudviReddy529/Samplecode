package webDriver.Practies;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
     static String url;
	public static void main(String[] args) throws Exception {
		try{

			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("http://www.google.com/");
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			//links.addAll(driver.findElements(By.tagName("img")));
			
			System.out.println(	links.size());
			
			for(int i=0;i<=links.size()-1;i++){
				WebElement ele = links.get(i);
				String url = ele.getAttribute("href");
				
				URL link = new URL(url);
				HttpURLConnection httpcon = (HttpURLConnection)link.openConnection();
				httpcon.connect();
			int rescode =	httpcon.getResponseCode();
			if(rescode>=400){
				System.out.println(url+" = " + "is broken link ");
			}else{
				
				System.out.println(url+" = "+ "is valid link");
			}
		}
	}catch(Exception e){
	 
		
		}
   }
}
