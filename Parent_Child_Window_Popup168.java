package seleniumbasicpages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child_Window_Popup168 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1=	driver.findElement(By.xpath("//span[.='Google']"));
		e1.click();
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		Iterator<String>id =ids.iterator();
		String parentid = id.next();//parent
		String childid = id.next();//child
		driver.close();
		driver.switchTo().window(childid);
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.name("identifier"));
		email.sendKeys("tejaswi13@gmail.com");
		
	}

}
