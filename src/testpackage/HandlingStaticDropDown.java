package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingStaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\subject\\selenium\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select currselection = new Select(currency);
		currselection.selectByVisibleText("INR");
		currselection.selectByValue("AED");
		currselection.selectByIndex(3);
		
		//check for multiselection or sinlge selection
		boolean multiselection = currselection.isMultiple();
		System.out.println(multiselection);
		
		//Display all elements
		List<WebElement> currnames = currselection.getOptions();
		for(int i = 0; i<currnames.size(); i++)
		{
		WebElement currencyname = 	currnames.get(i);
		String currvalue = currencyname.getText();
		//System.out.println(currvalue);
		if("AED".equals(currvalue))
		{
			System.out.println("The element is available");
			break;
		}
		
		
		}
		

	}

}
