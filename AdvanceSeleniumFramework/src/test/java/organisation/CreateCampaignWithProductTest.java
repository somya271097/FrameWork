package organisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_Utility;
import Generic_utility.File_Utility;
import Generic_utility.Java_Utility;
import Generic_utility.Webdriver_Utility;
import ObjectRepository.CreateCampPage;
import ObjectRepository.CreateProductPage;
import ObjectRepository.ValidatingPage;
import ObjectRepository.VtigerHomePage;
import ObjectRepository.VtigerLoginPage;
import ObjectRepository.WindowSwitingToProductPage;
@Listeners(Generic_utility.ListenerImplementation.class)
public class CreateCampaignWithProductTest extends BaseClass {

	@Test
	public void createCampaignWithProductTest() throws Throwable, IOException {
		
		//WebDriver driver = new ChromeDriver();
		//---------------------------------------------------------------------------------

//				FileInputStream fis = new FileInputStream("./src/test/resources/PropertiesData.properties");
//
//				// step2:- load all the keys to Properties class
//				Properties pro = new Properties();
//				pro.load(fis);
//
//				// Step3:- call keys from properties file
//				String BROWSER = pro.getProperty("browser");
//				String URL = pro.getProperty("url");
//				String USERNAME = pro.getProperty("username");
//				String PASSWORD = pro.getProperty("password");
//
//				driver.get(URL);
//				driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(USERNAME);
//				driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//				driver.findElement(By.id("submitButton")).click();
//
//				driver.findElement(By.linkText("Products")).click();
//				driver.findElement(By.cssSelector("[title=\"Create Product...\"]")).click();
//
//				Random ran = new Random();
//				int ranNum = ran.nextInt(1000);
//
//				// step1:- path connection
//				FileInputStream fis1 = new FileInputStream("C:\\Users\\somya\\OneDrive\\Documents\\TestData2pm.xlsx");
//
//				// step2:- excel file in read mode
//				Workbook book = WorkbookFactory.create(fis1);
//
//				// step3:- get control on sheet
//				Sheet sheet = book.getSheet("Product");
//
//				// step4:- get control on row
//				Row row = sheet.getRow(0);
//
//				// step5:- get control on cell
//				Cell cell = row.getCell(0);
//
//				// step6:-fetching the cell value
//				String prdName = cell.getStringCellValue() + ranNum;
//				System.out.println(prdName);
//
//				driver.findElement(By.name("productname")).sendKeys(prdName);
//
//				driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
//
//				// ---------------------------------------------------------------------------------------------------
//		//Navigating to campaigns module
//
//				WebElement moreLink = driver.findElement(By.linkText("More"));
//				Actions act = new Actions(driver);
//				act.moveToElement(moreLink).perform();
//
//				driver.findElement(By.linkText("Campaigns")).click();
//				driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
//
//				// step1:- path connection
//				FileInputStream fis2 = new FileInputStream("C:\\Users\\somya\\OneDrive\\Documents\\TestData2pm.xlsx");
//
//				// step2:- excel file in read mode
//				Workbook book1 = WorkbookFactory.create(fis2);
//
//				// step3:- get control on sheet
//				Sheet sheet1 = book1.getSheet("Campaigns");
//
//				// step4:- get control on row
//				Row row1 = sheet1.getRow(0);
//
//				// step5:- get control on cell
//				Cell cell1 = row1.getCell(0);
//
//				// step6:-fetching the cell value
//				String campData = cell1.getStringCellValue() + ranNum;
//				System.out.println(campData);
//
//				driver.findElement(By.name("campaignname")).sendKeys(campData);
//				// -----------------------------------------------------------------------
//		//window switching
//				driver.findElement(By.xpath("//img[@src=\"themes/softed/images/select.gif\"]")).click();
//
//				Set<String> allWins = driver.getWindowHandles();
//
//				Iterator<String> it = allWins.iterator();
//
//				while (it.hasNext()) {
//					String win = it.next();
//					driver.switchTo().window(win);
//					String title = driver.getTitle();
//
//					if (title.contains("Products&action")) {
//						break;
//					}
//				}
//
//				driver.findElement(By.name("search_text")).sendKeys(prdName);
//				driver.findElement(By.name("search")).click();
//
//				// driver.findElement(By.xpath("//a[text()='Iphone61']")).click();
//
//				Thread.sleep(2000);
//				// dynamic xpath
//				driver.findElement(By.xpath("//a[text()='" + prdName + "']")).click();
//				// -+-----------------------------------------------------------------------------------------------
//				// driver switching back to main win
//				Set<String> allWins1 = driver.getWindowHandles();
//
//				Iterator<String> it1 = allWins1.iterator();
//
//				while (it1.hasNext()) {
//					String win1 = it1.next();
//					driver.switchTo().window(win1);
//					String title1 = driver.getTitle();
//
//					if (title1.contains("Campaigns&action")) {
//						break;
//					}
//				}
//				driver.findElement(By.cssSelector("[title=\"Save [Alt+S]\"]")).click();     
//	        
//	--------------------------------------------------------------------
		File_Utility flib = new File_Utility();
		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib = new Excel_Utility();
		Webdriver_Utility wlib = new Webdriver_Utility();

		//WebDriver driver = new ChromeDriver();
//		wlib.windowMaximize(driver);
//		wlib.pageToLoad(driver);
//
//		String URL = flib.getKeyAndValuePair("url");
//		String USERNAME = flib.getKeyAndValuePair("username");
//		String PASSWORD = flib.getKeyAndValuePair("password");
//
//		driver.get(URL);
//		
//    wlib.windowMaximize(driver);
//	wlib.pageToLoad(driver);
//		driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(USERNAME);
//		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//		driver.findElement(By.id("submitButton")).click();
//
//		driver.findElement(By.linkText("Products")).click();
//		driver.findElement(By.cssSelector("[title=\"Create Product...\"]")).click();
//
//		int ranNum = jlib.getRandomNum();
//
//		String prdName = elib.getExcelData("Product", 0, 0) + ranNum;
//
//		driver.findElement(By.name("productname")).sendKeys(prdName);
//
//		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
//
//		// ---------------------------------------------------------------------------------------------------
////Navigating to campaigns module
//
//		WebElement moreLink = driver.findElement(By.linkText("More"));
//		wlib.mouseMoveToElement(driver, moreLink);
//
//		driver.findElement(By.linkText("Campaigns")).click();
//		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
//
//		String campData = elib.getExcelData("Campaigns", 0, 0) + ranNum;
//
//		driver.findElement(By.name("campaignname")).sendKeys(campData);
//		// -----------------------------------------------------------------------
////window switching
//		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/select.gif\"]")).click();
//
//		wlib.windowSwitching(driver, "Products&action");
//
//		driver.findElement(By.name("search_text")).sendKeys(prdName);
//		driver.findElement(By.name("search")).click();
//
//		// driver.findElement(By.xpath("//a[text()='Iphone61']")).click();
//
//		Thread.sleep(2000);
//		// dynamic xpath
//		driver.findElement(By.xpath("//a[text()='" + prdName + "']")).click();
//		// -+-----------------------------------------------------------------------------------------------
//		// driver switching back to main win
//
//		wlib.windowSwitching(driver, "Campaigns&action");
//		driver.findElement(By.cssSelector("[title=\"Save [Alt+S]\"]")).click();
//
//		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
//		driver.findElement(By.linkText("Sign Out")).click();
	int ranNum = jlib.getRandomNum();
//	 VtigerLoginPage login = new VtigerLoginPage(driver);
//	  login.loginToVtiger(USERNAME, PASSWORD);
	 
	  VtigerHomePage home = new VtigerHomePage(driver);
	  home.clickPrdLink();
	  
	  CreateProductPage prdPage = new CreateProductPage(driver);
      prdPage.getLoopUpImg();
      
      String prdName = elib.getExcelData("Product", 0, 0)+ranNum;
      prdPage.enterPrdName(prdName);
      prdPage.clicksaveButton();
    
	home.clickMoreLink();
    home.clickCampLink();
    
    CreateCampPage campPage = new CreateCampPage(driver);
    campPage.clickLookUpImg();
    
    String campaignData = elib.getExcelData("Campaign", 0, 0)+ranNum;
       campPage.enterCampName(campaignData);
       campPage.clickLookUpImg();
       
       wlib.windowSwitching(driver, "Products&action");
       WindowSwitingToProductPage campPrdPage = new WindowSwitingToProductPage(driver);
       campPrdPage.enterProductName(prdName);
       campPrdPage.searchPrdName();
       campPrdPage.prdNamePresent(driver, prdName);
       wlib.windowSwitching(driver, "Campaigns&action");
       campPage.clickSaveButton();
      
       ValidatingPage campProdValidation= new ValidatingPage(driver);
 campProdValidation.validateCampPage(driver, campaignData);
 campProdValidation.validateProductPage(driver, prdName);
// home.clickOnAdmLink();
// home.ClickSignOutLink();
	
	}

}
