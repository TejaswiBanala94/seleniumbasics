package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable_Displayed_AND_Operator_Googleclickgmail 
{
	static boolean b1;

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.linkText("Gmail"));
		if(b1==(e1.isDisplayed()&& b1==e1.isEnabled()))
		{
			e1.click();
		}
		

	}

}
