package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng_Priority_invocationCount 
{
	@Test(priority=1,invocationCount=5)
	public void testcase1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Modi");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
	@Test
	public void add()
	{
		
	}

}
