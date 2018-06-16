package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtonsAndCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\subject\\selenium\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Handling Radio Button
		WebElement roundtrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		if(!(roundtrip.isSelected()))
		{
			roundtrip.click();
		}

		//Handling Checkboxes
		WebElement student = driver.findElement(By.name("ctl00$mainContent$chk_StudentDiscount"));
		boolean studentselection = student.isSelected();
		if(studentselection== false)
		{
			student.click();
		}
		
	}

}
