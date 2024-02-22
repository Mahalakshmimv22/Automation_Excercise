package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC17_object {
	
WebDriver driver;
	
	public TC17_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath=" //header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")public WebElement cart;
	@FindBy(xpath="//tbody/tr[@id='product-2']/td[6]/a[1]")public WebElement remove;
	
	
	public void removeoroductfromcart(String mail) {
		try {
						
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			cart.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			remove.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
