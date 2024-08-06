package crossbrowserongoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcasegoogle2 extends Crossbrowser_5_Testcases_Google
{
	@Test
	public void testcase1()
	{
		WebElement e1=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		e1.sendKeys("Modi"+Keys.ENTER);
	}

}
