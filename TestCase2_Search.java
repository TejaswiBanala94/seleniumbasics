package fb_test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fb_source.Homepage_facebook;
import fb_source.Login_to_facebook;

//Login to facebook->serach a friend
public class TestCase2_Search 
{
	ChromeDriver driver;
 @Test
 public void login_seraching()
{
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Login_to_facebook l1=new Login_to_facebook(driver);
		l1.un();
		l1.pwd();
		l1.login();
		Homepage_facebook l2 = new Homepage_facebook (driver);
		l2.search();
		
	
	
	
	
}

}