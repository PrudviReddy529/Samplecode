package parametarization;

public class getExcel1 {


	public static void main(String[] args) {
	
		ExcelUtils2 ex = new ExcelUtils2("G:\\SELENIUM\\new selenium\\AmericanAirlines\\TestData\\testData.xlsx");
		String  exceldata =ex.getData("Sheet2", 1, 4);
		System.out.println(exceldata);
	}

}
