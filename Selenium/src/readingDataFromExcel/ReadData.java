package readingDataFromExcel;

public class ReadData {

	public static void main(String[] args) {
		
		ExcelDataconfig rds = new ExcelDataconfig("C:\\Users\\USER\\Desktop\\EXCELDATA\\ExcelWorkSheet.xlsx");
		
		System.out.println(rds.getData(0,2,0));
		

	}

}
