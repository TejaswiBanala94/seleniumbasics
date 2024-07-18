package basicsofselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.Amazon.com");
		Thread.sleep(3000);
		//driver.close(); //closes the parent tab
		
		driver.quit();  //closes the parent and child or closes the entire browser
		

	}

}
