package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Ename = driver.findElement(By.xpath("//input[@id='name']"));
		Ename.sendKeys("Tejaswi");
		
		WebElement e1 = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		e1.click();
		Thread.sleep(2000);
		
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		

	}

}
