package organisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

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
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

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
@Listeners(Generic_utility.ExtendsReportsImp.class)
public class CreateCampaignsTest extends BaseClass {

	//@Test(groups = {"smokeTest"})

	//@Test(retryAnalyzer = Generic_utility.RetryImp.class)
	@Test
	public void CreateCampaigns() throws Throwable {
	//public static void main(String[] args) throws Throwable {
//		WebDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
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
//		File_Utility file = new File_Utility();
//		String URL=file.getKeyAndValuePair("url");
//		String USERNAME=file.getKeyAndValuePair("username");
//		String PASSWORD=file.getKeyAndValuePair("password");
//		
//	    driver.get(URL);
//	    
//	    //Reading Data using getter methods
////	    VtigerLoginPage login = new VtigerLoginPage(driver);
////	    login.getUserTextfield().sendKeys(USERNAME);
////	    login.getPassWordTextField().sendKeys(PASSWORD);
////	    login.getLoginButton().click();
//	    
//	    //Business Logics
//	    VtigerLoginPage login=new VtigerLoginPage(driver);
//	    login.loginToVtiger(USERNAME, PASSWORD);
//	    
////	    driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(USERNAME);
////		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
////		driver.findElement(By.id("submitButton")).click();
//		
//	   VtigerHomePage home = new VtigerHomePage(driver); 
//	   
//	 
//		WebElement morelink = driver.findElement(By.linkText("More"));
//		Actions act=new Actions(driver);
//		act.moveToElement(morelink).perform();
//		
//		driver.findElement(By.linkText("Campaigns")).click();
//		
//		driver.findElement(By.xpath("//img[@alt=\"Create Campaign...\"]")).click();
//
////		Random ran = new Random();
////		int ranNum = ran.nextInt(1000);
//		Java_Utility jlib = new Java_Utility();
//		int ranNum = jlib.getRandomNum();
//		
////		//step1:- path connection
////		FileInputStream fis1 = new FileInputStream("C:\\Users\\somya\\OneDrive\\Documents\\TestData2pm.xlsx");
////
////		       //step2:- excel file in read mode
////			Workbook book = WorkbookFactory.create(fis1);
////			  
////			//step3:- get control on sheet
////			Sheet sheet = book.getSheet("Campaigns");
////			
////			//step4:- get control on row
////			Row row = sheet.getRow(0);
////			
////			//step5:- get control on cell
////			Cell cell = row.getCell(0);
////			
////			//step6:- fetching the cell value
////			String campData = cell.getStringCellValue()+ranNum;
//		
//		Excel_Utility elib = new Excel_Utility();
//		String campData=elib.getExcelData("Campaigns", 0, 0)+ranNum;
//		
//		
//		
//	            System.out.println(campData);
//	        
//	            driver.findElement(By.name("campaignname")).sendKeys(campData);
//	    		driver.findElement(By.cssSelector("[title=\"Save [Alt+S]\"]")).click();
//
//	    		String actData = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
//
//	    		if (actData.contains(campData)) {
//	    			System.out.println("campaigns name is created");
//	    		} else {
//	    			System.out.println("campaigns name is not created");
//	    		}
//
//	    		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
//	    		driver.findElement(By.linkText("Sign Out")).click();   
//	    
		
         // WebDriver driver = new ChromeDriver();
		
		Webdriver_Utility wlib = new Webdriver_Utility();
        File_Utility file = new File_Utility();
		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib = new Excel_Utility();

//		wlib.windowMaximize(driver);
//
//		String URL = file.getKeyAndValuePair("url");
//		String USERNAME = file.getKeyAndValuePair("username");
//		String PASSWORD = file.getKeyAndValuePair("password");
//
//		driver.get(URL);
//
//		// Business Logics
//		VtigerLoginPage login = new VtigerLoginPage(driver);
//		login.loginToVtiger(USERNAME, PASSWORD);

		VtigerHomePage home = new VtigerHomePage(driver);

		home.naviagteCamp(driver);

		CreateCampPage campPage = new CreateCampPage(driver);
		campPage.clickLookUpImg();
		

		int ranNum = jlib.getRandomNum();

		String campData=elib.getExcelData("Campaigns", 0, 0)+ranNum;	
		System.out.println(campData);

		
		campPage.enterCampName(campData);
		campPage.clickSaveButton();

		ValidatingPage validate = new ValidatingPage(driver);
		validate.validateCampPage(driver, campData);
		//===========Hard Assertion=============//
//		String actData = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
//      Assert.assertEquals(actData, campData);
		//===========[==================//
//		home.clickOnAdmLink();
//		home.ClickSignOutLink();
	}
	/*	@Test(groups = {"smokeTest","regressionTest","sanityTest"})
		
		public void createProductTest() throws Throwable {
			File_Utility flib = new File_Utility();
			Java_Utility jlib = new Java_Utility();
			Excel_Utility elib = new Excel_Utility();
			Webdriver_Utility wlib = new Webdriver_Utility();
			VtigerHomePage home = new VtigerHomePage(driver);
			home.clickPrdLink();

			CreateProductPage prdPage = new CreateProductPage(driver);
			prdPage.clickloopUpImg();

			int ranNum = jlib.getRandomNum();
			String prdName = elib.getExcelData("Product", 0, 0)+ranNum;
			prdPage.enterPrdName(prdName);
			prdPage.clicksaveButton();

				Thread.sleep(2000);
				ValidatingPage validate = new ValidatingPage(driver);
				validate.validateProductPage(driver, prdName);
	      }
	
*/
        }
