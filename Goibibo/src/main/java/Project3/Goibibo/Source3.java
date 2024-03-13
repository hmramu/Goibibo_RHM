package Project3.Goibibo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Source3 extends logincredentials {
		WebDriver driver;
		//WebDriver driver= new ChromeDriver();
// 1. Locating each components using @ Findby annotation
				
		@FindBy(xpath="//span[@class='logSprite icClose']")
		WebElement close;
		
		@FindBy(xpath="//div[@class='sc-1f95z5i-58 eDeLap down']")
		WebElement downarrow;
		
		//@FindBy(linkText="Login/Sign Up")
		@FindBy(xpath="//button[@class='sc-1f95z5i-41 eNOLcr']")
		WebElement logninsignup;
		
		@FindBy(xpath="//input[@type='text']")
		WebElement mobilenum;
		
		@FindBy(xpath="//p[@class='successMsg__subTitle']")
		WebElement confirmmessage;
		
		@FindBy(xpath="//span[@class='sc-1f95z5i-50 fugGLW']")
		WebElement name;
		
		@FindBy(xpath="//p[@class='errorMessage']")
		WebElement errormessage;
		
// 2. Creating the method for each component to perform its action
		public void close_popup()
		{
			close.click();
		}
		public void profileaccess(WebDriver driver)
		{	
			//driver= new ChromeDriver();
			Actions a1=new Actions(driver);
			a1.moveToElement(downarrow).perform();
		}
		public void login_signup()
		{
			logninsignup.click();
		}
		public void mobile_num()
		{
			mobilenum.sendKeys("9964321395");
	
		}
		public void confirm_msg()
		{
			String actual= confirmmessage.getText();
			String expected ="Account created successfully";
			Assert.assertEquals(actual, expected);
			System.out.println("Passed : created fresh account for new user");
		}
		public void login_confirm()
		{
			String actual= name.getText();
			String expected ="Ramu";
			Assert.assertEquals(actual, expected);
			System.out.println("Passed : Successfully logged in");
		}
		public void error_message()
		{
			String actual= errormessage.getText();
			String expected ="Please enter a valid OTP";
			Assert.assertEquals(actual, expected);
			System.out.println("Test case passed : Unable to login due to invalid credentials ");
		}
		
		
		
		
//3. Intializing each component using page factory class
		
	// NullPointerException will arrive without intializing element try to perform action 
			
		public Source3(WebDriver driver)
		{
			PageFactory.initElements(driver, this);// init meaning initializing elements
		}
		

	}
	

