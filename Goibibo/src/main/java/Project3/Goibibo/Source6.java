package Project3.Goibibo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Source6 extends logincredentials {
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
		
		@FindBy(linkText="One-way")
		WebElement oneway;
		
		@FindBy(xpath="//input[@type='text']")
		WebElement from;
		
		//@FindBy(xpath="//div/ul/li[@role='presentation']")
		@FindBy(xpath="//ul[@id='autoSuggest-list']/li")
		List<WebElement> autosuggestion;
		
		@FindBy(xpath="//h3[.='Congratulations']")
		WebElement popwindow;
		
		@FindBy(xpath="//span[@class=' closeIcon logSprite icClose']")
		WebElement closebutton;
		
		@FindBy (xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]")
		WebElement click_on_source_city;
		
		@FindBy (xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[2]")
		//@FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[2]")
		WebElement destinationcity;
		
		@FindBy(xpath="//input[@type='text']")
		WebElement to;
		
		@FindBy(xpath="//div[@aria-label='Sun Mar 31 2024']")
		WebElement date;
		
		@FindBy(xpath="//span[@class='fswTrvl__done']")
		WebElement donebutton;
		
		@FindBy(xpath="//a[@class='sc-12foipm-77 jYnAuG']")
		WebElement donebutton1;
		
		@FindBy(xpath="//span[@class='sc-12foipm-85 fUaVPB']")
		WebElement searchflight;
		
		//@FindBy(xpath="(//label[@class='search-widget-uistyles__RadioLabel-sc-f6e3g4-3 ijwIlZ'])[1]")
		@FindBy(xpath="(//input[@type='radio'])[1]")
		WebElement onewayradio;
		
		//@FindBy(xpath="(//label[@class='search-widget-uistyles__RadioLabel-sc-f6e3g4-3 ijwIlZ'])[2]")
		@FindBy(xpath="(//input[@type='radio'])[2]")
		WebElement twowayradio;
		
		//@FindBy(xpath="//span[@class='sc-12foipm-83 bHPmCk']")
		@FindBy(xpath="(//p[@class='sc-gEvEer gpfTmR'])[2]")
		WebElement roundtrip;
		
		@FindBy(xpath="//div[@class='search-widget-uistyles__PaxWrapperStyle-sc-f6e3g4-10 kmrdNu']")
		WebElement passclass;
		
		@FindBy(xpath="//button[@class='dweb-commonstyles__ButtonBase-sc-13fxsy5-4 pax-widgetstyles__ButtonWrapper-sc-1rr7cks-11 eTrRGk gvjhyb']")
		WebElement donebutton2;
		
		@FindBy(xpath="//button[@class='dweb-commonstyles__ButtonBase-sc-13fxsy5-4 search-widget-uistyles__UpdateSearchBtn-sc-f6e3g4-13 eTrRGk cQWDnK']")
		WebElement updatesearch;
		
		@FindBy(xpath="(//input[@class='search-widget-uistyles__SearchInputStyle-sc-f6e3g4-12 gqWtbC'])[5]")
		//@FindBy(xpath="//input[@value='1 Traveller(s), Business']")
		WebElement passsengerandclass;
		
		@FindBy(xpath="//option[@value='E']")
		WebElement economyclass;
		
		@FindBy(xpath="//option[@value='B']")
		WebElement businessclass;
		
		@FindBy(xpath="//option[@value='F']")
		WebElement firstclass;
		
		@FindBy(xpath="//div[@class='txtCenter ico20 padTB10']")
		WebElement searchresult;
		
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
		
		public void frame_ack()
		{
		driver.switchTo().frame("Adobe ID Syncing iFrame");
		driver.findElement(By.xpath("//iframe[@title='Adobe ID Syncing iFrame']")).click();
		}
		public void refresh_page(WebDriver driver)
		{
			driver.navigate().refresh();
		}
		public void one_way()
		{
			oneway.click();
		}
		public void from_location(WebDriver driver)
		{
			//WebDriverWait expwait= new WebDriverWait(driver,Duration.ofSeconds(20));// explicit wait until appearance of search bar
			//expwait.until(ExpectedConditions.elementToBeClickable(from));
			//expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//input[@type='text']"))));
			click_on_source_city.click();
			from.sendKeys("Bengaluru");
		}
		public void auto_suggestion()
		{
			int count=autosuggestion.size();
			System.out.println(count);
			autosuggestion.get(0).click();
			
		}
		public void popup_window(WebDriver driver)
		{
			WebDriverWait expwait= new WebDriverWait(driver,Duration.ofSeconds(20));// explicit wait until appearance of search bar
			expwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h3[.='Congratulations']")));
		}
		public void destination_city(WebDriver driver)
		{
			WebDriverWait expwait= new WebDriverWait(driver,Duration.ofSeconds(20));// explicit wait until appearance of search bar
			expwait.until(ExpectedConditions.elementToBeClickable(destinationcity));
			//expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//input[@type='text']"))));
			//destinationcity.click();
			to.sendKeys("Mumbai");
		}
		
		public void auto_suggestion1()
		{
			int count=autosuggestion.size();
			System.out.println(count);
			autosuggestion.get(0).click();
		}
		public void select_date()
		{
			date.click();
		}
		public void done_button()
		{
			donebutton.click();
		}
		public void done_button1()
		{
			donebutton1.click();
		}
		public void search_flight()
		{
			searchflight.click();
		}
		public void search_result(WebDriver driver)
		{
			WebDriverWait expwait= new WebDriverWait(driver,Duration.ofSeconds(20));// explicit wait until appearance of search bar
			//expwait.until(ExpectedConditions.elementToBeClickable(destinationcity));
			expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//button[@class='dweb-commonstyles__ButtonBase-sc-13fxsy5-4 search-widget-uistyles__UpdateSearchBtn-sc-f6e3g4-13 eTrRGk cQWDnK']"))));
			
			Assert.assertTrue(onewayradio.isSelected());
			System.out.println("Successfully searched for one way flight");
		}
		
		public void round_trip()
		{
			roundtrip.click();
		}
		public void search_result_twoway(WebDriver driver)
		{
			WebDriverWait expwait= new WebDriverWait(driver,Duration.ofSeconds(20));// explicit wait until appearance of search bar
			//expwait.until(ExpectedConditions.elementToBeClickable(destinationcity));
			expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//button[@class='dweb-commonstyles__ButtonBase-sc-13fxsy5-4 search-widget-uistyles__UpdateSearchBtn-sc-f6e3g4-13 eTrRGk cQWDnK']"))));
			
			Assert.assertTrue(twowayradio.isSelected());
			System.out.println("Successfully searched for two way flight");
		}
		public void economy_val(WebDriver driver)
		{
			passclass.click();
//			WebElement travelclass=driver.findElement(By.xpath("//select[@id='quantity']"));
//			Select se= new Select(travelclass);
//			se.selectByValue("B");
			economyclass.click();
			donebutton2.click();
			updatesearch.click();
			WebDriverWait expwait= new WebDriverWait(driver,Duration.ofSeconds(20));// explicit wait until appearance of search bar
			//expwait.until(ExpectedConditions.elementToBeClickable(destinationcity));
			expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("(//div[@class='f500 font14 padB5'])[1]"))));
			String actual= passsengerandclass.getAttribute("value");
			String expected ="1 Traveller(s), Economy";
			Assert.assertEquals(actual, expected);
			System.out.println("Passed for economy class selection");
		}
		
		public void business_val(WebDriver driver)
		{
			passclass.click();
//			WebElement travelclass=driver.findElement(By.xpath("//select[@id='quantity']"));
//			Select se= new Select(travelclass);
//			se.selectByValue("B");
			businessclass.click();
			donebutton2.click();
			updatesearch.click();
			WebDriverWait expwait= new WebDriverWait(driver,Duration.ofSeconds(20));// explicit wait until appearance of search bar
			//expwait.until(ExpectedConditions.elementToBeClickable(destinationcity));
			expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("(//div[@class='f500 font14 padB5'])[1]"))));
			String actual= passsengerandclass.getAttribute("value");
			String expected ="1 Traveller(s), Business";
			Assert.assertEquals(actual, expected);
			System.out.println("Passed for business class selection");
		}
		public void first_val(WebDriver driver)
		{
			passclass.click();
//			WebElement travelclass=driver.findElement(By.xpath("//select[@id='quantity']"));
//			Select se= new Select(travelclass);
//			se.selectByValue("B");
			firstclass.click();
			donebutton2.click();
			updatesearch.click();
			WebDriverWait expwait= new WebDriverWait(driver,Duration.ofSeconds(20));// explicit wait until appearance of search bar
			//expwait.until(ExpectedConditions.elementToBeClickable(destinationcity));
			expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//div[@class='greyCnt marginT5']"))));
//			String actual= searchresult.getText();
//			String expected ="Sorry, we could not find any flights for this route";
			String actual= passsengerandclass.getAttribute("value");
			String expected ="1 Traveller(s), First class";
			Assert.assertEquals(actual, expected);
			System.out.println("Passed for first class selection");
		}
		
//3. Intializing each component using page factory class
		
	// NullPointerException will arrive without intializing element try to perform action 
			
		public Source6(WebDriver driver)
		{
			PageFactory.initElements(driver, this);// init meaning initializing elements
		}
		

	}
	

