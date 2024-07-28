package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Shoes_FifthAutosuggetion {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchtextfeild = driver.findElement(By.id("twotabsearchtextbox"));
		searchtextfeild.sendKeys("shoes");
		Thread.sleep(1000);
		searchtextfeild.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		searchtextfeild.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		searchtextfeild.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		searchtextfeild.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		searchtextfeild.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		searchtextfeild.sendKeys(Keys.ENTER);
	

	}

}
