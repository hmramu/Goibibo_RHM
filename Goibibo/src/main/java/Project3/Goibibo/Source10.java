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

public class Source10 extends logincredentials {
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
				
				/*
				Set<String> handles =driver.getWindowHandles();
				Iterator<String> iterate= handles.iterator();
				String parent_tab = iterate.next();
				String child_tab = iterate.next();
					
				driver.switchTo().window(child_tab);
				
				try
				{
					softassert.assertTrue(price.isDisplayed());
				}
				catch(NoSuchElementException e11)
				{
					softassert.fail("product_price_tag is not displayed for - "+ product_name);
				}
				
				try
				{
					softassert.assertTrue(productdescription.isDisplayed());
				}
				catch(NoSuchElementException e11)
				{
					try
					{
						softassert.assertTrue(productdescription1.isDisplayed());
					}
					catch(NoSuchElementException e12)
					{
						softassert.fail("product_description_section is not displayed for - "+ product_name);
					}
				}
				
				try
				{
					softassert.assertTrue(productdetails.isDisplayed());
				}
				catch(NoSuchElementException e11)
				{
					softassert.fail("product_details_section is not displayed for - "+ product_name);
				}
				
				try
				{
					softassert.assertTrue(rating.isDisplayed());
				}
				catch(NoSuchElementException e11)
				{
					
					softassert.fail("customer_reviews are not displayed for - "+ product_name);
				}

				driver.close();
				driver.switchTo().window(parent_tab);
				
			}
			
		softassert.assertAll();
		*/	
		}
		
//3. Intializing each component using page factory class
		
	// NullPointerException will arrive without intializing element try to perform action 
			
		public Source10(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);// init meaning initializing elements
		}
		

	}
	

