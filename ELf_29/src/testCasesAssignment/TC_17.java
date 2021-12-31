package testCasesAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_17 {

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

		//step7: Select One Contact And open It
		driver.findElement(By.xpath("//a[text()='jamalDup']/../..//input[@name='selected_id']")).click();
		boolean expectedSelectboxIsSelected = true;
		boolean ActualSelectBoxIsSelected = driver.findElement(By.xpath("//a[text()='jamalDup']/../..//input[@name='selected_id']")).isSelected();
		System.out.println(ActualSelectBoxIsSelected);
		
		if(ActualSelectBoxIsSelected==expectedSelectboxIsSelected) {
			System.out.println("Contact is Selected successfully");
		}else {
			System.err.println("Contact is Selected Unsuccessfully");
		}
		
		driver.findElement(By.xpath("//a[text()='jamalDup']")).click();
		String expectedContactPageView = "[ CON65 ] w jamalDup - Contact Information";
		String actualContactPageView = driver.findElement(By.xpath("//span[text()='[ CON65 ] w jamalDup -  Contact Information']")).getText();
		System.out.println(actualContactPageView);
		
		if(actualContactPageView.equals(actualContactPageView)) {
			System.out.println("ContactPage Open successfully");
		}else {
			System.err.println("ContactPage Open Unsuccessfully");
		}
		
		//step8:Select contact as duplicate
		driver.findElement(By.xpath("(//input[@name='Duplicate'])[1]")).click();
		String expectedcontactInformationPage = "Contact Information";
		String actualConatcInformationpage = driver.findElement(By.xpath("//td[text()=' Contact Information']")).getText();
		
		if(actualConatcInformationpage.equals(actualConatcInformationpage)) {
			System.out.println("ContactInforamtion page Opens Successfully");
		}else {
			System.err.println("ContactInforamtion page Opens UnSuccessfully");
		}
		
		//step9: Save contact and check in Contacts
		driver.findElement(By.xpath("(//input[@accesskey='S'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		String expectedContactName = "jamalDup";
		String actualContactName = driver.findElement(By.linkText("jamalDup")).getText();
		if(actualContactName.equals(expectedContactName)) {
			System.out.println("Same Name Contact in ContactPage");
		}else {
			System.err.println("Same Name Contact Not in ContactPage");
		}
		driver.close();
		
	}

}
