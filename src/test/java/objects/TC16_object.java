package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC16_object {
	
WebDriver driver;
	
	public TC16_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[@href = '/login']")public WebElement signup;
	@FindBy(name="email")public WebElement email;
	@FindBy(name="password")public WebElement password;
	@FindBy(xpath="//body/section[@id='cart_items']/div[1]/div[6]/textarea[1]")public WebElement description;
	@FindBy(xpath="//a[contains(text(),'Place Order')]")public WebElement placeorder;
	@FindBy(name="name_on_card")public WebElement nameofcard;
	@FindBy(name="card_number")public WebElement cardnumber;
	@FindBy(name="cvc")public WebElement cvc;
	@FindBy(name="expiry_month")public WebElement expirationmonth;
	@FindBy(name="expiry_year")public WebElement expirationyear;
	@FindBy(xpath="//button[@id='submit']")public WebElement payandconfirm;
	@FindBy(xpath="//a[contains(text(),'Continue')]")public WebElement con;
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")public WebElement deletebutton;
	@FindBy(xpath="//button[@data-qa='login-button']")public WebElement login;
	
	
	public void placeorderloginbeforecheckout(String mail) {
		try {
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			
			email.sendKeys("mahalakshmi22@gmial.com");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			password.sendKeys("Maha@1234");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			login.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			 String ActualTitle1 = driver.getTitle();
				String ExpectedTitle1 = "Logged in as Maha";
				Assert.assertNotEquals(ActualTitle1, ExpectedTitle1);  
				
				
				String ActualTitle12 = driver.getTitle();
				String ExpectedTitle12 = "Mrs. Maha lakshmi\r\n"
						+ "Infi\r\n"
						+ "Gayatrinagar,Bangalore\r\n"
						+ "Rajajinagar,Bangalore\r\n"
						+ "Bangalore Karnataka 560021\r\n"
						+ "India\r\n"
						+ "9591093981";
				Assert.assertNotEquals(ActualTitle12, ExpectedTitle12);   
				
				
			
			description.sendKeys("Orders are selected properly, hoping to delievry a good quality products");
			
			placeorder.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			nameofcard.sendKeys("Mahalakshmi M v");
			 cardnumber.sendKeys("987366447732 ");
			 cvc.sendKeys("333");
			 expirationmonth.sendKeys("12");
			 expirationyear.sendKeys("2030");
			 payandconfirm.click();
			 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			 
			 String ActualTitle13 = driver.getTitle();
			 String ExpectedTitle13 = "Your order has been placed successfully!";
			 Assert.assertNotEquals(ActualTitle13, ExpectedTitle13);
			 
			 deletebutton.click();
			 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			 
			 String ActualTitle14 = driver.getTitle();
				String ExpectedTitle14 = "ACCOUNT DELETED!";
				Assert.assertNotEquals(ActualTitle14, ExpectedTitle14); 
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
				con.click();
			
			
			signup.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			email.sendKeys("mahalakshmi22@gmial.com");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			password.sendKeys("Maha@1234");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			login.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			deletebutton.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
