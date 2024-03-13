package Project3.Goibibo;
/* Reach till payments page and select credit card option→ enter card option → make the payment
 */

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testlistners_implemented.class)
public class Testcase15 extends Launch_Quit{

	@Test(dataProvider="Product", dataProviderClass = Dataprovider.class)
	public void goibibotestcase15(String data) throws EncryptedDocumentException, IOException, InterruptedException
	{	
		Source4 s4=new Source4(driver);// remember scanner and actions class
		Source12 s12=new Source12(driver);// remember scanner and actions class
		s4.popup_window(driver);
		s4.from_location(driver);
		s4.auto_suggestion();
		s4.destination_city(driver);
		s4.auto_suggestion1();
		s4.select_date();
		s4.done_button();
		Source9 s9=new Source9(driver);// remember scanner and actions class
		s4.done_button1();
		s4.search_flight();
		Source8 s8=new Source8(driver);// remember scanner and actions class
		s8.view_fares();
		s8.book_button();
		s8.wait_Until_Page_Load();
		s8.switch_window();
		s8.secure_mytrip();
		s8.tripsecure_val();
		s8.traveller_details();
	//	s8.seat_selection();
	//	s8.seatselection_val();
		Source15 s15=new Source15(driver);// remember scanner and actions class
		s15.payment_sel();
		s15.payment_val();
	}
	
}
