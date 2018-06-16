package testpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingWebTables {
  @Test
  public void htmltable() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\subject\\selenium\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> rows = table.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		System.out.println("No. of rows available : " + rows.size());
		
		for(int i =1; i<rows.size(); i++ )
		{
			List<WebElement> cols =	rows.get(i).findElements(By.tagName("td"));
			for(int j =0; j<cols.size(); j++)
			{
				String data = cols.get(j).getText();
				//System.out.println(data);
				if("UK".equals(data))
				{
					System.out.println("The text is found at " + i + " th row " + j + " th column ");
				}
				
				
			}
		}
		
		
  }
}
