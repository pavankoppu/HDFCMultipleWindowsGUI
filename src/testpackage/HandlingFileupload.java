package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileupload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\subject\\selenium\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tinyupload.com");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement uploadfile = driver.findElement(By.name("uploaded_file"));
		uploadfile.sendKeys("F:\\subject\\selenium\\sample programs\\Harika\\testfile.txt");
		
		driver.findElement(By.name("file_description")).sendKeys("sample file");
		driver.findElement(By.xpath("//img[@alt='Upload']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
