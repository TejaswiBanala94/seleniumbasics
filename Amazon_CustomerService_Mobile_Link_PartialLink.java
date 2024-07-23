package basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_CustomerService_Mobile_Link_PartialLink 
{

	public static void main(String[] args)
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement customer_Service_link = driver.findElement(By.linkText("Customer Service"));
		customer_Service_link.click();
		WebElement Mobile_link = driver.findElement(By.linkText("Mobiles"));
		Mobile_link.click();
		WebElement customer_Service_link1 = driver.findElement(By.partialLinkText("Customer"));
		customer_Service_link1.click();
		WebElement Mobile_link1 = driver.findElement(By.partialLinkText("Mobi"));
		Mobile_link1.click();

	}

}
