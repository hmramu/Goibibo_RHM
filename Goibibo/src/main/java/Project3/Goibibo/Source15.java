package Project3.Goibibo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Source15 extends logincredentials {
		WebDriver driver;
		//WebDriver driver= new ChromeDriver();
// 1. Locating each components using @ Findby annotation
				
		@FindBy(xpath="//span[@class='flight-reviewstyles__SkipPaymentWrapper-sc-1h0nhzs-9 jMxvlA light_grey_bg f500 white brdrRd10 font15 padL20 padR20']")
		WebElement skiptopayment;
		
		@FindBy(xpath="(//span[@class='font16 semiBold lineHeight24 appendBottom4'])[2]")
		WebElement creditcard;
		
		@FindBy(xpath="//input[@id='cardNumber']")
		WebElement cardnum;
		
		@FindBy(xpath="//input[@id='expiryMonth']")
		WebElement expirymonth;
		
		@FindBy(xpath="(//div[@class='dropdown-list']/ul/li)[4]")
		WebElement selectedexpirymonth;
		
		@FindBy(xpath="//input[@id='expiryYear']")
		WebElement expiryyear;
		
		@FindBy(xpath="(//div[@class='dropdown-list']/ul/li)[3]")
		WebElement selectedexpiryyear;
		
		@FindBy(xpath="//input[@id='cardCvv']")
		WebElement cvv;
		
		@FindBy(xpath="//input[@id='nameOnCard']")
		WebElement nameoncard;
		
		@FindBy(xpath="//button[@class='formBtnFilled flexOne greenBg vrtlCenter makeFlex vrtlCenter ']")
		WebElement savecardpay;
		
		@FindBy(xpath="(//p[@class='redText font12 lineHeight16 appendTop8 appendLeft16'])[1]")
		WebElement cardnumack;
		
// 2. Creating the method for each component to perform its action
		public void payment_sel()
		{
			skiptopayment.click();
			creditcard.click();
			cardnum.sendKeys("1234567812345678");
			expirymonth.click();
			selectedexpirymonth.click();
			expiryyear.click();
			selectedexpiryyear.click();
			cvv.sendKeys("123");
			nameoncard.sendKeys("Autmation tester");
			savecardpay.click();
		}
		public void payment_val()
		{
			String actual1= cardnumack.getText();
			String expected1 ="Card number is not valid";
			
			Assert.assertEquals(actual1, expected1);
			
			System.out.println("Passed for card number validation");
		}
//3. Intializing each component using page factory class
		
	// NullPointerException will arrive without intializing element try to perform action 
			
		public Source15(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);// init meaning initializing elements
		}
		

	}
	

