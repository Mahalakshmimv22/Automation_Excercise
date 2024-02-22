package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC18_object {
	
WebDriver driver;
	
	public TC18_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//body/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]")public WebElement women;
	@FindBy(xpath="//body/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")public WebElement Dress;
	@FindBy(xpath="//body/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/h4[1]")public WebElement men;
	@FindBy(xpath="//a[contains(text(),'Tshirts')]")public WebElement Tshirts;
	
	
	public void viewproductcategory(String mail) {
		try {
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "CATEGORY";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			women.click();
			Dress.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			
			String ActualTitle1 = driver.getTitle();
			String ExpectedTitle1 = "WOMEN - DRESS PRODUCTS";
			Assert.assertNotEquals(ActualTitle1, ExpectedTitle1);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			men.click();
			Tshirts.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle11 = driver.getTitle();
			String ExpectedTitle11 = "MEN - TSHIRTS PRODUCTS";
			Assert.assertNotEquals(ActualTitle11, ExpectedTitle11);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
