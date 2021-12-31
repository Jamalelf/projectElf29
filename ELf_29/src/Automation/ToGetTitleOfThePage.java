package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitleOfThePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.close();
	}

}
