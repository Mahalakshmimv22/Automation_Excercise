package Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objects.TC12_object;

public class Sc12 {
	
WebDriver driver;
	
	TC12_object pagefactory;
	
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
		pagefactory = new TC12_object(driver);
		pagefactory.addproductsincart("login");
	}
	
	@AfterTest
	
	public void aftertest() {
		
		driver.close();
	}

}
