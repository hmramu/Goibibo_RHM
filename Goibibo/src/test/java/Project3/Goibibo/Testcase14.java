package Project3.Goibibo;
/* Check if user is able to search the domestic round trip flight
 */

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testlistners_implemented.class)
public class Testcase14 extends Launch_Quit{

	@Test(dataProvider="Product", dataProviderClass = Dataprovider.class)
	public void goibibotestcase14(String data) throws EncryptedDocumentException, IOException, InterruptedException
	{	
		Source4 s4=new Source4(driver);// remember scanner and actions class
		//s4.popup_window(driver);
		//s4.refresh_page(driver);
		//Thread.sleep(5000);
		//s4.frame_ack();
		//s4.one_way();
		s4.from_location(driver);
		s4.auto_suggestion();
		s4.destination_city(driver);
		s4.auto_suggestion1();
		s4.select_date();
		s4.done_button();
		s4.done_button1();
		Source5 s5=new Source5(driver);// remember scanner and actions class
		s5.round_trip();
		s4.search_flight();
		s5.search_result_twoway(driver);
		
	}
	
}
