package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Grotechminds {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/x-path/");
		driver.manage().window().maximize();
		WebElement fname = driver.findElement(By.xpath("//input[@id='FirstName']"));
		fname.sendKeys("Tejaswi");
		Thread.sleep(2000);
		WebElement lname = driver.findElement(By.xpath("//input[@id='LastName']"));
		lname.sendKeys("Banala");
		Thread.sleep(2000);
		WebElement mname = driver.findElement(By.xpath("//input[@id='MiddleName']"));
		mname.sendKeys("Venkatesh");
		Thread.sleep(2000);
		WebElement workplace_Address = driver.findElement(By.xpath("//textarea[@name='Work-Place-Address']"));
		workplace_Address.sendKeys("America");
		Thread.sleep(2000);
		WebElement home_address = driver.findElement(By.xpath("//textarea[@name='home-address']"));
		home_address.sendKeys("India");
		Thread.sleep(2000);
		WebElement personal_email = driver.findElement(By.xpath("//input[@id='Personal-Email']"));
		personal_email.sendKeys("Tejaswibanala@gmail.com");
		Thread.sleep(2000);
		WebElement corporate_email = driver.findElement(By.xpath("//input[@id='Corporate-email']"));
		corporate_email.sendKeys("Tejaswi123@gmail.com");
		Thread.sleep(2000);
		WebElement mobile_no = driver.findElement(By.xpath("//input[@id='tel']"));
		mobile_no.sendKeys("73653462");

	}

}
