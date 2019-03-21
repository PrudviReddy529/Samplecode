package outData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataExcel {

	public static void main(String[] args) throws IOException {
	
		FileInputStream file = new FileInputStream("C:\\Users\\USER\\Desktop\\Data.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheet("PRUDVI2");
		
	    int rowcount =sheet.getLastRowNum();
		
		int colcount = sheet.getRow(0).getLastCellNum();
		
		for(int rownum = 0; rownum<=rowcount-1;rownum++){
			
			XSSFRow currentrow = sheet.getRow(rownum);
			
			for(int cellnum=0;cellnum<=colcount-1;cellnum++){
				
			String 	value = currentrow.getCell(cellnum).toString();
			
			System.err.print(" "+value);
			}
			System.out.println();
		}
		
	}

}
