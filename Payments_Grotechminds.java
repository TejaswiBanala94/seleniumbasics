package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Payments_Grotechminds {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/payments/");
		driver.manage().window().maximize();
		WebElement card_no = driver.findElement(By.xpath("//input[@id='cardNumber']"));
		card_no.sendKeys("53425213456");
		WebElement expiry_date = driver.findElement(By.xpath("//input[@id='expiryDate']"));
		expiry_date.sendKeys("23-7-2024");
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cvv']"));
		cvv.sendKeys("354");
		WebElement e1 = driver.findElement(By.id("cardType"));
		Select s1 = new Select(e1);
		s1.selectByVisibleText("American Express");
		WebElement amount = driver.findElement(By.xpath("//input[@id='amount']"));
		amount.sendKeys("50000");
		WebElement currency = driver.findElement(By.xpath("//input[@name='currency']"));
		
		WebElement save_card_details = driver.findElement(By.xpath("//input[@id='saveCard']"));
		save_card_details.click();
		
		
		

	}

}
