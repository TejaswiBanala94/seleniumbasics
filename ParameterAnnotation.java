package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation 
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void testcase1(String nameofbrowser)
	{
		if(nameofbrowser.equals("chrome"))
		{
	 driver = new ChromeDriver();
		}
		if(nameofbrowser.equals("edge"))
		{
	 driver = new EdgeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{
	 driver = new FirefoxDriver();
		}
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement Email_id =driver.findElement(By.xpath("//input[@id='email']"));
	Email_id.sendKeys("banalatejaswi555@gmail.com");
	WebElement password =driver.findElement(By.xpath("//input[@name='pass']"));
	password.sendKeys("banalatejaswi555@gmail.");
	WebElement login =driver.findElement(By.xpath("//button[@name='login']"));
	login.click();
	}

}
