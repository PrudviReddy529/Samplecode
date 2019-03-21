package work;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Airlines {
       static WebDriver driver;
       public static void main(String[] args) {
    	   Scanner sc1 = new Scanner(System.in);
    	   System.out.println("enter the passenger number:");
    	   int totalPassengers= sc1.nextInt();
    	   System.out.println("entered passenger number:"+totalPassengers);
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("enter the String value :");
    	   
    	   String passengerType = sc.nextLine();
    	   
    	   System.out.println("String value :"+passengerType);
    	   
System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
    	   WebDriver driver=new ChromeDriver();
    	   driver.manage().window().maximize();
    	   driver.get("https://www.americanairlines.in/i18n/moresearch.jsp?locale=en_IN");

    	   driver.findElement(By.xpath("//select[@id='passengerCount']/child::option[text()='"+totalPassengers+"']")).click();
    	   List<WebElement> passengerTypeLists = driver.findElements(By.xpath("//div[contains(@id,'passenger') and not(@style='display: none;')]/descendant::select"));
            
    	   if(passengerTypeLists.size()==totalPassengers){
    	   System.out.println("PASS : Total passenger drowp downs displayed : " + totalPassengers + "; Expected : " + totalPassengers);
    	   } else {
    	   System.out.println("FAIL : Total passenger drowp downs displayed : " + passengerTypeLists.size() + "; Expected : " + totalPassengers);
    	   }
    	 //label/select[contains(@id,'passengers')]/child::option[text()='Adult (16-64)']
    	   
    	   
    	 List<WebElement> pass=driver.findElements(By.xpath("//div[contains(@id,'passenger') and not(@style='display: none;')]/descendant::select/option[contains(text(),'"+passengerType+"')]"));
 
    	 for(WebElement passenger :pass ){
    		 passenger.click();
    
    		System.out.println("passName=========="    +passenger.getText());
    	
    		
    	 }
    	// driver.quit();
       }
       
}