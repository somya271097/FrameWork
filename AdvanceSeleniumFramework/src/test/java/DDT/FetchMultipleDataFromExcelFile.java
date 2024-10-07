package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcelFile {

	public static void main(String[] args) throws Throwable {

		FileInputStream fis=new FileInputStream("C:\\Users\\somya\\OneDrive\\Documents\\Book1.xlsx");

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet("Sheet2");
		
		int rowNum = sheet.getLastRowNum();
        System.out.println(rowNum);
        
        for (int i = 0; i <rowNum; i++) 
        {
        	Row row = sheet.getRow(i);
        	                        
        	for (int j = 0; j <row.getLastCellNum() ; j++)
        	{
        		Cell cell = row.getCell(j);
        		DataFormatter format=new DataFormatter();
        		String excelData=format.formatCellValue(cell);
        		System.out.println(excelData); 
        		
        	/*	Cell cell = row.getCell(j);
               String links = cell.getStringCellValue();
			System.out.println(links);
        	*/}
		}
        
	}

}
