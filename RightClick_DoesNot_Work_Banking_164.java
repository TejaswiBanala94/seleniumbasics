package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClick_DoesNot_Work_Banking_164 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		link.click();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Tejaswi Banala");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Tejaswi@123");

	}

}
