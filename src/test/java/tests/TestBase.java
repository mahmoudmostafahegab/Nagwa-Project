package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver;



	@BeforeSuite
	public void StartDriver() throws Exception
	{String path = System.getProperty("user.dir");
	System.out.println(path);  
	System.setProperty("webdriver.chrome.driver",  path+"\\Drivers\\chromedriver.exe");

	driver = new ChromeDriver();
	// open Nagwa Site
	driver.navigate().to("https://www.nagwa.com/");
	driver.manage().window().maximize();

	driver.findElement(By.xpath("/html/body/div/div/main/div[2]/ul/li[1]/a")).click();

	Thread.sleep(2000);





	}	

	@AfterSuite
	public void StopDriver() throws Exception
	{

		Thread.sleep(2000);
		driver.quit();
	}	

}
