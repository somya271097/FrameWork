package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertMultipleDataToExcelSheet {

	public static void main(String[] args) throws Throwable {
       FileInputStream fis=new FileInputStream("C:\\Users\\somya\\OneDrive\\Documents\\Book1.xlsx");
		
		Workbook book=WorkbookFactory.create(fis);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		 List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		 for (int i=0;i<alllinks.size();i++)
		 {
			Row row=sheet.createRow(i);
			Cell cel=row.createCell(0);
			cel.setCellValue(alllinks.get(i).getAttribute("href"));
		
		}
		 FileOutputStream fos=new FileOutputStream("C:\\Users\\somya\\OneDrive\\Documents\\Book1.xlsx");
			book.write(fos);
			book.close();
			
		
		
		

	}

}
