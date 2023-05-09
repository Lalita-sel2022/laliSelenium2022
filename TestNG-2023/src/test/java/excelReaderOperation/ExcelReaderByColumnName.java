package excelReaderOperation;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderByColumnName {
	public static void main(String[] args) throws IOException {

		FileInputStream fil = new FileInputStream("C:\\Users\\DELL\\Desktop\\TestCases.xlsx");

		XSSFWorkbook workBook = new XSSFWorkbook(fil);
		XSSFSheet sheetName = workBook.getSheet("login");
		XSSFRow row = sheetName.getRow(0);
		//XSSFCell cell = null;
		
	    int cellIndex = 0;
	    //System.out.println("row.getLastCellNum()  "+row.getLastCellNum());
		for(int i=0;i<row.getLastCellNum();i++)
		{
			//System.out.println("row.getCell(i).getStringCellValue().trim().  "+row.getCell(i).getStringCellValue().trim());
			if(row.getCell(i).getStringCellValue().trim().equals("Password")) {
			cellIndex=i;
			}
		}
		
		row=sheetName.getRow(1);
		XSSFCell cell = row.getCell(cellIndex);
		String value = cell.getStringCellValue();
		System.out.println("Cell value is :"+value);
		
		workBook.close();
		fil.close();
		
	}

}
