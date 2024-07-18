package basicsofselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowsHandle_GetWindowHandles 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		

	}

}
