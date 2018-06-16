package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionProg {
  @Test
  public void googleassert() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\subject\\selenium\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title verification not successful");
		
		driver.findElement(By.name("q")).sendKeys("webdriver");
		//driver.findElement(By.name("q")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		
		String result = driver.findElement(By.id("resultStats")).getText();
		System.out.println(result);
		Assert.assertTrue(result.contains("GhAbout"), "Basic Authentication failed");
		
		System.out.println("Completed test case executiom");
		driver.close();
  }
}
