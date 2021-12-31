package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContact_Page {
	
	public CreatingNewContact_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//span[text()='Creating New Contact']")
	private WebElement CreatingNewContactText;
	
	@FindBy(name="firstname")
	private WebElement FirstNameTextFiled;
	
	@FindBy(name="lastname")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="(//input[@onclick='toggleAssignType(this.value)'])[2]")
	private WebElement GroupradioButton;
	
	public WebElement getCreatingNewContactText() {
		return CreatingNewContactText;
	}
	@FindBy(xpath="//option[text()='Support Group']")
	private WebElement SupportGroup;
	
	@FindBy(xpath="//option[text()='Team Selling']")
	private WebElement TeamSellingGroup;
	
	@FindBy(xpath="(//input[@value='  Save  '])[1]")
	private WebElement saveButton;

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSupportGroup() {
		return SupportGroup;
	}

	public WebElement getTeamSellingGroup() {
		return TeamSellingGroup;
	}

	public WebElement getFirstNameTextFiled() {
		return FirstNameTextFiled;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getGroupradioButton() {
		return GroupradioButton;
	}

	

}
