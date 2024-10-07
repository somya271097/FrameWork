package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import org.openqa.selenium.support.PageFactory;

public class VtigerLoginPage {

	//Element initialization
	public VtigerLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	
	@FindBy(name="user_name")
	private WebElement userTextfield;
	
	//AND
	//@FindBys({@FindBy(css= "[type=\"password\"]"),@FindBy(name="user_password")})
	@FindBy(name="user_password")
	private  WebElement passWordTextField;
	
	@FindAll({@FindBy(xpath="//input[@type=\"submit\"]"),@FindBy(id="submitButton")})
	private WebElement loginButton;

	//GETTER Methods
	public WebElement getUserTextfield() {
		return userTextfield;
	}

	public WebElement getPassWordTextField() {
		return passWordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Business libraries or business logic
	/**
	 * This method is used to login
	 * @param uSERNAME
	 * @param pASSWORD
	 * @author somya
	 */

	public void loginToVtiger(String USERNAME, String PASSWORD)
	{
		
		userTextfield.sendKeys(USERNAME);
		passWordTextField.sendKeys(PASSWORD);
		loginButton.click();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
