package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Launch the Browser
		 * Navigate to the URL
		 * Maximize the browser
		 * Provide time to load all the objects
		 */

		System.setProperty("webdriver.chrome.driver", "F:\\subject\\selenium\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		//driver.navigate().to("http://www.newtours.demoaut.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
	}

}
