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

public class Source9 extends logincredentials {
		WebDriver driver;
		//WebDriver driver= new ChromeDriver();
// 1. Locating each components using @ Findby annotation
				
		@FindBy(xpath="(//span[@class='sc-12foipm-64 dGRyPm'])[2]")
		WebElement plussymbol;
		
		@FindBy(xpath="(//span[@class='padL20 padR20 font14'])[1]")
		WebElement adult1;
		
		@FindBy(xpath="(//span[@class='padL20 padR20 font14'])[2]")
		WebElement adult2;
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
//3. Intializing each component using page factory class
		
	// NullPointerException will arrive without intializing element try to perform action 
			
		public Source9(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);// init meaning initializing elements
		}
		

	}
	

