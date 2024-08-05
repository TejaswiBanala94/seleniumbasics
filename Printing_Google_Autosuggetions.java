package autosuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing_Google_Autosuggetions {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchtextfeild = driver.findElement(By.name("q"));
		searchtextfeild.sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> auto = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = auto.size();
		System.out.println(count);
		
		for(int i=0;i<auto.size();i++)
		{
			WebElement e1=auto.get(i);
			System.out.println(e1.getText());
		}
		

	}

}
