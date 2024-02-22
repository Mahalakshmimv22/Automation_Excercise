package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC20_object {
	
WebDriver driver;
	
	public TC20_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement product;
	
	@FindBy(id="search_product")public WebElement searchproduct;
	@FindBy(id="submit_search")public WebElement search;
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")public WebElement addtocart;
	@FindBy(xpath="//button[contains(text(),'Continue Shopping')]")public WebElement con;
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")public WebElement cart;
	@FindBy(xpath="//a[@href = '/login']")public WebElement signup;
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")public WebElement cart1;
	@FindBy(xpath="///button[@id='button-review'")public WebElement submit;
	
	
	public void searchproductsandverifyvartafterlogin(String mail) {
		try {
			product.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "ALL PRODUCTS";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			searchproduct.sendKeys("Men Tshirt");
			search.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle1 = driver.getTitle();
			String ExpectedTitle1 = "SEARCHED PRODUCTS";
			Assert.assertNotEquals(ActualTitle1, ExpectedTitle1);
			System.out.println("All products related to search is visible");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			addtocart.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			con.click();
			
			cart.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			signup.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			cart1.click();
			submit.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
