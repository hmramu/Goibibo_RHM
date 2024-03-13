package Project3.Goibibo;
/* Login to page, search the flight and logout
 */

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testlistners_implemented.class)
public class Testcase12 extends Launch_Quit{

	@Test(dataProvider="Product", dataProviderClass = Dataprovider.class)
	public void goibibotestcase12(String data) throws EncryptedDocumentException, IOException, InterruptedException
	{	
		Source1 s1=new Source1(driver);// remember scanner and actions class
		s1.profileaccess(driver);
		s1.login_signup();
		s1.mobile_num();
		Source2 s2=new Source2(driver);// remember scanner and actions class
		s2.login_confirm();
		Source4 s4=new Source4(driver);// remember scanner and actions class
		Source12 s12=new Source12(driver);// remember scanner and actions class
		//s12.close_popup();
		s4.popup_window(driver);
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
		
		s12.access_profile();
		s12.logout_val();
		
		
	}
	
}
