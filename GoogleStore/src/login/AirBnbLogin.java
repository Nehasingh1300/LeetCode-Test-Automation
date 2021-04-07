package login;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AirBnbLogin {
	
	String baseURL = "https://www.airbnb.co.in/";
	String driverPath = "C:\\Users\\HP\\Downloads\\chromedriver.exe";
	//String driverPath = "C:\\Users\\HP\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe";
	WebDriver driver;	
	
	@BeforeTest
	public void launchBrowser() {
		//System.setProperty("webdriver.gecko.driver",driverPath);
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",driverPath);
		
		ChromeOptions options = new ChromeOptions();
		    Map<String, Object> prefs = new HashMap<String, Object>();
		    prefs.put("credentials_enable_service", false);
		    prefs.put("profile.password_manager_enabled", false);
		//options.setExperimentalOption("useAutomationExtension", false);
		//options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(baseURL);
	} 
	
	@Test
	public void f() {
		driver.get("https://www.airbnb.co.in/login");
	}
	
	@Test
	public void f1() {
		driver.findElement(By.className("_bc4egv")).click();	
	}
	
	@Test
	public void f2() {		
		driver.findElement(By.id("email")).sendKeys("1300nehasingh@gmail.com");	
		driver.findElement(By.id("password")).sendKeys("airbnb#321");
		driver.findElement(By.className("_m9v25n")).click();
	}
	
	@Test
	public void f3() {
		driver.findElement(By.className("_ford54")).click();
	}
	
	@Test
	public void f4() {
		ArrayList<String> noOfTabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("no of tabs: "+ noOfTabs);
		driver.switchTo().window(noOfTabs.get(1));
	}
	
	
	
	
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
