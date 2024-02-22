package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC22_object {
	
WebDriver driver;
	
	public TC22_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//body/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]")public WebElement addtocart;
	@FindBy(xpath="/u[contains(text(),'View Cart')]")public WebElement viewcart;
	
	public void addtocartfromrecommendeditems(String mail) {
		try {
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "RECOMMENDED ITEMS";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			 addtocart.click();
			 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			 
		     viewcart.click();
		     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		     
		     String Actualquantity = driver.getTitle();
			 String Expectedquantity = "Winter Top";
			 Assert.assertNotEquals(Actualquantity, Expectedquantity);
			 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
