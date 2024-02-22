package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC3_object {
WebDriver driver;
	
	public TC3_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[@href = '/login']")public WebElement signup;
	@FindBy(name="email")public WebElement email;
	@FindBy(name="password")public WebElement password;
	@FindBy(xpath="//button[@data-qa='login-button']")public WebElement login;
	
	
	
	public void Invalidlogin(String mail) {
		try {
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			
			signup.click();
			
			String ActualTitle1 = driver.getTitle();
			String ExpectedTitle1 = "Login to your account";
			Assert.assertNotEquals(ActualTitle1, ExpectedTitle1);
			
			email.sendKeys("mahalakshmi222@gmial.com");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			password.sendKeys("Maha@1234");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			login.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle11 = driver.getTitle();
			String ExpectedTitle11 = "Your email or password is incorrect!";
			Assert.assertNotEquals(ActualTitle11, ExpectedTitle11);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
