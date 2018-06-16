package testpackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingAlert {
  @Test
  public void hdfc() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\subject\\selenium\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.hdfcbank.com");
			driver.manage().window().maximize();
			//Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			String HDFCHome = driver.getWindowHandle();
			driver.findElement(By.id("loginsubmit")).click();
			
			Set<String> hdfcwins = driver.getWindowHandles();
		for(String Handle : hdfcwins)
		{
			driver.switchTo().window(Handle);
			//System.out.println(driver.getTitle());
			//System.out.println(driver.getCurrentUrl());
			if("NetBanking".equals(driver.getTitle()))
			{
				driver.findElement(By.xpath("(//a[text()='Continue to NetBanking'])[2]")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.switchTo().defaultContent();
				driver.switchTo().frame("login_page");
				driver.findElement(By.name("fldLoginUserId")).sendKeys("345345345");
				driver.findElement(By.xpath("//img[@alt='continue']")).click();
			}
		}
	  
  }
}
