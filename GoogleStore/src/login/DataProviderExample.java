package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import login.TestData;

public class DataProviderExample {
	
	WebDriver driver;
	
	@BeforeMethod
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://leetcode.com/accounts/login/");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test(dataProvider = "getData", dataProviderClass = TestData.class)
	public void loginToApplication(String username, String password) {
		driver.findElement(By.id("id_login")).sendKeys(username);
		driver.findElement(By.id("id_password")).sendKeys(password);
		driver.findElement(By.className("btn-content-container__177h")).click();
	}

}