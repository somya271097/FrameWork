package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcelUsingMap {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\somya\\OneDrive\\Documents\\Book1.xlsx");

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet("Sheet3");
		
		LinkedHashMap<String, String> map = new LinkedHashMap<String,String>();
		
		map.put("10", "somya");
		map.put("20", "shobha");
		int rowNum=0;
		for ( Entry<String, String> m : map.entrySet())
		{
			Row row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue((String)m.getKey());
			row.createCell(1).setCellValue((String)m.getValue());
		}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\somya\\OneDrive\\Documents\\Book1.xlsx");
		book.write(fos);
		book.close();
		
		
		
	}

}
