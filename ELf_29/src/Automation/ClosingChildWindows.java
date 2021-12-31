package Automation;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingChildWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parentid = driver.getWindowHandle();
		
		Set<String> allwindowids = driver.getWindowHandles();
		allwindowids.remove(parentid);
		
		for(String s:allwindowids) {
			driver.switchTo().window(s);
			driver.close();
		}
		
		

}
}