package testngprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait 
{
	@Test
	public void testcase()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://www.google.com");
	     driver.manage().window().maximize();
	     WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	     w1.until(ExpectedConditions.titleIs("Google"));
	     driver.findElement(By.name("q")).sendKeys("India");
	     driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	     
	}

}
