package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWebApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

}
