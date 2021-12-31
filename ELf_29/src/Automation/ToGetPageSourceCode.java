package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSourceCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getPageSource());
		driver.close();

	}

}
