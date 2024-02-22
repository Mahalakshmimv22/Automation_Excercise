package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC9_object {
	
WebDriver driver;
	
	public TC9_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement product;
	@FindBy(id="search_product")public WebElement searchproduct;
	@FindBy(id="submit_search")public WebElement search;
	
	
	public void searchproduct(String mail) {
		try {
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			product.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle1 = driver.getTitle();
			String ExpectedTitle1 = "ALL PRODUCTS";
			Assert.assertNotEquals(ActualTitle1, ExpectedTitle1);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			searchproduct.sendKeys("Men Tshirt");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			search.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle11 = driver.getTitle();
			String ExpectedTitle11 = "SEARCHED PRODUCTS";
			Assert.assertNotEquals(ActualTitle11, ExpectedTitle11);
			System.out.println("All products related to search is visible");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
