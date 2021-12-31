package testCasesAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_15 {

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

		//step7: Select Contact and Edit
		driver.findElement(By.xpath("//a[text()='jamalEdit']/../..//input[@name='selected_id']")).click();
		boolean expectedTextBoxSelected= true;
		boolean actualTextBoxSelected= driver.findElement(By.xpath("//a[text()='jamalEdit']/../..//input[@name='selected_id']")).isSelected();
		if(actualTextBoxSelected==expectedTextBoxSelected) {
			System.out.println("TextBox is selected successfully");
		}else {
			System.out.println("TextBox is not selected successfully");
		}

		driver.findElement(By.xpath("//a[text()='jamalEdit']/../..//a[text()='edit']")).click();
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("jamalEdited");

		//step8: save the contact
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();

		//step9: checking edited contact in contact list
		String expectedContactName = "jamalEdited";
		String actualContactName = driver.findElement(By.xpath("//a[text()='jamalEdited']")).getText();
		if(actualContactName.equals(expectedContactName)) {
			System.out.println("Contact Edited Successfully");
		}else {
			System.err.println("Contact Edited UnSuccessfully");
		}
		//step10: Logout the application
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
