package crossbrowserongoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcasegoogle4 extends Crossbrowser_5_Testcases_Google 
{
	@Test
	public void testcase4() throws InterruptedException
	{
		WebElement searchtextfeild = driver.findElement(By.name("q"));
		searchtextfeild.sendKeys("facebook login page"+Keys.ENTER);
		
	}

}
