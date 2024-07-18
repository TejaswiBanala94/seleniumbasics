package basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium_Search {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		     driver.get("https://www.google.com");
		     driver.manage().window().maximize();
		     driver.findElement(By.name("q")).sendKeys("India");
		     driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		     

	}

}
