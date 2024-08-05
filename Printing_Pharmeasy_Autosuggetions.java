package autosuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing_Pharmeasy_Autosuggetions {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://pharmeasy.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-joLzpF-justify-center c-bXbWpx-joJbDg-align-center c-bXbWpx-igKcZLf-css']"));
		search.click();
		Thread.sleep(2000);
		WebElement inputforsearch = driver.findElement(By.id("topBarInput"));
		inputforsearch.sendKeys("pcm");
		Thread.sleep(4000);
		List<WebElement> auto = driver.findElements(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-iieFQlv-css']/div/a"));
		Thread.sleep(2000);
		int count = auto.size();
		System.out.println(count);
	
		for(int i=0;i<auto.size();i++)
		{
		WebElement e1=auto.get(i);
		System.out.println(e1.getText());
		
		}

	}

}
