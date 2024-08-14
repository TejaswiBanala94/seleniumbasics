package assertionintestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchAmazon_searchingForShoe_Assertion 
{
	ChromeDriver driver;
	@Test
	public void serchingforshoe() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe"+Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> shoes= driver.findElements(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])"));
		
		Assert.assertEquals(shoes.size(), 72, "Sorry testcase failed");
		
	}

}
