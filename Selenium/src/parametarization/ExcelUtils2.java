package parametarization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils2 {

	XSSFWorkbook wb ;
	XSSFSheet sheet;
	
	public ExcelUtils2(String excelPath){
	
		try {
			File src = new File(excelPath);
			
			FileInputStream fis = new FileInputStream(src);
			try {
				wb = new XSSFWorkbook(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}  catch (FileNotFoundException e ) {
			
			System.out.println("unable to read the data from excel :"+ e.getMessage());
		}
		
	}
	public String getData(String sheetName, int rowNum, int colNum){
		sheet =wb.getSheet(sheetName);
		
		String data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
		return data;
		
	   }
}
 