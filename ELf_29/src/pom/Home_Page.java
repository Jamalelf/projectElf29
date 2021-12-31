package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getContactLinkText() {
		return ContactLinkText;
	}
	@FindBy(xpath="//td[@onmouseout=\"fnHideDrop('ondemand_sub');\"]")
	private WebElement dropDown;
	
	@FindBy(linkText="Sign Out")
	private WebElement signout;

	public WebElement getDropDown() {
		return dropDown;
	}

	public WebElement getSignout() {
		return signout;
	}
	@FindBy(linkText="Contacts")
	private WebElement ContactLinkText;
	

}
