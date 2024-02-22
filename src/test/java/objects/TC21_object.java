package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC21_object {
	
WebDriver driver;
	
	public TC21_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement product;
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")public WebElement viewproduct1;
	@FindBy(name="email")public WebElement email;
	@FindBy(name="password")public WebElement password;
	@FindBy(xpath="//textarea[@id='review']")public WebElement review;
	@FindBy(xpath="///button[@id='button-review']")public WebElement submit;
	
	
	public void addviewonproduct(String mail) {
		try {
			
			product.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "ALL PRODUCTS";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			viewproduct1.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle1 = driver.getTitle();
			String ExpectedTitle1 = "Write Your Review";
			Assert.assertNotEquals(ActualTitle1, ExpectedTitle1);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
			email.sendKeys("mahalakshmi22@gmial.com");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			password.sendKeys("Maha@1234");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			review.sendKeys("The product is good and comfortable");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			submit.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle11 = driver.getTitle();
			String ExpectedTitle11 = "Thank you for your review.";
			Assert.assertNotEquals(ActualTitle11, ExpectedTitle11);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
