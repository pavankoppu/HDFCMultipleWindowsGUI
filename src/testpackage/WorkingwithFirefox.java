package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WorkingwithFirefox {
  @Test
  public void yahootest() {
	  System.setProperty("webdriver.gecko.driver", "F:\\subject\\selenium\\seleniumJars\\geckodriver-v0.15.0-win32\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.yahoo.com");
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  driver.close();
  }
}
