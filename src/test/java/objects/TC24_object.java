package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TC24_object {
	
WebDriver driver;
	
	public TC24_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")public WebElement addtocart;
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")public WebElement cart;
	@FindBy(xpath="//a[@class='btn btn-default check_out']")public WebElement checkout;
	@FindBy(xpath="//u[contains(text(),'Register / Login')]")public WebElement Register;
	@FindBy(xpath="//a[contains(text(),'Continue')]")public WebElement verifycon;
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")public WebElement cart1;
	@FindBy(xpath="//a[@class='btn btn-default check_out']")public WebElement checkout1;
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
	
	@FindBy(xpath="//button[@data-qa='signup-button']")public WebElement title;
	@FindBy(name="name")public WebElement uname;
	@FindBy(name="email")public WebElement email1;
	@FindBy(name="password")public WebElement password1;
	@FindBy(id="days")public WebElement days;
	@FindBy(id="months")public WebElement months;
	@FindBy(id="years")public WebElement years;
	@FindBy(name="newsletter")public WebElement checkbox1;
	@FindBy(name="Receive special offers from our partners!")public WebElement checkbox2;
	@FindBy(name="first_name")public WebElement Fname;
	@FindBy(name="last_name")public WebElement Lname;
	@FindBy(name="company")public WebElement company;
	@FindBy(name="address1")public WebElement address;
	@FindBy(name="address2")public WebElement address2;
	@FindBy(name="name")public WebElement country;
	@FindBy(name="state")public WebElement state;
	@FindBy(name="city")public WebElement city;
	@FindBy(name="zipcode")public WebElement zipcode;
	@FindBy(name="mobile_number")public WebElement Mnumber;
	@FindBy(xpath="//button[@data-qa='create-account']")public WebElement createaccount;
	
	@FindBy(xpath="//a[@href = '/login']")public WebElement signup;
	@FindBy(name="email")public WebElement email;
	@FindBy(name="password")public WebElement password;
	
	
	
	public void Downloadinvoiceafterpurchase(String mail) {
		try {
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			
			addtocart.click();
			
			cart.click();
			
			checkout.click();
			
			 Register.click();
			 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			
			email.sendKeys("mahalakshmi22@gmial.com");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			password.sendKeys("Maha@1234");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			signup.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			title.click();
			uname.sendKeys("Maha");
			email1.sendKeys("mahalakshmi22@gmial.com");
			password1.sendKeys("Maha@1234");
			Select days =new Select(driver.findElement(By.id("days")));
			days.selectByVisibleText("22");
			Select months =new Select(driver.findElement(By.id("months")));
			months.selectByVisibleText("June");
			Select years =new Select(driver.findElement(By.id("years")));
			years.selectByVisibleText("1996");
			checkbox1.click();
			checkbox2.click();
			Fname.sendKeys("Maha");
			Lname.sendKeys("lakshmi");
			company.sendKeys("infi");
			address.sendKeys("Gayatrinagar,Bangalore");
			address2.sendKeys("Rajajinagar,Bangalore");
			country.sendKeys("India");
			state.sendKeys("Karnataka");
			city.sendKeys("Bangalore");
			zipcode.sendKeys("560021");
			Mnumber.sendKeys("9591093981");
			createaccount.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle1 = driver.getTitle();
			String ExpectedTitle1 = "ACCOUNT CREATED!";
			Assert.assertNotEquals(ActualTitle1, ExpectedTitle1); 
			
			verifycon.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle11 = driver.getTitle();
			String ExpectedTitle11 = "Logged in as Maha";
			Assert.assertNotEquals(ActualTitle11, ExpectedTitle11);
			
			cart1.click();
			
			checkout1.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
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
			
		
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
