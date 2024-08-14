package iretryanalizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Retry_testcase1 
{
	@Test(retryAnalyzer = iretryanalizer.Retrymechanism.class)
	public void amazon_search() throws InterruptedException
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement customer_Service_link = driver.findElement(By.linkText("Customer Service"));
		customer_Service_link.click();
		WebElement Mobile_link = driver.findElement(By.linkText("Mobiles"));
		Mobile_link.click();
		
	}

}
