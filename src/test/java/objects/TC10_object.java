package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC10_object {
	
WebDriver driver;
	
	public TC10_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath="//input[@id='susbscribe_email']")public WebElement email;
	@FindBy(id="subscribe")public WebElement arrow;
	
	
	
	public void verifysubscriptioninhomepage(String mail) {
		try {
	
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,-350)", "");
		    
		    String ActualTitle1 = driver.getTitle();
			String ExpectedTitle1 = "SUBSCRIPTION";
			Assert.assertNotEquals(ActualTitle1, ExpectedTitle1);
			
			 email.sendKeys("mahalakshmimv22@gmail.com");
			 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			 
			 arrow.click();
			 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle11 = driver.getTitle();
			String ExpectedTitle11 = "You have been successfully subscribed!";
			Assert.assertNotEquals(ActualTitle11, ExpectedTitle11);
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
