package crossbrowserongoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcasegoogle3 extends Crossbrowser_5_Testcases_Google
{
	@Test
	public void testcase3()
	{
	WebElement gmail_link = driver.findElement(By.linkText("Gmail"));
	gmail_link.click();
	}

}
