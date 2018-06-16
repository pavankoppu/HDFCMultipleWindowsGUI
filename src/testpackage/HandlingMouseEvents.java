package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseEvents {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\subject\\selenium\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://icicibank.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions myaction = new Actions(driver);
		WebElement products = driver.findElement(By.linkText("Products"));
		myaction.moveToElement(products).perform();
		WebElement homeloan =driver.findElement(By.linkText("Home Loan"));
		myaction.moveToElement(homeloan).perform();
		myaction.click().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());

	}

	
	
	
	
}
