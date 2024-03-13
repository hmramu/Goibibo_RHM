package Project3.Goibibo;
/* Validate the login functionality with valid credentials.
 */

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testlistners_implemented.class)
public class Testcase2 extends Launch_Quit{

	@Test(dataProvider="Product", dataProviderClass = Dataprovider.class)
	public void goibibotestcase2(String data) throws EncryptedDocumentException, IOException, InterruptedException
	{	
		Source1 s1=new Source1(driver);// remember scanner and actions class
		s1.profileaccess(driver);
		s1.login_signup();
		s1.mobile_num();
		
		Source2 s2=new Source2(driver);// remember scanner and actions class
		s2.login_confirm();
}
	


}
