package login;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login_google_store {
	String baseURL = "https://store.google.com/";
	String driverPath = "C:\\Users\\HP\\Downloads\\chromedriver.exe";
	//String driverPath = "C:\\Users\\HP\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe";
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		//System.setProperty("webdriver.gecko.driver",driverPath);
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",driverPath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));    
		driver = new ChromeDriver(options);
		driver.get(baseURL);
		driver.manage().window().maximize();
	} 
	
	@Test(priority=2)
	public void clickToLogin() {
		driver.get("https://stackoverflow.com/");
		//driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fstore.google.com%2F&ltmpl=googlestore&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin\";\r\n");
	}
	
	@Test(priority=3)
	public void submitToLogin1() {
		driver.findElement(By.className("login-link s-btn s-btn__filled py8 js-gps-track"));
		//driver.findElement(By.cssSelector("input[type='email']")).sendKeys("appnewme2026@gmail.com");
	}
	
	@Test(priority=4)
	public void submitToLogin2() {
		driver.findElement(By.className("s-input")).sendKeys("1300nehasingh@gmail.com");
		driver.findElement(By.className("grid--cell s-input")).sendKeys("Neha#321");
		driver.findElement(By.className("grid--cell s-btn s-btn__primary")).click();
		
	}
	
//	@Test(priority=4)
//	public void clickPexel() {
//		driver.findElement(By.className("chevron category-phones")).click();
//	}
	
	@Test(priority=4)
	public void click4aCase() {
		//driver.findElement(By.linkText("Pixel 4a")).click();
	}
	
	@Test(priority=4)
	public void validateTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Google Store for Google Made Devices & Accessories";
		try {
		    Assert.assertEquals(ExpectedTitle, ActualTitle);
		} catch (AssertionError e) {
		    System.out.println("Title of Home Page: Not equal");
		    throw e;
		}
		System.out.println("Title of Home Page: Equal");
	}
	
	@Test(priority=4)
	public void searchPexel() {
		driver.findElement(By.xpath("//*[@id=\"productwall\"]/div/div[2]/div[2]/div[2]/a[1]/div[2]/div[1]")).click();
	}
	
	@Test(priority=4)
	public void validatePexelTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Pixel 4a, Great help at your fingertips – Google Store";
		try {
		    Assert.assertEquals(ExpectedTitle, ActualTitle);
		} catch (AssertionError e) {
		    System.out.println("Title of Pixel 4a Page: Not equal");
		    throw e;
		}
		System.out.println("Title of Pixel 4a Page: Equal");
	}
	
//	@Test(priority=4)
//	public void backToHomePage() {
//		driver.findElement(By.xpath("//*[@id=\"kO001e\"]/div[2]/div[2]/div/c-wiz[1]/div/div[2]/a/div[2]/svg")).click();
//	}
//	
//	@Test(priority=4)
//	public void searchNest() {
//		driver.findElement(By.xpath("//*[@id=\"productwall\"]/div/div[2]/div[2]/div[2]/a[1]/div[2]/div[1]")).click();
//	}
//	
//	@Test(priority=4)
//	public void validateNestTitle() {
//		String ActualTitle = driver.getTitle();
//		String ExpectedTitle = "Pixel 4a, Great help at your fingertips – Google Store";
//		try {
//		    Assert.assertEquals(ExpectedTitle, ActualTitle);
//		} catch (AssertionError e) {
//		    System.out.println("Title of Pixel 4a Page: Not equal");
//		    throw e;
//		}
//		System.out.println("Title of Pixel 4a Page: Equal");
//	}
//	
//	
		
	@AfterTest
	public void afterTest() {
		//driver.close();
	}
}