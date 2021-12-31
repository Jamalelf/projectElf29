package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compatability {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		//int  uheight = driver.findElement(By.id("email")).getSize().getHeight();
		//int uwidth = driver.findElement(By.id("email")).getSize().getWidth();
		
		//int pheight=driver.findElement(By.id("pass")).getSize().getHeight();
		//int pwidth=driver.findElement(By.id("pass")).getSize().getWidth();
		
		//System.out.println(uheight);
		//System.out.println(pheight);
		
		//System.out.println(uwidth);
		//System.out.println(pwidth);
		
		//if(uheight==pheight && uwidth==pwidth) {
			//System.out.println("aligned properly");
		//}
		
	}

}
