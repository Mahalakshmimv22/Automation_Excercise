package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TC1_object {
WebDriver driver;
	
	public TC1_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[@href = '/login']")public WebElement signup;
	@FindBy(name="email")public WebElement email;
	@FindBy(name="password")public WebElement password;
	@FindBy(xpath="//button[@data-qa='signup-button']")public WebElement sign;
	
	
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
	

	@FindBy(xpath="//button[@data-qa='signup-button']")public WebElement verifycon;
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")public WebElement deletebutton;
	@FindBy(xpath="//button[@data-qa='signup-button']")public WebElement verifycon1;
	
	
	public void Registeruser(String mail) {
		try {
			signup.click();
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			email.sendKeys("mahalakshmi22@gmial.com");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			password.sendKeys("Maha@1234");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			sign.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "ENTER ACCOUNT INFORMATION";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
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
			
			String ActualTitle1 = driver.getTitle();
			String ExpectedTitle1 = "ACCOUNT CREATED!";
			Assert.assertNotEquals(ActualTitle1, ExpectedTitle1);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			verifycon.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle11 = driver.getTitle();
			String ExpectedTitle11 = "Logged in as Maha";
			Assert.assertNotEquals(ActualTitle11, ExpectedTitle11); 
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			deletebutton.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			 String ActualTitle12 = driver.getTitle();
				String ExpectedTitle12 = "ACCOUNT DELETED!";
				Assert.assertNotEquals(ActualTitle12, ExpectedTitle12);
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
				verifycon1.click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
