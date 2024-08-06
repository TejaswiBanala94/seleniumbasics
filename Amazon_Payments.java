package testngprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_Payments 
{
	WebDriver driver;
	@Test
	public void amazon() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe"+Keys.ENTER);
		Thread.sleep(2000);
		WebElement shoe_15=	driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[15]"));
		shoe_15.click();
		Set<String> ids =driver.getWindowHandles();
		Iterator<String> id =ids.iterator();
		String parentid = id.next();//parent id
		String childid = id.next();//1st child id
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(childid); //it will move the control to child
		Thread.sleep(3000);
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
//		Set<String> ids1= driver.getWindowHandles();
//		Iterator<String> id1 = ids.iterator();
//		String parent_id = id1.next();
//		String child_id = id1.next();
		Thread.sleep(2000);
		//driver.close();
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		WebElement proceedtobuy = driver.findElement(By.name("proceedToRetailCheckout"));
		proceedtobuy.click();
		Thread.sleep(2000);
		//driver.close();
		driver.switchTo().window(childid);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("banalatejaswi555@gmail.com");
		WebElement button = driver.findElement(By.id("continue"));
		button.click();
		Thread.sleep(2000);
        driver.switchTo().window(childid);
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("8187832382");
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
		Thread.sleep(2000);
		driver.switchTo().window(childid);
		
		
		
		
	}

}
