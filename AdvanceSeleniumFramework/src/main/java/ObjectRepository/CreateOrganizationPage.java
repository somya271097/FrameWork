package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {

	//initilaztion
		public CreateOrganizationPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Declaration
		@FindBy(css = "[alt='Create Organization...']")
		private WebElement orgnaizationPlusSign;
		
		@FindBy(name="accountname")
		private WebElement organizationName;
		
		@FindBy(id="phone")
		private WebElement organizationPhoneNum;
		
		@FindBy(id="email1")
		private WebElement organizationEmailId;

		@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	    private WebElement saveButton;
		
		//getterMethods
		public WebElement getOrgnaizationPlusSign() {
			return orgnaizationPlusSign;
		}

		public WebElement getOrganizationName() {
			return organizationName;
		}

		public WebElement getOrganizationPhoneNum() {
			return organizationPhoneNum;
		}

		public WebElement getOrganizationEmailId() {
			return organizationEmailId;
		}
		public WebElement getSaveButton() {
			return saveButton;
		}

		//BusinessLogics
		/**
		 * This method is used to click on + sign
		 */
		public void clickOrgPlusSign()
		{
			orgnaizationPlusSign.click();
		}
		
		/**
		 * This method is used to enter organization name
		 * @param OrgName
		 */
		public void enterOrgName(String OrgName)
		{
			organizationName.sendKeys(OrgName);
		}
		
		/**
		 * This method is used to enter organization phoneNum
		 * @param phoneNum
		 */
		public void enterOrgPhoneNum(String phoneNum)
		{
			organizationPhoneNum.sendKeys(phoneNum);
		}
		
		/**
		 * This method is used to enter organization email
		 * @param Email
		 */
		public void enterOrgEmail(String Email)
		{
			organizationEmailId.sendKeys(Email);
		}
		/**
		 * This method is used to enter organization data
		 * @param OrgName
		 * @param phoneNum
		 * @param Email
		 */
		  public void orgData(String OrgName,String phoneNum)
		 {
			 organizationName.sendKeys(OrgName);
			 organizationPhoneNum.sendKeys(phoneNum);
			 //organizationEmailId.sendKeys(Email);
		 }
		 
		  /**
		   * This Method is used to click on save Button
		   */
		 public void clickOnSaveButton()
		 {
			 saveButton.click();
		 }

}
