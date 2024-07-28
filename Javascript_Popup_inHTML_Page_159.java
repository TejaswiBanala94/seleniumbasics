package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Popup_inHTML_Page_159 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/banal/OneDrive/Desktop/learningHTML1.html");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.name( "username"));
		username.sendKeys("Tejaswi");
		Thread.sleep(2000);
		
		

	}

}
