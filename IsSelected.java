package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/is-selected/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.xpath("(//input[@id='vehicle2'])[1]"));
		//boolean b1 =checkbox.isSelected();
		//System.out.println(b1);
		checkbox.click();
		Thread.sleep(2000);
		boolean b2 =checkbox.isSelected();
		System.out.println(b2);

	}

}
