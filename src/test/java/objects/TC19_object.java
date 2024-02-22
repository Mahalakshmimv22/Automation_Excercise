package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC19_object {
	
WebDriver driver;
	
	public TC19_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement product;
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")public WebElement polobrand1;
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[8]/a[1]")public WebElement biba;
	
	
	public void viewandcartbrands(String mail) {
		try {
			
			product.click();
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "BRANDS";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			polobrand1.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle1 = driver.getTitle();
			String ExpectedTitle1 = "BRAND - POLO PRODUCTS";
			Assert.assertNotEquals(ActualTitle1, ExpectedTitle1);
			System.out.println("All Brand POLO products are visible");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			biba.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle11 = driver.getTitle();
			String ExpectedTitle11 = "BRAND - BIBA PRODUCTS";
			Assert.assertNotEquals(ActualTitle11, ExpectedTitle11);
			System.out.println("All Brand BIBA products are visible");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
