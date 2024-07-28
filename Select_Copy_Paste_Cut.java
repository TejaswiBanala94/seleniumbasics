package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Copy_Paste_Cut {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement present = driver.findElement(By.id("Present-Address"));
		present.sendKeys("Beeramguda,Hyderabad");
		present.sendKeys(Keys.CONTROL+"a");
		present.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		WebElement permanent = driver.findElement(By.id("Permanent-Address"));
		permanent.sendKeys(Keys.CONTROL+"v");

	}

}
