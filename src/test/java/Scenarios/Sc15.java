package Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objects.TC15_object;

public class Sc15 {
	
WebDriver driver;
	
	TC15_object pagefactory;
	
	@BeforeTest
	
	public void beforetest() {
		System.setProperty(
	            "webdriver.chrome.driver",
				"C:\\Users\\IQ49\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://automationexercise.com");
	     driver.manage().window().maximize();
	}
	
	@Test
	
	public void test() {
		pagefactory = new TC15_object(driver);
		pagefactory.placeorderbeforecheckout("login");
	}
	
	@AfterTest
	
	public void aftertest() {
		
		driver.close();
	}

}
