package Project3.Goibibo;
/* Validate if after clicking on book button in the search page user is able to enter every test fields present 
 * like pincode, state, radio button, firstname, lastname, email id, mobile number, promo code etc search result page.
*/

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testlistners_implemented.class)
public class Testcase11 extends Launch_Quit{

	@Test(dataProvider="Product", dataProviderClass = Dataprovider.class)
	public void goibibotestcase11(String data) throws EncryptedDocumentException, IOException, InterruptedException
	{	
		Source4 s4=new Source4(driver);// remember scanner and actions class
		s4.from_location(driver);
		s4.auto_suggestion();
		s4.destination_city(driver);
		s4.auto_suggestion1();
		s4.select_date();
		s4.done_button();
		Source9 s9=new Source9(driver);// remember scanner and actions class
		//s9.add_member();
		s4.done_button1();
		s4.search_flight();
		Source10 s10=new Source10(driver);// remember scanner and actions class
		Source8 s8=new Source8(driver);// remember scanner and actions class
		s8.view_fares();
		s8.book_button();
		//Thread.sleep(3000);
		s8.wait_Until_Page_Load();
		s8.switch_window();
		Source11 s11=new Source11(driver);// remember scanner and actions class
		s11.validation_multiplefields();
		//s8.switch_window1(driver);
		//s8.switch_window2(driver);
		//s8.switch_window3(driver);
		/*
		s8.secure_mytrip();
		s8.tripsecure_val();
		s9.twoadults_val();
		//s8.traveller_details();
		//s8.seat_selection();
		//s8.seatselection_val();
		*/
	}
	
}
