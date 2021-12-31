package SeleniumAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowIdOfFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		String facebookId = driver.getWindowHandle();
		
		System.out.println(facebookId);
	}

}
