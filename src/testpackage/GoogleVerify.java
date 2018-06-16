package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleVerify {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\subject\\selenium\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String ExpectedTitle = "Google";
		String ActualTitle = driver.getTitle();
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Title validation successful");
		}
		else
		{
			System.out.println("Title validation failed");
		}
		//Enter value in the search box
		boolean searchTextBoxPresence = driver.findElement(By.id("lst-ib")).isDisplayed();
		System.out.println(searchTextBoxPresence);
		if(searchTextBoxPresence==true)
		{
			WebElement searchbox = driver.findElement(By.id("lst-ib"));
			searchbox.sendKeys("selenium");
			
		}
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		//Validate search button
		boolean searchButtonPresence = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).isDisplayed();
		boolean searchButtonEnabled = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).isEnabled();
		if(searchButtonPresence==true && searchButtonEnabled==true)
		{
			WebElement searchButton = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
			searchButton.click();
		}

		driver.close();
	}

}
