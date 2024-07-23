package seleniumbasicpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Growtechminds_Regi_Form_Relative {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
		fname.sendKeys("Tejaswi");
		Thread.sleep(2000);
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lname.sendKeys("Banala");
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("Tejaswi@gmail.com");
		Thread.sleep(2000);
		WebElement phoneno = driver.findElement(By.xpath("//input[@id='phone']"));
		phoneno.sendKeys("4543645454");
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.id("gender"));
		Select s1 = new Select(gender);
		s1.selectByValue("female");
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.id("state"));
		Select s2 = new Select(state);
		s2.selectByValue("telangana");
		Thread.sleep(2000);
		WebElement Aadhar_no = driver.findElement(By.xpath("//input[@id='aadhaar']"));
		Aadhar_no.sendKeys("224543645454");
		Thread.sleep(2000);
		WebElement pan_no = driver.findElement(By.xpath("//input[@id='pan']"));
		pan_no.sendKeys("4543645454");
		Thread.sleep(2000);
		WebElement agree= driver.findElement(By.xpath("//input[@id='terms']"));
		agree.click();
		Thread.sleep(2000);
		

	}

}
