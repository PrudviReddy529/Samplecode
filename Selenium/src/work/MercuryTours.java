package work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {
	static WebDriver driver;
public static void main(String[] args) {

	Launch_Application("http://newtours.demoaut.com/mercurysignon.php");
	
	Login("chanti123","chanti@123");
	
	
}	
	
	public static void Launch_Application(String url){
		
		System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
				
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
	
		List<WebElement> elem  = driver.findElements(By.name("userName"));
			
			if(elem.size()==0){
				System.out.println("Application has been not launched");
			}else{
				System.out.println("Application has been launched");
			}
	}		
			//public static void Login(String username,String password){
			public static void Login(String username, String password){
				
			driver.findElement(By.name("userName")).sendKeys(username);	
			driver.findElement(By.name("password")).sendKeys(password);
				
			driver.findElement(By.name("login")).click();
				
				
			}
}


