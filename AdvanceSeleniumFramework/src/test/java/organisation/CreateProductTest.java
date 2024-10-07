package organisation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_Utility;
import Generic_utility.File_Utility;
import Generic_utility.Java_Utility;
import Generic_utility.Webdriver_Utility;
import ObjectRepository.CreateProductPage;
import ObjectRepository.ValidatingPage;
import ObjectRepository.VtigerHomePage;
import ObjectRepository.VtigerLoginPage;
@Listeners(Generic_utility.ExtendsReportsImp.class)
public class CreateProductTest extends BaseClass {

	@Test(groups = {"smokeTest","regressionTest","sanityTest"})
	
	public void createProductTest() throws Throwable {
		 //WebDriver driver=new ChromeDriver();

//		 FileInputStream fis = new FileInputStream("./src/test/resources/PropertiesData.properties");
//
//
//			//step2:- load all the keys to Properties class
//			Properties pro = new Properties();
//			pro.load(fis);
//
//			//Step3:- call keys from properties file
//			String BROWSER = pro.getProperty("browser");
//			String URL = pro.getProperty("url");
//			String USERNAME = pro.getProperty("username");
//		    String PASSWORD = pro.getProperty("password");
		    File_Utility flib = new File_Utility();
			Java_Utility jlib = new Java_Utility();
			Excel_Utility elib = new Excel_Utility();
			Webdriver_Utility wlib = new Webdriver_Utility();

//			wlib.windowMaximize(driver);
//			String URL = flib.getKeyAndValuePair("url");
//			String USERNAME = flib.getKeyAndValuePair("username");
//			String PASSWORD = flib.getKeyAndValuePair("password");
//		    driver.get(URL);
//		    
//		    VtigerLoginPage login = new VtigerLoginPage(driver);
//			login.loginToVtiger(USERNAME, PASSWORD);

			VtigerHomePage home = new VtigerHomePage(driver);
			home.clickPrdLink();

			CreateProductPage prdPage = new CreateProductPage(driver);
			prdPage.clickloopUpImg();

			int ranNum = jlib.getRandomNum();

//			driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(USERNAME);
//			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//			driver.findElement(By.id("submitButton")).click();
//			
//			driver.findElement(By.linkText("Products")).click();
//			driver.findElement(By.cssSelector("[title=\"Create Product...\"]")).click();
//			
//			Random ran = new Random();
//			int ranNum = ran.nextInt(1000);
			
//			//step1:- path connection
//			FileInputStream fis1 = new FileInputStream("C:\\Users\\somya\\OneDrive\\Documents\\TestData2pm.xlsx");
//
//			       //step2:- excel file in read mode
//				Workbook book = WorkbookFactory.create(fis1);
//				  
//				//step3:- get control on sheet
//				Sheet sheet = book.getSheet("Product");
//				
//				//step4:- get control on row
//				Row row = sheet.getRow(0);
//				
//				//step5:- get control on cell
//				Cell cell = row.getCell(0);
//				
//				//step6:-fetching the cell value
//				String prdName = cell.getStringCellValue()+ranNum;
//				System.out.println(prdName);
			String prdName = elib.getExcelData("Product", 0, 0)+ranNum;
			
//				driver.findElement(By.name("productname")).sendKeys(prdName);
//				
//				driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
//				
			prdPage.enterPrdName(prdName);
			prdPage.clicksaveButton();

				Thread.sleep(2000);
//		String actData = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
//
//		if(actData.contains(prdName))
//		{
//		System.out.println("product name is created");
//		}
//		else
//		{
//		System.out.println("product name not created");
//		}

//		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
//		driver.findElement(By.linkText("Sign Out")).click();
	     
		ValidatingPage validate = new ValidatingPage(driver);
		validate.validateProductPage(driver, prdName);

//		home.clickOnAdmLink();
//		home.ClickSignOutLink();

	     
	
	
	}

}
