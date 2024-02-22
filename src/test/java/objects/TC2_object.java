package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC2_object {
	
	WebDriver driver;
	
	public TC2_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[@href = '/login']")public WebElement signup;
	@FindBy(name="email")public WebElement email;
	@FindBy(name="password")public WebElement password;
	@FindBy(xpath="//button[@data-qa='login-button']")public WebElement login;
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")public WebElement deletebutton;
	
	
	public void validlogin(String mail) {
		try {
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			
			signup.click();
			
			String ActualTitle1 = driver.getTitle();
			String ExpectedTitle1 = "Login to your account";
			Assert.assertNotEquals(ActualTitle1, ExpectedTitle1);
			
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			email.sendKeys("mahalakshmi22@gmial.com");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			password.sendKeys("Maha@1234");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			login.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle11 = driver.getTitle();
			String ExpectedTitle11 = "ENTER ACCOUNT INFORMATION";
			Assert.assertNotEquals(ActualTitle11, ExpectedTitle11);
			
			String ActualTitle12 = driver.getTitle();
	  		String ExpectedTitle12 = "Logged in as Maha";
	  		Assert.assertNotEquals(ActualTitle12, ExpectedTitle12);
	  		
	  
			deletebutton.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle13 = driver.getTitle();
	  		String ExpectedTitle13 = "ACCOUNT DELETED!";
	  		Assert.assertNotEquals(ActualTitle13, ExpectedTitle13);
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}
}
