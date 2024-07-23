package basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/banal/OneDrive/Desktop/learningHTML1.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement uname = driver.findElement(By.xpath("(/html/body/input)[1]"));
		uname.sendKeys("Tejaswi Banala");
		Thread.sleep(3000);
		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("Teju");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("(/html/body/input)[3]"));
		password.sendKeys("@12345$");
		Thread.sleep(3000);
		WebElement fn = driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		fn.sendKeys("Tejaswi");
		Thread.sleep(3000);
		WebElement boy = driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		boy.click();
		Thread.sleep(3000);
		WebElement girl = driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
		girl.click();
		Thread.sleep(3000);
		WebElement baby = driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
		baby.click();
		Thread.sleep(3000);
		WebElement male = driver.findElement(By.xpath("(/html/body/input)[4]"));
		male.click();
		Thread.sleep(3000);
		WebElement female = driver.findElement(By.xpath("(/html/body/input)[5]"));
		female.click();
		Thread.sleep(3000);
		WebElement bangalore = driver.findElement(By.xpath("(/html/body/input)[6]"));
		bangalore.click();
		Thread.sleep(3000);
		WebElement click_to_Know_Aboutus = driver.findElement(By.xpath("(/html/body/a)"));
		click_to_Know_Aboutus.click();
		
		
		
		

	}

}
