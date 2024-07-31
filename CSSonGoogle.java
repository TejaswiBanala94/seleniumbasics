package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSonGoogle {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.goolgle.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.cssSelector("#APjFqb"));  //with id
//		WebElement e2 = driver.findElement(By.cssSelector(".gLFyf")); //with classname
//		WebElement e3 = driver.findElement(By.cssSelector("textarea#APjFqb")); //tagname nd id
//		WebElement e4 = driver.findElement(By.cssSelector("textarea.gLFyf")); //tagname nd classname
//		WebElement e5 = driver.findElement(By.cssSelector("[name='q']")); //Attributename nd attribute value
//		WebElement e6 = driver.findElement(By.cssSelector("textarea.gLFyf[name='q']")); //tagname,classname nd attribute value
//		WebElement e7 = driver.findElement(By.cssSelector("input[id^='twotabsearch']")); //carot and substring
		e1.sendKeys("India");
		e1.sendKeys(Keys.ENTER);
		

	}

}
