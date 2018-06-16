package testpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenProgram {

	public static void main(String[] args) throws IOException {
		
		String result = "";
		System.setProperty("webdriver.chrome.driver", "F:\\subject\\selenium\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream Ifile = new FileInputStream("F:\\subject\\selenium\\pavan sessions\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(Ifile);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rc = sheet.getLastRowNum();
		System.out.println(rc);
		for(int i = 1; i<=rc; i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell1 = row.getCell(0); //test
			XSSFCell cell2 = row.getCell(1); //test
			String uname = cell1.getStringCellValue();		
			String pwd = cell2.getStringCellValue();
			
			driver.findElement(By.name("userName")).sendKeys(uname);
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.name("login")).click();
			
			if(driver.getTitle().equals("Find a Flight: Mercury Tours:"))
			{
				result = "Valid Credentials";
				driver.findElement(By.linkText("SIGN-OFF")).click();
			}
			else
			{
				result = "Invalid credentials";
			}
			System.out.println(result);
			XSSFCell cell3 = row.createCell(3);
			cell3.setCellValue(result);
			
		}
		
		FileOutputStream Ofile = new FileOutputStream("F:\\subject\\selenium\\pavan sessions\\TestData.xlsx");
		wb.write(Ofile);
	}

}
