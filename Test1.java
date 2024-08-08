package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test1 extends Launch_And_Quit
{
	@Test
	public void shoe()
	{
		WebElement e1 =driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe"+Keys.ENTER);
	}

}
