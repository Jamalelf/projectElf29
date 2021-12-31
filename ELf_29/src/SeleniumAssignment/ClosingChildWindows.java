package SeleniumAssignment;

import java.util.Set;

import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingChildWindows {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.naukri.com/");
	String parentid = driver.getWindowHandle();
	
	Set<String> allIds = driver.getWindowHandles();
	allIds.remove(parentid);
	
	for(String s:allIds) {
	driver.switchTo().window(s);
	driver.close();
		
	}
	}

}
