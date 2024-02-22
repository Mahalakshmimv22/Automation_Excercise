package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC8_object {
	
WebDriver driver;
	
	public TC8_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement product;
	@FindBy(xpath="//a[@href='/View Product/1']")public WebElement viewproduct;
	
	
	public void verifyallproductsandproductdetailpage(String mail) {
		try {
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			
			product.click();
			
			String ActualTitle1 = driver.getTitle();
			String ExpectedTitle1 = "ALL PRODUCTS";
			Assert.assertNotEquals(ActualTitle1, ExpectedTitle1);
			
			viewproduct.click();
			
			String Actualproductname = driver.getTitle();
			String Expectedproductname = "Blue Top";
			Assert.assertNotEquals(Actualproductname, Expectedproductname);
			String Actualcategory = driver.getTitle();
			String Expectedcategory = "Blue Top";
			Assert.assertNotEquals(Actualcategory, Expectedcategory);
			String Actualprice = driver.getTitle();
			String Expectedprice = "Blue Top";
			Assert.assertNotEquals(Actualprice, Expectedprice);
			String Actualavailability = driver.getTitle();
			String Expectedavailability = "Blue Top";
			Assert.assertNotEquals(Actualavailability, Expectedavailability);
			String Actualcondition = driver.getTitle();
			String Expectedcondition = "Blue Top";
			Assert.assertNotEquals(Actualcondition, Expectedcondition);
			String Actualbrand = driver.getTitle();
			String Expectedbrand = "Blue Top";
			Assert.assertNotEquals(Actualbrand, Expectedbrand);
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
