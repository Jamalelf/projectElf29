package SeleniumAssignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseCognizantWindowInnaukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		
		String cg="Cognizant";
		
		Set<String> allIds = driver.getWindowHandles();
		
		for(String s:allIds) {
			 driver.switchTo().window(s);
	if(cg.equals(driver.getTitle())) {
		driver.close();
	}
			}
		}
	}


