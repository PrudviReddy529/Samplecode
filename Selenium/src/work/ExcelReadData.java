package work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {

	public static void main(String[] args) {
		try {
       File src = new File("C:\\Users\\USER\\Desktop\\EXCELDATA\\ExcelWorkSheet.xlsx");
	   FileInputStream fis = new FileInputStream(src);			
		XSSFWorkbook wb = new XSSFWorkbook(fis);			
	    XSSFSheet sheet = wb.getSheetAt(0);	
	    
		int rowcount = sheet.getLastRowNum();
		
		for(int rowNum =0; rowNum<=rowcount-1;rowNum++){
		String data = sheet.getRow(rowNum).getCell(1).getStringCellValue();
		System.out.println("excel data is "+data);
	
		}		
		wb.close();
		
		} catch (IOException e) {
			
			System.out.println("excel sheet is not available:");
		}
		
		
	}
	
	
	
	
	
	
}
