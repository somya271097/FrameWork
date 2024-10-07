package TestNgprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_utility.Java_Utility;

public class DataProviderEx2 {

	@Test(dataProvider="readData")
	public void organisationModuleTest(String orgName,String phnNum,String mailId) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.id("phone")).sendKeys(phnNum);
		driver.findElement(By.id("email1")).sendKeys(mailId);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.quit();

	}
@DataProvider
public Object[][] readData()
{
   	Object[][] objArr=new Object[3][3];
   	
   	Java_Utility jlib = new Java_Utility();
   	int ranNum=jlib.getRandomNum();
   	
   	objArr[0][0]="AAA";
	objArr[0][1]="9425765961";
	objArr[0][2]="abc@gmail.com";
	
	
	
	
	objArr[1][0]="BBB";
	objArr[1][1]="9654568";
	objArr[1][2]="abc@gmail.com";
	
	
	
	
	objArr[2][0]="CCC";
	objArr[2][1]="9654689";
	objArr[2][2]="abc@gmail.com";
	
	
	
	
	
	return objArr;
	







}









}
