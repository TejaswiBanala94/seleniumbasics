package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class File_Upload_in_Registration {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.xpath("//input[@id='fname']"));
		fname.sendKeys("Tejaswi");
		Thread.sleep(2000);
		WebElement lname = driver.findElement(By.xpath("//input[@id='lname']"));
		lname.sendKeys("Banala");
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("Tejaswi@gmail.com");
		Thread.sleep(2000);
		WebElement phoneno = driver.findElement(By.xpath("//input[@id='password']"));
		phoneno.sendKeys("Teju#72");
		Thread.sleep(2000);
//		WebElement male = driver.findElement(By.xpath("//input[@id='male']"));
//		male.click();
		Thread.sleep(2000);
		WebElement female = driver.findElement(By.xpath("//input[@id='Female']"));
		female.click();
		Thread.sleep(2000);
		WebElement skill = driver.findElement(By.id("Skills"));
		Select s1 = new Select(skill);
		s1.selectByVisibleText("Technical Skills");
		WebElement language = driver.findElement(By.id("technicalskills"));
		Select s2 = new Select(language);
		s2.selectByVisibleText("Selenium");
		
		WebElement country = driver.findElement(By.id("Country"));
		Select s3 = new Select(country);
		s3.selectByVisibleText("India ");
		WebElement Present_Address = driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
		Present_Address.sendKeys("11225 Seward Plazza,Omaha");
		Thread.sleep(2000);
		WebElement Permanent_Address = driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
		Permanent_Address.sendKeys("24 Beeramguda,Hyderabad");
		Thread.sleep(2000);
		WebElement pincode = driver.findElement(By.xpath("//input[@id='Pincode']"));
		pincode.sendKeys("506343");
		WebElement e1 = driver.findElement(By.id("Relegion"));
		Select s4 = new Select(e1);
		s4.selectByVisibleText("Hindu");
		WebElement relocate = driver.findElement(By.xpath("//input[@name='relocate']"));
		relocate.click();
		WebElement choosefile = driver.findElement(By.id("file"));

		choosefile.sendKeys("C:\\Users\\banal\\Downloads\\assignments-js-fundamentals.pdf");
		WebElement submitt = driver.findElement(By.name("Submit"));
		submitt.click();
		

	}

}
