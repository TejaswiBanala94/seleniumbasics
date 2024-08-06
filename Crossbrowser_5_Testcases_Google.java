package crossbrowserongoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Crossbrowser_5_Testcases_Google
{
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void precondition(String nameofbrowser) 
	{
		if(nameofbrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(nameofbrowser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void postexecution() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
