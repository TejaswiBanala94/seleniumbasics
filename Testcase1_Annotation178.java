package testngbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1_Annotation178 
{
	@Test
	static void login()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement  username = driver.findElement(By.id("email"));
		username.sendKeys("banalatejaswi@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Automationbatch@42");
		WebElement loginbutton = driver.findElement(By.name("login"));
		//loginbutton.sendKeys(Keys.ENTER);
		loginbutton.click();
	}

}
