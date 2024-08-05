package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_2 extends LaunchQuit
{
	@Test
	public void mobiles()
	{
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("mobiles"+Keys.ENTER);
	}
	
}
