package Project3.Goibibo;
/* Test for multi-city flight search
 */

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testlistners_implemented.class)
public class Testcase7 extends Launch_Quit{

	@Test(dataProvider="Product", dataProviderClass = Dataprovider.class)
	public void goibibotestcase7(String data) throws EncryptedDocumentException, IOException, InterruptedException
	{	
		Source7 s7=new Source7(driver);// remember scanner and actions class
		s7.multi_city();
		Source4 s4=new Source4(driver);// remember scanner and actions class
		s4.from_location(driver);
		s4.auto_suggestion();
		s4.destination_city(driver);
		s4.auto_suggestion1();
		s4.select_date();
		s4.done_button();
		s7.done_button3();
		s7.destination_city2(driver);
		s7.auto_suggestion2();
		s7.select_date2();
		s7.done_button4();
		s7.cancel_button();
		s7.search_flights();
		s7.multicity_val();
		
		
	}
	
}
