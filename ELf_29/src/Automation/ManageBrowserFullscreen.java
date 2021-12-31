package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class ManageBrowserFullscreen {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().fullscreen();

	}

}
