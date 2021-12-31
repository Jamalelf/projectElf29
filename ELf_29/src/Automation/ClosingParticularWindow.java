package Automation;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingParticularWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		String particularid="Tech Mahindra";
		
		Set<String> windowids = driver.getWindowHandles();
		
		for(String s:windowids) {
			driver.switchTo().window(s);
			if(particularid.equals(driver.getTitle())) {
			driver.close();
			break;
		}
		

	}
	}
}
