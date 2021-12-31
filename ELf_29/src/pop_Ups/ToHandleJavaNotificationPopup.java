package pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleJavaNotificationPopup {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.licindia.in/home/policy-loan-options");
	driver.findElement(By.linkText("Pay Direct (Without login)")).click();
	Alert notificationPopUp = driver.switchTo().alert();
	
	 notificationPopUp.dismiss();
	 
	 driver.findElement(By.linkText("Pay Direct (Without login)")).click();
	 notificationPopUp.accept();
	 
	 driver.close();
	}

}
