package login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Leetcode {
	
	String baseURL = "https://leetcode.com/";
	String driverPath = "C:\\Users\\HP\\Downloads\\chromedriver.exe";
	//String driverPath = "C:\\Users\\HP\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe";
	WebDriver driver;	
	
	@BeforeTest
	public void launchBrowser() {
		//System.setProperty("webdriver.gecko.driver",driverPath);
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
	} 
	
	@Test(priority=0)
	public void f() {
		driver.findElement(By.partialLinkText("Sign in")).click();
	}
	
	@Test(priority=1)
    public void f1() {
		driver.findElement(By.id("id_login")).sendKeys("1300nehasingh@gmail.com");
		
	}
	
	@Test(priority=2)
    public void f2() {
		driver.findElement(By.id("id_password")).sendKeys("Neha#321");		
	}
	
	
	@Test(priority=3)
    public void f3() {
		driver.findElement(By.className("btn-content-container__177h")).click();
	}
			
	@AfterTest
	public void afterTest() {
		System.out.println("Login Complete");	
	}
	
}
