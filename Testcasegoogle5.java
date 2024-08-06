package crossbrowserongoogle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcasegoogle5 extends Crossbrowser_5_Testcases_Google 
{
	@Test
	public void testcase4() throws InterruptedException
	{
		WebElement searchtextfeild = driver.findElement(By.name("q"));
		searchtextfeild.sendKeys("india");
		Thread.sleep(2000);
		List<WebElement> auto = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = auto.size();
		System.out.println(count);
		auto.get(count-10).click();
		
	}

}
