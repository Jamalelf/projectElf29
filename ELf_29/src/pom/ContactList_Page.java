package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactList_Page {
	
	public ContactList_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getAddContactLink() {
		return AddContactLink;
	}

	@FindBy(xpath="//img[@alt='Create Contact...']")
	private WebElement AddContactLink;

}
