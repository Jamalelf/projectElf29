package testCasesAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_11 {

	public static void main(String[] args) {
		//step1: opening the browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//step2: navigating the application
		driver.get("http://localhost:8888/");
		String expectedLoginPageTitle="vtiger CRM 5 - Commercial Open Source CRM";
		String actualLoginPageTitle=driver.getTitle();
		System.out.println(actualLoginPageTitle);
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login Page displayed Successfully");
		}else {
			System.err.println("Login Page not displayed Successfully");
		}


		//step3: Enter valid UserName credentials
		WebElement userName=driver.findElement(By.name("user_name"));
		userName.sendKeys("admin");
		String expectedUserName="admin";
		String actualUserName = driver.findElement(By.name("user_name")).getAttribute("value");
		if(actualUserName.equals(expectedUserName)) {
			System.out.println("UserName is Entered Correctly");
		}else {
			System.err.println("UserName is not  Entered Correctly");
		}

		//step4: Enter Valid Password

		WebElement password=driver.findElement(By.name("user_password"));
		String expectedPassword="root";
		password.sendKeys("root");
		String actualPassword=driver.findElement(By.name("user_password")).getAttribute("value");
		if(actualPassword.equals(expectedPassword)) {
			System.out.println("Password Entered Correctly");
		}else {
			System.err.println("Password Entered InCorrectly");
		}

		//step5: Login To Application

		driver.findElement(By.id("submitButton")).click();
		String expectedVtigerHomePageTitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String actualVtigerHomePage = driver.getTitle();

		if(actualVtigerHomePage.equals(actualVtigerHomePage)) {
			System.out.println("vtiger HomePage Is Displayed successfully");
		}else {
			System.err.println("vtiger HomePage Is Not Displayed successfully");
		}

		//step6: Click On Contact Link
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		String expectedContactsPageTitle="Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM";
		String actualcontactsPageTitle=driver.getTitle();
		if(actualcontactsPageTitle.equals(expectedContactsPageTitle)) {
			System.out.println("Contacts page Is Displayed Successfully");
		}else {
			System.err.println("Contacts page Is NotDisplayed Successfully");
		}

		//step7: click on Create New Contact image
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		String expectedCratingNewContactPageTitle = "Creating New Contact";
		String actualCratingNewContactPageTitle = driver.findElement(By.xpath("//span[text()='Creating New Contact']")).getText();
		if(actualCratingNewContactPageTitle.equals(actualCratingNewContactPageTitle)) {
			System.out.println("Create New contact Page is Displayed");	
		}else {
			System.err.println("Create New contact Page is Not Displayed");
		}

		//step8: Enter Valid First Name
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("jamal1");
		String expectedFirstName = "jamal1";
		String actualFirstName = driver.findElement(By.name("firstname")).getAttribute("value");
		if(actualFirstName.equals(expectedFirstName)) {
			System.out.println("FirstName Entered Correctly");
		}else {
			System.err.println("FirstName Not Entered Correctly");
		}

		//step9:Entered Valid LastName
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("1");
		String expectedLastName="1";
		String actualLastName = driver.findElement(By.name("lastname")).getAttribute("value");
		if(actualLastName.equals(expectedLastName)) {
			System.out.println("LastName Is Entered correctly");
		}else {
			System.out.println("LastName Is Entered Incorrectly");
		}

		//step10: Click on Group As supportGroup
		driver.findElement(By.xpath("(//input[@onclick='toggleAssignType(this.value)'])[2]")).click();
		String expectedMarketingGroupText = "Marketing Group";
		String actualMarketingGroupText = driver.findElement(By.xpath("//option[text()='Marketing Group']")).getText();
		System.out.println(actualMarketingGroupText);
		if(actualMarketingGroupText.equals(expectedMarketingGroupText)) {
			System.out.println("Group Radio Button is Selected Successfully");
		}else {
			System.out.println("Group Radio Button is Not Selected Successfully");
		}

		driver.findElement(By.xpath("//option[text()='Support Group']")).click();
		String expectedSupportGroupText="Support Group";
		String actualSupportGroupText= driver.findElement(By.xpath("//option[text()='Support Group']")).getText();

		if(actualSupportGroupText.equals(actualSupportGroupText)) {
			System.out.println("Selected SupportGroup Is Successfully");
		}else {
			System.err.println("Selected SupportGroup Is UnSuccessfully");
		}

		//step11: Click On Save Button
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		driver.findElement(By.xpath("//input[contains(@onclick,'ModCommentsCommon.')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		String expectedContactUsername="jamal1";
		String actualContactUserName= driver.findElement(By.linkText("jamal1")).getText();

		if(actualContactUserName.equals(expectedContactUsername)) {
			System.out.println("Contact Created Successfully");
		}else {
			System.err.println("Contact Not Created Successfully");
		}

		//step12: Logout the application
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		String exepectedWindowTitle = "vtiger CRM 5 - Commercial Open Source CRM";
		String actualWindowTitle = driver.getTitle();
		if(actualWindowTitle.equals(actualWindowTitle)) {
			System.out.println("Logout Successfully");
		}else {
			System.out.println("Logout is Unsuccessfully");
		}
		driver.close();
	}


}
