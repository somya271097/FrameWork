package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampPage {

	public CreateCampPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Create Campaign...']")
	private WebElement lookUpImg;
	
	@FindBy(name = "campaignname")
	private WebElement CampName;
	
	@FindBy(css = "[title=\"Save [Alt+S]\"]")
	private WebElement saveButton;

	
	public WebElement getLookUpImg() {
		return lookUpImg;
	}
	public WebElement getCampNAme() {
		return CampName;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void clickLookUpImg()
	{
		lookUpImg.click();
	}
	public void enterCampName(String name)
	{
		CampName.sendKeys(name);
	}
	public void clickSaveButton()
	{
		saveButton.click();
	}
	
}
	

