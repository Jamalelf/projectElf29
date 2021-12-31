package testcasesWithPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pom.ContactInformation_Page;
import pom.ContactList_Page;
import pom.CreatingNewContact_Page;
import pom.Home_Page;
import pom.Login_Page;

public class TC_11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//step1: Navigate to the application
		driver.get("http://localhost:8888/");
		String expectedLoginPageTitle="vtiger CRM 5 - Commercial Open Source CRM";
		String actualLoginPageTitle=driver.getTitle();
		System.out.println(actualLoginPageTitle);
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login Page displayed Successfully");
		}else {
			System.err.println("Login Page not displayed Successfully");
		}
		
		//step2: login to application
		Login_Page loginPage=new Login_Page(driver);
		loginPage.getUserNameTextField().sendKeys("admin");
		loginPage.getPasswordTextField().sendKeys("root");
		loginPage.getLoginButton().click();
		String expectedHomePageTitle = " Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		if(expectedHomePageTitle.equals(driver.getTitle())) {
			System.out.println("Home Page is Displayed");
		}else {
			System.out.println("Home Page Is not Displayed");
		}
		
		//step3:Click On Contact Link
		Home_Page homePage=new Home_Page(driver);
		homePage.getContactLinkText().click();
		String expectedContactPageTitle = " Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM";
		if(expectedContactPageTitle.equals(driver.getTitle())) {
			System.out.println("ContactList Page Displayed");
		}else {
			System.out.println("ContactList Page not displayed ");
		}
		
		//step4: Click on"+" image
		ContactList_Page contactListPage=new ContactList_Page(driver);
		contactListPage.getAddContactLink().click();
		CreatingNewContact_Page creatingNewContactPage=new CreatingNewContact_Page(driver);
		String expectedcreatingNewcontactText = "Creating New Contact";
		if(expectedcreatingNewcontactText.equals(creatingNewContactPage.getCreatingNewContactText())) {
			System.out.println("creating New contact displayed");
		}else {
			System.out.println("Creating New contact Not Displayed");
		}
		
		//step5:Create a Contact
		CreatingNewContact_Page CreatingNewContact_Page=new CreatingNewContact_Page(driver);
		CreatingNewContact_Page.getFirstNameTextFiled().sendKeys("jamal1");
		CreatingNewContact_Page.getLastNameTextField().sendKeys("pom");
		CreatingNewContact_Page.getGroupradioButton().click();
		CreatingNewContact_Page.getSupportGroup().click();
		CreatingNewContact_Page.getSaveButton().click();
		
		ContactInformation_Page ContactInformation_Page=new ContactInformation_Page(driver);
		String expectedContactInformationText = ContactInformation_Page.getContactInformation().getText();
		if(expectedContactInformationText.equals(ContactInformation_Page.getContactInformation().getText())) {
			System.out.println("Contact Created successfully");
		}else {
			System.out.println("Contact Created Unsuccessfully");
		}
		
		//step6: Logout
		Actions actions=new Actions(driver);
		actions.moveToElement(homePage.getDropDown()).perform();
		homePage.getSignout().click();
		
		
	}

}
