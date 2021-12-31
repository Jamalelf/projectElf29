package LoginpageScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_001 {

	public static void main(String[] args) {
		//step1: open the browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println(" chrome browser launched successfully ");
		driver.manage().window().maximize();
		System.out.println("browser window maximized successfuly");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//step2:enter the valid url 
		driver.get("https://www.facebook.com/");
		String expectedLoginPageTitle = "Facebook – log in or sign up";
		String actualLoginPageTitle = driver.getTitle();
		System.out.println(actualLoginPageTitle);
		
		if(expectedLoginPageTitle.equals(actualLoginPageTitle)) {
			System.out.println("login page is displayed successfully");
		}else {
			System.err.println("login page is not displayed successfully");
		}
		
		//step3: enter valid credentials
		String expectedUsername = "9949716881";
		WebElement usernameTextField = driver.findElement(By.id("email"));
		usernameTextField.clear();
		usernameTextField.sendKeys(expectedUsername);
		String actualUsername = usernameTextField.getAttribute("value");
		if(expectedUsername.equals(actualUsername)) {
			System.out.println("username is entered correctly");
		}else {
			System.err.println("username is not entered correctly");
		}
		
		String expectedPasswordData = "Jamal@2000";
		WebElement passwordTextfield = driver.findElement(By.id("pass"));
		passwordTextfield.clear();
		passwordTextfield.sendKeys(expectedPasswordData);
		String actualPasswordData = passwordTextfield.getAttribute("value");
		if(actualPasswordData.equals(actualPasswordData)) {
			System.out.println("password is entered correctly");
		}else {
			System.out.println("password is not entered correctly");
		}
		
		//step4: click on login button
		driver.findElement(By.name("login")).click();
		String expectedHomePageTitle= "Facebook – log in or sign up";
		String actualHomePageTitle = driver.getTitle();
		System.out.println(actualHomePageTitle);
		if(expectedHomePageTitle.equals(actualHomePageTitle)) {
			System.out.println("Home Page is displayed successfully");
		}else {
			System.err.println("Home Page is not displayed successfully");
		}
		

	}

}
