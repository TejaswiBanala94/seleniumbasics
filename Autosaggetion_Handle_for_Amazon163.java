package seleniumbasicpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosaggetion_Handle_for_Amazon163 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		Thread.sleep(4000);
		List<WebElement> autosuggetion =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = autosuggetion.size();
		System.out.println(count);
		autosuggetion.get(count-6).click();

	}

}
