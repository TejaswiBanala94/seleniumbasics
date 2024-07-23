package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Books_Serch_Book {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(e1);
		s1.selectByValue("search-alias=stripbooks");
		Thread.sleep(2000);
		WebElement searchfor_book = driver.findElement(By.name("field-keywords"));
		searchfor_book.sendKeys("Java Book");
		WebElement searching = driver.findElement(By.name("field-keywords"));
		searching.sendKeys(Keys.ENTER);

	}

}
