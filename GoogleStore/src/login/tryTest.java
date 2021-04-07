package login;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tryTest {
	String baseURL = "https://www.google.com/";
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
		driver.manage().window().maximize();
		driver.get(baseURL);
	} 
	
	@Test(priority=2)
	public void clickToLogin() {
		driver.findElement(By.className("gb_4 gb_5 gb_ae gb_4c")).click();
	}
	
	@Test(priority=3)
	public void f() {
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("appnewme2026@gmail.com");
	}
	@Test(priority=4)
	public void f1() {
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	}
}