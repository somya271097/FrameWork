package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchingDataFromPrpertyfile {

	public static void main(String[] args) throws Throwable {
		
		//WebDriver driver=new ChromeDriver();
	//step1: create object of fileInstream class(connection of physical file)
		FileInputStream fis=new FileInputStream("src/test/resources/PropertiesData.properties");
	//step2: load all the keys to properties class
		Properties pro=new Properties();
		pro.load(fis);
	//step3: call keys from properties file
		String BROWSER=pro.getProperty("browser");
		String URL=pro.getProperty("url");
		String USERNAME=pro.getProperty("username");
		String PASSWORD=pro.getProperty("password");
		
		WebDriver driver;
		if (BROWSER.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver();
		
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
	//if the browser given in properties file is not given in condition then default browser will execute
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
	//default browser
		else
		{
			driver=new EdgeDriver();
		}
		driver.get(URL);
		driver.findElement(By.cssSelector("[name='user_name']")).sendKeys(USERNAME);
		driver.findElement(By.cssSelector("[name='user_password']")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
	}

}
