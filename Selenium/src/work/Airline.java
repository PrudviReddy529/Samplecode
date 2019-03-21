package work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Airline {
	static WebDriver driver;
	static int passengerIndex = 0;

	public static void main(String[] args) {
			String passengerType = "2IS-2Y-4A";
			int totalPassengers = 4;
			System.setProperty("webdriver.chrome.driver", "G:\\SELENIUM\\new selenium\\Selenium\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.americanairlines.in/i18n/moresearch.jsp?locale=en_IN");
			
			WebElement passengerCount = driver.findElement(By.id("passengerCount"));
			
			Select passengers = new Select(passengerCount);
			passengers.selectByVisibleText(String.valueOf(totalPassengers));		
			
			if (passengerType.contains("-")){
				String[] allPassTypes = passengerType.split("-");
				
				for (String passType : allPassTypes){
					selectPassengerType(passType);				
				}
				
				
			} else {
				selectPassengerType(passengerType);
			}	

		}
		
		
		
			private static void selectPassengerType(String passengerType){
			
				int passengerCountForType = Integer.parseInt(passengerType.substring(0, 1));
				String type = passengerType.substring(1);
				
				for (int pcount = 1; pcount <= passengerCountForType; pcount++){
					WebElement element = driver.findElement(By.id("passengers"+passengerIndex+".passengerType"));
					Select passengerList = new Select(element);	
					switch (type.toUpperCase()) {
					case "Y":
						passengerList.selectByValue("YOUTH");
						break;
						
					case "A":
						passengerList.selectByValue("ADULT");
						break;
						
					case "C":
						passengerList.selectByValue("CHILD");
						break;
						
					case "S":
						passengerList.selectByValue("SENIOR");
						break;
						
					case "IS":
						passengerList.selectByValue("INFANT_SEAT");
						break;
						
					case "IL":
						passengerList.selectByValue("INFANT_LAP");
						break;
						
             default:
						break;
					}
					
					passengerIndex++;
				}
				
			}
	
}
