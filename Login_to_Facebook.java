package basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_to_Facebook {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement  username = driver.findElement(By.id("email"));
		username.sendKeys("banalatejaswi@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Automationbatch@42");
		WebElement loginbutton = driver.findElement(By.name("login"));
		//loginbutton.sendKeys(Keys.ENTER);
		loginbutton.click();
		
	

	}

}
