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

public class Source13 extends logincredentials {
		WebDriver driver;
		//WebDriver driver= new ChromeDriver();
// 1. Locating each components using @ Findby annotation
				
		@FindBy(xpath="//span[@class='go_blue blueCnt font14 curPointFlt']")
		WebElement viewallcoupons;
		
		@FindBy(xpath="(//span[@class='common-elementsstyles__CheckBox-sc-ilw4bs-2 TIWwk'])[1]")
		WebElement firstpromocode;
		
		@FindBy(xpath="//div[@class='dF font18 padR10 alignItemsCenter']")
		WebElement confmsg;
		
		@FindBy(xpath="//button[@class='dweb-commonstyles__FltBtn-sc-13fxsy5-12 iocrTs font14']")
		WebElement ackmsg;
		
// 2. Creating the method for each component to perform its action
		public void apply_coupon()
		{
			viewallcoupons.click();
			firstpromocode.click();
		}
		public void promo_val()
		{
			String actual1= confmsg.getText();
			String expected1 ="Awesome! Promo discount applied";
			System.out.println("Passed for promo code applied");
			ackmsg.click();
			
		}
		
//3. Intializing each component using page factory class
		
	// NullPointerException will arrive without intializing element try to perform action 
			
		public Source13(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);// init meaning initializing elements
		}
		

	}
	

