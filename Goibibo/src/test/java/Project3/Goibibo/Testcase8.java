package Project3.Goibibo;
/* Verify that the user is presented with additional options like-luggage, extra legroom, food/beverages, etc 
 * and selecting the same results in additional  cost with the booking amount.
*/

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testlistners_implemented.class)
public class Testcase8 extends Launch_Quit{

	@Test(dataProvider="Product", dataProviderClass = Dataprovider.class)
	public void goibibotestcase8(String data) throws EncryptedDocumentException, IOException, InterruptedException
	{	
		Source4 s4=new Source4(driver);// remember scanner and actions class
		s4.from_location(driver);
		s4.auto_suggestion();
		s4.destination_city(driver);
		s4.auto_suggestion1();
		s4.select_date();
		s4.done_button();
		s4.done_button1();
		s4.search_flight();
		Source8 s8=new Source8(driver);// remember scanner and actions class
		s8.view_fares();
		s8.book_button();
		//Thread.sleep(3000);
		s8.wait_Until_Page_Load();
		s8.switch_window();
		//s8.switch_window1(driver);
		//s8.switch_window2(driver);
		//s8.switch_window3(driver);
		s8.secure_mytrip();
		s8.tripsecure_val();
		s8.traveller_details();
		s8.seat_selection();
		s8.seatselection_val();
	}
	
}
