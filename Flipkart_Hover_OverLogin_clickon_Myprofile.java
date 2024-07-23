package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Hover_OverLogin_clickon_Myprofile {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//span[.='Login']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(login).perform();
		WebElement myprofile = driver.findElement(By.linkText("My Profile")); //if the tag name is a
		myprofile.click();
		

	}

}
