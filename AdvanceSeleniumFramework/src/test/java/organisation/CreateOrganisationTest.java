package organisation;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_Utility;
import Generic_utility.File_Utility;
import Generic_utility.Java_Utility;
import Generic_utility.Webdriver_Utility;
import ObjectRepository.CreateOrganizationPage;
import ObjectRepository.ValidatingPage;
import ObjectRepository.VtigerHomePage;
import ObjectRepository.VtigerLoginPage;

@Listeners(Generic_utility.ExtendsReportsImp.class)
public class  CreateOrganisationTest extends BaseClass{
	@Test(groups = {"regressionTest"})

	public  void  createOrganisationTest()throws Throwable
	{
//		 WebDriver driver =new ChromeDriver();
////		//Step1:- Create a object of FileInStream class(connection of physical file path)
////		FileInputStream fis = new FileInputStream("./src/test/resources/PropertiesData.properties");
////
////		//step2:- load all the keys to Properties class
////		Properties pro = new Properties();
////		pro.load(fis);
////	
////		//Step3:- call keys from properties file
////		String BROWSER = pro.getProperty("browser");
////		String URL = pro.getProperty("url");
////		String USERNAME = pro.getProperty("username");
////	    String PASSWORD = pro.getProperty("password");
//		
//	  
//		
////		if(BROWSER.equalsIgnoreCase("chrome"))
////		{
////			driver=new ChromeDriver();
////		}
////		else if(BROWSER.equalsIgnoreCase("firefox"))
////		{
////			driver=new FirefoxDriver();
////		}
////		else if (BROWSER.equalsIgnoreCase("edge"))
////		{
////			driver=new EdgeDriver();
////		}
////		else
////		{
////			driver=new FirefoxDriver();
////		}
//		 File_Utility flib = new File_Utility();
//			Java_Utility jlib = new Java_Utility();
//			Excel_Utility elib = new Excel_Utility();
//			
//			String URL = flib.getKeyAndValuePair("url");
//			String USERNAME = flib.getKeyAndValuePair("username");
//			String PASSWORD = flib.getKeyAndValuePair("password");
//			
//		driver.get(URL);
//		driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(USERNAME);
//		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//		driver.findElement(By.id("submitButton")).click();
//		driver.findElement(By.linkText("Organizations")).click();
//		
//		driver.findElement(By.xpath("//img[@alt=\"Create Organization...\"]")).click();
//
////		Random ran = new Random();
////		int ranNum = ran.nextInt(1000);
////		
////		//step1:- path connection
////		FileInputStream fis1 = new FileInputStream("C:\\Users\\somya\\OneDrive\\Documents\\TestData2pm.xlsx");
////
////		       //step2:- excel file in read mode
////			Workbook book = WorkbookFactory.create(fis1);
////			  
////			//step3:- get control on sheet
////			Sheet sheet = book.getSheet("Organization");
////			
////			//step4:- get control on row
////			Row row = sheet.getRow(0);
////			
////			//step5:- get control on cell
////			Cell cell = row.getCell(0);
////			
////			//step6:-fetching the cell value
////			String OrgName = cell.getStringCellValue()+ranNum;
//		int ranNum = jlib.getRandomNum();
//
//		String OrgName = elib.getExcelData("Organization", 0, 0) + ranNum;
//		String PhnNum = elib.getExcelDataUsingDataFormatter("Organization", 1, 0);
//		String email = elib.getExcelDataUsingDataFormatter("Organization", 2, 0);
//
//			driver.findElement(By.name("accountname")).sendKeys(OrgName);
//            
////			Row row1 = sheet.getRow(1);
////			
////			//step5:- get control on cell
////			Cell cell1 = row1.getCell(0);
////			
////			//step6:-fetching the cell value
////			DataFormatter format = new DataFormatter();
////			String phnNum = format.formatCellValue(cell1);
//			
//			driver.findElement(By.id("phone")).sendKeys(PhnNum);
//			
////            Row row2 = sheet.getRow(2);
////			
////			//step5:- get control on cell
////			Cell cell2 = row2.getCell(0);
////			
////			//step6:-fetching the cell value
////			
////			String email = format.formatCellValue(cell2);  
//			
//			driver.findElement(By.id("email1")).sendKeys(email);
//
//			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//
//			Thread.sleep(2000);
//			
//			VtigerHomePage home = new VtigerHomePage(driver);
//
//			home.naviagteCamp(driver);
//			
////String actData = driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
////
////if(actData.contains(OrgName))
////{
////System.out.println("Organization name is created");
////}
////else
////{
////System.out.println("Organization name not created");
////}
//			
//
//			ValidatingPage validate = new ValidatingPage(driver);
//			validate.validateOrganisationPage(driver, OrgName);
//             Thread.sleep(1000);
////driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
////driver.findElement(By.linkText("Sign Out")).click();
////		
//              home.clickOnAdmLink();
//              home.ClickSignOutLink();
//
		// WebDriver driver=new ChromeDriver();
		 File_Utility flib = new File_Utility();
		 Webdriver_Utility wlib = new Webdriver_Utility();
		 Java_Utility jlib = new Java_Utility();
		 Excel_Utility elib = new Excel_Utility();
		
		
//  String URL = flib.getKeyAndValuePair("url");
//  String USERNAME = flib.getKeyAndValuePair("username");
//  String PASSWORD = flib.getKeyAndValuePair("password");
//		
//  wlib.windowMaximize(driver);
//	wlib.pageToLoad(driver);
//		
//  driver.get(URL);
//  VtigerLoginPage login = new VtigerLoginPage(driver);
//  login.loginToVtiger(USERNAME, PASSWORD);
 
  VtigerHomePage home = new VtigerHomePage(driver);
  home.clickOrgLink();
 
  CreateOrganizationPage orgPage = new CreateOrganizationPage(driver);
  orgPage.clickOrgPlusSign();
  int ranNum = jlib.getRandomNum();
  String organizationData = elib.getExcelDataUsingDataFormatter("Organization", 0, 0)+ranNum;
  String phoneNum = elib.getExcelDataUsingDataFormatter("Organization", 2, 1);
  
  orgPage.orgData(organizationData, phoneNum);
  orgPage.clickOnSaveButton();
 
    ValidatingPage validate = new ValidatingPage(driver);
	validate.validateOrganisationPage(driver,organizationData);
   Thread.sleep(2000);
//    home.clickOnAdmLink();
//	home.ClickSignOutLink();
//	

	}

}
