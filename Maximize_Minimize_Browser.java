package basicsofselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Minimize_Browser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();  //launching the browser
		driver.get("https://www.flipkart.com");  //launching the wedsite
		Thread.sleep(5000);
		driver.manage().window().maximize();  //maximize
		Thread.sleep(3000);
		driver.manage().window().minimize(); //minimize
		

	}

}
