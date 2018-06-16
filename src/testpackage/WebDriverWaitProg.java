package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebDriverWaitProg {
  @Test
  public void waitprog() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\subject\\selenium\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("webdriver");
		//driver.findElement(By.name("q")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("webdriver"));
		System.out.println(driver.getTitle());
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
		String result = driver.findElement(By.id("resultStats")).getText();
		System.out.println(result);
		
		
		
  }
}
