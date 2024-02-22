package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC26_object {
	
WebDriver driver;
	
	public TC26_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	

	
	public void verifyscrollupwithoutarrow(String mail) {
		try {
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-350)", "");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle1 = driver.getTitle();
			String ExpectedTitle1 = "SUBSCRIPTION";
			Assert.assertNotEquals(ActualTitle1, ExpectedTitle1);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
		    js1.executeScript("window.scrollBy(0,350)", "");
		    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		    
		    String ActualTitle11 = driver.getTitle();
		    String ExpectedTitle11 = "Automation Excercise";
		    Assert.assertNotEquals(ActualTitle11, ExpectedTitle11);
		    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
