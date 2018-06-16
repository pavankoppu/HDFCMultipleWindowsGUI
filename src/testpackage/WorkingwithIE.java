package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WorkingwithIE {
	
  @Test
  public void yahoo() {
	  System.setProperty("webdriver.ie.driver", "F:\\subject\\selenium\\seleniumJars\\IEDriverServer.exe");
	  WebDriver driver = new InternetExplorerDriver();
	  driver.get("http://www.yahoo.com");
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  driver.close();
	  
	  
  }
}
