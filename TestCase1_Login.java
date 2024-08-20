package fb_test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import fb_source.Login_to_facebook;

//login to facebook
public class TestCase1_Login 
{
	@Test
	public void login()
	{
	  ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Login_to_facebook l1=new Login_to_facebook(driver);
		l1.un();
		l1.pwd();
		l1.login();
		 
		
	}
}
