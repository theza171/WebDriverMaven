package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\jars\\geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
	@Test
public void doLogin()
{
		
	driver.get("http://gmail.com");
	driver.findElement(By.id("identifierID")).sendKeys("thezasri1997@gmail.com");
	//driver.findElement(By.id("Password")).sendKeys("sdfs");
	}
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
