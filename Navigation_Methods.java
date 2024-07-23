package seleniumbasicpages;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Methods {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com"); //another way to launch the browser 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();  //backward
		Thread.sleep(2000);
		driver.navigate().forward(); //forward
		Thread.sleep(2000);
		driver.navigate().refresh();  //refresh
		
	}

}
