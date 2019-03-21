package excelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelfrom {

	public static void main(String[] args) {
		try {
					FileInputStream fis = new FileInputStream("G:\\SELENIUM\\new selenium\\AmericanAirlines\\TestData\\testData.xlsx");
					
					XSSFWorkbook wb = new XSSFWorkbook(fis);
					XSSFSheet sheet = wb.getSheet("PRUDVI2");
					//System.out.println(sheet.getLastRowNum());
					//System.out.println(sheet.getPhysicalNumberOfRows());
				    int totalrows = sheet.getLastRowNum();
					
				    for(int rNum = 1;rNum<=totalrows-1;rNum++){
				    	XSSFRow row = sheet.getRow(rNum);
				    	if(row!= null){
						XSSFCell cell =row.getCell(0);
					    CellType cellType = cell.getCellType();
						Object val;
						 switch (cellType) {
						case STRING:
							val= cell.getStringCellValue();
							break;
						case NUMERIC:
							val = cell.getNumericCellValue();
							break;
						default:
							val = "";
							break;
						}
						System.out.println(val);
				    	}
				    }
					
					wb.close();
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

	}


