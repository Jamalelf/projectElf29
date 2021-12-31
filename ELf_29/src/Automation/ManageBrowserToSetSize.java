package Automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageBrowserToSetSize {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver=new  ChromeDriver();
	driver.get("https://www.instagram.com/");

	Dimension dimension = new Dimension(20,10);
	driver.manage().window().setSize(dimension);
	

	}

}
