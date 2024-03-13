package Project3.Goibibo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit
{
	public static WebDriver driver; //works for both public and protected access specifiers
	@BeforeMethod
	public void launchbrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.goibibo.com/");
		Source1 s1=new Source1(driver);// remember scanner and actions class
		s1.close_popup();
		//driver.findElement(By.linkText("Sign in")).click();
	}
	
	@AfterMethod
	public void quitbrowser()
	{
		driver.quit();
	}
}
