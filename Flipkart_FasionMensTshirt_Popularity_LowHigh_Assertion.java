package assertionintestng;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flipkart_FasionMensTshirt_Popularity_LowHigh_Assertion
{
	ChromeDriver driver;
	
	@Test
	public void flipkart() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement fashion = driver.findElement(By.xpath("//span[.='Fashion']"));
		fashion.click();
		Thread.sleep(2000);
		WebElement men = driver.findElement(By.xpath("//span[.='Men']"));
		Actions a1= new Actions(driver);
		a1.moveToElement(men).perform();
		Thread.sleep(1000);
		WebElement tshirt = driver.findElement(By.linkText("T-Shirts"));
		tshirt.click();
		Thread.sleep(2000);
		//String s1=driver.getCurrentUrl();

		WebElement pricelow_high = driver.findElement(By.xpath("(//div[@class='zg-M3Z'])[1]"));
		pricelow_high.click();
		String s1=driver.getCurrentUrl();
		Assert.assertEquals(s1.contains("sort=price_asc"), true, "sorry the testcase is failed");
		
	}

}
