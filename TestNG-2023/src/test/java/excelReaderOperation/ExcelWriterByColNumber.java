package excelReaderOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriterByColNumber {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fil= new FileInputStream("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");
		FileOutputStream fos= null;
		
		XSSFWorkbook workbook= new XSSFWorkbook(fil);
		XSSFSheet sheet = workbook.getSheet("login");
		XSSFRow row = sheet.getRow(1);
		
		XSSFCell cell = row.getCell(1);
		cell.setCellValue("admin123");
		fos = new FileOutputStream("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");
		workbook.write(fos);
		
		workbook.close();
		fos.close();
		

	}

}
