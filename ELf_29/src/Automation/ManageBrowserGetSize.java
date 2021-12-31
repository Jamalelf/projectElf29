package Automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageBrowserGetSize {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver=new  ChromeDriver();
	driver.get("https://www.instagram.com/");
	Dimension dim = driver.manage().window().getSize();
	System.out.println(dim);
	driver.close();

	}

}
