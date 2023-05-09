package excelReaderOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriterByColName {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fil= new FileInputStream("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");
		FileOutputStream fos= null;
		
		XSSFWorkbook workbook= new XSSFWorkbook(fil);
		XSSFFont font = workbook.createFont();
		XSSFCellStyle style = workbook.createCellStyle();
		
		XSSFSheet sheet = workbook.getSheet("login");
		font.setFontName("Algerian");
		font.setFontHeight(20);
		font.setBold(true);
		style.setFont(font);
		
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = null;
		
		int cellIndex= -1;
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals("Results"))
					{
			    cellIndex= i;
					}
		}
		
		row =sheet.getRow(2);
		cell=row.getCell(cellIndex);
		cell.setCellStyle(style);
		cell.setCellValue("Aboarting");
		fos = new FileOutputStream("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");
		workbook.write(fos);
		
		workbook.close();
		fos.close();
		

	}


}
