package seleniumbasicpages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Control_To_Another167 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe");
		e1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement shoe_5=	driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[5]"));
		shoe_5.click();
		Set<String> ids =driver.getWindowHandles();
		Iterator<String> id =ids.iterator();
		String parentid = id.next();//parent id
		String childid = id.next();//1st child id
		Thread.sleep(3000);
		//driver.close();
		driver.switchTo().window(childid); //it will move the control to child
		driver.close();
		

	}

}
