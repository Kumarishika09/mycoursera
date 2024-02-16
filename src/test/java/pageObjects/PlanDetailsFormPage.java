package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlanDetailsFormPage extends BasePage{

	// Constructor
	public PlanDetailsFormPage(WebDriver driver) {
		super(driver);
	}
	
	// Locators
	@FindBy(xpath = "//input[@aria-label='Number of users']")
	private WebElement numberOfUsersInput;

	@FindBy(xpath = "//button[@class='cds-128 cds-button-disableElevation cds-button-primary css-efrgiy']")
	private WebElement continueButton;
	
	@FindBy(xpath="//span[contains(text(), \"No thanks\")]")
	private WebElement discountClose_loc;
	
	// Actions
	public void fillPlanDetails() {
		// Generate a random number between 5 and 50
		int randomNumberOfUsers = (int) (Math.random() * (50 - 5 + 1)) + 5;

		// Convert the random number to a String
		String randomNumberOfUsersString = String.valueOf(randomNumberOfUsers);
		
		// Use sendKeys to input the random number into the WebElement
		numberOfUsersInput.sendKeys(randomNumberOfUsersString);
		
		//click on continue button 
		continueButton.click();
		
		try {
			discountClose_loc.click();
		} catch (Exception e) {
			
		}
	}

}
