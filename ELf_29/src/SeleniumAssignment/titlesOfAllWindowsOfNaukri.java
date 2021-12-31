package SeleniumAssignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class titlesOfAllWindowsOfNaukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		Set<String> windowids = driver.getWindowHandles();
		
		
		for(String s:windowids) {
			System.out.println(s);
			
			driver.quit();
		}

	}

}
