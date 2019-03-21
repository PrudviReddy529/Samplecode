package readingDataFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataconfig {
	String String = null;
	XSSFSheet sheet;
	XSSFWorkbook wb;
	
	public ExcelDataconfig(String filepath){
	try {
        File src = new File(filepath);
        
	    FileInputStream fis= new FileInputStream(src);
		wb= new XSSFWorkbook(fis);
		wb.getSheetAt(0);	
	} catch (Exception e) {
		System.out.println(e.getMessage());
		
	}			
    
	}
	public String  getData(int sheetnum, int row, int colomn){
		sheet = wb.getSheetAt(sheetnum);
		
		String  obj = sheet.getRow(row).getCell(colomn).getStringCellValue();
		
		
		return obj;
	
	}
	
}
