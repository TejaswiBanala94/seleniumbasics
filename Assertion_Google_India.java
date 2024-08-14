package assertionintestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Google_India 
{
	ChromeDriver driver;
	@Test
	public void testcase1() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("India"+Keys.ENTER);
		
		Assert.assertEquals(driver.getTitle(), "India - Google Search","Sorry please try again");		
		
	}

}
