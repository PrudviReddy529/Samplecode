package webDriver.Practies;



import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlDataRead {
	private static DocumentBuilderFactory dbf;
	private static DocumentBuilder db;
	private static Document rep;
	
	public static By loadRepository(String repPath){
		
		try {
			dbf = DocumentBuilderFactory.newInstance();
			db = dbf.newDocumentBuilder();
			rep = db.parse(repPath);
			
		}catch(FileNotFoundException fne ){
			System.out.println("The repository file :"+repPath+" is  not found in the source:");
		}  catch (IOException e) {
			System.out.println(" The repository file :"+repPath+" is not readable at this moment:");
		}catch (ParserConfigurationException | SAXException  e) {
			System.out.println("Exception generated while calling DocumentBuilder:");
			System.exit(0);
		} 
		return null;
	}
	 private static String[] getObjectInfo(String tagName){
		 String[] objInfo = new String[2];
		 NodeList allElem = rep.getElementsByTagName(tagName);
		 if(allElem.getLength()>1){
			 System.out.println("Element:"+tagName+" is not unique repository :");
			 System.exit(0);
			 
		 }else if(allElem.getLength()==0){
			 System.out.println("Element:"+tagName+" is not found the repository:");
			 System.exit(0);
		 }else{
			 Element elem = (Element)allElem.item(0);
			 if(elem.hasAttribute("locator")){
				 objInfo[0] = elem.getAttribute("locator");
				 if(elem.hasAttribute("value")){
					 objInfo[1] = elem.getAttribute("value");
				 }else{
					 System.out.println("Element :"+tagName+" does not have locator value.");
				 }
			 }else{
				 System.out.println("Element :"+tagName+" does not have locator attribute.");
			 }
			 
		 }
		return objInfo; 
	 }
	public static By getBy(String tagName){	
		By by = null;
		String[] objInfo = getObjectInfo(tagName);
		switch (objInfo[0].toLowerCase()) {
		case "id":
			by= By.id(objInfo[1]);
			break;
		case "name":
			by= By.name(objInfo[1]);
			break;
		case "className":
			by= By.className(objInfo[1]);
			break;
		case "LinkText":
			by= By.linkText(objInfo[1]);
			break;
		case "partiallinktext":
			by= By.partialLinkText(objInfo[1]);
			break;
		case "tagName":
			by= By.tagName(objInfo[1]);
			break;
		case "xpath":
			by= By.xpath(objInfo[1]);
				break;
		case "css":
			by= By.cssSelector(objInfo[1]);
			break;
		default:
			System.out.println("Element: " +objInfo[1]+" is invalid for element:"+tagName+"; locator must be either: id,name,className,linktext,partiallinktext,xpath,tagName,cssSelector.");
			break;
		}
		return by;
	}

}
