package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TC13_object {
	
WebDriver driver;
	
	public TC13_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="quantity")public WebElement quantity;
	@FindBy(xpath="//a[@href='/View Product/1']")public WebElement viewproduct;
	@FindBy(xpath="//body/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]")public WebElement addtocart;
	@FindBy(xpath="/u[contains(text(),'View Cart')]")public WebElement viewcart;
	
	
	public void verifyproductquantityincart(String mail) {
		try {
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			viewproduct.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			Select quantity =new Select(driver.findElement(By.id("quantity")));
			quantity.selectByVisibleText("4");
			
			addtocart.click();
			 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			 
		     viewcart.click();
		     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		     
		     String Actualquantity = driver.getTitle();
		 	String Expectedquantity = "4";
		 	Assert.assertNotEquals(Actualquantity, Expectedquantity);
		 	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
