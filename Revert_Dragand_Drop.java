package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Revert_Dragand_Drop {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag =driver.findElement(By.xpath("//div[@id='container-6']"));
		WebElement drop =driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		WebElement dragback =driver.findElement(By.xpath("//div[@id='div2']"));
		WebElement dropback =driver.findElement(By.xpath("//div[@id='container-6']"));
		Actions a2 = new Actions(driver);
		a2.dragAndDrop(dragback, dropback).perform();

	}

}
