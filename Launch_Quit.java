package amazon;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit
{
	ChromeDriver driver;
	@BeforeMethod
	public void precondition() 
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
			
	}
	@AfterMethod
	public void postexecution()throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		
	}
	

}
