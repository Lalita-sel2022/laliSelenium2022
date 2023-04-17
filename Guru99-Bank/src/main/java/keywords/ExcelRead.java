package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {

		XSSFWorkbook excelWorkbook = null;
		XSSFSheet excelSheet;
		XSSFCell cell;
		FileInputStream file=null;
		
		// Location of excel sheet
		String excelPath = "C:\\Users\\DELL\\Documents\\ExcelRead.xlsx";
		System.out.println(excelPath);
		String sheetName = "Sheet1";
		try {
			file = new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		// Instantiate the workbook
		try {
			excelWorkbook = new XSSFWorkbook(file);
		} catch (IOException e) {
			System.out.println(e);
			
		}
		excelSheet = excelWorkbook.getSheet(sheetName);
		cell = excelSheet.getRow(0).getCell(2);
		String cellData = cell.getStringCellValue();
		System.out.println("Cell Data ::"+cellData);

	}

}
