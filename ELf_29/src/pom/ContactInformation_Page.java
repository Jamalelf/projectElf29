package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformation_Page {
	
	public ContactInformation_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public WebElement getContactInformation() {
		return ContactInformation;
	}

	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement ContactInformation;

}
