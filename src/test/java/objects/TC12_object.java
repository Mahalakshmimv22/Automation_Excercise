package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC12_object {
	
WebDriver driver;
	
	public TC12_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement product;
	@FindBy(xpath="//a[@class='btn btn-default add-to-cart']")public WebElement product1;
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']")public WebElement con1;
	@FindBy(xpath="//a[@data-product-id='2']")public WebElement product2;
	@FindBy(xpath="//a[@href='/view cart']")public WebElement viewcart;
	
	
	public void addproductsincart(String mail) {
		try {
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			product.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			product1.click();
			con1.click();
			product2.click();
			viewcart.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			
			String ActualTitle1 = driver.getTitle();
			String ExpectedTitle1 = "Blue Top";
			Assert.assertNotEquals(ActualTitle1, ExpectedTitle1);
			String ActualTitle11 = driver.getTitle();
			String ExpectedTitle11 = "Men Tshirt";
			Assert.assertNotEquals(ActualTitle11, ExpectedTitle11);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String Actualprice = driver.getTitle();
			String Expectedprice = "Rs. 500";
			Assert.assertNotEquals(Actualprice, Expectedprice);
			String Actualprice1 = driver.getTitle();
			String Expectedprice1 = "Rs. 400";
			Assert.assertNotEquals(Actualprice1, Expectedprice1);
			String Actualquantity = driver.getTitle();
			String Expectedquantity = "2";
			Assert.assertNotEquals(Actualquantity, Expectedquantity);
			String Actualquantity1 = driver.getTitle();
			String Expectedquantity1 = "1";
			Assert.assertNotEquals(Actualquantity1, Expectedquantity1);
			String Actualtotalprice = driver.getTitle();
			String Expectedtotalprice = "Rs. 1000";
			Assert.assertNotEquals(Actualtotalprice, Expectedtotalprice);
			String Actualtotalprice1 = driver.getTitle();
			String Expectedtotalprice1 = "Rs. 400";
			Assert.assertNotEquals(Actualtotalprice1, Expectedtotalprice1);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			

		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
