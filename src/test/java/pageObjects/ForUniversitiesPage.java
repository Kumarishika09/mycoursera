package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForUniversitiesPage extends BasePage{

	// Constructor
	public ForUniversitiesPage(WebDriver driver) {
		super(driver);
	}
	
	// Locators
	@FindBy(xpath="//div[@aria-label='Banner']//a[3]")
	WebElement universityBtn_loc;
	
	@FindBy(xpath = "//a[normalize-space()='Solutions']")
	private WebElement solutionsLink;
	
	@FindBy(xpath = "//p[normalize-space()='Upskill teams of 5 to 125 employees']")
	private WebElement upskillTeam;
	
	@FindBy(xpath = "//span[@class='cds-button-label'][normalize-space()='Get Started'][1]")
	private WebElement getStartedButton;
	
	
	// Actions
	public void navigateToForm() {
		universityBtn_loc.click();
		solutionsLink.click();
		upskillTeam.click();
		getStartedButton.click();
	}

}
