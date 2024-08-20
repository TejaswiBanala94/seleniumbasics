package fb_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_to_facebook 
{
	ChromeDriver driver;
	//locating each elements using @findBY
	@FindBy(id="email")
	WebElement emailid_un;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement login_button;
	
	//each elements should have separate methods
	
	public void un()
	{
		emailid_un.sendKeys("banalatejaswi555@gmail.com");
	}
	public void pwd()
	{
		password.sendKeys("btechfriends");
	}
	public void login()
	{
		login_button.click();
	}
	//initialize the elements using pagefactory class
	
	public Login_to_facebook(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}
