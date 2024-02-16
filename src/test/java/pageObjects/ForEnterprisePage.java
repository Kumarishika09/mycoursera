package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForEnterprisePage extends BasePage{
	
	// Constructor
	public ForEnterprisePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// Locators
	@FindBy(xpath = "//a[normalize-space()='For Enterprise']")
	WebElement forEnterpriseBtn;
	 
	 
	// Methods
	 public void clickForEnterpriseBtn() {
		 forEnterpriseBtn.click();
	 }
}
