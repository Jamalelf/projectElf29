import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTheAllOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/Admin/Desktop/MultipleSelectOptions.html");
		
		WebElement multipleCheckBox = driver.findElement(By.id("m_m1"));
		
	Select select=new Select(multipleCheckBox);
	
	for(int i=0;i<=6;i++) {
		select.selectByIndex(i);
				}

	}

}