package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC6_object {
WebDriver driver;
	
	public TC6_object(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	
	@FindBy(name="name")public WebElement name;
	@FindBy(name="email")public WebElement email;
	@FindBy(name="subject")public WebElement subject;
	@FindBy(name="message")public WebElement message;
	@FindBy(xpath="//input[@type='submit']")public WebElement submit;
	@FindBy(xpath="//input[@type='file']")public WebElement upload;
	@FindBy(linkText="ok")public WebElement act;
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[8]/a[1]")public WebElement contactus;
	
	
	public void contactus(String mail) {
		try {
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			contactus.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			String ActualTitle11 = driver.getTitle();
			String ExpectedTitle11 = "GET IN TOUCH";
			Assert.assertNotEquals(ActualTitle11, ExpectedTitle11);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			
			name.sendKeys("Maha");
			email.sendKeys("mahalakshmi22@gmial.com");
			subject.sendKeys("Reg product cancellation");
			message.sendKeys("I have received a wrong product and how long will it take to exchange the product");
			upload.sendKeys("C:\\Users\\IQ49\\image01.jpg");
			submit.click();
			act.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught"+ e.getMessage());
		}
		
		
		
	}

}
