package SeleniumAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingParentwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.close();

	}

}
