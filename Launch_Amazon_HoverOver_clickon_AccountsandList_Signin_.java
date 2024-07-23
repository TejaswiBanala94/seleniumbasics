package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch_Amazon_HoverOver_clickon_AccountsandList_Signin_ {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement accountandlist = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		WebElement signin = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		signin.click();
		
	}

}
