package exam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exam_Grotechminds
{
	@Test
	public void testcase() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement grotech = driver.findElement(By.id("APjFqb"));
		grotech.sendKeys("Grotechminds"+Keys.ENTER);
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.xpath("//a[@class='gb_d']"));
		btn.click();
		Thread.sleep(2000);
		//WebElement youtube = driver.findElement(By.xpath("(//span[@class='Rq5Gcb'])[4]"));
		//youtube.click();
		WebElement frame1= driver.findElement(By.name("app"));
		driver.switchTo().frame(frame1);
		WebElement youtube = driver.findElement(By.xpath("(//span[@class='Rq5Gcb'])[4]"));
		youtube.click();
		//Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
		search.sendKeys("grotechminds"+Keys.ENTER);
		Thread.sleep(4000);
		WebElement subscribe = driver.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape yt-spec-touch-feedback-shape--touch-response-inverse']"));
		subscribe.click();
		
		
	}

}
