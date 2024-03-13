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

public class Source7 extends logincredentials {
		WebDriver driver;
		//WebDriver driver= new ChromeDriver();
// 1. Locating each components using @ Findby annotation
				
		@FindBy(xpath="(//p[@class='sc-gEvEer gpfTmR'])[3]")
		WebElement multicity;
		
		@FindBy(xpath="//a[@class='sc-12foipm-77 jYnAuG']")
		WebElement donebutton3;
		
		//@FindBy(xpath="//span[@class='sc-12foipm-39 hRfNRh']")
		//@FindBy(xpath="(//p[@class='sc-12foipm-20 bhnHeQ'])[1]")
		@FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[6]")
		WebElement secondcity;
		
		@FindBy(xpath="//input[@type='text']")
		WebElement to2;
		
		@FindBy(xpath="//ul[@id='autoSuggest-list']/li")
		List<WebElement> autosuggestion;
		
		@FindBy(xpath="//div[@aria-label='Sun Mar 31 2024']")
		WebElement selectdate2;
		
		@FindBy(xpath="//span[@class='fswTrvl__done']")
		WebElement donebutton4;
		
		@FindBy(xpath="//span[@class='fswTrvl__cancel']")
		WebElement cancelbutton;
		
		@FindBy(xpath="//span[@class='sc-12foipm-85 fUaVPB']")
		WebElement searchflights;
		
		@FindBy(xpath="//div[@class='f600 font18 white']")
		WebElement searchresult;
		
// 2. Creating the method for each component to perform its action
		public void multi_city()
		{
			multicity.click();
		}
		public void done_button3()
		{
			donebutton3.click();
		}
		public void destination_city2(WebDriver driver)
		{
			WebDriverWait expwait= new WebDriverWait(driver,Duration.ofSeconds(20));// explicit wait until appearance of search bar
			expwait.until(ExpectedConditions.elementToBeClickable(secondcity));
			//expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//input[@type='text']"))));
			//destinationcity.click();
			secondcity.click();
			to2.sendKeys("Delhi");
		}
		
		public void auto_suggestion2()
		{
			int count=autosuggestion.size();
			System.out.println(count);
			autosuggestion.get(0).click();
		}
		public void select_date2()
		{
			selectdate2.click();
		}
		public void done_button4()
		{
			donebutton4.click();
		}
		public void cancel_button()
		{
			cancelbutton.click();
		}
		public void search_flights()
		{
			searchflights.click();
		}
		public void multicity_val()
		{
			String actual= searchresult.getText();
			String expected ="Multicity Flights";
			Assert.assertEquals(actual, expected);
			System.out.println("Passed for Multicity Flights");
		}
		
//3. Intializing each component using page factory class
		
	// NullPointerException will arrive without intializing element try to perform action 
			
		public Source7(WebDriver driver)
		{
			PageFactory.initElements(driver, this);// init meaning initializing elements
		}
		

	}
	

