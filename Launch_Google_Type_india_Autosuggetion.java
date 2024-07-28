package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Google_Type_india_Autosuggetion {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchtextfeild = driver.findElement(By.name("q"));
		searchtextfeild.sendKeys("India");
		Thread.sleep(2000);
		searchtextfeild.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		searchtextfeild.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		searchtextfeild.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		searchtextfeild.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		searchtextfeild.sendKeys(Keys.ENTER);
		
		
		

	}

}
