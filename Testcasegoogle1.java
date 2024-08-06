package crossbrowserongoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcasegoogle1 extends Crossbrowser_5_Testcases_Google 
{
	@Test
	public void testcase1() throws InterruptedException
	{
		WebElement searchtextfeild = driver.findElement(By.name("q"));
		searchtextfeild.sendKeys("Hyderabad");
		Thread.sleep(1000);
		searchtextfeild.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		searchtextfeild.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		searchtextfeild.sendKeys(Keys.ENTER);
		
	}

}
