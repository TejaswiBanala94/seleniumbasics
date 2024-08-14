package assertionintestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Launch_Amazon_Login_Assertion 
{
	ChromeDriver driver;
	@Test
	public void amazon() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1= new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement signin = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		signin.click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("banalatejaswi555@gmail.com");
		WebElement button = driver.findElement(By.id("continue"));
		button.click();
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("8187832382");
		Thread.sleep(1000);
		WebElement sgn = driver.findElement(By.id("signInSubmit"));
		sgn.click();
		Thread.sleep(1000);
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		Assert.assertEquals(search.isDisplayed(), true, "Sorry search component is not found");
		//another way with title
		//Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Sorry title not found try again");
		
	}

}
