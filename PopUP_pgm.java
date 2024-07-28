package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUP_pgm {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		WebElement click_Button = driver.findElement(By.xpath("//button[.='Click ']"));
		
		click_Button.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();	
	}

}
