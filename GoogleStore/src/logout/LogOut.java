package logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogOut {
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
	
	@Test(priority=8)
    public void f8() {
		
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Logout Complete");	
	}
}
