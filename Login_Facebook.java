package basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Facebook {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Email_id =driver.findElement(By.xpath("//input[@id='email']"));
		Email_id.sendKeys("banalatejaswi555@gmail.com");
		WebElement password =driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("banalatejaswi555@gmail.");
		WebElement login =driver.findElement(By.xpath("//button[@name='login']"));
		login.click();

	}

}
