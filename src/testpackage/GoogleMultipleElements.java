package testpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMultipleElements {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\subject\\selenium\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> allinputs = driver.findElements(By.tagName("input"));
		System.out.println(allinputs.size());
		for(int i =0; i<allinputs.size(); i++)
		{
			String actval= allinputs.get(i).getAttribute("name");
			System.out.println(actval);
			if(actval.equals("q"))
			{
				System.out.println("The element is available");
				break;
			}
			
		}
		driver.close();

	}

}
