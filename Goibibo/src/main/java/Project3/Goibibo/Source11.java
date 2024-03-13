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

public class Source11 extends logincredentials {
		WebDriver driver;
		//WebDriver driver= new ChromeDriver();
// 1. Locating each components using @ Findby annotation
				
		@FindBy(xpath="(//span[@class='sc-12foipm-64 dGRyPm'])[2]")
		WebElement plussymbol;
		
		@FindBy(xpath="(//span[@class='padL20 padR20 font14'])[1]")
		WebElement adult1;
		
		@FindBy(xpath="(//span[@class='padL20 padR20 font14'])[2]")
		WebElement adult2;
		
		@FindBy(xpath="//span[@class='blueCnt padR5 f500']")
		List<WebElement> listofflightdetails;
		
		@FindBy(xpath="//span[@class='curPointFlt switchAct']")
		WebElement flightinfo;
		
		@FindBy(xpath="(//span[@class='curPointFlt'])[1]")
		WebElement faredetails;
		
		@FindBy(xpath="(//span[@class='curPointFlt'])[2]")
		WebElement baggagerules;
		
		@FindBy(xpath="(//span[@class='curPointFlt'])[3]")
		WebElement cancellrules;
		
		@FindBy(xpath="//button[@class='dweb-commonstyles__Button-sc-13fxsy5-14 drjZCZ']")
		WebElement securemytrip1;
		
		@FindBy(xpath="//option[@value='MALE']")
		WebElement travellergender1;
		
		@FindBy(xpath="(//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 jxlvgt width100'])[1]")
		WebElement firstname1;
		
		@FindBy(xpath="(//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 jxlvgt width100'])[2]")
		WebElement lastname1;
		
		@FindBy(xpath="(//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 jxlvgt width100'])[3]")
		WebElement mobilenum1;
		
		@FindBy(xpath="//button[@class='dweb-commonstyles__FltBtn-sc-13fxsy5-12 bWfuav f500 wid25 font16']")
		WebElement proceedbutton1;
		
		@FindBy(xpath="(//input[@class='sc-eBHhsj fYsyIB'])[1]")
		WebElement addressdetails1;
		
		//@FindBy(xpath="(//input[@class='sc-eBHhsj fYsyIB'])[2]")
		@FindBy(xpath="//input[@class='sc-eBHhsj fYsyIB']")
		WebElement pincodedetails1;
		
		//@FindBy(xpath="//label[@class='sc-ePDLzJ cCTwuw']")
		@FindBy(xpath="//label[@class='sc-ePDLzJ pRlTU']")
		WebElement confirmbutton1;
		
		//@FindBy(xpath="//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 zSvZy width100']")
		@FindBy(xpath="//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 dEvRMR width100']")
		WebElement emailaddress1;
		
		@FindBy(xpath="//p[@class='sc-dExYaf fFgTQr']")
		WebElement state1;
		
		@FindBy(xpath="//div[@class='offersstyle__PromoInputWrapper-sc-4s1lmm-2 jqlIba']")
		WebElement promocode;
		
// 2. Creating the method for each component to perform its action
		public void add_member()
		{
			plussymbol.click();
		}
		public void twoadults_val()
		{
			String actual1= adult1.getText();
			String expected1 ="Adult 1";
			String actual2= adult2.getText();
			String expected2 ="Adult 2";
			Assert.assertEquals(actual1, expected1);
			Assert.assertEquals(actual2, expected2);
			System.out.println("Passed for accodomation of 2 adults selected");
		}
		
		public void verify_searched_result_for_listofflightdetails()
		{
			//List<WebElement> listoftheproducts=driver.findElements(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])"));
			int count= listofflightdetails.size(); // Count of total no. of auto suggestion loaded
			System.out.println("Total no. of flight details found in the list is "+count);
			
			for(int i=0; i<count; i++)
			{
				
				WebElement flightdetails = listofflightdetails.get(i);
				
		//		String product_name = product.getText();
				flightdetails.click();
				boolean actual=((flightinfo.isDisplayed())&& faredetails.isDisplayed()&& baggagerules.isDisplayed()&& cancellrules.isDisplayed());
				boolean expected =true;
				Assert.assertEquals(actual, expected);
				System.out.println("Flight details like info, fare, baggage rules and cancell rules are available for the search result at  "+i);
				flightdetails.click();

			}
				
				
		}
		public void validation_multiplefields()
		{
			boolean actual=(securemytrip1.isEnabled()&& travellergender1.isEnabled()&& firstname1.isEnabled()&& lastname1.isEnabled()&& 
					mobilenum1.isEnabled()&& proceedbutton1.isEnabled() && addressdetails1.isEnabled() && pincodedetails1.isEnabled() &&
					confirmbutton1.isEnabled()&& emailaddress1.isEnabled() && state1.isEnabled()&& promocode.isEnabled());
			boolean expected =true;
			Assert.assertEquals(actual, expected);
			System.out.println("Validated for field entry");
			
		}
//3. Intializing each component using page factory class
		
	// NullPointerException will arrive without intializing element try to perform action 
			
		public Source11(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);// init meaning initializing elements
		}
		

	}
	

