package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcelFile {

	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\somya\\OneDrive\\Documents\\Book1.xlsx");
		
		Workbook book=WorkbookFactory.create(fis);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		Row row=sheet.createRow(6);
		Cell cel=row.createCell(6);
		
		cel.setCellValue("QSPIDERS");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\somya\\OneDrive\\Documents\\Book1.xlsx");
		book.write(fos);
		book.close();
		
		

	}

}
