package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FetchDataFronJasonFile {

	public static void main(String[] args) throws Throwable {
		//pulling back
		//push2
		//pull2
		//push3
		FileInputStream file=new FileInputStream("./src/test/resources/jason.jason");

		ObjectMapper jsonData=new ObjectMapper();
		
		JsonNode data = jsonData.readTree(file);
		
		String URL = data.get("url").asText();
		String USERNAME = data.get("username").asText();
		String PASSWORD = data.get("password").asText();
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		 driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		 driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		 driver.findElement(By.name("submitbutton")).click();
		
		
	}

}
