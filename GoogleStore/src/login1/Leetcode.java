package login1;

import org.openqa.selenium.By;
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
		// firefox, extend report
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
		driver.findElement(By.id("id_password")).sendKeys("Neha#321");
	}
	
	@Test(priority=2)
		public void f2() throws InterruptedException {
			
			driver.findElement(By.className("btn-content-container__177h")).click();
			Thread.sleep(3000);
		}
	
	@Test(priority=3)
    public void fp() {
		System.out.println("Login Complete");
	}
	
	@Test(priority=4)
	public void f4() {
		driver.findElement(By.linkText("Explore")).click();
	}
	
	@Test(priority=5)
    public void f5() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Explore - LeetCode";
		try {
		    Assert.assertEquals(ExpectedTitle, ActualTitle);
		} catch (AssertionError e) {
		    System.out.println("Title of Home Page: Not equal");
		    throw e;
		}
		System.out.println("Title of Home Page: Equal");		
	}
	
	@Test(priority=6)
    public void f6() {
		driver.findElement(By.linkText("Problems")).click();
	}
	
	@Test(priority=7)
    public void f7() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Problems - LeetCode";
		try {
		    Assert.assertEquals(ExpectedTitle, ActualTitle);
		} catch (AssertionError e) {
		    System.out.println("Title of Home Page: Not equal");
		    throw e;
		}
		System.out.println("Title of Home Page: Equal");
	}
	
	@Test(priority=8)
    public void fpv() {
		System.out.println("Validation Complete");
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}	
}