package basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Grotech_Registration 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.xpath("(((((((((/html)[1]/body)[1]/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[1]/div)[1]/input)"));
		fname.sendKeys("Tejaswi");
		Thread.sleep(2000);
		WebElement lname = driver.findElement(By.xpath("(((((((((/html)[1]/body)[1]/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[1]/div)[2]/input)"));
		lname.sendKeys("Banala");
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.xpath("(((((((((/html)[1]/body)[1]/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[2]/div)[1]/input)"));
		Email.sendKeys("Tejaswi@gmail.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("(((((((((/html)[1]/body)[1]/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[2]/div)[2]/input)"));
		password.sendKeys("Teju@55");
		Thread.sleep(2000);
//		WebElement male = driver.findElement(By.xpath("(((((((((((/html)[1]/body)[1]/div)[2]/div)[2]/div)[1]/div)[3]/div/div)[2]/div/div/form/div)[3]/div)[1]/div/div)[1]/div/input)"));
//		male.click();
		Thread.sleep(2000);
		WebElement female = driver.findElement(By.xpath("(((((((((((/html)[1]/body)[1]/div)[2]/div)[2]/div)[1]/div)[3]/div/div)[2]/div/div/form/div)[3]/div)[1]/div/div)[2]/div/input)"));
		female.click();
		Thread.sleep(2000);
		WebElement Present_Address = driver.findElement(By.xpath("((((((((((/html)[1]/body)[1]/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[5])/div)[1]/textarea)"));
		Present_Address.sendKeys("11225 Seward Plazza,Omaha");
		Thread.sleep(2000);
		WebElement Permanent_Address = driver.findElement(By.xpath("((((((((((/html)[1]/body)[1]/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[5])/div)[2]/textarea)"));
		Permanent_Address.sendKeys("24 Beeramguda,Hyderabad");
		Thread.sleep(2000);
		WebElement pincode = driver.findElement(By.xpath("((((((((((/html)[1]/body)[1]/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[6])/div)[1]/input)"));
		pincode.sendKeys("506343");
		
		

	}

}
