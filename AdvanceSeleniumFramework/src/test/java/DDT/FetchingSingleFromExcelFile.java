package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingSingleFromExcelFile {

	public static void main(String[] args) throws Throwable {
		
		//step1 path connection
		FileInputStream fis=new FileInputStream("C:\\Users\\somya\\OneDrive\\Documents\\Book1.xlsx");
		//step 2 excel file in read mode
		Workbook book=WorkbookFactory.create(fis);
		//step3 get control on sheet
		Sheet sheet=book.getSheet("Sheet1");
		//step4 get control on row
		Row row=sheet.getRow(4);
		//step5 get control on cell
		Cell cell =row.getCell(2);
		//step 6 fetching cell value in string format
		//String excelData=cell.getStringCellValue();
		
		//fetching data in numerical form it gives in decimal format so use data formatter 
		//double excelData=cell.getNumericCellValue();
		
		//DATA FORMATER:---it reads any data whether it is value,number.special character
		
		DataFormatter format=new DataFormatter();
		String excelData=format.formatCellValue(cell);
		System.out.println(excelData);
		
		
		
		
		
		
		
		
		

	}

}
