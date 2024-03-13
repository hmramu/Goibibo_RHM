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

public class Source8 extends logincredentials {
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
		
		@FindBy(xpath="(//button[@class='srp-card-uistyles__BookButton-sc-3flq99-21 gtPjNk dF justifyCenter alignItemsCenter f600'])[1]")
		WebElement viewfares;
		
		@FindBy(xpath="(//input[@class='srp-card-uistyles__Fltbook-sc-3flq99-35 hqAmOx f600 widthF105'])[1]")
		WebElement bookbutton;
		
		@FindBy(xpath="//button[@class='dweb-commonstyles__Button-sc-13fxsy5-14 drjZCZ']")
		WebElement securemytrip;
		
		@FindBy(xpath="(//span[@class='truncate maxWid80'])[2]")
		WebElement tripsecureconf;
		
		@FindBy(xpath="//option[@value='MALE']")
		WebElement travellergender;
		
		@FindBy(xpath="(//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 jxlvgt width100'])[1]")
		WebElement firstname;
		
		@FindBy(xpath="(//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 jxlvgt width100'])[2]")
		WebElement lastname;
		
		@FindBy(xpath="(//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 jxlvgt width100'])[3]")
		WebElement mobilenum;
		
		@FindBy(xpath="//button[@class='dweb-commonstyles__FltBtn-sc-13fxsy5-12 bWfuav f500 wid25 font16']")
		WebElement proceedbutton;
		
		@FindBy(xpath="(//input[@class='sc-eBHhsj fYsyIB'])[1]")
		WebElement addressdetails;
		
		//@FindBy(xpath="(//input[@class='sc-eBHhsj fYsyIB'])[2]")
		@FindBy(xpath="//input[@class='sc-eBHhsj fYsyIB']")
		WebElement pincodedetails;
		
		//@FindBy(xpath="//label[@class='sc-ePDLzJ cCTwuw']")
		@FindBy(xpath="//label[@class='sc-ePDLzJ pRlTU']")
		WebElement confirmbutton;
		
		//@FindBy(xpath="//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 zSvZy width100']")
		@FindBy(xpath="//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 dEvRMR width100']")
		WebElement emailaddress;
		
		@FindBy(xpath="//button[@class='dweb-commonstyles__ButtonBase-sc-13fxsy5-4 reviewTravellerOverlaystyles__RtdCorrBtn-sc-w2a3p-7 eTrRGk iYGKjl']")
		WebElement thatscorrect;
		
		@FindBy(xpath="(//button[@class='srp-card-uistyles__BookButton-sc-3flq99-21 gtPjNk dF justifyCenter alignItemsCenter f600'])[1]")
		WebElement hidefares;
		
		@FindBy(xpath="//p[@class='sc-dExYaf fFgTQr']")
		WebElement state;
		
		@FindBy(xpath="(//ul[@class='sc-iapWAC bPcczV']/li)[17]")
		WebElement karnataka;
		
		@FindBy(xpath="//button[@class='dweb-commonstyles__FltBtn-sc-13fxsy5-12 iocrTs font14']")
		WebElement okbutton;
		
		@FindBy(xpath="(//img[@class='price-list-newstyles__SeatPriceElementImg-sc-1x6dz85-6 kUOdzE'])[5]")
		WebElement bootspace1000;
		
		//@FindBy(xpath="(//span[@class='seatText  black'])[134]")
		@FindBy(xpath="(//span[@class='seatText  black'])[9]")
		WebElement seatselection;
		
		@FindBy(xpath="//button[@class='dweb-commonstyles__FltBtn-sc-13fxsy5-12 bWfuav width100 f500 font16']")
		WebElement proceedtopayment;
		
		@FindBy(xpath="(//span[@class='truncate maxWid80'])[3]")
		WebElement seatconfirm;
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
		public void view_fares()
		{
			viewfares.click();
		}
		public void book_button()
		{
			bookbutton.click();
		}
		public void wait_Until_Page_Load()
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.titleIs("Book Cheap Flights, Air Tickets, Hotels, Bus & Holiday Package at Goibibo"));
		}
		public void switch_window()
		{
						
			// To Switch the control to the child tab
			String parentid = driver.getWindowHandle();// gets Parent tab id
			Set<String> ParChid = driver.getWindowHandles();// gets Parent + Child tab id
			System.out.println(parentid);
			System.out.println(ParChid);
			
			Iterator<String> id1 = ParChid.iterator();// Assigning parent+child tab id to iterator to split id's 
			String parentid1 = id1.next();//Only parent id assigned to id1
			String Child1=id1.next();// Only child id assigned to id1
			
			System.out.println(parentid1);// Printing only parent id
			System.out.println(Child1);// Printing only child id
			driver.switchTo().window(Child1);// Switching control to child id
			
			//clicking on hotel in the parent tab to verify the control to child tab is shifted or not
			//driver.findElement(By.xpath("(//span[@class='sc-gmPhUn beBHgZ'])[2]")).click();
			
			//Set<String> handles = driver.getWindowHandles();

	        // Switch to the next tab
	      //  Iterator<String> it = handles.iterator();
	      //  it.next(); // Skip the current tab
	       // String nextTab = it.next();
	       // driver.switchTo().window(next());
	       // driver.switchTo().newWindow(WindowType.TAB);
	      //  d1.switchTo().newWindow(WindowType.TAB);
	        
		}
		
		public void switch_window1(WebDriver driver)
		{
			 // Get the window handles of all open tabs
	        Set<String> handles = driver.getWindowHandles();

	        // Switch to the next tab
	        Iterator<String> it = handles.iterator();
	        String currentWindowHandle = driver.getWindowHandle();
	        while (it.hasNext()) {
	            String handle = it.next();
	            if (!handle.equals(currentWindowHandle)) {
	                driver.switchTo().window(handle);
	                break;
	            }
	        }
	        
	        //securemytrip.click();
	        //hidefares.click();
	        
	      //clicking on hotel in the parent tab to verify the control to child tab is shifted or not
			driver.findElement(By.xpath("(//span[@class='sc-gmPhUn beBHgZ'])[2]")).click();
		}
		
		public void switch_window2(WebDriver driver)
		{
			// Get a list of all open window handles
	        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());

	        // Iterate through the list of window handles and compare each handle to the parent window handle
	        for (String windowHandle : windowHandles) {
	            if (!windowHandle.equals(driver.getWindowHandle())) {
	                // Switch to the window handle
	                driver.switchTo().window(windowHandle);
	            }
	        }
		}
		public void switch_window3(WebDriver driver)
		{
			Actions ac = new Actions(driver);

			ac.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
			
			//clicking on hotel in the parent tab to verify the control to child tab is shifted or not
			//driver.findElement(By.xpath("(//span[@class='sc-gmPhUn beBHgZ'])[2]")).click();
			//securemytrip.click();
			driver.close();
		}
		public void switchtochildWindow(WebDriver driver) {
			String window =driver.getWindowHandle();
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> winpop = windows.iterator();
			String parentid = winpop.next();
			String childid = winpop.next();
			driver.switchTo().window(childid);
			
		}
		public void secure_mytrip() throws InterruptedException
		{	
			//WebDriverWait expwait= new WebDriverWait(driver,Duration.ofSeconds(20));// explicit wait until appearance of search bar
			//expwait.until(ExpectedConditions.elementToBeClickable(securemytrip));
			//expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//div[@class='font24 f500 white']"))));
			//expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//button[@class='dweb-commonstyles__Button-sc-13fxsy5-14 TPeIR marginR10']"))));
			//expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//div[@class='price-breakupstyles__BreakupTitle-sc-fjdxc9-15 iUdYkh f600 flex1 blueCnt']"))));
			//driver.navigate().refresh();
		
			//expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//span[@class='font22 f600']"))));
			//button[@class='dweb-commonstyles__Button-sc-13fxsy5-14 TPeIR marginR10']
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//button[@class='dweb-commonstyles__Button-sc-13fxsy5-14 TPeIR marginR10']")).click();
			securemytrip.click();
			
		}
		public void tripsecure_val()
		{
			String actual= tripsecureconf.getText();
			String expected ="Trip Secure";
			Assert.assertEquals(actual, expected);
			System.out.println("Passed for insurance selected");
		}
		public void traveller_details()
		{
			travellergender.click();
			firstname.sendKeys("Automation");
			lastname.sendKeys("tester");
			mobilenum.sendKeys("8951051048");
			//emailaddress.click();
			emailaddress.sendKeys("testautomation472@gmail.com");
			addressdetails.sendKeys("Vijayanagar Mysore");
			pincodedetails.sendKeys("570017");
			state.click();
			karnataka.click();
			confirmbutton.click();
			try {
				okbutton.click();
			}
			catch(NoSuchElementException e){
				System.out.println("Ok button press is not required");
			}
			finally {
				
			}
			
			
			proceedbutton.click();
			
			thatscorrect.click();
		}
		
		public void seat_selection()
		{
			bootspace1000.click();
			//WebElement element = driver.findElement((By) seatselection);
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",seatselection);
			seatselection.click();
			//proceedtopayment.click();
		}
		public void seatselection_val()
		{
			String actual= seatconfirm.getText();
			String expected ="Seats";
			Assert.assertEquals(actual, expected);
			System.out.println("Passed for seat selected");
		}
//3. Intializing each component using page factory class
		
	// NullPointerException will arrive without intializing element try to perform action 
			
		public Source8(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);// init meaning initializing elements
		}
		

	}
	

