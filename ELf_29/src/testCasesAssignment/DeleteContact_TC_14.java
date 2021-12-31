package testCasesAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteContact_TC_14 {

	public static void main(String[] args) throws InterruptedException {

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

		//step7: Select Contact And Delete Contact
		driver.findElement(By.xpath("//a[text()='DeleteContact']/../..//input[@name='selected_id']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='DeleteContact']/../..//a[text()='del']")).click();
		
		try {
		String contactName = driver.findElement(By.linkText("DeleteContact")).getText();
		}catch(Exception e) {
			System.out.println("Contact not present the Contact list");
		}
		
		driver.close();
	} 

}
